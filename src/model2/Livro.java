package model2;

public class Livro extends Obra {
    private int tiragem;

    public Livro () {}

    public Livro(int id, String titulo, String lsbn, double valor, int tiragem) {
        super(id, titulo, lsbn, valor);
        this.tiragem = tiragem;
    }

    public Livro(int tiragem) {
        this.tiragem = tiragem;
    }

    public int getTiragem() {
        return tiragem;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

}
