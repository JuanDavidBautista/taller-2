package POLIMORFISMO;

public class Circulo extends Figura {

    private double radio;
    private double pi = 3.1416;

    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }



    @Override
    public void calcularArea(){
        double area=((pi*radio)/2);
        System.out.println("El area del circulo de radio " +this.radio+ " es " +area);
    }

    
}
