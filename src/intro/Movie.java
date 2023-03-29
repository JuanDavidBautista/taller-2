package intro;

import java.util.Scanner;

public class Movie {

    private String name;
    private int duration;
    String category;
    public String director;



    //Metodo constructor 

public Movie(String name, int duration, String category, String director){
    this.name=name;
    this.duration=duration;
    this.category=category;
    this.director=director;
}

    //metodos

    Scanner lectura=new Scanner(System.in);
    public void addMovie(){
        System.out.println("Ingrese nombre de la pelicula");
        name=lectura.nextLine();
        System.out.println("Ingrese duracion de la pelicula");
        duration=lectura.nextInt();
        lectura.nextLine();
        System.out.println("Ingrese categoria de la pelicula");
        category=lectura.nextLine();
        System.out.println("Ingrese nombre del director");
        director=lectura.nextLine();


    }

    public String changeCategory(String c){
        int cambiar;
        System.out.println("¿Desea cambiar categoria? 1si 2no");
        cambiar=lectura.nextInt();

        if(cambiar==1){
            category=c;
            System.out.println("Ingrese nueva categoria");
            c=lectura.nextLine();
            
        }

        else{
            
        }
        return category;


    }

    public int addCredits(int a){
        int credits=a+15;
        return credits;

    }
    

        
    }
    

