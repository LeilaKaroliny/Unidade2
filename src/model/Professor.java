package model;

public class Professor extends Pessoa {
    private String area;
   
    public Professor(int id, String nome, String area) {
        super(id, nome);
        this.area = area;
    }
   
    public Professor() { 
    super(); }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
  



    
}
