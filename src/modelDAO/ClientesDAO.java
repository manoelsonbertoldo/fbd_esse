/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelVO.Clientes;
import sql.SQLConections;
import sql.SQLUtil;

/**
 *
 * @author manoelson
 */
public class ClientesDAO implements IClientesDAO{
private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
    @Override
    public int salvar(Clientes clientes) {
       int id = 0;
        try {
            int id_endereco = new EnderecosDAO().salvar(clientes.getEnderecos());
            this.conexao = SQLConections.getInstance();
            this.statement = conexao.prepareStatement(SQLUtil.Clientes.INSERT);
            this.statement.setString(1, clientes.getCpf());
            this.statement.setString(2, clientes.getNome());
            this.statement.setString(3, clientes.getContato());
            this.statement.setInt(4, id_endereco);
            this.result = this.statement.executeQuery();
            //int clientes_id = 0;
            if (result.next()) {
                id = result.getInt(1);
            clientes.setId(id);
            }
            //this.statement.close();
            
            

        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	 return id;	  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clientes buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clientes> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
