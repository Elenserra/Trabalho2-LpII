package entidade;

import java.util.ArrayList;

import disciplina.Disciplina;
import disciplina.nivel1.*;
import disciplina.nivel2.*;
import disciplina.nivel3.Antropologia;
import disciplina.nivel3.ArquiteturaComputadores;
import disciplina.nivel3.Calculo3;
import disciplina.nivel3.EstruturaDados1;
import disciplina.nivel3.Fisica3;
import disciplina.nivel3.Lp2;
import disciplina.nivel3.Sociologia;

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

            listaDisciplina.add(new Antropologia());
            listaDisciplina.add(new ArquiteturaComputadores());
            listaDisciplina.add(new Calculo3());
            listaDisciplina.add(new EstruturaDados1());
            listaDisciplina.add(new Fisica3());
            listaDisciplina.add(new Lp2());
            listaDisciplina.add(new Sociologia());
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
                curso.situacaoDoAluno();
                System.out.println(curso.getSituacao());
            }
                
        }
    }

    
    public Disciplina getCurso(String codigo) {
        String requisito;Disciplina curso ;
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
        
        if (codigo.equalsIgnoreCase("DEMA0342")){
            requisito = "DEMA0340";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new AlgebraLinear();
            else
                return null;
        }
        if (codigo.equalsIgnoreCase("DEMA0341")){
            requisito = "DEMA0339";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new Calculo2();
            else
                return null;
        }

        if (codigo.equalsIgnoreCase("DEFI0254")){
            requisito = "DEMA0339";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new Fisica1();
            else
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0030")){
            requisito = "DEIN0076";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new Lp1();
            else
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0078")){
            requisito = "DEIN0076";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new MDL();
            else
                return null;
        }

        if (codigo.equalsIgnoreCase("DSOC0055"))
            return new Antropologia();

        if (codigo.equalsIgnoreCase("DEIN0079")){
            requisito = "DEIN0078";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new ArquiteturaComputadores();
            else
                return null;
        }
        
        if (codigo.equalsIgnoreCase("DEMA0338")){
            requisito = "DEMA0341";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new Calculo3();
            else
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0080")){
            requisito = "DEIN0030";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new EstruturaDados1();
            else
                return null;
        }

        if (codigo.equalsIgnoreCase("DEFI0255")){
            requisito = "DEFI0254";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new Fisica3();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DSOC0313"))
            return new Sociologia();

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
