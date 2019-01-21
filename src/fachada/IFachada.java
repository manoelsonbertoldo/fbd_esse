/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import java.util.List;
import modelVO.Alugueis;
import modelVO.Apartamentos;
import modelVO.Casas;
import modelVO.Clientes;
import modelVO.Enderecos;
import modelVO.Estados;
import modelVO.Funcionarios;
import modelVO.Imoveis;
import modelVO.Municipios;
import modelVO.Pagamentos;
import modelVO.Pagamentos_Vendas;
import modelVO.Predios;
import modelVO.Proprietarios;
import modelVO.Terrenos;
import modelVO.Vendas;

/**
 *
 * @author manoelson
 */
public interface IFachada {
   //	Apartamentos
	
	public  void salvarApartamento(Apartamentos apartamentos);
	public Apartamentos buscarApartamentosPorId(int id);
	public List<Apartamentos> getALLApartamnetos();
	public  void editarAparatamentos(Apartamentos apartamentos);
	public  void ativarDesativarApartamentos(int id);
	
//Casas

	public  void salvarCasas(Casas casas);
	public Casas buscarCasasPorId(int id);
	public List<Casas> getALLCasas();
	public  void editarCasas(Casas casas);
	public  void ativarDesativarCasas(int id);

//Clientes
	
	public  void salvarClientes(Clientes clientes);
	public Clientes  buscarClientesPorId(int id);
	public List<Clientes> getALLClientes();
	public  void editarClientes(Clientes clientes);
	public  void ativarDesativarClientes(int id);
	
//	Terreno
	
	public  void salvarTerrenos(Terrenos terrenos);
	public Terrenos  buscarTerrenosPorId(int id);
	public List<Terrenos> getALLTerrenos();
	public  void editarContato(Terrenos terrenos);
	public  void ativarDesativarTerrenos(int id);
	
//	Funcionarios
	
	public  void salvarFuncionarios(Funcionarios funcionarios);
	public Funcionarios  buscarFuncionariosPorId(int id);
	public List<Funcionarios > getALLFuncionarios();
	public  void editarFuncionarios(Funcionarios funcionarios);
	public  void ativarDesativarFuncionarios(int id);
	
//	Endereco
	
	public  void salvarEnderecos(Enderecos enderecos);
	public Enderecos  buscarEnderecosPorId(int id);
	public List<Enderecos > getALLEnderecos();
	public  void editarEnderecos(Enderecos enderecos);
	public  void ativarDesativarEnderecos(int id);
	
//	estado
	
	public  void salvarEstados(Estados estados);
	public Estados  buscarEstadosPorId(int id);
	public List<Estados> getALLEstados();
	public  void editarEstado(Estados estado);
	public  void ativarDesativarEstados(int id);
	
//	Imoveis
	
	public  void salvarImoveis(Imoveis imoveis);
	public Imoveis  buscarImoveisPorId(int id);
	public List<Imoveis> getALLImoveis();
	public  void editarImoveis(Imoveis imoveis);
	public  void ativarDesativarImoveis(int id);
	
//	Munucipios
	
	
	public  void salvarMunicipios(Municipios municipios);
	public Municipios buscarMunicipiosPorId(int id);
	public List<Municipios> getALLMunicipios();
	public  void editarMunicipios(Municipios municipio);
	public  void ativarDesativarMunicipios(int id);
	
//	Proprietario
	
	public  void salvarProprietarios (Proprietarios proprietarios);
	public Proprietarios buscarProprietariosPorId(int id);
	public List<Proprietarios> getALLProprietarios ();
	public  void editarProprietarios (Proprietarios proprietarios);
	public  void ativarDesativarProprietarios (int id);
	
//	Vender
	
	public  void salvarVendas(Vendas vendas);
	public Vendas buscarVendasPorId(int id);
	public List<Vendas> getALLVendas();
	public  void editarVendas(Vendas vendas);
	public  void ativarDesativarVendas(int id);
	
	
        //	Alugueis
	
	public  void salvarAlugueis(Alugueis alugueis);
	public Vendas buscarAlugueisPorId(int id);
	public List<Vendas> getALLAlugueis();
	public  void editarAlugueis(Alugueis alugueis);
	public  void ativarDesativarAlugueis(int id);
	
        //	Predios
	
	public  void salvarPredios(Predios predios);
	public Predios buscarPrediosPorId(int id);
	public List<Predios> getALLPredios();
	public  void editarPredios(Predios predios);
	public  void ativarDesativarPredios(int id);
	
        //	Pagamentos
	
	public  void salvarPagamentos(Pagamentos pagamentos);
	public Predios buscarPagamentosPorId(int id);
	public List<Pagamentos> getALLPagamentos();
	public  void editarPagamentos(Pagamentos pagamentos);
	public  void ativarDesativarPagamentos(int id);
	 //	Pagamentos_Vendas
	
	public  void salvarPagamentos_Vendas(Pagamentos_Vendas pagamentos_Vendas);
	public Predios buscarPagamentos_VendasPorId(int id);
	public List<Pagamentos_Vendas> getALLPagamentos_Vendas();
	public  void editarPagamentos_Vendas(Pagamentos_Vendas pagamentos_Vendas);
	public  void ativarDesativarPagamentos_Vendas(int id);
	
	 
}
