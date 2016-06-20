package br.unesp.rc.lcp.universidades.dao;

import br.unesp.rc.lcp.universidades.beans.Universidade;
import sun.plugin2.main.client.DisconnectedExecutionContext;

import javax.swing.*;
import javax.xml.transform.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 6/16/16 by:
 * Dalton Lima         github.com/daltonbr
 */
public class UniversidadeDAO implements IUniversidade {


    @Override
    public void insereUniversidade(Universidade uni) {
        String query = "Insert into tb_universidades (nome, endereco, cidade, sigla, RA141152257)"
                + " values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(query);
            stmt.setString(1, uni.getNomeUni());
            stmt.setString(2, uni.getEnderecoUni());
            stmt.setString(3, uni.getCidadeUni());
            stmt.setString(4, uni.getSiglaUni());
            stmt.setString(5, uni.getMeu141152257());

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
        String query = "UPDATE tb_universidades SET nome = ?, endereco = ?, cidade = ?, sigla = ?, RA141152257 = ?"
                + " WHERE id = (?)";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(query);
            stmt.setString(1, uni.getNomeUni());
            stmt.setString(2, uni.getEnderecoUni());
            stmt.setString(3, uni.getCidadeUni());
            stmt.setString(4, uni.getSiglaUni());
            stmt.setString(5, uni.getMeu141152257());
            stmt.setInt(6, uni.getIdUni());

            stmt.executeUpdate();  // insert, update e delete
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro na instrucao SQL!");
        }
    }

    @Override
    public List<Universidade> consultaUniversidade() {
        String query = "Select * from tb_universidades ";
        List<Universidade> lista = new ArrayList<>();
        try  {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Universidade uni = new Universidade();
                uni.setNomeUni(rs.getString("nome"));
                uni.setIdUni(rs.getInt("id"));
                uni.setCidadeUni(rs.getString("cidade"));
                uni.setEnderecoUni(rs.getString("endereco"));
                uni.setMeu141152257(rs.getString("RA141152257"));
                uni.setSiglaUni(rs.getString("sigla"));
                lista.add(uni);
            }
        } catch (SQLException ex) {
            System.out.println("Erro na instrução SQL");
        }

        return null;
    }

    @Override
    public ArrayList<String> getCidadeArray() {
        // Create an array list to be filled with cidades
        ArrayList<String> cidadeArray = new ArrayList<String>();
        String query = "SELECT nome FROM tb_cidade ORDER BY estado";
        try {
            PreparedStatement stm = Conexao.getConnection().prepareStatement(query);
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                String cidade = rs.getString("nome");
                // add cidade to the array list
                cidadeArray.add(cidade);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro na instrução SQL");
        }
        return cidadeArray;
    }
}
