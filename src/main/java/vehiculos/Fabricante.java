package vehiculos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Fabricante {
    int unidadesVendidas=0;
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre) {
        this.nombre=nombre;
    }

    static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();

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
        ArrayList<Fabricante> fabricante = new ArrayList<Fabricante>();
        ArrayList<Integer> contador = new ArrayList<Integer>();
        for (Vehiculo i: Vehiculo.getVehiculos()) {

            if (fabricante.contains(i.getFabricante())) {
            }
            else {
                fabricante.add(i.getFabricante());
                int cont=0;
                for (Vehiculo j: Vehiculo.getVehiculos()) {
                    if (i.getFabricante().getNombre().equals(j.getFabricante().getNombre())) {
                        cont++;
                    }
                }
                contador.add(cont);
            }

        }
        int mayor=0;
        int temp=0;
        int index = 0;
        for ( Integer k:contador) {
            if (k>mayor) {
                mayor=k;
                index=temp;
            }
            temp++;
        }


        Fabricante nombre=fabricante.get(index);
        Fabricante f =nombre;
        return f;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }
}
