package view;

import java.util.InputMismatchException;
import java.util.Scanner;
import entidade.Turma;

/**
 * O programa a ser desenvolvido deve permitir o cadastro de todas as
disciplinas do curso, assim como seus pre-requisitos, e sequencia 
aconselhada. Permitir que um aluno seja cadastrado e em seguida a 
medida que o discente for finalizando disciplinas, informar a 
sequencia aconselhada de disciplinas.

Funcionalidades:

_Cadastrar disciplinas, pre-requisitos (outras disciplinas), áreas 
(engenharia de software, aprendizado de máquina, ...) e tipo (básica, 
eletiva grupo 1, eletiva grupo 2), e horário
_Cadastrar sequência aconselhada

Sugere-se para os dois casos acima que o cadastro esteja no código para 
evitar re-trabalho:
_Permitir cadastro do aluno (nome, área de interesse: engenharia de software, 
aprendizado de máquina, ...)
_Permitir que o aluno informe disciplina cursada, com nota
_Avaliar disciplinas cursadas pelo aluno e informar quais poderia ser cursadas 
no semestre seguinte, montando uma grade de horários para o mesmo
_Permitir que o aluno troque disciplinas a seu bem entender, adaptando a sua 
grade de horários
 */


public class App {

    public static void menu(){
        System.out.println("\n\n======== SISTEMA DE MATRICULA ========");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Listar os Alunos cadastrados");
		System.out.println("3 - Matricular disciplina");
        System.out.println("0 - Sair");              
        System.out.println("============================");
        System.out.print("Escolha uma opcao: ");
    }

    public static void main(String[] args)  {
        
        Turma turma = new Turma();

        String[] listDisciplina = turma.listDisc();

        String nome, matricula; 
        Float nota = 0.0f;
        int opcao=0;


        Scanner input = new Scanner(System.in);
        do{
            try{
                
                menu();
			    opcao = input.nextInt();
			    input.nextLine();
                
                switch(opcao){
                
	                //cadastro
	                case 1: {
	                        
	                        System.out.println("\nDigite seu nome: ");
	                        nome = input.nextLine().trim().toUpperCase();
	                        System.out.println("Digite a matricula: ");
	                        matricula = input.nextLine();
	
	                        if (turma.addAluno(nome, matricula)){
	                            System.out.println("\n>> Aluno cadastrado <<");
	                        } else {
	                            System.out.println("\n>> ERRor <<");
	                        }
	                        
	                            
	
	                        break;
	                }
	            
	                case 2: {
		                turma.listar();
		                break;
		            }

	                // Cadastrar disciplina ao Aluno
	                case 3: {
	                	//TODO Escolhe o Aluno
	                	//pegar a matricula do aluno
						
						System.out.println("\n\nInforme a matricula do discente: ");
						matricula = input.nextLine();
			
						if (turma.buscaMatricula(matricula)) {
					
							String[] disciplina = turma.listDisc();
							
							
							String codigo;
							System.out.println("\n----------- ESTRUTURA CURRICULAR - CP -----------"); 
							for (int i = 0; i < disciplina.length-1; i++) {
								System.out.println( disciplina[i] );
							}
							System.out.println("-------------------------------------------------"); 
							
							System.out.print("\nInforme o codigo da disciplina a ser cadastrada:");
							codigo = input.nextLine();
							
							if (turma.addDisciplinaParaAluno(matricula, codigo)) {
								System.out.println("\n Disciplina cadastrada");
							}else{
								System.out.println("\n Error ao cadastrar disciplina");
							}

							
						}else{
							System.out.println("\nDiscente nao encontrado");
						}

						break;
	                }
                }
                
            
        }catch(InputMismatchException e){
            System.out.println("\n\n>>Error. Entrada invalida<<");
            input.nextLine();
        }
    }while(opcao != 0);

    
        

    }
}
