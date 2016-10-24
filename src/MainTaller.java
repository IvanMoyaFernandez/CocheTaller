public class MainTaller {
    public static void main(String[] args) {
        // Creamos clientes
        Persona ivan = new Persona("47112772D", "12345", "Ivan", "Moya", 21, 70500.00);
        Persona alvaro = new Persona("44583222W", "67890", "Alvaro", "Rodriguez", 21, 52665.00);
        Persona kevin = new Persona("12345678P", "96385", "Kevin", "Castro", 22, 40777.00);
        Persona cris = new Persona("98765432M", "14785", "Cris", "Rodriguez", 19, 59789.00);

        // Creamos coches
        Coche Coche1 = new Coche("7534QQE", "Honda", "Civic", 25000);
        Coche Coche2 = new Coche("4568FGH", "Audi", "a1", 50000);
        Coche Coche3 = new Coche("1234BCN", "Seat", "Ibiza", 10000);
        Coche Coche4 = new Coche("9446THJ", "Seat", "Leon", 15000);

        // Registramos en el taller las entradas de los coches y sus dueños.
        Taller taller = new Taller();
        taller.registrarReparacion(ivan, Coche1);
        taller.registrarReparacion(alvaro, Coche2);
        taller.registrarReparacion(kevin, Coche3);
        taller.registrarReparacion(cris, Coche4);

        // Muestra el coche de la persona indicada
        System.out.println("- COCHE DE ALVARO: ");
        System.out.println(taller.obtenerCoche(alvaro));
        // Muestra todos los clientes ordenados según el criterio indicado en el TreeMap
        // dentro de Taller.java, ahora los ordena por nombre
        System.out.println("- CLIENTES ORDENADOS POR NOMBRE: ");
        System.out.println(taller.obtenerClientes());
    }
}
