/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import fachada.Fachada;
import fachada.IFachada;
import modelVO.Apartamentos;
import modelVO.Casas;
import modelVO.Clientes;
import modelVO.Enderecos;
import modelVO.Estados;
import modelVO.Imoveis;
import modelVO.Municipios;
import modelVO.Predios;
import modelVO.Proprietarios;
import modelVO.Terrenos;
import modelVO.Vendas;
import view.Telalogin;


/**
 *
 * @author manoelson
 */
public class Aplicacao {
    public static void main(String[] args) {
         
        
         //new Aplicacao().salvarApartamentos();
        // new Aplicacao().salvarTerrenos();
         //new Aplicacao().salvarClientes();
         
         Telalogin telalogin =new Telalogin();
          
         telalogin.setVisible(true);
         telalogin.setLocationRelativeTo(null);
          
                 
       
//        
//		 
//		 fachada2.salvarClientes(clientes);
    }
    public void salvarCasas(){
        IFachada fachada1 = Fachada.getInstance();
        
        Imoveis imoveis= new Imoveis();
          imoveis.setRgi("2191");
          imoveis.setValor(100.0);
          
         Estados estados = new Estados();
         estados.setUf("pernambuco");
         
         Estados estados1 = new Estados();
         estados1.setUf("bahia");
         
         
         
         Municipios municipios =new Municipios();
         municipios.setDescricao("custodia");
         municipios.setEstado(estados);
         
         
         Municipios municipios1 =new Municipios();
         municipios1.setDescricao("sobradinho");
         municipios1.setEstado(estados1);
         
         
         
         Enderecos endereco= new Enderecos();
		 endereco.setCep("4333");
		 endereco.setRua("4333");
		 endereco.setNumero(32);
                 endereco.setMunicipios(municipios);
                 
          Enderecos endereco1= new Enderecos();
		 endereco1.setCep("56000");
		 endereco1.setRua("ceara");
		 endereco1.setNumero(32);
                 endereco1.setMunicipios(municipios1);
                 
          Proprietarios proprietarios= new Proprietarios();
          proprietarios.setCpf("0639482442");
          proprietarios.setNome("manoelson");
          proprietarios.setContato("0639482442");
          proprietarios.setEnderecos(endereco);
          
          
       Casas casas= new Casas();
       casas.setQuartos(2);
       casas.setBanheiros(2);
       casas.setSalas(2);
       casas.setCozihas(2);
       casas.setGaragens(2);
       casas.setArea(22.0);
       casas.setEnderecos(endereco1);
       casas.setProprietarios(proprietarios);
       casas.setImoveis(imoveis);
       
        fachada1.salvarCasas(casas);
    }
    public void salvarApartamentos(){
        IFachada fachada1 = Fachada.getInstance();
        
        
        Imoveis imoveis= new Imoveis();
          imoveis.setRgi("2191");
          imoveis.setValor(100.0);
          
          
         Estados estados = new Estados();
         estados.setUf("pernambuco");
         
         Estados estados1 = new Estados();
         estados1.setUf("bahia");
         
         
         
         Municipios municipios =new Municipios();
         municipios.setDescricao("custodia");
         municipios.setEstado(estados);
         
         
         Municipios municipios1 =new Municipios();
         municipios1.setDescricao("sobradinho");
         municipios1.setEstado(estados1);
         
         
         
         Enderecos endereco= new Enderecos();
		 endereco.setCep("4333");
		 endereco.setRua("4333");
		 endereco.setNumero(32);
                 endereco.setMunicipios(municipios);
                 
          Enderecos endereco1= new Enderecos();
		 endereco1.setCep("56000predio");
		 endereco1.setRua("cearaapredio");
		 endereco1.setNumero(32);
                 endereco1.setMunicipios(municipios1);
                 
          Predios predios = new Predios();
          predios.setNome("rua tomas");
          predios.setEnderecos(endereco1);
                  
          Proprietarios proprietarios= new Proprietarios();
          proprietarios.setCpf("0639482442");
          proprietarios.setNome("manoelson");
          proprietarios.setContato("0639482442");
          proprietarios.setEnderecos(endereco);
          
          
      Apartamentos apartamentos= new Apartamentos();
       apartamentos.setQuartos(2);
       apartamentos.setBanheiros(2);
       apartamentos.setSalas(2);
       apartamentos.setCozihas(2);
       apartamentos.setGaragens(2);
       apartamentos.setArea(22.0);
       apartamentos.setPredios(predios);
       apartamentos.setProprietarios(proprietarios);
       apartamentos.setImoveis(imoveis);
       
        fachada1.salvarApartamento(apartamentos);
    }
     public void salvarTerrenos(){
         
        IFachada fachada1 = Fachada.getInstance();
        
        Imoveis imoveis= new Imoveis();
          imoveis.setRgi("2191");
          imoveis.setValor(100.0);
          
         Estados estados = new Estados();
         estados.setUf("pernambuco");
         
         Estados estados1 = new Estados();
         estados1.setUf("bahia");
         
         
         
         Municipios municipios =new Municipios();
         municipios.setDescricao("custodia");
         municipios.setEstado(estados);
         
         
         Municipios municipios1 =new Municipios();
         municipios1.setDescricao("sobradinho");
         municipios1.setEstado(estados1);
         
         
         
         Enderecos endereco= new Enderecos();
		 endereco.setCep("4333");
		 endereco.setRua("4333");
		 endereco.setNumero(32);
                 endereco.setMunicipios(municipios);
                 
          Enderecos endereco1= new Enderecos();
		 endereco1.setCep("56000");
		 endereco1.setRua("ceara");
		 endereco1.setNumero(32);
                 endereco1.setMunicipios(municipios1);
                 
          Proprietarios proprietarios= new Proprietarios();
          proprietarios.setCpf("0639482442");
          proprietarios.setNome("manoelson");
          proprietarios.setContato("0639482442");
          proprietarios.setEnderecos(endereco);
          
          
       Terrenos terrenos= new Terrenos();
       terrenos.setComprimento(1.1);
       terrenos.setLargura(1.1);
       terrenos.setArea(1.1);
       terrenos.setEnderecos(endereco1);
       terrenos.setProprietarios(proprietarios);
       terrenos.setImoveis(imoveis);
       
       
        fachada1.salvarTerrenos(terrenos);
    }
      public void salvarClientes(){
          IFachada fachada1 = Fachada.getInstance();
          
          Imoveis imoveis= new Imoveis();
          imoveis.setRgi("2191.vend");
          imoveis.setValor(100.0);
          
          fachada1.salvarImoveis(imoveis);
          
         Estados estados = new Estados();
         estados.setUf("pernambuco.ven");
         fachada1.salvarEstados(estados);
          
          Municipios municipios =new Municipios();
         municipios.setDescricao("custodia.vendas");
         municipios.setEstado(estados);
         fachada1.salvarMunicipios(municipios);
          
          Enderecos endereco= new Enderecos();
              endereco.setCep("4333.vendas");
	      endereco.setRua("4333.vendas");
	      endereco.setNumero(32);
              endereco.setMunicipios(municipios);
              fachada1.salvarEnderecos(endereco);
          
        Clientes  clientes= new Clientes();
        clientes.setCpf("");
        clientes.setNome("manu");
        clientes.setContato("1233");
        clientes.setEnderecos(endereco);
        
        fachada1.salvarClientes(clientes);
        
        Vendas vendas =new Vendas();
        
        vendas.setData("13/01/2019");
        vendas.setNota_Fiscal(1);
        vendas.setStatus(true);
        vendas.setTotal(1.0);
        vendas.setDesconto(1.4);
        vendas.setValor_recebido(10.0);
        vendas.setTroco(1.0);
        vendas.setClientes(clientes);
        vendas.setImoveis(imoveis);
        
        fachada1.salvarVendas(vendas);
//        
      }
      
      public void salvarvendas(){
//      Vendas vendas =new Vendas();
//      IFachada fachada1 = Fachada.getInstance();
//      
//        vendas.setData("13/01/2019");
//        vendas.setNota_Fiscal(1);
//        vendas.setStatus(true);
//        vendas.setTotal(1.0);
//        vendas.setDesconto(1.4);
//        vendas.setValor_recebido(10.0);
//        vendas.setTroco(1.0);
//        vendas.setClientes();
//        vendas.setImoveis();
//        
//        fachada1.salvarVendas(vendas);

      }
      
}
