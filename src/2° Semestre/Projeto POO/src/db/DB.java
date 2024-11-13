package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {
    private static Connection conn = null;

    private static final String Database = "jdbc:mysql://localhost:3306/trabalho_poo";
    private static final String User = "joao";
    private static final String Password = "123";

    public static Connection getConnection(){
        if(conn == null){
            try {
                conn = DriverManager.getConnection(Database, User, Password);
                System.out.println("Conexao Efetuada com Sucesso!");
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void fecharConexao(){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e){
                e.getMessage();
            }
        }
    }
}
