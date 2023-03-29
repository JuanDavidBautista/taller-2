package POLIMORFISMO;

public class Triangulo extends Figura {

    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public float getAltura(){
        return altura; 
    }


    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    @Override
    public void calcularArea(){
        float area=(base*altura)/2;
        System.out.println("El area del triangulo de base " +this.base+" y altura "+this.altura+ " es " +area);
    }

    
}
