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
import modelVO.Municipios;
import sql.SQLConections;
import sql.SQLUtil;

/**
 *
 * @author manoelson
 */
public class MunicipiosDAO implements IMunicipiosDAO{
private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
    
    public int salvar(Municipios municipios) {
       int id = 0;
        try {
           int estados_id = new EstadosDAO().salvar(municipios.getEstados());
           this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Municipios.INSERT);
            this.statement.setString(1, municipios.getDescricao());
            this.statement.setInt(2,estados_id);
           result = statement.executeQuery();
            
            
            if (result.next()) {
                id = result.getInt(1);
            municipios.setId(id);
            }
            //clientes.setId(clientes_id);
        } catch (SQLException ex) {
            Logger.getLogger(MunicipiosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Municipios buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Municipios> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Municipios municipios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
