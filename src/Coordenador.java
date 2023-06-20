public class Coordenador  extends Funcionario{
    private Professor[] professoresSupervisionados;

    private int qtdProfessoresSupervisionados;

    public Coordenador(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = new Professor[20];
        this.qtdProfessoresSupervisionados = 0;
    }

    public boolean addProfessor(Professor professor){
        boolean add = false;
        if (qtdProfessoresSupervisionados < professoresSupervisionados.length){
            professoresSupervisionados[qtdProfessoresSupervisionados++] = professor;
            add = true;
        }
        return add;
    }

    public Professor[] getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    @Override
    double reembolsoDespesas(double despesa) {
        return despesa+getSalario();
    }

    @Override
    void aumentoSalario() {
        super.setSalario(getSalario()*1.05);
    }
}
