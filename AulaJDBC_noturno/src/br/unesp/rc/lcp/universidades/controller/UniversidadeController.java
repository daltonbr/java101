package br.unesp.rc.lcp.universidades.controller;

import br.unesp.rc.lcp.universidades.beans.Universidade;
import br.unesp.rc.lcp.universidades.dao.IUniversidade;
import br.unesp.rc.lcp.universidades.dao.UniversidadeDAO;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created on 6/16/16 by:
 * Dalton Lima         github.com/daltonbr
 */
public class UniversidadeController {
    public void insereUniversidade(String nome, String endereco, String cidade, String sigla, String meuRA) {
        Universidade uni = new Universidade();
        uni.setNomeUni(nome);
        uni.setEnderecoUni(endereco);
        uni.setCidadeUni(cidade);
        uni.setSiglaUni(sigla);
        uni.setMeu141152257(meuRA);

        IUniversidade uniDao = new UniversidadeDAO();
        uniDao.insereUniversidade(uni);
    }

    public void recuperaUniversidade () {

    }

    public DefaultComboBoxModel getCidadeComboBoxModel() {
        IUniversidade uniDao = new UniversidadeDAO();
        ArrayList<String> cidadeArray = uniDao.getCidadeArray();
        DefaultComboBoxModel model = new DefaultComboBoxModel(cidadeArray.toArray());
        return model;
    }


}
