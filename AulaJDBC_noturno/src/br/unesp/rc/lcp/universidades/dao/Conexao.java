package br.unesp.rc.lcp.universidades.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created on 6/16/16 by:
 * Dalton Lima         github.com/daltonbr
 */
public class Conexao {

    public static Connection getConnection() {
        Connection conexao = null;
        String usuario = "root";
        String senha = "0880";
        String urlBD = "jdbc:mysql://localhost:3306/bd_universidades";

        // carregar dinamicamente o driver do mysql
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("org.postgresql.Driver");
            DriverManager.getConnection(urlBD, usuario, senha);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver de conexao MYSQL nao encontrado!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados");
            e.printStackTrace();
        }
        finally {
            return conexao;
        }
    }

}
