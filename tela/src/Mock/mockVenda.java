package Mock;

import Cliente.Cliente;
import Conexao.UtilitarioConexao;
import Produto.Produto;
import Venda.ItensVenda;
import Venda.Venda;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class mockVenda {

    private static int contadorVenda = 0;
    private static ArrayList<Venda> listaVenda = new ArrayList<Venda>();

    public static void inserir(Venda venda) throws Exception {
        /*venda.setId(contadorVenda++);
        listaVenda.add(venda);*/
        
        String sql = "INSERT INTO VENDAS (DATA_VENDA, FORMAPAGAMENTO, "
                + "VALORTOTAL, IDCLI) VALUES (?, ?, ?, ?)";
        String sq2 = "INSERT INTO ITENSVENDA (IDPROD, QTDPROD, "
                + "IDVENDA) VALUES (?, ?, ?)";
        String sq3 = "Select max(ID) From vendas";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = UtilitarioConexao.getConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement1 = connection.prepareStatement(sq2);
            preparedStatement2 = connection.prepareStatement(sq3);
            //Configura os parâmetros do "PreparedStatement"
            Timestamp t = new Timestamp(venda.getDataVenda().getTime());
            preparedStatement.setTimestamp(1, t);
            preparedStatement.setString(2, venda.getFormaPagamento());
            preparedStatement.setDouble(3, venda.getTotalVenda());
            preparedStatement.setInt(4, venda.getCliente().getId());
            preparedStatement.execute();
            result = preparedStatement2.executeQuery();
            result.next();
            //Executa o comando no banco de dados
            for (int i = 0; i < venda.getItens().size(); i++) {
                preparedStatement1.setInt(1, venda.getItens().get(i).getProduto().getID());
                preparedStatement1.setInt(2, venda.getItens().get(i).getQtdProduto());
                preparedStatement1.setInt(3, result.getInt(1));
                preparedStatement1.execute();
            }   
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

    /*public static void excluir(Integer id) throws Exception {
        if (id != null && !listaVenda.isEmpty()) {
            for (int i = 0; i < listaVenda.size(); i++) {
                Venda venda1 = listaVenda.get(i);
                if (venda1 != null && venda1.getId() == id) {
                    listaVenda.remove(i);
                    break;
                }
            }
        }
    }*/

    //retorna a lista de vendas
    /*public static java.util.List<Venda> listar()
            throws Exception {
        return listaVenda;
    }
     */

    //Pesquisa vendas entre as datas determinadas
    public static java.util.ArrayList<Venda> buscaDataVenda(Date data1, Date data2)
            throws Exception {
        java.util.ArrayList<Venda> listaResultado = new ArrayList<Venda>();
       
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        data1 = calendar.getTime();
        Timestamp d1 = new Timestamp(data1.getTime());
        calendar = Calendar.getInstance();
        calendar.setTime(data2);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        data2 = calendar.getTime();
        Timestamp d2 = new Timestamp(data2.getTime());
        
        String sql = "Select * From Vendas WHERE data_venda BETWEEN ? AND ?";
        String sq2 = "Select *"
                + "From ITENSVENDA "
                + "WHERE idvenda=?";
        String sq3= "Select * From Produtos WHERE id=?";
        String sq4= "Select * from Clientes Where id=?";
        
        Connection connection = null;
        ResultSet result = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        PreparedStatement preparedStatement3 = null;
        
        try {
            //Abre uma conexão com o banco de dados
            connection = UtilitarioConexao.getConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setTimestamp(1, d1);
            preparedStatement.setTimestamp(2, d2);
            //Executa o comando no banco de dados
            result = preparedStatement.executeQuery();
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                //Cria uma instância de Cliente e popula com os valores do BD
                Venda venda = new Venda();
                venda.setDataVenda(result.getTimestamp("data_venda"));
                venda.setFormaPagamento(result.getString("FORMAPAGAMENTO"));
                int idVenda=result.getInt("ID");
                ArrayList<ItensVenda> itens =new ArrayList<ItensVenda>();
                ResultSet result1 = null;
                preparedStatement1 = connection.prepareStatement(sq2);
                preparedStatement1.setInt(1, idVenda);
                result1 = preparedStatement1.executeQuery();
                while (result1.next()){
                    ItensVenda item = new ItensVenda();
                    item.setQtdProduto(result1.getInt("QTDPROD"));
                    ResultSet result2 = null;
                    preparedStatement2= connection.prepareStatement(sq3);
                    preparedStatement2.setInt(1, result1.getInt("IDPROD"));
                    result2 = preparedStatement2.executeQuery();
                    Produto produto= new Produto();
                    result2.next();
                    produto.setNome(result2.getString("NOME"));
                    produto.setPreco(result2.getDouble("PRECO"));
                    produto.setColecao(result2.getString("COLECAO"));
                    item.setProduto(produto);
                    itens.add(item);
                }
                ResultSet result3 = null;
                preparedStatement3= connection.prepareStatement(sq4);
                preparedStatement3.setInt(1, result.getInt("IDCLI"));
                result3 = preparedStatement3.executeQuery();
                while(result3.next()){
                    Cliente cliente=new Cliente();
                    cliente.setNome(result3.getString("nomecli"));
                    cliente.setSobrenome(result3.getString("sobrenome"));
                    venda.Cliente(cliente);
                }
                venda.setItens(itens);
                venda.setTotalVenda();
                //Adiciona a instância na lista
                listaResultado.add(venda);
            }
            //Configura os parâmetros do "PreparedStatement"
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
        
        
        /*for (Venda venda : listaVenda) {
            if (data1.before(venda.getDataVenda())
                    && data2.after(venda.getDataVenda())) {
                listaResultado.add(venda);
            }
        }*/
        
        return listaResultado;
    }

}
