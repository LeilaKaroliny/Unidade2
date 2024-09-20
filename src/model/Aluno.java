package model;
//public = acesso livre em qualquer lugar
//private = acesso restrito em todo lugar
//protected = acesso livre APENAS para o mesmmo pacote
public class Aluno extends Pessoa{
private String matricula;
  

   public Aluno(int id, String nome, String matricula) {
    super(id, nome);
    this.matricula = matricula;
}
    public Aluno() {
    super();
}
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    


    
    
}
