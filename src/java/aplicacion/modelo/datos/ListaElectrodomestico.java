/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Electrodomestico;
import java.util.ArrayList;

/**
 *
 * @author Agustin
 */
public class ListaElectrodomestico {
    private ArrayList<Electrodomestico> listaElectrodomestico;

    public ListaElectrodomestico() {
        listaElectrodomestico=new ArrayList();
    }
    public void agregarElemento(Electrodomestico unElectrodomestico){
        listaElectrodomestico.add(unElectrodomestico);
    }

    public ListaElectrodomestico(ArrayList<Electrodomestico> listaElectrodomestico) {
        this.listaElectrodomestico = listaElectrodomestico;
    }

    /**
     * @return the listaElectrodomestico
     */
    public ArrayList<Electrodomestico> getListaElectrodomestico() {
        return listaElectrodomestico;
    }

    /**
     * @param listaElectrodomestico the listaElectrodomestico to set
     */
    public void setListaElectrodomestico(ArrayList<Electrodomestico> listaElectrodomestico) {
        this.listaElectrodomestico = listaElectrodomestico;
    }
    
}
