/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ListaElectrodomestico;
import aplicacion.modelo.datos.ListaMarcas;
import aplicacion.modelo.dominio.Electrodomestico;
import aplicacion.modelo.dominio.Marca;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Agustin
 */
@ManagedBean
@ViewScoped
public class ElectrodomesticoManagedBean {

    private String codigo;
    private String tipo;
    private Marca marca;
    private ListaElectrodomestico listaElec;
    private ListaMarcas listaMarcas;
    private String fecha;
    private Date fechaA;

    /**
     * Creates a new instance of ElectrodomesticoManagedBean
     */
    public ElectrodomesticoManagedBean() {
        listaElec = new ListaElectrodomestico();
        listaMarcas=new ListaMarcas();
        listaMarcas.getListaMarcas().add(new Marca("1234", "Samsung"));
        listaMarcas.getListaMarcas().add(new Marca("1235", "Noblex"));
        listaMarcas.getListaMarcas().add(new Marca("1236", "LG"));
    }

    public void agregarElemento() throws ParseException {
        if (getCodigo() == " " || getTipo() == " ") {
        } else {
            if (controlarCodRepetidos(getCodigo(), listaElec) == false) {
                //SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
                //setFechaA(formato.parse(getFecha()));
                getListaElec().agregarElemento(new Electrodomestico(getCodigo(), getTipo(), getMarca(), getFechaA()));
            }
        }

    }
   

    public boolean controlarCodRepetidos(String unaPalabra, ListaElectrodomestico unaLista) {
        boolean control = false;
        for (int i = 0; i < unaLista.getListaElectrodomestico().size(); i++) {
            if (unaLista.getListaElectrodomestico().get(i).getCodigo().equals(unaPalabra)) {
                control = true;
                break;
            }
        }
        return control;
    }

    public void reiniciarLista() {

        getListaElec().getListaElectrodomestico().clear();
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the listaElec
     */
    public ListaElectrodomestico getListaElec() {
        return listaElec;
    }

    /**
     * @param listaElec the listaElec to set
     */
    public void setListaElec(ListaElectrodomestico listaElec) {
        this.listaElec = listaElec;
    }

    /**
     * @return the listaMarcas
     */
    public ListaMarcas getListaMarcas() {
        return listaMarcas;
    }

    /**
     * @param listaMarcas the listaMarcas to set
     */
    public void setListaMarcas(ListaMarcas listaMarcas) {
        this.listaMarcas = listaMarcas;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the fechaA
     */
    public Date getFechaA() {
        return fechaA;
    }

    /**
     * @param fechaA the fechaA to set
     */
    public void setFechaA(Date fechaA) {
        this.fechaA = fechaA;
    }
}
