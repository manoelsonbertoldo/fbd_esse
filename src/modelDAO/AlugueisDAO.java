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
import modelVO.Alugueis;
import sql.SQLConections;
import sql.SQLUtil;

/**
 *
 * @author manoelson
 */
public class AlugueisDAO implements IAlugueisDAO{
private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
    @Override
    public int salvar(Alugueis alugueis) {
        int id =0;
        try{
            
            int clientes_id = new ClientesDAO().salvar(alugueis.getClientes());
            int imoveis_id = new ImoveisDAO().salvar(alugueis.getImoveis());
            this.conexao = SQLConections.getInstance();
           this.statement = conexao.prepareStatement(SQLUtil.Alugueis.INSERT);
           this.statement.setString(1, alugueis.getData());
           this.statement.setInt(2, alugueis.getNota_Fiscal());
           this.statement.setBoolean(3, alugueis.getStatus());
           this.statement.setDouble(4, alugueis.getTotal());
           this.statement.setDouble(5, alugueis.getDesconto());
           this.statement.setDouble(6, alugueis.getTroco());
            this.statement.setInt(7,clientes_id);
            this.statement.setInt(8,imoveis_id);

            this.result = this.statement.executeQuery();

            if (result.next()) {
                id = result.getInt(1);
                alugueis.setId(id);
            }//To change body of generated methods, choose Tools | Templates.
    }   catch (SQLException ex) {
            Logger.getLogger(AlugueisDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
        return id; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alugueis buscarPorId(int id) {
        Alugueis alugueis = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Alugueis.COL_IMOVEIS_ID, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
                alugueis = new Alugueis();
                alugueis.setId(result.getInt(1));
                
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(AlugueisDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alugueis; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alugueis> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Alugueis alugueis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
