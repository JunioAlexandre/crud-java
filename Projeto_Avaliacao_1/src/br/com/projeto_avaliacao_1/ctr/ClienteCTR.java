package br.com.projeto_avaliacao_1.ctr;
import java.sql.ResultSet;
import br.com.projeto_avaliacao_1.dto.ClienteDTO;
import br.com.projeto_avaliacao_1.dao.ClienteDAO;
import br.com.projeto_avaliacao_1.dao.ConexaoDAO;
import java.sql.SQLException;

public class ClienteCTR {
    
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public ClienteCTR(){
        
    }
    
    public String inserirProduto(ClienteDTO clienteDTO){
        try{
            if (clienteDAO.inserirProduto(clienteDTO)){
                return "Produto cadastrado com sucesso!";
            }else{
                return "Produto não cadastrado!";
            }
            
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "Produto não cadastrado";
        }
    }
    
    public ResultSet consultarProduto(ClienteDTO clienteDTO, int opcao) throws SQLException{
        
        ResultSet rs = null;
        
        rs = clienteDAO.consultarProduto(clienteDTO, opcao);
        
        return rs;
    }
    
    public String alterarProduto (ClienteDTO clienteDTO){
        try{
            if (clienteDAO.alterarProduto(clienteDTO)){
                return "produto Alterado com Sucesso!!!";
            }else{
                return "produto NÃO Alterado!!!";
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "produto NÂO Alterado!!!";
        }
    }
    
    public String excluirProduto (ClienteDTO clienteDTO){
        try{
            if (clienteDAO.excluirProduto(clienteDTO)){
                return "Produto Excluido com sucesso!!!";
            }else{
                return "produto NÂO Excluido!!!";
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "Produto NÂO Excluido!!!";
        }
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
}
