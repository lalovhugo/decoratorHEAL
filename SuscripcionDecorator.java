import java.util.List;

public class SuscripcionDecorator extends CatalogoDecorator {
    private final Usuario usuario;

    public SuscripcionDecorator(CatalogoPeliculas catalogo, Usuario usuario) {
        super(catalogo);
        this.usuario = usuario;
    }

    //TODO: Implementar el método obtenerPeliculas() para devolver la lista de películas del catálogo decorado solo si el usuario tiene una suscripción activa al servicio correspondiente. Si el usuario no tiene una suscripción activa, se debe devolver una lista vacía.
}