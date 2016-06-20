package br.unesp.rc.lcp.universidades.dao;

import br.unesp.rc.lcp.universidades.beans.Universidade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 6/16/16 by:
 * Dalton Lima         github.com/daltonbr
 */
public interface IUniversidade {
    void insereUniversidade(Universidade uni);
    void removeUniversidade(Universidade uni);
    void atualizaUniversidade(Universidade uni);
    List consultaUniversidade();
    ArrayList<String> getCidadeArray();
}
