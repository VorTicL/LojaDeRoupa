
package Servico;

import Exception.DataSourceException;
import Exception.VendaException;
import Mock.mockProduto;
import Mock.mockVenda;
import Produto.Produto;
import Validador.ValidadorVenda;
import Venda.Venda;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ServicoVenda {
    public static void cadastrarVenda(Venda venda)throws VendaException, 
            DataSourceException{
        ValidadorVenda.validar(venda);
        

        try {    
            mockVenda.inserir(venda);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("erro no banco de dados", e);
        }
        try {
            mockProduto.decrementar(venda.getItens());
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro no estoque", e);
        }
    }
    
    /*public static void excluirVenda(Integer id)throws VendaException, 
            DataSourceException{
        try {
            mockVenda.excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("erro no banco de dados", e);
        }
    }*/
    
    public static ArrayList procurarVenda(Date date1, Date date2 )throws VendaException, 
            DataSourceException{
        ArrayList<Venda> prod = new ArrayList<Venda>();
        try {
            prod=mockVenda.buscaDataVenda(date1, date2);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("erro no banco de dados", e);
        }
        return prod;
    }

}
