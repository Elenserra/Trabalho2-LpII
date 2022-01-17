package entidade;

import java.util.ArrayList;

import disciplina.Disciplina;
import disciplina.nivel1.*;
import disciplina.nivel2.*;

public class Turma {
    private ArrayList<Aluno> listaAluno;
    private ArrayList<Disciplina> listaDisciplina;

    public Turma(){
        this.listaDisciplina = new ArrayList<>();
        this.listaAluno = new ArrayList<>();
            listaDisciplina.add(new Algoritmo1());
            listaDisciplina.add(new Calculo1());
            listaDisciplina.add(new CalculoVetorial());
            listaDisciplina.add(new EticaCidadania());
            listaDisciplina.add(new IntroducaoComputacao());
            listaDisciplina.add(new ProducaoTextoIngles());
        
            listaDisciplina.add(new AlgebraLinear());
            listaDisciplina.add(new Calculo2());
            listaDisciplina.add(new Fisica1());
            listaDisciplina.add(new Lp1());
            listaDisciplina.add(new MDL());
    }

    

    //busca matricula do aluno
    public boolean buscaMatricula(String matricula) {
    	if (getAluno(matricula) != null) {
    		return true;
    	}
    	return false;
    }

    //retorna o aluno
    public Aluno getAluno (String matricula){
        for(Aluno aluno: listaAluno){
            if (aluno.getMatricula().equals(matricula) ){
                return aluno;
            }
        }
        return null;
    }
    
    //criando aluno e adicionando na lista
    public boolean addAluno(String nome, String matricula) {
    	Aluno aluno = getAluno(matricula);
        if (aluno == null) {
    		listaAluno.add(new Aluno(nome, matricula));
    		return true;
    	}
    	return false;
    }


    //adicionando disciplina ao aluno
    public boolean addDisciplinaParaAluno(String matricula, String codigo) {
    	Aluno aluno = getAluno(matricula);
    	if (aluno != null) {
    		Disciplina curso = getCurso(codigo);
    		if (curso != null) {
    			aluno.addDisciplina(curso);
                return true;
    		}
    	}
    	return false;
    }

    public void notaDisciplina(String matricula,String codigo, float[] nota){
        Aluno aluno = getAluno(matricula);
        if (aluno!=null){
            aluno.setNota(nota);
            Disciplina curso = getCurso(codigo);
            if (curso!=null){
                //curso.calculaNotasAlunos();
            }
                
        }
    }
    
    public Disciplina getCurso(String codigo) {
        Disciplina curso = getCurso(codigo);
    	if (codigo.equalsIgnoreCase("dein0076"))
    		return new Algoritmo1();
    	
    	if (codigo.equalsIgnoreCase("dema0339"))
    		return new Calculo1();
    	
        if (codigo.equalsIgnoreCase("DEMA0340"))
    	    return new CalculoVetorial();
        
        if (codigo.equalsIgnoreCase("DFIL0315"))
    	    return new EticaCidadania();

        if (codigo.equalsIgnoreCase("DEIN0075"))
            return new IntroducaoComputacao();
        
        if (codigo.equalsIgnoreCase("DLER0845"))
            return new ProducaoTextoIngles();
        
        if (codigo.equalsIgnoreCase("DEMA0342")) //preRequisito DEMA0340
            return new AlgebraLinear();
        
        if (codigo.equalsIgnoreCase("DEMA0341"))
            return new Calculo2();

        if (codigo.equalsIgnoreCase("DEFI0254"))
            return new Fisica1();

        if (codigo.equalsIgnoreCase("DEIN0030"))
            return new Lp1();
        
        if (codigo.equalsIgnoreCase("DEIN0078"))
            return new MDL();

    	return null;
    }

    // Retorna o nome de todas as disciplinas contidos na lista de disciplinas
    public String[] listDisc() {
        String[] nomeDisc = new String[listaDisciplina.size()];
        for (int i = 0; i < listaDisciplina.size(); i++) {
           nomeDisc[i] = listaDisciplina.get(i).getCodigo() + " - "+ listaDisciplina.get(i).getArea();
        }
        return nomeDisc;
    }

    // Procura uma disciplina cadastrada
    public Disciplina getDisciplina(String codigo) {
        for (Disciplina discp: listaDisciplina) {
            if (discp.getCodigo().equals(codigo)) {
                return discp;
            }
        }
        return null;
    }

    public void listar(){
        System.out.println("\n\n------------LISTA DE ALUNOS------------");
        for (Aluno a: listaAluno){
            a.imprimeAluno();
            a.imprimeNota();

        }
        System.out.println("\n\n---------------------------------------");
    }

    

}
