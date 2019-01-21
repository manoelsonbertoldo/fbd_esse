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
import modelVO.Imoveis;
import sql.SQLConections;
import sql.SQLUtil;

/**
 *
 * @author manoelson
 */
public class ImoveisDAO implements IImoveisDAO{
private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
    @Override
    public int salvar(Imoveis imoveis) {
        int id = 0;
        try {
           
           this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Imoveis.INSERT);
            this.statement.setString(1, imoveis.getRgi());
            this.statement.setDouble(2, imoveis.getValor());
            
           result = statement.executeQuery();
            
            
            if (result.next()) {
                id = result.getInt(1);
            imoveis.setId(id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImoveisDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Imoveis buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imoveis> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Imoveis Imoveis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
