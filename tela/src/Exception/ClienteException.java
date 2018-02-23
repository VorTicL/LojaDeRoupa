/*
 *Classe que trata os erros relacionados ao Cliente
 */
package Exception;
/**
 * @author Victor Raphael Silva de Lucca
 * Alexandre
 * Marcelo Liebhardt
 * Marcos
 */
public class ClienteException extends Exception{
    // Construtor que recebe possíveis erros dos atributos da classe Cliente
    // retorna uma mensagem para ser exibida indicando o erro
    public ClienteException(String message) {
        super(message);
    }
}
