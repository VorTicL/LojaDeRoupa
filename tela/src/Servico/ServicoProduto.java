/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import Cliente.Cliente;
import Exception.ClienteException;
import Exception.DataSourceException;
import Exception.ProdutoException;
import Exception.VendaException;
import Produto.Produto;
import Validador.ValidadorProduto;
import Venda.ItensVenda;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gabra
 */
public class ServicoProduto {
    public static void cadastrarProduto(Produto produto)throws ProdutoException, 
            DataSourceException,
            VendaException{
        ValidadorProduto.validar(produto);
        
        try {
            
            Mock.mockProduto.inserir(produto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro ao cadastrar o produto, tente novamente", e);
        }
    }
    
    public static void excluirProduto(Integer id)throws ProdutoException, 
            DataSourceException{
        try {
            Mock.mockProduto.excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro ao excluir o produto, tente novamente", e);
        }
    }
    
    public static java.util.ArrayList<Produto> procurarProduto(String a)throws ProdutoException, 
            DataSourceException{
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        try {
            listaProduto = Mock.mockProduto.buscaProduto(a);
            return listaProduto;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro ao procurar o produto: "+a, e);
        }
    }
    public static java.util.ArrayList<Produto> listarProduto()throws ProdutoException, 
            DataSourceException{
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        try {
            listaProduto = Mock.mockProduto.listar();
            return listaProduto;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro ao verificar lista de produtos", e);
        }
    }
    
    public static void atualizarProduto(Produto prod, int id)throws ProdutoException, 
            DataSourceException, VendaException{
        ValidadorProduto.validar(prod);
        try {
            Mock.mockProduto.atualizar(prod, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Produto não encontrado", e);
        }
    }
}
