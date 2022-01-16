package entidade;

import java.util.List;
import java.util.LinkedList;

import disciplina.Disciplina;

public class Aluno {
    private String nome;
    private String matricula;
    private List<Disciplina> disciplinasCursando;
    private float totalNota = 0;
    
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasCursando = new LinkedList<>();
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Disciplina> getDisciplinasCursando() {
        return disciplinasCursando;
    }

    public void setDisciplinasCursando(List<Disciplina> disciplinasCursando) {
        this.disciplinasCursando = disciplinasCursando;
    }

    public void addDisciplina (Disciplina disciplina){
        disciplinasCursando.add(disciplina);
    }


    public String getDisciplina(String codigo){
        for (Disciplina d: disciplinasCursando) {
            if(d.getCodigo().equals(codigo)){
                return d.toString();
            }
        }
        return null;
    }

    public boolean getBuscaDisciplina(String codigo) {
        String busca = getDisciplina(codigo);
        if (busca != null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void imprimeAluno() {
        System.out.println("Matricula: " + matricula + " - Nome: " + nome);
    }


    
}
