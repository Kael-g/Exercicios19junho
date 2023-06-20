public class Professor extends Funcionario{

    private String nivelGraduacao;

    private String[] disciplinas;

    private int qtdAlunos;

    private int qtdTurmas;

    private Turma[] turmas;

    private Estagiario[] estagiarios;


    public Professor(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String[] disciplinas) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinas = disciplinas;
        this.turmas = new Turma[10];
        this.qtdTurmas = 0;
        this.qtdAlunos = 0;
        this.estagiarios = new Estagiario[2];
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public String[] getDisciplina() {
        return disciplinas;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public Estagiario[] getEstagiarios(){
        return estagiarios;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    @Override
    double reembolsoDespesas(double despesa) {
        return despesa+getSalario();
    }

    public boolean addTurma(Turma turma){
        boolean add = false;
        if (qtdTurmas<turmas.length){
            turmas[qtdTurmas++] = turma;
            qtdAlunos += turma.getQtdAlunos();
            add = true;
        }
        return add;
    }

    public boolean addEstagiario(Estagiario estagiario){
        boolean add = false;
        for (int i = 0; i<estagiarios.length;i++){
            if (estagiarios[i]==null){
                estagiarios[i] = estagiario;
                add = true;
                break;
            }
        }
        return add;
    }

    public boolean removeEstagiario(Estagiario estagiario){
        boolean remove = false;
        for (int i = 0; i<estagiarios.length;i++){
            if (estagiarios[i].equals(estagiario)){
                estagiarios[i] = null;
                remove = true;
                break;
            }
        }
        return remove;
    }

}
