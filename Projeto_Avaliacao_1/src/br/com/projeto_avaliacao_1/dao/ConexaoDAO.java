package br.com.projeto_avaliacao_1.dao;
import java.sql.*;

public class ConexaoDAO {

    public static Connection con = null;
    
    public ConexaoDAO(){
        
    }
    
    public static void ConnectDB(){
        try{
            String dsn = "avaliacao_1";
            String user = "postgres";
            String senha = "postdba";
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            String url = "jdbc:postgresql://localhost:5432/" + dsn;
            
            con = DriverManager.getConnection(url, user, senha);
            
            con.setAutoCommit(false);
            if (con == null){
                System.out.println("erro ao abrir o banco");
            }
        }
        catch (Exception e){
            System.out.println("Problema ao abrir a base de dados! " +
                    e.getMessage());
        }
    }
    
    public static void CloseDB(){
        try{
            con.close();
        }
        catch (Exception e){
            System.out.println("Problema ao fechar a base de dados! " +
                    e.getMessage());
        } 
    }
    
}
