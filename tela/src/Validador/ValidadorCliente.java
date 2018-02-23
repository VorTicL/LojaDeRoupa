/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

import Cliente.Cliente;
import Exception.ClienteException;

/**
 *
 * @author Gabra
 */
public class ValidadorCliente {
    public static void validadorCliente(Cliente cliente) throws ClienteException{
        if (cliente.getNome().isEmpty()) {
            throw new ClienteException("É necessário informar o nome do "
                    + "cliente");
        }
        if (cliente.getSobrenome().isEmpty() ) {
            throw new ClienteException("É necessário informar o "
                    + " sobrenome do cliente");
        }
        if (cliente.getCPFCNPJ().isEmpty() ) {
            throw new ClienteException("É necessário informar a "
                    + "CPF/CNPJ do cliente");
        }
        if(cliente.getCPFCNPJ().length()==11 || cliente.getCPFCNPJ().length()==14){
            boolean ok=false;
            for (int i = 0; i < cliente.getCPFCNPJ().length(); i++) {
                ok = cliente.getCPFCNPJ().charAt(i)=='0' ||
                     cliente.getCPFCNPJ().charAt(i)=='1' ||
                     cliente.getCPFCNPJ().charAt(i)=='2' ||
                     cliente.getCPFCNPJ().charAt(i)=='3' ||
                     cliente.getCPFCNPJ().charAt(i)=='4' ||
                     cliente.getCPFCNPJ().charAt(i)=='5' ||
                     cliente.getCPFCNPJ().charAt(i)=='6' ||
                     cliente.getCPFCNPJ().charAt(i)=='7' ||
                     cliente.getCPFCNPJ().charAt(i)=='8' ||
                     cliente.getCPFCNPJ().charAt(i)=='9'; 
            }
            if (ok==false) {
                throw new ClienteException("CPF ou CNPJ contém caractere inválido");
            }
        }else{
            throw new ClienteException("Quantidade de caracteres do CPF ou CNPJ inválida");
        }
        if (cliente.getDataNascimento()==null) {
            throw new ClienteException("É necessário informar o "
                    + "data de nascimento do cliente");
        }
        if (cliente.getTelefone().isEmpty()) {
            throw new ClienteException("É necessário informar o "
                    + "telefone do cliente");
        }
        if(cliente.getTelefone().length()==10 || cliente.getTelefone().length()==11){
            boolean ok=false;
            for (int i = 0; i < cliente.getTelefone().length(); i++) {
                ok = cliente.getTelefone().charAt(i)=='0' ||
                     cliente.getTelefone().charAt(i)=='1' ||
                     cliente.getTelefone().charAt(i)=='2' ||
                     cliente.getTelefone().charAt(i)=='3' ||
                     cliente.getTelefone().charAt(i)=='4' ||
                     cliente.getTelefone().charAt(i)=='5' ||
                     cliente.getTelefone().charAt(i)=='6' ||
                     cliente.getTelefone().charAt(i)=='7' ||
                     cliente.getTelefone().charAt(i)=='8' ||
                     cliente.getTelefone().charAt(i)=='9'; 
            }
            if (ok==false) {
                throw new ClienteException("O telefone contém caractere inválido");
            }
        }else{
            throw new ClienteException("Quantidade de caracteres do telefone inválida");
        }
        /*if (cliente.getEmail().isEmpty()) {
            throw new ClienteException("É necessário informar o "
                    + "email do cliente");
        }*/
        if (cliente.getCidade().isEmpty()) {
            throw new ClienteException("É necessário informar a "
                    + "cidade do cliente");
        }
        if (cliente.getEndereco().isEmpty()) {
            throw new ClienteException("É necessário informar o "
                    + "endereÃ§o do cliente");
        }
        
        /*if (cliente.getComplemento().isEmpty()) {
            throw new ClienteException("É necessário informar o "
                   + "complemento do cliente");
        }*/
        if (cliente.getNumEnd().isEmpty()) {
            throw new ClienteException("É necessário informar o "
                    + "número do endereço");
        }
        if(cliente.getNumEnd().length()>0){
            boolean ok=false;
            for (int i = 0; i < cliente.getNumEnd().length(); i++) {
                ok = cliente.getNumEnd().charAt(i)=='0' ||
                     cliente.getNumEnd().charAt(i)=='1' ||
                     cliente.getNumEnd().charAt(i)=='2' ||
                     cliente.getNumEnd().charAt(i)=='3' ||
                     cliente.getNumEnd().charAt(i)=='4' ||
                     cliente.getNumEnd().charAt(i)=='5' ||
                     cliente.getNumEnd().charAt(i)=='6' ||
                     cliente.getNumEnd().charAt(i)=='7' ||
                     cliente.getNumEnd().charAt(i)=='8' ||
                     cliente.getNumEnd().charAt(i)=='9'; 
            }
            if (ok==false) {
                throw new ClienteException("O número do endereço contém caractere inválido");
            }
        }else{
            throw new ClienteException("Quantidade de caracteres do número do endereço inválida");
        }
        if (cliente.getBairro().isEmpty()) {
            throw new ClienteException("É necessário informar a "
                    + "bairro do cliente");
        }
        if (cliente.getCep().isEmpty()) {
            throw new ClienteException("É necessário informar o "
                    + "CEP do cliente");
        }
        if(cliente.getCep().length()==8){
            boolean ok=false;
            for (int i = 0; i < cliente.getCep().length(); i++) {
                ok = cliente.getCep().charAt(i)=='0' ||
                     cliente.getCep().charAt(i)=='1' ||
                     cliente.getCep().charAt(i)=='2' ||
                     cliente.getCep().charAt(i)=='3' ||
                     cliente.getCep().charAt(i)=='4' ||
                     cliente.getCep().charAt(i)=='5' ||
                     cliente.getCep().charAt(i)=='6' ||
                     cliente.getCep().charAt(i)=='7' ||
                     cliente.getCep().charAt(i)=='8' ||
                     cliente.getCep().charAt(i)=='9'; 
            }
            if (ok==false) {
                throw new ClienteException("O número do CEP contém caractere inválido");
            }
        }else{
            throw new ClienteException("Quantidade de caracteres do CEP inválida");
        } 
        if (cliente.getEstado().compareTo("")==0 && cliente.getEstado().isEmpty()) {
            throw new ClienteException("É necessário informar o "
                    + "estado do cliente");
        } 
        
    }
}