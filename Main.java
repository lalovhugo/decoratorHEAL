public class Main {
    public static void main(String[] args) {

        // Creamos un usuario
        Usuario usuario = new Usuario("Hugo");

        // Le activamos algunas subscripciones
        usuario.activarSuscripcion(ServicioStreaming.DISNEY);
        usuario.activarSuscripcion(ServicioStreaming.WARNER);

        // Creamos los catalogos base
        CatalogoPeliculas catalogoDisney = new CatalogoDisney();
        CatalogoPeliculas catalogoParamount = new CatalogoParamount();
        CatalogoPeliculas catalogoWarner = new CatalogoWarner();

        // CatalogoPeliculas disney = new SuscripcionDecorator(new CatalogoDisney(), usuario);
        // CatalogoPeliculas paramount = new SuscripcionDecorator(new CatalogoParamount(), usuario);
        // CatalogoPeliculas warner = new SuscripcionDecorator(new CatalogoWarner(), usuario);

        // 4. Envolver los catálogos con el decorador de suscripción
        CatalogoPeliculas disneyProtegido = new SuscripcionDecorator(catalogoDisney, usuario);
        CatalogoPeliculas paramountProtegido = new SuscripcionDecorator(catalogoParamount, usuario);
        CatalogoPeliculas warnerProtegido = new SuscripcionDecorator(catalogoWarner, usuario);

        // 5. Probar accesos
        System.out.println("--- Consultando catálogos inicialmente ---");
        mostrarCatalogo(disney);
        mostrarCatalogo(paramount);
        mostrarCatalogo(warner);

        System.out.println("\n\n--- Activando suscripción de Paramount ---");
        usuario.activarSuscripcion(ServicioStreaming.PARAMOUNT);
        mostrarCatalogo(paramount);
    }

    private static void mostrarCatalogo(CatalogoPeliculas catalogo) {
        System.out.println("\nCatalogo " + catalogo.getServicio().getNombre() + ":");
        try {
            for (String pelicula : catalogo.obtenerPeliculas()) {
                System.out.println("- " + pelicula);
            }
        } catch (IllegalStateException error) {
            System.out.println("Acceso denegado: " + error.getMessage());
        }
    }
}