/*
 * Classe que trata os erros de inserção, alteração e exclusão de dados no mock
 */
package Exception;
/**
 * @author Victor Raphael Silva de Lucca
 * Alexandre
 * Marcelo Liebhardt
 * Marcos
 */
public class DataSourceException extends Exception{
    // Construtor que recebe possíveis erros do pacote Mock
    // retorna uma mensagem para ser exibida indicando o erro 
     public DataSourceException(String message) {
        super(message);
    }

    // Construtor que recebe possíveis erros do pacote Mock
    // retorna uma mensagem para ser exibida indicando o erro
    public DataSourceException(String message, Throwable cause) {
        super(message, cause);
    }

    // Construtor que recebe possíveis erros do pacote Mock
    // retorna uma mensagem para ser exibida indicando o erro
    public DataSourceException(Throwable cause) {
        super(cause);
    }
}
