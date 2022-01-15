package entidade;

import java.util.ArrayList;

import disciplina.Disciplina;

public class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<Disciplina> disciplinasCursando;
    private ArrayList<Float> notasAluno = new ArrayList<>();
    private float totalNota = 0;
    private String situacao = "reprovado";
    
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasCursando = new ArrayList<>();
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

    public ArrayList<Disciplina> getDisciplinasCursando() {
        return disciplinasCursando;
    }

    public void setDisciplinasCursando(ArrayList<Disciplina> disciplinasCursando) {
        this.disciplinasCursando = disciplinasCursando;
    }

    public ArrayList<Float> getNotasAluno() {
        return notasAluno;
    }

    public void setNotasAluno(ArrayList<Float> notasAluno) {
        this.notasAluno = notasAluno;
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


    public void insereNotas(Float nota){
        notasAluno.add(nota);
    }

    public void calculaNotasAlunos(){
        for (float nota: notasAluno){
            totalNota += nota;
        }

        if (totalNota >= 7.0f){
            this.situacao = "aprovado";
        }else{
            this.situacao = "reprovado";
        }
    }
    
    public void imprimeAluno() {
        System.out.println("Matricula: " + matricula + " - Nome: " + nome);
    }


    
}
