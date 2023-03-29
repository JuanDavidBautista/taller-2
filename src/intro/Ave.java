package intro;

public class Ave extends Animal{
    //atributos
    private int envergadura;

    //constructor
    public Ave(int envergadura) {
        this.envergadura = envergadura;
    }

    public Ave(String nombre, int edad, int envergadura) {
        super(nombre, edad);
        this.envergadura = envergadura;
    }

    //metodo
    public void mostrarAve(){
        System.out.println("el nombre del animal es: "+getName()+" la edad del animal es: "+getEdad()+"  su envergadura es: "+envergadura);
    }
    
}
