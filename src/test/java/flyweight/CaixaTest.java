package test.java.flyweight;

import min.java.flyweight.Caixa;
import min.java.flyweight.PagamentoFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CaixaTest {

    @Test
    void deveRetornarBancarios() {
        Caixa caixa = new Caixa();
        caixa.cadastrarPagamento("Jose", "115", "Boleto");
        caixa.cadastrarPagamento("Maria", "116", "NF-e");
        caixa.cadastrarPagamento("Ana", "117", "NF");
        caixa.cadastrarPagamento("Joao", "117", "NF");

        List<String> saida = Arrays.asList(
                "Bancario{nome='Jose', pagamento='115', documento='Boleto'}",
                "Bancario{nome='Maria', pagamento='116', documento='NF-e'}",
                "Bancario{nome='Ana', pagamento='117', documento='NF'}",
                "Bancario{nome='Joao', pagamento='117', documento='NF'}");

        assertEquals(saida, caixa.obterBancarios());
    }

    @Test
    void deveRetornarTotalPagamentos() {
        Caixa caixa = new Caixa();
        caixa.cadastrarPagamento("Jose", "115", "Boleto");
        caixa.cadastrarPagamento("Maria", "116", "NF-e");
        caixa.cadastrarPagamento("Ana", "117", "NF");
        caixa.cadastrarPagamento("Joao", "117", "NF");

        assertEquals(2, PagamentoFactory.getTotalPagamentos());
    }
}
