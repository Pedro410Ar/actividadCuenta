
public class Main {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta(1, 17001001, 3500);
        Cuenta c2 = new Cuenta(2, 3000000, 4700);

        c1.ingresar(10000);
        c1.retirar(700);
        //c1.extraccionRapida();
        c2.consultarSaldo();
        c2.consultarDatos();


        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        double resultadoSuma = operacion.sumar();
        double resultadoResta = operacion.restar();
        double resultadoMultiplicacion = operacion.multiplicar();

        System.out.println("El monto de la operacion es " + resultadoSuma);
        System.out.println("El monto de la operacion es " + resultadoResta);
        System.out.println("El monto de la operacion es " + resultadoMultiplicacion);



    }
}