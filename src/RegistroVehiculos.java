import java.util.*;
import java.util.stream.Collectors;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    // registramos el coche
    public void registrarVehiculo(Coche coche){
        coches.add(coche);
    }

    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7
    public Optional<Coche> obtenerVehiculo(String matricula){
        return coches.stream().filter(coche -> coche.getMatricula().equals(matricula)).findFirst();
    }

    // Para eliminar el coche si coincide con la matricula dada
    public boolean eliminarVehiculo(String matricula){
        return coches.removeIf(coche -> coche.getMatricula().equals(matricula));
    }

    // De todos los coches coger el que tenga el precio mayor
    public Optional<Coche> obtenerVehiculoPrecioMax(){
        return coches.stream().max(Comparator.comparing(Coche::getPrecio));
    }

    // Obtener coches segun la marca dada
    public List<Coche> obtenerVehiculosMarca(String marca){
        return coches.stream().filter(coche -> coche.getMarca().equals(marca)).collect(Collectors.toList());
    }

    // Hacer una lista con todos los coches registrados
    public List<Coche> obtenerTodos(){
        return coches.stream().collect(Collectors.toList());
    }
}
