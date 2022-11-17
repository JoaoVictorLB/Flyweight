package min.java.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PagamentoFactory {
    private static Map<String, Pagamento> pagamentos = new HashMap<>();

    public static Pagamento getPagamento(String numero, String documento) {
        Pagamento pagamento = pagamentos.get(numero);
        if (pagamento == null) {
            pagamento = new Pagamento(numero, documento);
            pagamentos.put(numero, pagamento);
        }
        return pagamento;
    }

    public static int getTotalPagamentos() {
        return pagamentos.size();
    }
}
