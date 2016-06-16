package br.unesp.rc.lcp.universidades.view;

import br.unesp.rc.lcp.universidades.beans.Universidade;
import br.unesp.rc.lcp.universidades.controller.UniversidadeController;

import javax.swing.*;

/**
 * Created on 6/16/16 by:
 * Dalton Lima         github.com/daltonbr
 */
public class UniversidadeView {
        private JButton inserirButton;
        private JButton atualizarButton;
        private JTextField jtfNome;
        private JTextField jtfSigla;
        private JTextField jtfEndereco;
        private JTextField jtfMeuRA;

    private void inserirButtonActionPerformed(java.awt.event.ActionEvent evt) {
        UniversidadeController uc = new UniversidadeController();
        uc.insereUniversidade(jtfNome.getText(), jtfSigla.getText(), jtfEndereco.getText(), jtfMeuRA.getText());
    }

}
