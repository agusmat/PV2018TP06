/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author Agustin
 */
public class Marca {
    private String codigo;
    private String nombreDeMarca;

    public Marca() {
    }

    public Marca(String codigo, String nombreDeMarca) {
        this.codigo = codigo;
        this.nombreDeMarca = nombreDeMarca;
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
     * @return the nombreDeMarca
     */
    public String getNombreDeMarca() {
        return nombreDeMarca;
    }

    /**
     * @param nombreDeMarca the nombreDeMarca to set
     */
    public void setNombreDeMarca(String nombreDeMarca) {
        this.nombreDeMarca = nombreDeMarca;
    }
    
}
