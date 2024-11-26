package classes.departamento;
import classes.curso.Curso;

public class Departamento{
  private String nome;
  private Curso curso = new Curso(); //composição

  public Departamento(){
   
  }

  public Departamento(String nomeDpto, Curso curso){
    this.nome = nomeDpto;
    this.curso = curso;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  @Override
  public String toString(){
    return "Departamento: " + nome + 
            "\nCurso: " + curso.toString();
  }
}