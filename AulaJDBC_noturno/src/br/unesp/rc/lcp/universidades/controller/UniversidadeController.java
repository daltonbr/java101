package br.unesp.rc.lcp.universidades.controller;

import br.unesp.rc.lcp.universidades.beans.Universidade;
import br.unesp.rc.lcp.universidades.dao.IUniversidade;
import br.unesp.rc.lcp.universidades.dao.UniversidadeDAO;

/**
 * Created on 6/16/16 by:
 * Dalton Lima         github.com/daltonbr
 */
public class UniversidadeController {
    public void insereUniversidade(String nome, String sigla, String endereco, String meuRA) {
        Universidade uni = new Universidade();
        uni.setNomeUni(nome);
        uni.setSiglaUni(sigla);
        uni.setEnderecoUni(endereco);
        uni.setMeu141152257(meuRA);

        IUniversidade uniDao = new UniversidadeDAO();
        uniDao.insereUniversidade(uni);
    }
}
