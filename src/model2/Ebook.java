package model2;

public class Ebook extends Obra {
    private String urlmarcaDagua;
    public Object setTitulo;
    public Object setUrlmarcaDagua;

    public Ebook(){}

    public Ebook(int id, String titulo, String lsbn, double valor, String urlmarcaDagua) {
        super(id, titulo, lsbn, valor);
        this.urlmarcaDagua = urlmarcaDagua;
    }

    public Ebook(String urlmarcaDagua) {
        this.urlmarcaDagua = urlmarcaDagua;
    }

    public String getUrlmarcaDagua() {
        return urlmarcaDagua;
    }

    public void setUrlmarcaDagua(String urlmarcaDagua) {
        this.urlmarcaDagua = urlmarcaDagua;
    }

  
}
