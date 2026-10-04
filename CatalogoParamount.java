import java.util.List;

public class CatalogoParamount implements CatalogoPeliculas {

    @Override
    public ServicioStreaming getServicio() {
        return ServicioStreaming.PARAMOUNT;
    }

    @Override
    public List<String> obtenerPeliculas() {
        return List.of("Top Gun: Maverick", "Sonic", "Un lugar en silencio");
    }
    
    //TODO: Implementar CatalogoParamount que represente un catálogo de películas de Paramount. Esta clase debe implementar la interfaz CatalogoPeliculas y proporcionar una lista de películas disponibles en el servicio correspondiente.
}