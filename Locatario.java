public class Locatario extends Pessoa{
    private String email;
    private double salario;

    public Locatario(String nome,String cpf, String telefone ,String endereco, String email, double salario){
        super(nome, cpf, telefone,endereco);
        this.email = email;
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
