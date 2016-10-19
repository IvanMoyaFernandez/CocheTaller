public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private double precio;

    public Coche(String matricula, String marca, String modelo, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coche)) return false;

        Coche coche = (Coche) o;

        if (Double.compare(coche.getPrecio(), getPrecio()) != 0) return false;
        if (!getMatricula().equals(coche.getMatricula())) return false;
        if (!getMarca().equals(coche.getMarca())) return false;
        return getModelo().equals(coche.getModelo());

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getMatricula().hashCode();
        result = 31 * result + getMarca().hashCode();
        result = 31 * result + getModelo().hashCode();
        temp = Double.doubleToLongBits(getPrecio());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}