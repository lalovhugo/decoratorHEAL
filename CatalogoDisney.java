import java.util.List;

public class CatalogoDisney implements CatalogoPeliculas {
    @Override
    public ServicioStreaming getServicio() {
        return ServicioStreaming.DISNEY;
    }

    //TODO: Implementar el método obtenerPeliculas() para devolver una lista de películas disponibles en el catálogo de Disney.
}