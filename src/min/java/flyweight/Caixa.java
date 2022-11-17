package min.java.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Caixa {
    private List<Bancario> bancarios = new ArrayList<>();

    public void cadastrarPagamento(String nomeBancario, String numeroPagamento, String documento) {
        Pagamento pagamento = PagamentoFactory.getPagamento(numeroPagamento, documento);
        Bancario bancario = new Bancario(nomeBancario, pagamento);
        bancarios.add(bancario);
    }

    public List<String> obterBancarios() {
        List<String> saida = new ArrayList<String>();
        for (Bancario bancario : this.bancarios) {
            saida.add(bancario.obterBancario());
        }
        return saida;
    }
}
