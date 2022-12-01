package min.java.flyweight;

public class Bancario {
    private String nome;
    private Pagamento pagamento;

    public Bancario(String nome, Pagamento pagamento){
        this.nome = nome;
        this.pagamento = pagamento;
    }

    public String obterBancario(){
        return "Bancario{" +
                "nome='" + this.nome + '\'' +
                ", pagamento='" + pagamento.getNumero() + '\'' +
                ", documento='" + pagamento.getDocumento() + '\'' +
                '}';
    }
}
