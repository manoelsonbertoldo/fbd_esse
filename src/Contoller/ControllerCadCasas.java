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
import view.CadCasas;
import view.CadFun;
import view.TelaCadastro;

/**
 *
 * @author manoelson
 */
public class ControllerCadCasas implements ActionListener{
private TelaCadastro telaCadastro;
private CadCasas cadCasas;

    public ControllerCadCasas(CadCasas cadCasas) {
        this.cadCasas= cadCasas;
         cadCasas.setResizable(false);
        cadCasas.setLocationRelativeTo(null);
        this.cadCasas.getVoltarButton().addActionListener(this);
        this.cadCasas.getSalvarButton().addActionListener(this);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cadCasas.getVoltarButton()){
            telaCadastro.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            cadCasas.setVisible(false);
    }
        if(e.getSource()==cadCasas.getSalvarButton()){
            JOptionPane.showMessageDialog(null, "salvado com sucesso");//To change body of generated methods, choose Tools | Templates.
    } //To change body of generated methods, choose Tools | Templates.
    }
    
}
