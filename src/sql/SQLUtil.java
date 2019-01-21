/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

/**
 *
 * @author manoelson
 */
public class SQLUtil {
    public static class Terreno {

		public static final String NOME_TABELA = "terreno";
		public static final String COL_COMPRIMENTO = "comprimento";
		public static final String COL_LARGURA = "largura";
		public static final String COL_AREA = "area";
		public static final String COL_ENDERECO_ID = "endereco_id";
		public static final String COL_PROPRIETARIO_ID = "proprietario_id";
                public static final String COL_IMOVEIS_ID = "imoveis_id";
		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_COMPRIMENTO + ","
				+ COL_LARGURA + ","
				+ COL_AREA + ","
                                + COL_ENDERECO_ID + ","
                                + COL_PROPRIETARIO_ID + ","
				+ COL_IMOVEIS_ID + 
				"" + " ) values (?,?,?,?,?,?)returning id";
	}
    public static class Apartamentos {

		public static final String NOME_TABELA = "apartamentos";
		public static final String COL_QUARTOS = "quartos";
                public static final String COL_BANHEIROS = "banheiros";
                public static final String COL_SALAS = "salas";
                public static final String COL_COZINHAS = "cozinhas";
                public static final String COL_GARAGENS = "garagens";
                public static final String COL_AREA = "area";
                public static final String COL_PREDIO_ID = "predio_id";
                public static final String COL_PROPRIETARIO_ID = "proprietario_id";
                public static final String COL_IMOVEIS_ID = "imoveis_id";
		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_QUARTOS +","+COL_BANHEIROS+","+
                        COL_SALAS+","+COL_COZINHAS+","+COL_GARAGENS+","+COL_AREA + ","+COL_PREDIO_ID +","+COL_PROPRIETARIO_ID+","+ COL_IMOVEIS_ID+
				" ) values (?,?,?,?,?,?,?,?,?,?)returning id";
	}
	public static class Casas {

		public static final String NOME_TABELA = "casas";
		public static final String COL_QUARTOS = "quartos";
                public static final String COL_BANHEIROS = "banheiros";
                public static final String COL_SALAS = "salas";
                public static final String COL_COZINHAS = "cozinhas";
                public static final String COL_GARAGENS = "garagens";
                public static final String COL_AREA = "area";
                public static final String COL_ENDERECO_ID = "endereco_id";
                public static final String COL_PROPRIETARIO_ID = "proprietario_id";
                public static final String COL_IMOVEIS_ID = "imoveis_id";
		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_QUARTOS +","+
                        COL_BANHEIROS+","+
                        COL_SALAS+","+
                        COL_COZINHAS+","+
                        COL_GARAGENS+","+
                        COL_AREA +","+ 
                        COL_ENDERECO_ID +","+
                        COL_PROPRIETARIO_ID+","+ 
                        COL_IMOVEIS_ID+
				" ) values (?,?,?,?,?,?,?,?,?)returning id";}
	public static class Clientes {

		public static final String NOME_TABELA = "clientes";
		public static final String COL_CPF = "cpf";
		public static final String COL_NOME = "nome";
                public static final String COL_CONTATO = "contato";
		
		public static final String COL_ENDERECO_ID = "endereco_id";


		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_CPF + ","
				+ COL_NOME + ","
				+ COL_CONTATO+ ","
				+ COL_ENDERECO_ID +"" 
				 + " ) values (?,?,?,?)returning id ";
	}
        public static class Funcionarios {

		public static final String NOME_TABELA = "funcionarios";
		public static final String COL_CPF = "cpf";
		public static final String COL_NOME = "nome";
                public static final String COL_CONTATO = "contato";
		
		public static final String COL_ENDERECO_ID = "endereco_id";


		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_CPF + ","
				+ COL_NOME + ","
				+ COL_CONTATO+ ","
				+ COL_ENDERECO_ID +"" 
				 + " ) values (?,?,?,?)returning id ";
	}

	
	


	public static class Enderecos {

		public static final String NOME_TABELA = "enderecos";
		public static final String COL_CEP = "cep";
		public static final String COL_RUA = "rua";
		public static final String COL_NUMERO = "numero";
		public static final String COL_MUNICIPIO_ID = "municipio_id";
		

		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_CEP + ","
				+ COL_RUA + ","
				+ COL_NUMERO + ","
				+ COL_MUNICIPIO_ID + 
				"" + " ) values (?,?,?,?)returning id";
	}
	public static class Estados {

		public static final String NOME_TABELA = "estados";
		public static final String COL_UF = "uf";
		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_UF + ") values (?)returning id";
	}
	public static class Imoveis {


		public static final String NOME_TABELA = "Imoveis";
		public static final String COL_RGI = "rgi";
		public static final String COL_VALOR = "valor";
		

		public static final String INSERT = "insert into " + NOME_TABELA + "(" 
				+ COL_RGI + ","
				
				+ COL_VALOR +   " ) values (?,?)returning id";
	}
        public static class Predios {


		public static final String NOME_TABELA = "predios";
		public static final String COL_NOME = "nome";
		public static final String COL_ENDERECO_ID = "endereco_id";
		

		public static final String INSERT = "insert into " + NOME_TABELA + "(" 
				+ COL_NOME + ","
				
				+ COL_ENDERECO_ID + "" + " ) values (?,?)returning id";
	}
	public static class Municipios {

		public static final String NOME_TABELA = "municipios";
		public static final String COL_DESCRICAO = "descricao";
                public static final String COL_ESTADO_ID = "estados_id";
		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_DESCRICAO +","+
                        COL_ESTADO_ID + ""+ ") values (?,?)returning id";
	}
	public static class Proprietarios {

		public static final String NOME_TABELA = "proprietarios";
		public static final String COL_CPF = "cpf";
		public static final String COL_NOME = "nome";
                public static final String COL_CONTATO = "contato";
		
		public static final String COL_ENDERECO_ID = "endereco_id";


		public static final String INSERT = "insert into " + NOME_TABELA + "(" 
                                + COL_CPF + ","
				+ COL_NOME + ","
				+ COL_CONTATO+ ","
				+ COL_ENDERECO_ID +"" 
				 + " ) values (?,?,?,?)returning id ";
	}
	public static class Vendas {


		public static final String NOME_TABELA = "vendas";
		public static final String COL_DATA = "data_venda";
		public static final String COL_NOTA_FISCAL = "nota_fiscal";
		public static final String COL_STATUS = "status";
		public static final String COL_TOTAL = "total";
		public static final String COL_DESCONTO = "desconto";
		public static final String COL_VALOR_RECEBIDO = "valor_recebido";
		public static final String COL_TROCO = "troco";
                public static final String COL_CLIENTE_ID = "cliente_id";
                public static final String COL_IMOVEIS_ID = "imoveis_id";


		public static final String INSERT = "insert into " + NOME_TABELA + "("
                                + COL_DATA + ","
				+ COL_NOTA_FISCAL + ","
				+ COL_STATUS + ","
				+ COL_TOTAL + ","
				+ COL_DESCONTO + ","
				+ COL_VALOR_RECEBIDO+ ","
                                + COL_TROCO + ","
                                + COL_CLIENTE_ID+ ","
				+ COL_IMOVEIS_ID  + ""


                                + " ) values (?,?,?,?,?,?,?,?,?)returning id ";
	}
        public static class Alugueis {


		public static final String NOME_TABELA = "alugueis";
		public static final String COL_DATA = "data";
		public static final String COL_NOTA_FISCAL = "nota_fiscal";
		public static final String COL_STATUS = "status";
		public static final String COL_TOTAL = "total";
		public static final String COL_DESCONTO = "desconto";
		public static final String COL_VALOR_RECEBIDO = "valor_recebido";
		public static final String COL_TROCO = "troco";
                public static final String COL_CLIENTE_ID = "cliente_id";
                public static final String COL_IMOVEIS_ID = "imoveis_id";


		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_DATA + ","
				+ COL_NOTA_FISCAL + ","
				+ COL_STATUS + ","
				+ COL_TOTAL + ","
				+ COL_DESCONTO + ","
				+ COL_VALOR_RECEBIDO+ ","
                                + COL_TROCO + ","
                                + COL_CLIENTE_ID+ ","
				+ COL_IMOVEIS_ID  + ""


                                + " ) values (?,?,?,?,?,?,?,?,?) returning id";
	}
        public static class Pagamentos {

		public static final String NOME_TABELA = "estados";
		public static final String COL_VALOR = "valor";
		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_VALOR + ") values (?)returning id";
	}
        public static class Pagamentos_vendas {

		public static final String NOME_TABELA = "pagamentos_vendas";
		public static final String COL_ID_VENDAS = "id_vendas";
		public static final String COL_ID_PAGAMENTO = "id_pagamento";
                public static final String COL_ID_PAGAMENTOS_VENDAS = "id_pagamentos_vendas";
		
		public static final String COL_ID_VENDAS_PAGAMENOS = "id_vendas_pagamentos";


		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_ID_VENDAS+ ","
				+ COL_ID_PAGAMENTO+ ","
				+ COL_ID_PAGAMENTOS_VENDAS+ ","
				+ COL_ID_VENDAS_PAGAMENOS+"" 
				 + " ) values (?,?,?,?)returning id ";
	}
        





	public static String selectAll(String nomeTabela) {
		return "select * from " + nomeTabela;
	}

	public static String selectById(String nomeTabela, int id) {
		return "select * from " + nomeTabela + " where id = " + id;
	}



}

    

