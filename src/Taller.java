import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Taller {
    private Map<Persona, Coche> reparaciones =
            new TreeMap<>(Comparator.comparing(Persona::getNumeroSeguridadSocial));

    // Registramos la reparación con el nombre del duelo y su coche
    public void registrarReparacion(Persona persona, Coche coche) {
        reparaciones.putIfAbsent(persona, coche);
    }

    // Obtener un coche dado el nombre de su dueño
    public Coche obtenerCoche(Persona persona){return reparaciones.get(persona);}

    public Set<Persona> obtenerClientes(){
        return reparaciones.keySet();
    }
}
