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
        System.out.println("2 - Listar");
        System.out.println("0 - Sair");              
        System.out.println("============================");
        System.out.print("Escolha uma opcao: ");
    }

    public static void main(String[] args)  {
        
        Turma turmaDeAlunos = new Turma();

        String[] listDisciplina = turmaDeAlunos.listDisc();

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
                case 1:
                  

                        
                        System.out.println("\nDigite seu nome: ");
                        nome = input.nextLine().trim().toUpperCase();
                        System.out.println("Digite a matricula: ");
                        matricula = input.nextLine();

                        if (turmaDeAlunos.addAluno(nome, matricula)){
                            System.out.println("\n>> Aluno cadastrado <<");
                        } else {
                            System.out.println("\n>> ERRor <<");
                        }
                        
                            
                        /** 
                        System.out.println("\n----------- ESTRUTURA CURRICULAR - CP -----------"); 
                        for (int i = 0; i < listDisciplina.length; i++) {
                            System.out.println("ID " + (i+1)+ "_ " + listDisciplina[i] );
                        }
                        System.out.println("-------------------------------------------------"); 
                        */
                          
                              
                        
                            

                     

                       
                    
                break;
            case 2:
                turmaDeAlunos.listar();
                break;
            }
        }catch(InputMismatchException e){
            System.out.println("\n\n>>Error. Entrada invalida<<");
            input.nextLine();
        }
    }while(opcao != 0);

    
        

    }
}
