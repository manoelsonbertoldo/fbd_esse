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
import view.TelaCadastro;

/**
 *
 * @author manoelson
 */
public class ControllerCadApartamento implements ActionListener{
private TelaCadastro telaCadastro;
private CadApartamento cadApartamento;

//    public ControllerCadApartamento(CadApartamento cadApartamento) {
//        this.cadApartamento = cadApartamento;
//        
//        this.cadApartamento.getjButton1().addActionListener(this);
//        this.cadApartamento.getjButton2().addActionListener(this);
//    }

    

    ControllerCadApartamento(CadApartamento cadApartamento,TelaCadastro telaCadastro) {
         this.cadApartamento = cadApartamento;
         this.telaCadastro= telaCadastro;
          cadApartamento.setResizable(false);
        cadApartamento.setLocationRelativeTo(null);
        
        this.cadApartamento.getVoltarButton().addActionListener(this);
        this.cadApartamento.getSalvarButton().addActionListener(this);  //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cadApartamento.getVoltarButton()){
            telaCadastro.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            cadApartamento.setVisible(false);
    }
        if(e.getSource()==cadApartamento.getSalvarButton()){
            JOptionPane.showMessageDialog(null, "salvado com sucesso");//To change body of generated methods, choose Tools | Templates.
    } //To change body of generated methods, choose Tools | Templates.
    }
    
}
