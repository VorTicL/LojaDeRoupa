/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import Cliente.Cliente;
import Conexao.UtilitarioConexao;
import Produto.Produto;
import Venda.ItensVenda;
import Venda.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabra
 */
public class mockProduto {
    //private static int contadorVenda = 0; 
    //private static ArrayList<Produto> listaProduto=new ArrayList<Produto>();


    public static void inserir(Produto produto)throws Exception{
        //produto.setID(contadorVenda++);
        //listaProduto.add(produto);
        
        String sql = "INSERT INTO PRODUTOS (NOME, TAMANHO, "
                + "QUANTIDADE, COLECAO, SEXO, COR, "
                + "PRECO, ENABLED) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = UtilitarioConexao.getConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getTamanho());
            preparedStatement.setInt(3, produto.getQuantidade());
            preparedStatement.setString(4, produto.getColecao());
            preparedStatement.setString(5, produto.getSexo());
            preparedStatement.setString(6, produto.getCor());
            preparedStatement.setDouble(7, produto.getPreco());
            preparedStatement.setBoolean(8, true);
            
            //Executa o comando no banco de dados
            preparedStatement.execute();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    public static void excluir(Integer id)throws Exception{
        /*if (id != null && !listaProduto.isEmpty()) {
            for (int i = 0; i < listaProduto.size(); i++) {
                Produto prod1 = listaProduto.get(i);
                if (prod1 != null && prod1.getID() == id) {
                    listaProduto.remove(i);
                    break;
                }
            }
        }*/
        
        String sql = "UPDATE PRODUTOS SET enabled=? WHERE (ID=?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = UtilitarioConexao.getConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, id);
            
            //Executa o comando no banco de dados
            preparedStatement.execute();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    //retorna a lista de vendas
    public static java.util.ArrayList<Produto> listar()
            throws Exception {
        //return listaProduto;
        java.util.ArrayList<Produto> listaResultado = new ArrayList<Produto>();
        
        String sql = "SELECT * FROM PRODUTOS WHERE ENABLED=true";
        //Lista de clientes de resultado
        ArrayList<Produto> listaProduto = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = UtilitarioConexao.getConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            
            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaProduto == null) {
                    listaProduto = new ArrayList<Produto>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                Produto produto = new Produto();
                produto.setID(result.getInt("ID"));
                produto.setNome(result.getString("NOME"));
                produto.setTamanho(result.getString("TAMANHO"));
                produto.setQuantidade(result.getInt("QUANTIDADE"));
                produto.setColecao(result.getString("COLECAO"));
                produto.setSexo(result.getString("SEXO"));
                produto.setCor(result.getString("COR"));
                produto.setPreco(result.getDouble("PRECO"));
                //Adiciona a instância na lista
                listaProduto.add(produto);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de clientes do banco de dados
        return listaProduto;
    }
    
    
    //Pesquisa vendas entre as datas determinadas
    public static java.util.ArrayList<Produto> buscaProduto(String valor)
            throws Exception {
        /*
        if (!a.isEmpty() && !listaProduto.isEmpty()) {
            for (int i = 0; i<listaProduto.size(); i++) {
                if (listaProduto.get(i) != null && listaProduto.get(i).getNome().contains(a)) {
                    listaResultado.add(listaProduto.get(i));
                }
            }
        }*/
        String sql = "SELECT * FROM PRODUTOS WHERE ((UPPER(NOME) LIKE UPPER(?)) AND enabled=?) ";
        //Lista de clientes de resultado
        ArrayList<Produto> listaProduto = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = UtilitarioConexao.getConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, "%" + valor + "%");
            preparedStatement.setBoolean(2, true);
            
            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaProduto == null) {
                    listaProduto = new ArrayList<Produto>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                Produto produto = new Produto();
                produto.setID(result.getInt("ID"));
                produto.setNome(result.getString("NOME"));
                produto.setTamanho(result.getString("TAMANHO"));
                produto.setQuantidade(result.getInt("QUANTIDADE"));
                produto.setColecao(result.getString("COLECAO"));
                produto.setSexo(result.getString("SEXO"));
                produto.setCor(result.getString("COR"));
                produto.setPreco(result.getDouble("PRECO"));
                //Adiciona a instância na lista
                listaProduto.add(produto);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de clientes do banco de dados
        return listaProduto;
    }
    public static void atualizar(Produto produtoNovo, int id)
            throws Exception {
        /*if (produtoNovo != null && produtoNovo.getNome() != null && !listaProduto.isEmpty()) {
            for (int i= 0; i<listaProduto.size(); i++) {
                if (produtoNovo.getID()==listaProduto.get(i).getID()) {
                    if (produtoNovo.getNome().compareTo(listaProduto.get(i).getNome())!=0) {
                        listaProduto.get(i).setNome(produtoNovo.getNome());
                    }
                    if (produtoNovo.getColecao().compareTo(listaProduto.get(i).getColecao())!=0) {
                        listaProduto.get(i).setColecao(produtoNovo.getColecao());
                    }
                    if (produtoNovo.getCor().compareTo(listaProduto.get(i).getCor())!=0) {
                        listaProduto.get(i).setCor(produtoNovo.getColecao());
                    }
                    if (produtoNovo.getTamanho().compareTo(listaProduto.get(i).getTamanho())!=0) {
                        listaProduto.get(i).setTamanho(produtoNovo.getTamanho());
                    }
                    if (produtoNovo.getPreco()!=listaProduto.get(i).getPreco()) {
                        listaProduto.get(i).setPreco(produtoNovo.getPreco());
                    }
                    break;
                }
            }
        }*/
        
        String sql = "UPDATE PRODUTOS SET NOME=?, TAMANHO=?, "
                + "QUANTIDADE=?, COLECAO=?, SEXO=?, COR=?, "
                + "PRECO=? "
            + "WHERE (ID=?)";
        
        Connection connection = null;
        
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = UtilitarioConexao.getConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, produtoNovo.getNome());
            preparedStatement.setString(2, produtoNovo.getTamanho());
            preparedStatement.setInt(3, produtoNovo.getQuantidade());
            preparedStatement.setString(4, produtoNovo.getColecao());
            preparedStatement.setString(5, produtoNovo.getSexo());
            preparedStatement.setString(6, produtoNovo.getCor());
            preparedStatement.setDouble(7, produtoNovo.getPreco());
            preparedStatement.setDouble(8, produtoNovo.getID());
            
            
            //Executa o comando no banco de dados
            preparedStatement.execute();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    public static void decrementar(ArrayList<ItensVenda> produtoVenda)
            throws Exception {
        
        String sql = "UPDATE PRODUTOS SET QUANTIDADE=QUANTIDADE - ? "
            + "WHERE (ID=?)";
        
         Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = UtilitarioConexao.getConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < produtoVenda.size(); i++) {
                preparedStatement.setInt(1, produtoVenda.get(i).getQtdProduto());
                preparedStatement.setInt(2, produtoVenda.get(i).getProduto().getID());
                preparedStatement.execute();
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        
        /*for (int i = 0; i < produtoVenda.size(); i++) {
            for (int j = 0; j < listaProduto.size(); j++) {
                if (produtoVenda.get(i).getProduto().getID()==listaProduto.get(j).getID()) {
                    System.out.println(listaProduto.get(j).getQuantidade());
                    System.out.println(produtoVenda.get(i).getQtdProduto());
                    listaProduto.get(j).setQuantidade(listaProduto.get(j).getQuantidade()-produtoVenda.get(i).getQtdProduto());
                }
            }
        }*/
    }    
}
