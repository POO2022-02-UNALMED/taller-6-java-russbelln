package vehiculos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Fabricante {
    private int unidadesVendidas=0;
    private String nombre;
    private Pais pais;

    static ArrayList<Fabricante> listado = new ArrayList<>();

    public Fabricante(){

    }

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }


    public static ArrayList<Fabricante> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Fabricante> listado) {
        Fabricante.listado = listado;
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante inicial = listado.get(0);
        for (Fabricante fabricante : listado) {
            if (inicial.unidadesVendidas < fabricante.unidadesVendidas) {
                inicial = fabricante;
            }

        }
        return inicial;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }
}
