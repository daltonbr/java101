package br.unesp.rc.lcp.universidades.dao;

import br.unesp.rc.lcp.universidades.beans.Universidade;

import java.util.List;

/**
 * Created on 6/16/16 by:
 * Dalton Lima         github.com/daltonbr
 */
public interface IUniversidade {
    public void insereUniversidade(Universidade uni);
    public void removeUniversidade(Universidade uni);
    public void atualizaUniversidade(Universidade uni);
    public List consultaUniversidade();
}
