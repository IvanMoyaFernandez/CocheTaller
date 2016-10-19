public class Persona {
    private String dni;
    private String numeroSeguridadSocial;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private Double salario;

    public Persona(String dni, String numeroSeguridadSocial, String nombre, String apellidos, Integer edad, Double salario) {
        this.dni = dni;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}

    public String getNumeroSeguridadSocial() {return numeroSeguridadSocial;}
    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {this.numeroSeguridadSocial = numeroSeguridadSocial;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public Integer getEdad() {return edad;}
    public void setEdad(Integer edad) {this.edad = edad;}

    public Double getSalario() {return salario;}
    public void setSalario(Double salario) {this.salario = salario;}

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
                "dni='" + dni + '\'' +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}