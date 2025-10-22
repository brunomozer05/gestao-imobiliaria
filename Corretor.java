public class Corretor extends Pessoa implements RecebeValor{
    private String registro;
    private String dataAdimissao;
    private double comissao;
    private double totalComissaoAcumulada;

    public Corretor(String nome,String cpf, String telefone , String email, String registro, String dataAdimissao,double comissao){
    super(nome,cpf,telefone,email);
    this.registro = registro;
    this.dataAdimissao = dataAdimissao;
    this.comissao = comissao;
    }



    @Override
    public void receber(double valor) {

    }
}
