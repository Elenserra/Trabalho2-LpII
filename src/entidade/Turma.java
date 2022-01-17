package entidade;

import java.util.ArrayList;

import disciplina.Disciplina;
import disciplina.nivel1.*;
import disciplina.nivel2.*;
import disciplina.nivel3.*;
import disciplina.nivel4.*;
import disciplina.nivel5.*;
import disciplina.nivel6.*;
import disciplina.nivel7.*;
import disciplina.nivel8.*;

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

            listaDisciplina.add(new EngenhariaSoftware());
            listaDisciplina.add(new EstatisticaProbabilidade());
            listaDisciplina.add(new EstruturaDados2());
            listaDisciplina.add(new LFA());
            listaDisciplina.add(new RedesComputadores1());
            listaDisciplina.add(new SO1());

            listaDisciplina.add(new BancoDeDados1());
            listaDisciplina.add(new CircuitosDigitais1());
            listaDisciplina.add(new Compiladores());
            listaDisciplina.add(new LabCircuitosDigitais1());
            listaDisciplina.add(new ProcessoDesnSoftware());
          
            listaDisciplina.add(new CalculoNumerico());
            listaDisciplina.add(new EquacoesDiferenciais1());
            listaDisciplina.add(new InteligenciaArtificial());
            listaDisciplina.add(new TeoriaComputacao());
            
            listaDisciplina.add(new Algoritmos2());
            listaDisciplina.add(new ArqSoftware());
            listaDisciplina.add(new AvaliacaoDeDesenpenho());
            listaDisciplina.add(new BancoDeDado2());
            listaDisciplina.add(new CircuitosDigitais2());
            listaDisciplina.add(new ComputacaoGrafica());
            listaDisciplina.add(new ComputacaoMovel());
            listaDisciplina.add(new ComputacaoParalela());
            listaDisciplina.add(new EngDaInformacao());
            listaDisciplina.add(new EngDeRequisitos());
            listaDisciplina.add(new GerenciaProjSoftware());
            listaDisciplina.add(new Hipermidia());
            listaDisciplina.add(new InterfaceHumComputador());
            listaDisciplina.add(new IntrodCriptografia());
            listaDisciplina.add(new IntrodMineracaoDados());
            listaDisciplina.add(new IntrodRobotica());
            listaDisciplina.add(new JogosDigitais());
            listaDisciplina.add(new LabCircuitosDig2());
            listaDisciplina.add(new LabEngDeSoftware());
            listaDisciplina.add(new LabProgramacao());
            listaDisciplina.add(new LabRedesComputadores());
            listaDisciplina.add(new LabSoftwareBasico());
            listaDisciplina.add(new MetodPesquisaEmCP());
            listaDisciplina.add(new PesquisaOperacional());
            listaDisciplina.add(new ProcesosEstocasticos());
            listaDisciplina.add(new ProcessamentoImagem());
            listaDisciplina.add(new QualidadeSoftware());
            listaDisciplina.add(new RealidadeVitualAumentada());
            listaDisciplina.add(new RedesComputadores2());
            listaDisciplina.add(new SisInforGeo());
            listaDisciplina.add(new SistemasDistribuidos());
            listaDisciplina.add(new SO2());
            listaDisciplina.add(new TesteSoftware());
            listaDisciplina.add(new TopcEspCP());
            listaDisciplina.add(new VisaoComputacional());
            
            listaDisciplina.add(new CienciaTecSociedade());
            listaDisciplina.add(new ComputacaoSociedade());
            listaDisciplina.add(new ContabilidadeGeral());
            listaDisciplina.add(new ControleProcessosAutomacao());
            listaDisciplina.add(new DireitoAdministrativo());
            listaDisciplina.add(new DireitoConstitucional());
            listaDisciplina.add(new DireitoUsualComputacao());
            listaDisciplina.add(new Economia());
            listaDisciplina.add(new EducacaoAmbiental());
            listaDisciplina.add(new EmpreInovacao());
            listaDisciplina.add(new EngDeSoftware2());
            listaDisciplina.add(new Filosofia());
            listaDisciplina.add(new GerenciaTecInformacao());
            listaDisciplina.add(new GestaoPeqEmpBasetec());
            listaDisciplina.add(new IntrodAdministracao());
            listaDisciplina.add(new IntrodControleProcessos());
            listaDisciplina.add(new LabMicroprocessadores());
            listaDisciplina.add(new LinguaBrasSinais());
            listaDisciplina.add(new Microprocessadores());
            listaDisciplina.add(new Psicologia());
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



    //instanciando as disciplinas
    public Disciplina getCurso(String codigo) {
        String requisito, requisito2, requisito3;; 
        Disciplina curso ;
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

        if (codigo.equalsIgnoreCase("DEIN0225")){
            requisito = "DEIN0076";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new Lp2();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DSOC0313"))
            return new Sociologia();

        if (codigo.equalsIgnoreCase("DEIN0226")){
            requisito = "DEIN0225";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new EngenhariaSoftware();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEMA0343")){
            requisito = "DEMA0338";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new EstatisticaProbabilidade();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0083")){
            requisito = "DEIN0080";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new EstruturaDados2();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0082")){
            requisito = "DEIN0078";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new LFA();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0088")){
            requisito = "DEIN0079"; requisito2 = "DEMA0339";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new RedesComputadores1();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEIN0114")){
            requisito = "DEIN0079"; requisito2 = "DEIN0080";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new SO1();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEIN0115")){
            requisito = "DEIN0076";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new BancoDeDados1();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEEE0220")){
            requisito = "DEIN0078";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new CircuitosDigitais1();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0086")){ 
            requisito = "DEIN0080"; requisito2 = "DEIN0082";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new Compiladores();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEEE0221")){
                return new LabCircuitosDigitais1();
        }

        if (codigo.equalsIgnoreCase("DEIN0087")){
            requisito = "DEIN0226";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new ProcessoDesnSoftware();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0117")){  
            requisito = "DEIN0030,"; requisito2 = "DEMA0338";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new CalculoNumerico();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEMA0344")){
            requisito = "DEMA0338";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new EquacoesDiferenciais1();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0118")){   
            requisito = "DEIN0078"; requisito2 = "DEIN0083";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new InteligenciaArtificial();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEIN0085")){
            requisito = "DEIN0082";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new TeoriaComputacao();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0093")){
            requisito = "DEIN0083";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new Algoritmos2();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0230")){
            requisito = "DEIN0226";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new ArqSoftware();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0095")){   
            requisito = "DEMA0343"; requisito2 = "DEIN0114";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new AvaliacaoDeDesenpenho();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEIN0185")){
            requisito = "DEIN0115";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new BancoDeDado2();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEEE0222")){
            requisito = "DEEE0220";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new CircuitosDigitais2();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0120")){    
            requisito = "DEMA0342"; requisito2 = "DEIN0083";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new ComputacaoGrafica();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEIN0112")){
            requisito = "DEIN0088";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new ComputacaoMovel();
            else 
                return null;
        }
        
        if (codigo.equalsIgnoreCase("DEIN0097")){
            requisito = "DEIN0114";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new ComputacaoParalela();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0098")){
            requisito = "DEIN0226";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new EngDaInformacao();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0099")){
            requisito = "DEIN0226";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new EngDeRequisitos();
            else 
                return null;
        }
        
        if (codigo.equalsIgnoreCase("DEIN0231")){
            requisito = "DEIN0226";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new GerenciaProjSoftware();
            else 
                return null;
        }
        
        if (codigo.equalsIgnoreCase("DEIN0101")){
            requisito = "DEIN0226";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new Hipermidia();
            else 
                return null;
        }
        
        if (codigo.equalsIgnoreCase("DEIN0102")){
            requisito = "DEIN0226";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new InterfaceHumComputador();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0232")){    
            requisito = "DEIN0030"; requisito2 = "DEIN0080"; requisito3 = "DEIN0088";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    curso = getCurso(requisito3);
                    if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                        return new IntrodCriptografia();
                    }
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEIN0233")){    
            requisito = "DEMA0343"; requisito2 = "DEIN0115";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new IntrodMineracaoDados();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEIN0234")){
            requisito = "DEMA0341";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new IntrodRobotica();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0235")){
            requisito = "DEIN0080";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new JogosDigitais();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEEE0226")){
            return new LabCircuitosDig2();
        }

        if (codigo.equalsIgnoreCase("DEIN0103")){  
            requisito = "DEIN0115"; requisito2 = "DEIN0226";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new LabEngDeSoftware();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEIN0237")){
            requisito = "DEIN0225";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new LabProgramacao();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0236")){
            requisito = "DEIN0088";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new LabRedesComputadores();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0238")){  
            requisito = "DEIN0079"; requisito2 = "DEIN0114";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new LabSoftwareBasico();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEIN0239")){
            return new MetodPesquisaEmCP();
        }

        if (codigo.equalsIgnoreCase("DEIN0119")){  
            requisito = "DEMA0342"; requisito2 = "DEIN0083";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new PesquisaOperacional();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEIN0116")){
            requisito = "DEMA0343";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new ProcesosEstocasticos();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0104")){  
            requisito = "DEIN0083"; requisito2 = "DEMA0343";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new ProcessamentoImagem();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEIN0240")){
            requisito = "DEIN0226";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new QualidadeSoftware();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0241")){
            return new RealidadeVitualAumentada();
        }

        if (codigo.equalsIgnoreCase("DEIN0106")){
            requisito = "DEIN0088";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new RedesComputadores2();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0242")){
            return new SisInforGeo();
        }

        if (codigo.equalsIgnoreCase("DEIN0107")){  
            requisito = "DEIN0088"; requisito2 = "DEIN0114";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                curso = getCurso(requisito2);
                if (curso.getSituacao().equalsIgnoreCase("aprovado")){
                    return new SistemasDistribuidos();
                }
            }else {
                return null;
            }
        }

        if (codigo.equalsIgnoreCase("DEIN0184")){
            requisito = "DEIN0114";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new SO2();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0243")){
            requisito = "DEIN0226";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new TesteSoftware();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("DEIN0109")){
            return new TopcEspCP();
        }

        if (codigo.equalsIgnoreCase("DEIN0244")){
            requisito = "DEIN0083";
            curso = getCurso(requisito);
            if (curso.getSituacao().equalsIgnoreCase("aprovado"))
                return new VisaoComputacional();
            else 
                return null;
        }

        if (codigo.equalsIgnoreCase("CCCT0007"))
            return new CienciaTecSociedade();
        
        if (codigo.equalsIgnoreCase("DEIN0110"))
            return new ComputacaoSociedade();

        if (codigo.equalsIgnoreCase("DECC0076"))
            return new ContabilidadeGeral();
        
        if (codigo.equalsIgnoreCase("DEEE0224"))
            return new ControleProcessosAutomacao();

        if (codigo.equalsIgnoreCase("DDIR0097"))
            return new DireitoAdministrativo();

        if (codigo.equalsIgnoreCase("DDIR0258"))
            return new DireitoConstitucional();

        if(codigo.equalsIgnoreCase("DDIR0131"))
            return new DireitoUsualComputacao();

        if(codigo.equalsIgnoreCase("DCON0117"))
            return new Economia();
        
        if (codigo.equalsIgnoreCase("CCCT0045"))
            return new EducacaoAmbiental();

        if (codigo.equalsIgnoreCase("CCCT0034"))
            return new EmpreInovacao();
        
        if (codigo.equalsIgnoreCase("DEIN0100"))
            return new EngDeSoftware2();

        if (codigo.equalsIgnoreCase("DFIL0048"))
            return new Filosofia();

        if (codigo.equalsIgnoreCase("DEIN0111"))
            return new GerenciaTecInformacao();

        if (codigo.equalsIgnoreCase("CCCT0031"))
            return new GestaoPeqEmpBasetec();

        if (codigo.equalsIgnoreCase("DECC0077"))
            return new IntrodAdministracao();
        
        if (codigo.equalsIgnoreCase("DEEE0223"))
            return new IntrodControleProcessos();
            
        if (codigo.equalsIgnoreCase("DEEE0227"))
            return new LabMicroprocessadores();
        
        if (codigo.equalsIgnoreCase("DLER0798"))
            return new LinguaBrasSinais();
        
        if (codigo.equalsIgnoreCase("DEEE0229"))
            return new Microprocessadores();
        
        if (codigo.equalsIgnoreCase("DPSI0025"))
            return new Psicologia();


    	return null;
    }

    
    
    // Retorna o nome de todas as disciplinas contidos na lista de disciplinas
    public String[] listDisc() {
        String[] nomeDisc = new String[listaDisciplina.size()];
        for (int i = 0; i < listaDisciplina.size(); i++) {
           nomeDisc[i] = listaDisciplina.get(i).getCodigo() + " - "+ listaDisciplina.get(i).getArea() ;
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

        }
        System.out.println("\n\n---------------------------------------");
    }

    

}
