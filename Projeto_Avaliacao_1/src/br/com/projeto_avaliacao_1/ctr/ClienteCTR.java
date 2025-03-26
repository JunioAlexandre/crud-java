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
            return "Produto não cadastradoã";
        }
    }
    
    public ResultSet consultarProduto(ClienteDTO clienteDTO, int opcao) throws SQLException{
        
        ResultSet rs = null;
        
        rs = clienteDAO.consultarProduto(clienteDTO, opcao);
        
        return rs;
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
}
