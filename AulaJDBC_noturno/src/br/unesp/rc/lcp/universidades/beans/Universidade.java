package br.unesp.rc.lcp.universidades.beans;

/**
 * Created on 6/16/16 by:
 * Dalton Lima         github.com/daltonbr
 */
public class Universidade {
    private int idUni;

    public int getIdUni() {
        return idUni;
    }

    public void setIdUni(int idUni) {
        this.idUni = idUni;
    }

    public String getNomeUni() {
        return nomeUni;
    }

    public void setNomeUni(String nomeUni) {
        this.nomeUni = nomeUni;
    }

    public String getEnderecoUni() {
        return enderecoUni;
    }

    public void setEnderecoUni(String enderecoUni) {
        this.enderecoUni = enderecoUni;
    }

    public String getCidadeUni() {
        return cidadeUni;
    }

    public void setCidadeUni(String cidadeUni) {
        this.cidadeUni = cidadeUni;
    }

    public String getSiglaUni() {
        return siglaUni;
    }

    public void setSiglaUni(String siglaUni) {
        this.siglaUni = siglaUni;
    }

    public String getMeu141152257() {
        return meu141152257;
    }

    public void setMeu141152257(String meu141152257) {
        this.meu141152257 = meu141152257;
    }

    private String nomeUni;
    private String enderecoUni;
    private String cidadeUni;
    private String siglaUni;
    private String meu141152257;
}
