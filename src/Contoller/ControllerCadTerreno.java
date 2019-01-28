/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.CadApartamento;
import view.CadFun;
import view.CadTerreno;
import view.TelaCadastro;

/**
 *
 * @author manoelson
 */
public class ControllerCadTerreno implements ActionListener{
private TelaCadastro telaCadastro;
private CadTerreno cadTerreno;

    public ControllerCadTerreno(CadTerreno cadTerreno) {
        this.cadTerreno =cadTerreno;
         cadTerreno.setResizable(false);
        cadTerreno.setLocationRelativeTo(null);
        
        this.cadTerreno.getVoltarButton().addActionListener(this);
        this.cadTerreno.getSalvarButton().addActionListener(this);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cadTerreno.getVoltarButton()){
            telaCadastro.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            cadTerreno.setVisible(false);
    }
        if(e.getSource()==cadTerreno.getSalvarButton()){
            JOptionPane.showMessageDialog(null, "salvado com sucesso");//To change body of generated methods, choose Tools | Templates.
    } //To change body of generated methods, choose Tools | Templates.
    }
    
}
