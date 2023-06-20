import java.text.DecimalFormat;

public class Teste {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        Professor professor1 = new Professor("Leandro", "12312312399",11111,"Orgao II",2300.00,"Superior", new String[]{"matematica", "logica"});
        professor1.addEstagiario(new Estagiario("Juca","12312312312",99999,"Orgao",600.00, professor1));
        professor1.addTurma(new Turma("c5m",23));
        Coordenador coordenador1 = new Coordenador("Roberta","98798798778",345162,"Orgao cord",4800);
        coordenador1.addProfessor(professor1);
        FuncionarioAdministrativo funcionario1 = new FuncionarioAdministrativo("Rogerio","35897125632",98765,"Orgao 47",7000,"diretor", "top");

        System.out.println("-------- Professor --------");
        System.out.println("Nome: "+professor1.getNome());
        System.out.println("CPF: "+professor1.getCpf());
        System.out.println("Número de registro: "+professor1.getNumeroRegistro());
        System.out.println("Órgão de lotação: "+professor1.getOrgaoLotacao());
        System.out.println("Salário: R$ "+ df.format(professor1.getSalario()));
        professor1.aumentoSalario();
        System.out.println("Salário após aumento: R$ "+df.format(professor1.getSalario()));
        System.out.println("Nível de graduação: "+professor1.getNivelGraduacao());
        System.out.print("Disciplinas: ");
        for (String d: professor1.getDisciplina()) {
            System.out.print(d + "  ");
        }
        System.out.println("\nEstagiários: ");
        for (Estagiario e : professor1.getEstagiarios()) {
            if (e != null){
                System.out.println(e.getNome()+ "(bolsa de R$ "+df.format(e.getBolsa())+")     ");
            }
        }
        System.out.print("Turmas: "+professor1.getQtdTurmas());
        System.out.println("Alunos: "+professor1.getQtdAlunos());
        System.out.println();
        System.out.println("-------- COORDENADOR --------");
        System.out.println("Nome: "+coordenador1.getNome());
        System.out.println("CPF: "+coordenador1.getCpf());
        System.out.println("Número de registro: "+coordenador1.getNumeroRegistro());
        System.out.println("Órgão de lotação: "+coordenador1.getOrgaoLotacao());
        System.out.println("Salário: R$ "+ df.format(coordenador1.getSalario()));
        coordenador1.aumentoSalario();
        System.out.println("Salário após aumento: R$ "+df.format(coordenador1.getSalario()));
        System.out.print("Professores coordenados: ");
        for (Professor p : coordenador1.getProfessoresSupervisionados()) {
            if (p != null) {
                System.out.println(p.getNome() + "     ");
            }
        }
        System.out.println();
        System.out.println("-------- FUNCIONÁRIO ADMINISTRATIVO --------");
        System.out.println("Nome: "+funcionario1.getNome());
        System.out.println("CPF: "+funcionario1.getCpf());
        System.out.println("Número de registro: "+funcionario1.getNumeroRegistro());
        System.out.println("Órgão de lotação: "+funcionario1.getOrgaoLotacao());
        System.out.println("Salário: R$ "+ df.format(funcionario1.getSalario()));
        funcionario1.aumentoSalario();
        System.out.println("Salário após aumento: R$ "+df.format(funcionario1.getSalario()));
        System.out.println("Função administrativa: "+funcionario1.getFuncaoAdministrativa());
        System.out.println("Senioridade: "+funcionario1.getSenioridade());

    }
}


