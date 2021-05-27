/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author William
 */
public class Produto {
    private String nomeProd;
    private String descProd;
    private Double valorUnit;
    private String fornecedor;

    /**
     * @return the nomeProd
     */
    public String getNomeProd() {
        return nomeProd;
    }

    /**
     * @param nomeProd the nomeProd to set
     */
    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    /**
     * @return the descProd
     */
    public String getDescProd() {
        return descProd;
    }

    /**
     * @param descProd the descProd to set
     */
    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    /**
     * @return the valorUnit
     */
    public Double getValorUnit() {
        return valorUnit;
    }

    /**
     * @param valorUnit the valorUnit to set
     */
    public void setValorUnit(Double valorUnit) {
        this.valorUnit = valorUnit;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
}
