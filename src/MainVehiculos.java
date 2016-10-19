public class MainVehiculos {
    public static void main(String[] args) {
        // creamos coches
        Coche Coche1 = new Coche("7534QQE", "Honda", "Civic", 25000);
        Coche Coche2 = new Coche("4568FGH", "Audi", "a1", 50000);
        Coche Coche3 = new Coche("1234BCN", "Seat", "Ibiza", 10000);
        Coche Coche4 = new Coche("9446THJ", "Seat", "Leon", 15000);

        // registramos los coches
        RegistroVehiculos registro = new RegistroVehiculos();
        registro.registrarVehiculo(Coche1);
        registro.registrarVehiculo(Coche2);
        registro.registrarVehiculo(Coche3);
        registro.registrarVehiculo(Coche4);
        registro.registrarVehiculo(Coche4);

        // Obtener vehiculo por matricula
                                        // != null. Solo muestra el coche si esa matricula está presente.
        System.out.println("- BUSCAR COCHE POR MATRICULA");
        registro.obtenerVehiculo("7534QQE").ifPresent(coche -> System.out.println("El coche con la matricula - 7534QQE - es el: " + coche));

        // Obtener vehiculo por marca
                                        // bucle que muestra coches mientras hayan con esa marca
        System.out.println("- BUSCAR COCHE POR MARCA");
        registro.obtenerVehiculosMarca("Audi").forEach(coche -> System.out.println("Coche de marca Audi: " + coche));

        // Obtener vehiculo de mayor precio de venta
                                        // != null. Solo muestra el valor si está presente.
        System.out.println("- BUSCAR COCHE DE MAYOR PRECIO");
        registro.obtenerVehiculoPrecioMax().ifPresent(coche -> System.out.println("Coche de mayor precio es el: " + coche));

        // Si existe esa matricula elimina el coche asociado a ella
        System.out.println("- ELIMINAR COCHE POR MATRICULA");
        if(registro.eliminarVehiculo("9446THJ") == true){
            System.out.println("Eliminar coche con matricula - 9446THJ -");
            System.out.println("Eliminando coche ...");
        }else{
            System.out.println("El coche con matricula - 9446THJ - no existe.");
        }

        // Nos muestra todos los coches
        System.out.println(registro.obtenerTodos());
    }
}