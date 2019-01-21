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
import modelVO.Proprietarios;
import sql.SQLConections;
import sql.SQLUtil;

/**
 *
 * @author manoelson
 */
public class ProprietariosDAO implements IProprietariosDAO{
private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
    @Override
    public int salvar(Proprietarios proprietarios) {
        int id=0; 
        try {
            int id_endereco = new EnderecosDAO().salvar(proprietarios.getEnderecos());
            this.conexao = SQLConections.getInstance();
            this.statement = conexao.prepareStatement(SQLUtil.Proprietarios.INSERT);
            this.statement.setString(1, proprietarios.getCpf());
            this.statement.setString(2, proprietarios.getNome());
            this.statement.setString(3, proprietarios.getContato());
            this.statement.setInt(4, id_endereco);
             
            this.result = this.statement.executeQuery();
            
            if (result.next()) {
                id = result.getInt(1);
            proprietarios.setId(id);
            }
           this.statement.close();
            
            

        } catch (SQLException ex) {
            Logger.getLogger(ProprietariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } //To change body of generated methods, choose Tools | Templates.
    return id; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Proprietarios buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proprietarios> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Proprietarios proprietarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
