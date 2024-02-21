import java.util.Scanner;

public class Operacion {
    /* ATRIBUTOS */
    private double numero1;
    private double numero2;

    /*CONSTRUCTORES*/
    public Operacion() {
    }
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    /*GETTER Y SETTER*/
    public double getNumero1() { return numero1;  }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() { return numero2;   }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /*METODOS*/
    public void crearOperacion(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor para el primer numero: ");
        this.numero1 = scanner.nextDouble();

        System.out.println("Ingrese un valor para el segundo numero: ");
        this.numero2 = scanner.nextDouble();

        scanner.close();
    }
    public double sumar(){
        return numero1 + numero2;
    }
    public double restar(){
        return numero1-numero2;
    }
    public double multiplicar(){
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error x multiplicar x 0");
            return 0;
        }
        else {
            return numero1 * numero2;
        }
    }
   /* public double dividir(){
        if (numero1 == 0 || if numero2 = 0 {
            return 0 + System.out.println("error");
        }
        numero1 / numero2;
    }*/

}
