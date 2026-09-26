import java.util.List;

public class CatalogoWarner implements CatalogoPeliculas {
    @Override
    public ServicioStreaming getServicio() {
        return ServicioStreaming.WARNER;
    }

    @Override
    public List<String> obtenerPeliculas() {
        return List.of("Harry Potter", "Batman", "Duna");
    }
}