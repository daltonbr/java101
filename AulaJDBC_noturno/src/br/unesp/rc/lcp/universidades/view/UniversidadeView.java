package br.unesp.rc.lcp.universidades.view;

import br.unesp.rc.lcp.universidades.controller.UniversidadeController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created on 6/16/16 by:
 * Dalton Lima         github.com/daltonbr
 */
public class UniversidadeView extends JFrame {
        private JButton inserirButton;
        private JButton atualizarButton;
        private JTextField jtfNome;
        private JTextField jtfSigla;
        private JTextField jtfEndereco;
        private JTextField jtfMeuRA;
        private JTextField jtfCidade;
        private JPanel mainJPanel;
    private JButton editarButton;
    private JTable table1;
    private JComboBox jcbCidade;
    private JButton removerButton;


    public UniversidadeView() {
        UniversidadeController uc = new UniversidadeController();
        this.jcbCidade.setModel(uc.getCidadeComboBoxModel());

        inserirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //   UniversidadeController uc = new UniversidadeController();
                uc.insereUniversidade(jtfNome.getText(), jtfEndereco.getText(), jcbCidade.getSelectedItem().toString(), jtfSigla.getText(),
                        jtfMeuRA.getText());
            }
        });
    }



    public static void main(String[] args) {

        JFrame frame = new JFrame("UniversidadeView");
        frame.setContentPane(new UniversidadeView().mainJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
