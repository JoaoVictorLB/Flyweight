package min.java.flyweight;

public class Pagamento {
    private String numero;
    private String documento;

    public Pagamento(String numero, String documento) {
        this.numero = numero;
        this.documento = documento;
    }

    public String getNumero() {
        return numero;
    }

    public String getDocumento() {
        return documento;
    }
}
