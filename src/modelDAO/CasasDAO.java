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
import modelVO.Casas;
import sql.SQLConections;
import sql.SQLUtil;

/**
 *
 * @author manoelson
 */
public class CasasDAO implements ICasasDAO{
private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
    @Override
    public int salvar(Casas casas) {
       int id =0;
        try{
            int endereco_id = new EnderecosDAO().salvar(casas.getEnderecos());
            int proprietario_id = new ProprietariosDAO().salvar(casas.getProprietarios());
            int imoveis_id = new ImoveisDAO().salvar(casas.getImoveis());
           this. conexao = SQLConections.getInstance();
            this.statement = conexao.prepareStatement(SQLUtil.Casas.INSERT);
            this.statement.setInt(1, casas.getQuartos());
           this. statement.setInt(2, casas.getBanheiros());
           this. statement.setInt(3, casas.getSalas());
            this.statement.setInt(4, casas.getCozihas());
           this. statement.setInt(5, casas.getGaragens());
           this. statement.setDouble(6, casas.getArea());
           this. statement.setInt(7,endereco_id);
            this.statement.setInt(8,proprietario_id);
            this.statement.setInt(9,imoveis_id);

           this.result = this.statement.executeQuery();

            
            if (result.next()) {
                id = result.getInt(1);
                casas.setId(id);
            }//To change body of generated methods, choose Tools | Templates.
    }   catch (SQLException ex) {
            Logger.getLogger(CasasDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
        return id;
    
  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Casas buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Casas> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Casas casas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
