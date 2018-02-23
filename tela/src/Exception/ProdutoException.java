/*
* Classe que define os atributos dos produtos da loja de roupa.
*/
package Exception;
/**
 * @author Victor Raphael Silva deLucca
 * Alexandre
 * Marcelo Liebhardt
 * Marcos
 */
public class ProdutoException extends Exception {
    // Construtor que recebe possíveis erros dos atributos da classe Produto
    // retorna uma mensagem para ser exibida indicando o erro
    public ProdutoException(String message) {
        super(message);
    }
}
