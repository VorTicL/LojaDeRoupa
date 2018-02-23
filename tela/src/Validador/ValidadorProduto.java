/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

import Exception.VendaException;
import Produto.Produto;
import Venda.Venda;

/**
 *
 * @author Gabra
 */
public class ValidadorProduto {
    public static  void validar(Produto produto) throws VendaException{
        //Realização de validações de negócio
        if (produto == null) {
            throw new VendaException("É necessario informar informações do produto");
        }
        if (produto.getNome().isEmpty()) {
            throw new VendaException("É necessário informar o nome do "
                    + "produto");
        }
        if (produto.getSexo().isEmpty() && produto.getSexo().compareTo("")==0) {
            throw new VendaException("É necessário informar o "
                    + " genero do produto");
        }
        if (produto.getColecao().isEmpty() && produto.getColecao().compareTo("")==0) {
            throw new VendaException("É necessário informar a "
                    + "colecao do produto");
        }
        if (produto.getTamanho().isEmpty() && produto.getTamanho().compareTo("")==0) {
            throw new VendaException("É necessário informar o "
                    + "tamanho do produto");
        }
        if (produto.getQuantidade() == 0) {
            throw new VendaException("É necessário informar a "
                    + "quantidade deste produto");
        }
        if (produto.getCor().isEmpty() && produto.getCor().compareTo("")==0) {
            throw new VendaException("É necessário informar a "
                    + "cor deste produto");
        }
        if (produto.getPreco()== 0) {
            throw new VendaException("É necessário informar o "
                    + "preço deste produto");
        }
    }
}
