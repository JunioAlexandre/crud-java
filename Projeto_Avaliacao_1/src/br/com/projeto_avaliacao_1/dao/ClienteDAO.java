package br.com.projeto_avaliacao_1.dao;
import java.sql.*;
import br.com.projeto_avaliacao_1.dto.ClienteDTO;


public class ClienteDAO {
    
    public ClienteDAO(){
        
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    public boolean inserirCliente(ClienteDTO clienteDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Insert into cliente (nome_cli, descricao_cli, "
                    + "precodevenda_cli, quantidadeemestoque_cli, datadocadastro_cli) value ( "
                    + "'" + clienteDTO.getNome_cli() + "', "
                    + "'" + clienteDTO.getDescricao_cli() + "', "
                    + "'" + clienteDTO.getPrecodevenda_cli() + ", "
                    + clienteDTO.getQuantidadeemestoque_cli() + ", "
                    + "'" + clienteDTO.getDatadocadastro_cli() + "') ";
            
            stmt.execute(comando.toUpperCase());
            
            ConexaoDAO.con.commit();
            
            stmt.close();
            return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }
    
}
