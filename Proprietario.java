public class Proprietario extends Pessoa implements RecebeValor{
    private String conta;
    private String agencia;

    public Proprietario(String nome, String telefone, String endereco, String cpf, String conta, String agencia){
        super(nome,telefone,endereco,cpf);
        this.agencia = agencia;
        this.conta = conta;
    }


    @Override
    public void receber(double valor) {
        System.out.println("Proprietario : " + getNome() + " | está Recebendo : R$" + valor);
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
}
