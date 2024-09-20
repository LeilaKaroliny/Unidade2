package model;

import java.util.List;

public class Disciplina {
    private int id;
    private String nome;
    private Professor professor; 
    private List<Aluno> alunos;
    public Disciplina(int id, String nome, Professor professor, List<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = alunos;
    }
    public Disciplina() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
   
    
}
