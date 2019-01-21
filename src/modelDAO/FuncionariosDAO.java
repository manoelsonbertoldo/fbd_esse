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
import modelVO.Funcionarios;
import sql.SQLConections;
import sql.SQLUtil;

/**
 *
 * @author manoelson
 */
public class FuncionariosDAO implements IFuncionariosDAO{
private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
    @Override
    public int salvar(Funcionarios Funcionarios) {
        int id=0; 
        try {
            int id_endereco = new EnderecosDAO().salvar(Funcionarios.getEnderecos());
            this.conexao = SQLConections.getInstance();
            this.statement = conexao.prepareStatement(SQLUtil.Funcionarios.INSERT);
            this.statement.setString(1, Funcionarios.getCpf());
            this.statement.setString(2, Funcionarios.getNome());
            this.statement.setString(3, Funcionarios.getContato());
             this.statement.setInt(4, id_endereco);
            this.result = this.statement.executeQuery();
            //int funcionarios_id = 0;
            if (result.next()) {
                id = result.getInt(1);
            Funcionarios.setId(id);
            }
            //this.statement.close();
            
            

        } catch (SQLException ex) {
            Logger.getLogger(FuncionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } //To change body of generated methods, choose Tools | Templates.
    return id;
    }
    

    @Override
    public Funcionarios buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionarios> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Funcionarios Funcionarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
