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
import modelVO.Terrenos;
import sql.SQLConections;
import sql.SQLUtil;

/**
 *
 * @author manoelson
 */
public class TerrenosDAO implements ITerrenosDAO{
private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
    @Override
    public int salvar(Terrenos terrenos) {
        int id =0;
        try{
            int endereco_id = new EnderecosDAO().salvar(terrenos.getEnderecos());
            int proprietario_id = new ProprietariosDAO().salvar(terrenos.getProprietarios());
            int imoveis_id = new ImoveisDAO().salvar(terrenos.getImoveis());
            this.conexao = SQLConections.getInstance();
            
            this.statement.setDouble(1, terrenos.getComprimento());
            this.statement.setDouble(2, terrenos.getLargura());
            this.statement.setDouble(3, terrenos.getArea());
            this.statement.setInt(4,endereco_id);
            this.statement.setInt(5,proprietario_id);
            this.statement.setInt(6,imoveis_id);

            this.result = statement.executeQuery();

            if (result.next()) {
                id = result.getInt(1);
                terrenos.setId(id);
            }//To change body of generated methods, choose Tools | Templates.
    }   catch (SQLException ex) {
            Logger.getLogger(TerrenosDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
        return id;
     //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Terrenos buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Terrenos> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Terrenos terrenos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
