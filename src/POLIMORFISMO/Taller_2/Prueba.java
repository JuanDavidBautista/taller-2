package POLIMORFISMO.Taller_2;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

        Scanner lectura= new Scanner(System.in);
       
        
        int seleccion;
        System.out.println("Que juego desea jugar 1.Carisellazo 2.Piedra, papel y tijera");
        seleccion=lectura.nextInt();

    switch (seleccion) {
        case 1:
        Carisellazo juego1=new Carisellazo();

        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();

            break;
    
            case 2:
            Ppt juego2=new Ppt();

            juego2.iniciar();
            juego2.jugar();
            juego2.finalizar();

        default:
            break;
    }

    lectura.close();
    }

}
