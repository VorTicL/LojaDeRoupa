/*
* Classe que define os atributos dos clientes da loja de roupa.
*/
package Cliente;

import java.util.Date;
/**
 * @author Victor Raphael Silva deLucca
 * Alexandre
 * Marcelo Liebhardt
 * Marcos
 */
public class Cliente {
    //Atributos
    private Integer id;
    private String nome;
    private String sobrenome;
    private String CPFCNPJ;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String cidade;
    private String estado;
    private String endereco;
    private String numEnd;
    private String bairro;
    private String complemento;
    private String cep;

    // Getters and Setters
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumEnd() {
        return numEnd;
    }

    public void setNumEnd(String numEnd) {
        this.numEnd = numEnd;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getCPFCNPJ() {
        return CPFCNPJ;
    }
    
    public void setCPFCNPJ(String CPFCNPJ) {
        this.CPFCNPJ = CPFCNPJ;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
     public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

     public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
     public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
