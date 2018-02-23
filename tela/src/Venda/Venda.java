/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Venda;

import Cliente.Cliente;
import Produto.Produto;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author victor.rslucca
 */
public class Venda {
    private ArrayList<ItensVenda> itens;
    private Date dataVenda;
    private Cliente cliente;
    private double totalVenda;
    private String formaPagamento;
    private Integer Id;

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getId() {
        return Id;
    }

    public void itemVenda(){
        itens = new ArrayList<ItensVenda>();
    }
    public void Cliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setItens(ArrayList<ItensVenda> itens) {
        this.itens = itens;
    }
    
    public Date getDataVenda() {
        return dataVenda;
    }

    public Cliente getCliente() { 
        return cliente;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<ItensVenda> getItens() {
        return itens;
    }

    public void setTotalVenda() {
        for (int i = 0; i < itens.size(); i++) {
            totalVenda+=itens.get(i).calcularPreco();
        }
    }
    
}
