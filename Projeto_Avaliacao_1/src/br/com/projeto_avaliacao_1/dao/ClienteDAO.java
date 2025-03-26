package br.com.projeto_avaliacao_1.dao;
import java.sql.*;
import br.com.projeto_avaliacao_1.dto.ClienteDTO;


public class ClienteDAO {
    
    public ClienteDAO(){
        
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    public boolean inserirproduto(ClienteDTO clienteDTO){
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
    
    public ResultSet consultarProduto (ClienteDTO clienteDTO, int opcao) throws SQLException{
        try{
            ConexaoDAO.ConnectDB();
        
            stmt = ConexaoDAO.con.createStatement();
        
         String comando = "";
        
         switch (opcao){
               case 1:
                   comando = "Select c.* "+
                            "from cliente c"+
                             "where nome_cli like '" + clienteDTO.getNome_cli()+ "%' "+
                             "order by c.nome_cli";
                break;
                case 2:
                   comando = "Select c.* "+
                          "from cliente c"+
                          "where c.id_cli = " + clienteDTO.getId_cli();
                break;
                case 3:
                   comando = "Select c.id_cli, c.nome_cli "+
                          "from cliente c ";
                break;
                }
        
              rs = stmt.executeQuery(comando.toUpperCase());
              return rs;
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                return rs;
            }
    }
    
    
    
    public boolean inserirProduto(ClienteDTO clienteDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
