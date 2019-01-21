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
import modelVO.Apartamentos;
import sql.SQLConections;
import sql.SQLUtil;

/**
 *
 * @author manoelson
 */
public class ApartamentosDAO implements IApartamentosDAO{
private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
    @Override
    public int salvar(Apartamentos apartamentos) {
        int id =0;
        try{
            int predios_id = new PrediosDAO().salvar(apartamentos.getPredios());
            int proprietario_id = new ProprietariosDAO().salvar(apartamentos.getProprietarios());
            int imoveis_id = new ImoveisDAO().salvar(apartamentos.getImoveis());
            this.conexao = SQLConections.getInstance();
            this.statement = conexao.prepareStatement(SQLUtil.Apartamentos.INSERT);
            this.statement.setInt(1, apartamentos.getQuartos());
            this.statement.setInt(2, apartamentos.getBanheiros());
            this.statement.setInt(3, apartamentos.getSalas());
            this.statement.setInt(4, apartamentos.getCozihas());
            this.statement.setInt(5, apartamentos.getGaragens());
            this.statement.setDouble(6, apartamentos.getArea());
            this.statement.setInt(7,predios_id);
            this.statement.setInt(8,proprietario_id);
            this.statement.setInt(9,imoveis_id);

            this.result = this.statement.executeQuery();

            if (result.next()) {
                id = result.getInt(1);
                apartamentos.setId(id);
            }//To change body of generated methods, choose Tools | Templates.
    }   catch (SQLException ex) {
            Logger.getLogger(ApartamentosDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
        return id;
    }

    @Override
    public Apartamentos buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Apartamentos> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Apartamentos apartamentos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
