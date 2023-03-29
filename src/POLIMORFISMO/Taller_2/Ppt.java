package POLIMORFISMO.Taller_2;

import java.util.Scanner;

public class Ppt implements Juego{

    Scanner lectura=new Scanner(System.in);

    private String nombre;
    private int eleccion;
    private int numero;

    @Override
    public void iniciar() {

        System.out.println("Ingrese su nombre");
        nombre=lectura.nextLine();
       
    }

    @Override
    public void jugar() {
        numero=(int)Math.floor(Math.random()*3+1);

        System.out.println(this.nombre+ " Seleccione 1.Piedra 2.Papel 3.Tijera");
        eleccion=lectura.nextInt();
    }

    @Override
    public void finalizar() {

        if (eleccion==1 && numero==2) {

            System.out.println(this.nombre+" Seleccionaste piedra, la maquina saco papel, pierdes :( ");
            
        }
        
        else if (eleccion==1 && numero==3) {

            System.out.println(this.nombre+" Seleccionaste piedra, la maquina saco tijera, ganaste! :) ");

            
        }

        else if (eleccion==2 && numero==1) {

            System.out.println(this.nombre+" Seleccionaste papel, la maquina saco piedra, ganaste! :) ");
            
        }

        else if (eleccion==2 && numero==3) {
            
            System.out.println(this.nombre+" Seleccionaste papel, la maquina saco tijera, pierdes :( ");

        }

        else if (eleccion==3 && numero==1) {
            System.out.println(this.nombre+" Seleccionaste tijera, la maquina saco piedra, pierdes :( ");
            
        }

        else if (eleccion==3 && numero==2 ) {
            System.out.println(this.nombre+"Seleccionaste tijera, la maquina saco papel, ganaste! :) ");
            
        }
        else{
            System.out.println(this.nombre+" Es un empate :o ");
        }
    }

 
}
