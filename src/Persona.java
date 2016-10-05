/**
 * Created by ivanmoya on 05/10/2016.
 */
public class Persona {
    private String dni;
    private String numeroSeguridadSocial;
    private String nombre;
    private String apellidos;
    private Integer edad;


    public Persona(String dni, String numeroSeguridadSocial, String nombre, String apellidos, Integer edad) {
        this.dni = dni;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }
    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (dni != null ? !dni.equals(persona.dni) : persona.dni != null) return false;
        return numeroSeguridadSocial != null ? numeroSeguridadSocial.equals(persona.numeroSeguridadSocial) : persona.numeroSeguridadSocial == null;

    }

    @Override
    public int hashCode() {
        int result = dni != null ? dni.hashCode() : 0;
        result = 31 * result + (numeroSeguridadSocial != null ? numeroSeguridadSocial.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                '}';
    }
}