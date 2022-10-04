package vehiculos;

public class Pais {

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor(){
        return Fabricante.fabricaMayorVentas().getPais();
    }
}
