package semana05_java;

import java.util.ArrayList;

public class Semana05_java {

    public static void main(String[] args) {
        
        ArrayList<Cachorro> listaDogs = new ArrayList<>();
        
        Dono donoUm = new Dono("Maçaneiro", "9999-9999", "Tua tal, nº aquele");
        Dono donoDois = new Dono("Gustavo", "9999-9999", "Tua tal, nº aquele");
        
        listaDogs.add(new Cachorro("Bob Marley", "Pincher", 3, "Pequeno", donoUm));
        
        Cachorro dogDois = new Cachorro("Tunico", "Vira-lata", 2, "Médio", donoDois);
        listaDogs.add(dogDois);
        
        for(Cachorro dog : listaDogs){
            System.out.println(dog.getNome() +" - "+ dog.getDono().getNome());
        }
        
    }
    
}
