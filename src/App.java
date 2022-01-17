

import java.util.InputMismatchException;
import java.util.Scanner;

import disciplina.Disciplina;
import entidade.Aluno;
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
        System.out.println("2 - Listar os discentes cadastrados");
		System.out.println("3 - Matricular disciplinas");
		System.out.println("4 - Adicionar notas");
        System.out.println("0 - Sair");              
        System.out.println("============================");
        System.out.print("Escolha uma opcao: ");
    }

    public static void main(String[] args)  {
        
        Turma turma = new Turma();

		Disciplina disc;
        String[] listDisciplina = turma.listDisc();

        String nome, matricula, codigo; 
        float[] nota = new float[3];
        int opcao=1;


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
						matricula = input.nextLine().trim().toLowerCase();

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
						
						System.out.println("\n\nInforme a matricula do discente: ");
						matricula = input.nextLine();
			
						if (turma.buscaMatricula(matricula)) {
					
							String[] disciplina = turma.listDisc();
							
							
							
							System.out.println("\n----------- ESTRUTURA CURRICULAR - CP -----------"); 
							for (int i = 0; i < disciplina.length-1; i++) {
								System.out.println( disciplina[i] );
							}
							System.out.println("-------------------------------------------------"); 
							
							System.out.println("\nInforme o codigo da disciplina a ser cadastrada:");
							codigo = input.nextLine();
							
							if (turma.addDisciplinaParaAluno(matricula, codigo)){
								System.out.println("\n>> Disciplina cadastrada <<");
							}else{
								System.out.println("\n>> Error ao tentar cadastrar disciplina <<");
							}
						
			
							
							
						}else{
							System.out.println("\n>> Discente nao encontrado <<");
						}

						break;
	                }

					//add notas para as disciplinas
					case 4:{

						System.out.println("\nInforme a matricula do discente:");
						matricula = input.nextLine();
						
						System.out.print("\n------------------------------------------");
						turma.getAluno(matricula).imprimeAluno();
						System.out.println("------------------------------------------");

						System.out.println("\nInforme o codigo da disciplina:");
						codigo = input.nextLine();
						
						float nota1, nota2, nota3;
									
						System.out.println("Nota 1");
						nota1 = input.nextFloat();
						System.out.println("Nota 2");
						nota2 = input.nextFloat();
						System.out.println("Nota 3");
						nota3 = input.nextFloat();

						nota[0] = nota1;
						nota[1] = nota2;
						nota[2] = nota3;

						
						
						
				
						break;

					}
						
					case 0:{
						break;
					}

					default:
						System.out.println("\n>> Opcao Invalida. Tente Novamente! <<");
						break;

                }
                
            
			}catch(InputMismatchException e){
				System.out.println("\n\n>>Error. Entrada invalida<<");
				input.nextLine();
			}
			
		}while(opcao != 0);

    
        

    }
}
