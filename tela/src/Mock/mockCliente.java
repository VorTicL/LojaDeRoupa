/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import Cliente.Cliente;
import Conexao.UtilitarioConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gabra
 */
public class mockCliente {

    //private static int totalClientes = 0;
    /**
     * Armazena a lista de clientes inseridos para manipulaÃ§Ã£o. #MOCK *
     */
    private static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    //Insere um cliente no mock "cliente"
    public static void inserir(Cliente cliente)
            throws Exception {
        /*cliente.setId(totalClientes++);
        listaClientes.add(cliente);*/
        //BANCO DE DADOS
        String sql = "INSERT INTO CLIENTES (NOMECLI, CPFCNPJ, "
                + "DATA_DE_NASCCLI, TELEFONECLI, EMAILCLI, CIDADECLI, "
                + "ESTADOCLI, ENDERECOCLI, COMPLEMENTOCLI, NUMEROCLI, BAIRROCLI, "
                + "CEPCLI, SOBRENOME, ENABLE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = UtilitarioConexao.getConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCPFCNPJ());
            Timestamp t = new Timestamp(cliente.getDataNascimento().getTime());
            preparedStatement.setTimestamp(3, t);
            preparedStatement.setString(4, cliente.getTelefone());
            preparedStatement.setString(5, cliente.getEmail());
            preparedStatement.setString(6, cliente.getCidade());
            preparedStatement.setString(7, cliente.getEstado());
            preparedStatement.setString(8, cliente.getEndereco());
            preparedStatement.setString(9, cliente.getComplemento());
            preparedStatement.setString(10, cliente.getNumEnd());
            preparedStatement.setString(11, cliente.getBairro());
            preparedStatement.setString(12, cliente.getCep());
            preparedStatement.setString(13, cliente.getSobrenome());
            preparedStatement.setBoolean(14, true);
            
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
    public static void atualizar(Cliente clienteProcura)
            throws Exception {
        /*if (clienteProcura != null && clienteProcura.getNome() != null && !listaClientes.isEmpty()) {
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i) != null && listaClientes.get(i).getId() == clienteProcura.getId()) {
                    listaClientes.get(i).setNome(clienteProcura.getNome());
                    listaClientes.get(i).setBairro(clienteProcura.getBairro());
                    listaClientes.get(i).setCep(clienteProcura.getCep());
                    listaClientes.get(i).setCidade(clienteProcura.getCidade());
                    listaClientes.get(i).setComplemento(clienteProcura.getComplemento());
                    listaClientes.get(i).setCPFCNPJ(clienteProcura.getCPFCNPJ());
                    listaClientes.get(i).setDataNascimento(clienteProcura.getDataNascimento());
                    listaClientes.get(i).setEmail(clienteProcura.getEmail());
                    listaClientes.get(i).setEndereco(clienteProcura.getEndereco());
                    listaClientes.get(i).setEstado(clienteProcura.getEstado());
                    listaClientes.get(i).setNumEnd(clienteProcura.getNumEnd());
                    listaClientes.get(i).setSobrenome(clienteProcura.getSobrenome());
                    listaClientes.get(i).setTelefone(clienteProcura.getTelefone());
                    break;
                }
            }
        }*/
        //Banco de dados
        String sql = "UPDATE Clientes SET NOMECLI=?, CPFCNPJ=?, DATA_DE_NASCCLI=?, TELEFONECLI=?, EMAILCLI=?, CIDADECLI=?, ESTADOCLI=?, ENDERECOCLI=?, COMPLEMENTOCLI=?, NUMEROCLI=?, BAIRROCLI=?, CEPCLI=?, SOBRENOME=?, ENABLE=? "
            + "WHERE (ID=?)";
        
        Connection connection = null;
        
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = UtilitarioConexao.getConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, clienteProcura.getNome());
            preparedStatement.setString(2, clienteProcura.getCPFCNPJ()); 
            Timestamp t = new Timestamp(clienteProcura.getDataNascimento().getTime());
            preparedStatement.setTimestamp(3, t);
            preparedStatement.setString(4, clienteProcura.getTelefone());
            preparedStatement.setString(5, clienteProcura.getEmail());
            preparedStatement.setString(6, clienteProcura.getCidade());
            preparedStatement.setString(7, clienteProcura.getEstado());
            preparedStatement.setString(8, clienteProcura.getEndereco());
            preparedStatement.setString(9, clienteProcura.getComplemento());
            preparedStatement.setString(10, clienteProcura.getNumEnd());
            preparedStatement.setString(11, clienteProcura.getBairro());
            preparedStatement.setString(12, clienteProcura.getCep());
            preparedStatement.setString(13, clienteProcura.getSobrenome());
            preparedStatement.setBoolean(14, true);
            preparedStatement.setInt(15, clienteProcura.getId());
            
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
    
    public static void excluir(int id) throws Exception {
        /*if (id >= 0 && !listaClientes.isEmpty()) {
            for (int i = 0; i < listaClientes.size(); i++) {
                Cliente clienteLi = listaClientes.get(i);
                if (clienteLi != null && clienteLi.getId() == id) {
                    listaClientes.remove(i);
                    break;
                }
            }
        }*/
        
        String sql = "UPDATE clientes SET enable=? WHERE (ID=?)";
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

    //Lista todos os clientes
    public static ArrayList<Cliente> listar()
            throws Exception {
        //Retorna a lista de clientes
        //return listaClientes;
        String sql = "SELECT * FROM CLIENTES WHERE (enable=?)";       
        //Lista de clientes de resultado
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
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
            preparedStatement.setBoolean(1, true);
            
            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                //Cria uma instância de Cliente e popula com os valores do BD
                Cliente cliente = new Cliente();
                cliente.setId(result.getInt("ID"));
                cliente.setNome(result.getString("NOMECLI"));
                cliente.setBairro(result.getString("BAIRROCLI"));
                cliente.setCPFCNPJ(result.getString("CPFCNPJ"));
                cliente.setCep(result.getString("CEPCLI"));
                cliente.setCidade(result.getString("CIDADECLI"));
                cliente.setComplemento(result.getString("COMPLEMENTOCLI"));
                cliente.setEmail(result.getString("EMAILCLI"));
                cliente.setEndereco(result.getString("ENDERECOCLI"));
                cliente.setEstado(result.getString("ESTADOCLI"));
                cliente.setNumEnd(result.getString("NUMEROCLI"));
                cliente.setTelefone(result.getString("TELEFONECLI"));
                cliente.setSobrenome(result.getString("SOBRENOME"));
                Date d = new Date(result.getTimestamp("DATA_DE_NASCCLI").getTime());
                cliente.setDataNascimento(d);
                //Adiciona a instância na lista
                listaClientes.add(cliente);
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
        return listaClientes;
    }

    //Procura um cliente no mock, de acordo com o nome
    //ou com o sobrenome, passado como parÃ¢metro
    public static ArrayList<Cliente> procurar(String valor)
            throws Exception {

        /*if (valor != null && !listaClientes.isEmpty()) {
            for (Cliente clienteLi : listaClientes) {
                if (clienteLi != null && clienteLi.getNome() != null
                        && clienteLi.getSobrenome() != null) {
                    if (clienteLi.getNome().toUpperCase().contains(valor.toUpperCase())
                            || clienteLi.getSobrenome().toUpperCase().contains(valor.toUpperCase())) {
                        listaResultado.add(clienteLi);
                    }
                }
            }
        }*/

        //Retorna a lista de clientes encontrados
        //return listaResultado;
        
        String sql = "SELECT * FROM CLIENTES WHERE ((UPPER(NOMECLI) LIKE UPPER(?) "
            + "OR UPPER(SOBRENOME) LIKE UPPER(?)) AND enable=?)";
        //Lista de clientes de resultado
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
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
            preparedStatement.setString(2, "%" + valor + "%");
            preparedStatement.setBoolean(3, true);
            
            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                //Cria uma instância de Cliente e popula com os valores do BD
                Cliente cliente = new Cliente();
                cliente.setId(result.getInt("ID"));
                cliente.setNome(result.getString("NOMECLI"));
                cliente.setBairro(result.getString("BAIRROCLI"));
                cliente.setCPFCNPJ(result.getString("CPFCNPJ"));
                cliente.setCep(result.getString("CEPCLI"));
                cliente.setCidade(result.getString("CIDADECLI"));
                cliente.setComplemento(result.getString("COMPLEMENTOCLI"));
                cliente.setEmail(result.getString("EMAILCLI"));
                cliente.setEndereco(result.getString("ENDERECOCLI"));
                cliente.setEstado(result.getString("ESTADOCLI"));
                cliente.setNumEnd(result.getString("NUMEROCLI"));
                cliente.setTelefone(result.getString("TELEFONECLI"));
                cliente.setSobrenome(result.getString("SOBRENOME"));
                Date d = new Date(result.getTimestamp("DATA_DE_NASCCLI").getTime());
                cliente.setDataNascimento(d);
                //Adiciona a instância na lista
                listaClientes.add(cliente);
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
        return listaClientes;
    }

    //ObtÃ©m um cliente da lista
    /*public static Cliente obter(Integer id)
            throws Exception {
        if (id != null && !listaClientes.isEmpty()) {
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i) != null && listaClientes.get(i).getId() == id) {
                    return listaClientes.get(i);
                }
            }
        }
        return null;
    }*/
}
