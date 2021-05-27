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
public class Fornecedor {
    private String razSoc;
    private Double cnpj;
    private String nomeRep;
    private String endForn;
    private Double foneForn;

    /**
     * @return the razSoc
     */
    public String getRazSoc() {
        return razSoc;
    }

    /**
     * @param razSoc the razSoc to set
     */
    public void setRazSoc(String razSoc) {
        this.razSoc = razSoc;
    }

    /**
     * @return the cnpj
     */
    public Double getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(Double cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the nomeRep
     */
    public String getNomeRep() {
        return nomeRep;
    }

    /**
     * @param nomeRep the nomeRep to set
     */
    public void setNomeRep(String nomeRep) {
        this.nomeRep = nomeRep;
    }

    /**
     * @return the endForn
     */
    public String getEndForn() {
        return endForn;
    }

    /**
     * @param endForn the endForn to set
     */
    public void setEndForn(String endForn) {
        this.endForn = endForn;
    }

    /**
     * @return the foneForn
     */
    public Double getFoneForn() {
        return foneForn;
    }

    /**
     * @param foneForn the foneForn to set
     */
    public void setFoneForn(Double foneForn) {
        this.foneForn = foneForn;
    }
    
}
