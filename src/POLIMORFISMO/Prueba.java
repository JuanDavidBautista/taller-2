package POLIMORFISMO;

import java.util.Scanner;

public class Prueba {
    
    public static void main(String[] args){
        
        Scanner lectura =new Scanner(System.in);

        int seguir;
        int figura;

        seguir=1;

        while (seguir==1) {

            System.out.println("Seleccione la figura a calcular 1.Cuadrado 2.Triangulo 3.Circulo 4.Rectangulo");

            figura=lectura.nextInt();

            switch (figura) {

                case 1:
                Cuadrado cu1=new Cuadrado();

                float ladoT;
                System.out.println("Escriba el lado del cuadrado");
                ladoT= lectura.nextFloat();
                cu1.setLado(ladoT);
                cu1.calcularArea();

                    break;

                    case 2:
                    Triangulo t1=new Triangulo();
                    float baseT;
                    float alturaT;
                    System.out.println("Escriba la base del triangulo");
                baseT= lectura.nextFloat();
                System.out.println("escriba la altura del triangulo");
                alturaT=lectura.nextFloat();

                    t1.setBase(baseT);
                    t1.setAltura(alturaT);
                    t1.calcularArea();

                    break;

                    case 3:
                    
                    Circulo C1= new Circulo();
                    float radioT;
                    System.out.println("Escriba el radio del circulo");
                 radioT= lectura.nextFloat();
                    C1.setRadio(radioT);
                    C1.calcularArea();
                 break;

                 case 4:

                 Rectangulo R1= new Rectangulo();
                float basesT;
                float alturasT;
                System.out.println("Escriba la base del triangulo");
                basesT= lectura.nextFloat();
                System.out.println("escriba la altura del triangulo");
                alturasT=lectura.nextFloat();
            R1.setBase(basesT);
            R1.setAltura(alturasT);
            R1.calcularArea();

        break;
            
                default:
                    break;
            }

            System.out.println("Desea calcular otra figura 1.Si 2.No");
            seguir=lectura.nextInt();

        }

        lectura.close();
        /**/

       /* */

        /**/

        /**/

        
    }


}
