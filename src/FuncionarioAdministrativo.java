public class FuncionarioAdministrativo extends Funcionario{
    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionarioAdministrativo(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    @Override
    double reembolsoDespesas(double despesa) {
        return despesa+getSalario();
    }
}
