public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana");
        usuario.activarSuscripcion(ServicioStreaming.DISNEY);
        usuario.activarSuscripcion(ServicioStreaming.WARNER);

        CatalogoPeliculas disney = new SuscripcionDecorator(new CatalogoDisney(), usuario);
        CatalogoPeliculas paramount = new SuscripcionDecorator(new CatalogoParamount(), usuario);
        CatalogoPeliculas warner = new SuscripcionDecorator(new CatalogoWarner(), usuario);

        mostrarCatalogo(disney);
        mostrarCatalogo(paramount);
        mostrarCatalogo(warner);

        System.out.println("\nAna activa Paramount:");
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