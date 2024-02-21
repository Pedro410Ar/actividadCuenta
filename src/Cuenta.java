/*ENTIDAD CUENTA*/
public class Cuenta {
    /* ATRIBUTOS */
    public int numeroCuenta;
    public long dni;
    public double saldoActual;


    /*CONSTRUCTORES*/
    public Cuenta() {
    }
    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    /*GETTER Y SETTER*/
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }


    /* OTROS METODOS */
    //CREAR OBJETO CUENTA//
    public void crearCuenta(){
    }

    //INGRESAR//
    public void ingresar (double valorIngresar) {
        if(valorIngresar>0){
        saldoActual += valorIngresar;
    }}

    //RETIRAR//
    public void retirar (double valorRetirar) {
        if(saldoActual>0 && valorRetirar<=saldoActual){
        saldoActual -= valorRetirar;
    }}

    /*EXTRACCION RAPIDA: le permitirá sacar solo un 20% de su saldo//
    public void extraccionRapida(double valorRapido) {

        saldoActual -= valorRapido;
    } */

    //CONSULTAR SALDO//
    public void consultarSaldo(){
        System.out.println("El saldo disponible es de: " + this.saldoActual);
    }

    //CONSULTAR DATOS//
    public void consultarDatos(){
        System.out.println("Numero de cuenta: " + this.numeroCuenta + " ****| DNI: " +  this.dni + " ****| Saldo: " + this.saldoActual);

    }


}

