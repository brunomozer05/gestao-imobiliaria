public class Corretor extends Pessoa implements RecebeValor {
    private String registro;
    private String dataAdmissao;
    private double comissao;
    private double totalComissaoAcumulada;

    public Corretor(String nome, String telefone, String endereco, String cpf, String registro, String dataAdmissao, double comissao) {
        super(nome, telefone, endereco, cpf);
        this.registro = registro;
        this.dataAdmissao = dataAdmissao;
        this.comissao = comissao;
        this.totalComissaoAcumulada = 0.0;
    }

    @Override
    public void receber(double valor) {
    }
}