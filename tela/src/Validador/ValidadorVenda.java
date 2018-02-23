
package Validador;

import Exception.VendaException;
import Venda.Venda;

public class ValidadorVenda {
    public static  void validar(Venda venda) throws VendaException{
        //Realização de validações de negócio
        if (venda == null) {
            throw new VendaException("É necessario informar os produtos, cliente"
                    + " e forma de pagamento, para realizar a venda");
        }
        if (venda.getItens().isEmpty()) {
            throw new VendaException("É necessário adicionar pelo menos um "
                    + "produto");
        }
        if (venda.getCliente().getNome() == null) {
            throw new VendaException("É necessário informar o "
                    + "cliente");
        }
        if (venda.getFormaPagamento() == null ) {
            throw new VendaException("É necessário informar a "
                    + "forma de pagamento");
        }
    }
}
