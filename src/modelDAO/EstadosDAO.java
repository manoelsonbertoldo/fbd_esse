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
import modelVO.Estados;
import sql.SQLConections;
import sql.SQLUtil;

/**
 *
 * @author manoelson
 */
public class EstadosDAO implements IEstadosDAO{

    private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
    
    @Override
    public int salvar(Estados estados) {
       int id = 0;
        try {
           
           this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Estados.INSERT);
            this.statement.setString(1, estados.getUf());
            
           result = statement.executeQuery();
            
            
            if (result.next()) {
                id = result.getInt(1);
            estados.setId(id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstadosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estados buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estados> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Estados Estados) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
