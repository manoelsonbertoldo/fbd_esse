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
import modelVO.Enderecos;
import sql.SQLConections;
import sql.SQLUtil;

/**
 *
 * @author manoelson
 */
public class EnderecosDAO implements IEnderecosDAO{
    private static Connection conexao;
    private static PreparedStatement statement;
    private static ResultSet result;

    

    @Override
    public int salvar(Enderecos enderecos) {
       
        int id = 0;
        try {
            int municipios_id = new MunicipiosDAO().salvar(enderecos.getMunicipios());
            conexao = SQLConections.getInstance();
            statement = conexao.prepareStatement(SQLUtil.Enderecos.INSERT);
            statement.setString(1, enderecos.getCep());
            statement.setString(2, enderecos.getRua());
            statement.setInt(3, enderecos.getNumero());
            
            statement.setInt(4,municipios_id);

            result = statement.executeQuery();

            if (result.next()) {
                id = result.getInt(1);
                //clientes.setId(clientes_id);
                
                enderecos.setId(id);
            }//To change body of generated methods, choose Tools | Templates.
    }   catch (SQLException ex) {
            Logger.getLogger(EnderecosDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
        return id;
    }
    @Override
    public Enderecos buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Enderecos> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Enderecos enderecos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 
    
    
}