/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

/**
 *
 * @author noeli
 */
public class Produto {
    private String nome;
    private String tamanho;
    private int quantidade;
    private String colecao;
    private String sexo;
    private String cor;
    private int ID;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getID() {
        return ID;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getColecao() {
        return colecao;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
