package App3;

import model3.Cachorro;
import model3.Gato;

public class App {
    public static void main(String[] args) {
    
    Gato gato = new Gato();
    gato.setNome("Sam");

    gato.EmitirSom();
    gato.ColocarDormir();

    Cachorro cachorro = new Cachorro();
    cachorro.setNome("jasmim");

    cachorro.EmitirSom();
    cachorro.ColocarDormir();
        
        
    }
    
}
