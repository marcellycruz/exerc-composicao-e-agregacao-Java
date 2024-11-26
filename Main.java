import classes.aluno.Aluno;
import classes.curso.Curso;
import classes.departamento.Departamento;

public class Main{
  public static void main(String[] args){
    //Agregação
    Aluno aluno1 = new Aluno("Fernando da Silva", "12341528");
    Curso curso1 = new Curso("Análise e Desenvolvimento de Sistemas" , "1234");

    curso1.setAluno(aluno1); 
    System.out.println("Aluno: " + curso1.getAluno().getNome()); 
    System.out.println("Matricula: " + curso1.getAluno().getMatricula()); 

    //Composição
    Departamento depart1 = new Departamento("FCI", curso1);
    System.out.println(depart1.toString());
  }
}