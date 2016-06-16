package br.unesp.rc.lcp.universidades.dao;

import br.unesp.rc.lcp.universidades.beans.Universidade;
import sun.plugin2.main.client.DisconnectedExecutionContext;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created on 6/16/16 by:
 * Dalton Lima         github.com/daltonbr
 */
public class UniversidadeDAO implements IUniversidade {


    @Override
    public void insereUniversidade(Universidade uni) {
        String query = "Insert into tb_universidades (nome, sigla, endereco, RA141152257)"
                + " values (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(query);
            stmt.setString(1, uni.getNomeUni());
            stmt.setString(2, uni.getSiglaUni());
            stmt.setString(3, uni.getEnderecoUni());
            stmt.setString(4, uni.getMeu141152257());

            stmt.executeUpdate();  // insert, update e delete
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro na instrucao SQL!");
        }
    }

    @Override
    public void removeUniversidade(Universidade uni) {
        String query = "DELETE FROM tb_universidades WHERE (id) = (?)";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(query);
            stmt.setInt(1, uni.getIdUni());

            stmt.executeUpdate();  // insert, update e delete
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro na instrucao SQL!");
        }

    }

    @Override
    public void atualizaUniversidade(Universidade uni) {
        String query = "UPDATE tb_universidades SET nome = ?, sigla = ?, endereco = ?, RA141152257 = ?"
                + " WHERE id = (?)";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(query);
            stmt.setString(1, uni.getNomeUni());
            stmt.setString(2, uni.getSiglaUni());
            stmt.setString(3, uni.getEnderecoUni());
            stmt.setString(4, uni.getMeu141152257());
            stmt.setInt(5, uni.getIdUni());

            stmt.executeUpdate();  // insert, update e delete
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro na instrucao SQL!");
        }
    }

    @Override
    public List consultaUniversidade() {
        return null;
    }
}
