public class Estagiario extends Pessoa{
    private double bolsa;

    private Professor professor;

    public Estagiario(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double bolsa, Professor professor) {
        super(nome, cpf, numeroRegistro, orgaoLotacao);
        this.bolsa = bolsa;
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public double getBolsa() {
        return bolsa;
    }

    @Override
    double reembolsoDespesas(double despesa) {
        return despesa+bolsa;
    }
}
