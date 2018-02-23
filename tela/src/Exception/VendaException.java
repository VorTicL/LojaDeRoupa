/*
* Classe que define os atributos das vendas da loja de roupa.
*/
package Exception;
/**
 * @author Victor Raphael Silva deLucca
 * Alexandre
 * Marcelo Liebhardt
 * Marcos
 */
public class VendaException extends Exception{
    // Construtor que recebe possíveis erros dos atributos da classe Venda
    // retorna uma mensagem para ser exibida indicando o erro
    public VendaException(String message) {
        super(message);
    }
    
}
