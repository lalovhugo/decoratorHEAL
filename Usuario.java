import java.util.EnumSet;
import java.util.Set;

public class Usuario {
    private final String nombre;
    //TODO: Implementar la clase Usuario que represente a un usuario del sistema. Esta clase debe tener un nombre y una lista de suscripciones activas a los diferentes servicios de streaming. Se deben implementar métodos para activar y cancelar suscripciones, así como para verificar si el usuario tiene una suscripción activa a un servicio específico.
    //private final Set<ServicioStreaming> suscripcionesActivas = EnumSet.noneOf(ServicioStreaming.class);

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    //TODO: Implementar los métodos activarSuscripcion, cancelarSuscripcion y tieneSuscripcion para gestionar las suscripciones activas del usuario.
    
}