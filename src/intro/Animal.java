package intro;

import java.util.Scanner;

public class Animal {

    //Atributos 
    
    private String nombre;
    private int edad;

    
private Scanner lectura=new Scanner(System.in);

//Metodo constructor 
public Animal(){

}

public Animal(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
}

//metodos accesores (set get)
public String getName(){
    return nombre;
}
public int getEdad(){
    return edad;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
    //Metodos

    public void registrarAnimal(){
        //cuerpo del metodo 

        System.out.println("Ingrese el nombre del animal");
        nombre=lectura.nextLine();

        System.out.println("Ingrese la edad del animal");
        edad=lectura.nextInt();
}

public void mostrarAnimal(){
    System.out.println("El nombre del animal es " + nombre + " y su edad es " +edad);

}
}
