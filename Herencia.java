/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.gt;

/**
 *
 * @author marit
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Gallina gallina1 = new Gallina ("Picar el suelo", "Pablo", "cemillas" , 3);
        
        gallina1.mostrar();
        gallina1.Alimentarse();
        gallina1.correr();
        gallina1.dormir();
        
        Conejo conejo1 = new Conejo ("Blanco", "Flash", "Herviboro", 6);
        
        conejo1.mostrar();
        conejo1.Alimentarse();
        conejo1.correr();
        conejo1.dormir();
        
    }

}

