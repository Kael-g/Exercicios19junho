abstract class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    void aumentoSalario(){
        salario *= 1.1;
    }

}
