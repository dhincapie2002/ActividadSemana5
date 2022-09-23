package numeroabstracto;
public abstract class Numero {
    public double n1;
    public double n2;
    // Constructor de la clase Numero
    public Numero(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    // Metodo abstracto (no se implementa)
    public abstract double operacion();
}


