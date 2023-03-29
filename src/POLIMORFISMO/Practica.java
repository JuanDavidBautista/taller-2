package POLIMORFISMO;

import java.util.Scanner;

public class Practica {

    static Scanner lectura= new Scanner(System.in);
    public static void main(String[] args) {
    
        int opcion;
        int hveces=0;
        int aveces=0;

        int veces=1;

        while (veces==1) {

            System.out.println("Dijite 1.Hola 2.Adios 3.Finalizar");
            opcion=lectura.nextInt();
            
            
            switch (opcion) {
                case 1:

                System.out.println("Hola");
                System.out.println("Quiere finalizar la ejecucion?");

                veces=lectura.nextInt();
                
                hveces++;
                
                    
                    break;

                case 2:

                System.out.println("Adios");

                System.out.println("Quiere finalizar la ejecucion?");
                veces=lectura.nextInt();

                aveces++;
                

                


                default:
                            System.out.println("Dato invalido");
            
                    break;
                    
            }
              
        }
        System.out.println("Usted imprimio una cantidad de hola " +hveces);
        System.out.println("Usted imprio una cantidad de Adios "+aveces);
        
    }


    
}
