package numeroabstracto;
public class Suma extends Numero{
    double n1, n2;
    public Suma (double n1, double n2) {
        super(n1, n2);
        this.n1 = n1;
        this.n2 = n2;
    }
    //imprementar el metodo dividir con los datos n1 y n2
    @Override
    public double operacion() {
        return n1+n2;
    }
}