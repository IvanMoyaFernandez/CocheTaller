import java.util.*;
import java.util.stream.Collectors;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    // registramos el coche
    public void registrarVehiculo(Coche coche){
        coches.add(coche);
    }

    // Para no trabajar con valores null
    public Optional<Coche> obtenerVehiculo(String matricula){
        return coches.stream().filter(coche -> coche.getMatricula().equals(matricula)).findFirst();
    }

    public boolean eliminarVehiculo(String matricula){
        return coches.removeIf(coche -> coche.getMatricula().equals(matricula));
    }

    public Optional<Coche> obtenerVehiculoPrecioMax(){
        return coches.stream().max(Comparator.comparing(Coche::getPrecio));
    }

    public List<Coche> obtenerVehiculosMarca(String marca){
        return coches.stream().filter(coche -> coche.getMarca().equals(marca)).collect(Collectors.toList());
    }

    public List<Coche> obtenerTodos(){
        return coches.stream().collect(Collectors.toList());
    }
}
