/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import Cliente.Cliente;
import Exception.ClienteException;
import Exception.DataSourceException;
import Produto.Produto;
import Validador.ValidadorCliente;
import java.util.ArrayList;

/**
 *
 * @author Gabra
 */
public class ServicoCliente {
    public static void cadastrarCliente(Cliente cliente)throws ClienteException, 
            DataSourceException{
        ValidadorCliente.validadorCliente(cliente);
        
        try {
            
            Mock.mockCliente.inserir(cliente);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro ao cadastrar cliente, tente novamente.", e);
        }
    }
    
    public static void excluirCliente(int id)throws ClienteException, 
            DataSourceException{
        try {
            Mock.mockCliente.excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro ao excluir cliente, tente novamente", e);
        }
    }
    
    public static java.util.ArrayList<Cliente>  procurarCliente(String a)throws ClienteException, 
            DataSourceException{
        ArrayList <Cliente> cli = new ArrayList<Cliente>();
        try {
            cli=Mock.mockCliente.procurar(a);
            return cli;
        } catch (Exception e) {
            throw new DataSourceException("erro ao procurar cliente: "
                    + a, e);
        }
        
    }
    public static java.util.ArrayList<Cliente> listarCliente()throws ClienteException, 
            DataSourceException{
        ArrayList <Cliente> cli = new ArrayList<Cliente>();
        try {
            cli=Mock.mockCliente.listar();
            return cli;
        } catch (Exception e) {
            throw new DataSourceException("Erro ao lista clientes", e);
        }
        
    }
    /*public static Cliente obterCliente(int a)throws ClienteException, 
            DataSourceException{
        Cliente cli = new Cliente();
        try {
            cli=Mock.mockCliente.obter(a);
            return cli;
        } catch (Exception e) {
            throw new DataSourceException("Erro ao obter o cliente, por favor tente novamente", e);
        }
    }*/
    public static void atualizarCliente(Cliente cli)throws ClienteException, 
            DataSourceException{
        ValidadorCliente.validadorCliente(cli);
        try {
            Mock.mockCliente.atualizar(cli);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro ao atualizar cliente, tente novamente", e);
        }
    }
}
