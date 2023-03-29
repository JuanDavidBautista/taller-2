package POLIMORFISMO.Taller_2;

import java.util.Scanner;

public class Carisellazo implements Juego {

    Scanner lectura= new Scanner(System.in);
     private String nombre;
     private int moneda;
     private int eleccion;


    @Override
    public void iniciar() {
        
        System.out.println("Ingrese su nombre");
        nombre= lectura.nextLine();

    }

    @Override
    public void jugar() {

        moneda=(int)Math.floor(Math.random()*2+1);
        System.out.println(this.nombre+ " escoja 1.Cara 2.Sello");
        eleccion=lectura.nextInt();

      
    }

    @Override
    public void finalizar() {

        if (eleccion==1 && moneda==1) {

            System.out.println(this.nombre + " Salio cara, escogiste cara, tu ganas!");
            
        }

        else if (eleccion==2 && moneda==2) {

            System.out.println(this.nombre + " Salio sello, escogiste sello, tu ganas! ");
            
        }

        else{
            System.out.println("Perdiste :( ");
        }
        
    }

   
    
}
