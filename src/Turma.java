public class Turma {
    String nome;
    private int qtdAlunos;

    public Turma(String nome, int qtdAlunos) {
        this.nome = nome;
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }
}
