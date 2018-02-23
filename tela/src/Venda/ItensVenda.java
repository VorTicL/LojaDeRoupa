/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Venda;

import Produto.Produto;

/**
 *
 * @author victor.rslucca
 */
public class ItensVenda {
    private Produto produto;
    private int qtdProduto;
    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }
    
    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
    
    public double calcularPreco(){
        double valorTotal;
        valorTotal = qtdProduto*produto.getPreco();
        return valorTotal;
    }
    
}
