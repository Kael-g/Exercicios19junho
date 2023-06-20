abstract class Pessoa {
    private String nome;
    private String cpf;
    private int numeroRegistro;
    private String orgaoLotacao;

    public Pessoa(String nome, String cpf, int numeroRegistro, String orgaoLotacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.orgaoLotacao = orgaoLotacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    abstract double reembolsoDespesas(double despesa);

}
