/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Marca;
import java.util.ArrayList;

/**
 *
 * @author Agustin
 */
public class ListaMarcas {
    private ArrayList<Marca> listaMarcas;

    public ListaMarcas() {
        listaMarcas=new ArrayList();
    }

    public ListaMarcas(ArrayList<Marca> listaMarcas) {
        this.listaMarcas = listaMarcas;
    }

    /**
     * @return the listaMarcas
     */
    public ArrayList<Marca> getListaMarcas() {
        return listaMarcas;
    }

    /**
     * @param listaMarcas the listaMarcas to set
     */
    public void setListaMarcas(ArrayList<Marca> listaMarcas) {
        this.listaMarcas = listaMarcas;
    }
    
}
