package br.senai.sp.jandira;

import br.senai.sp.jandira.model.*;

public class App {
    public static void main(String[] args){
        Voo voo = new VooEmirates(23674, "São Paulo", "Bahia", "Voo Emirates", 700 );
        Voo voo1 = new Gol(67584, "Rio de Janeiro ", "França", "Gol", 800);
        Voo voo2 = new Azul(89746, "Nova York", "Texas", "Azul", 900);
        Voo voo3 = new Latam(49824, "Fortaleza", "Egito", "Latam", 850);

        
    }
}
