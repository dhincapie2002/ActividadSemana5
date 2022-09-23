package calculadoramatriz;

public class Objetos {

    public Objetos(int f, int c, String valores1, String valores2) {
        this.f = f;
        this.c = c;
        this.valores1 = valores1;
        this.valores2 = valores2;
    }

    public Objetos() {
    }
    public int getF() {
        return f;
    }
    public int getC() {
        return c;
    }
    public String getValores1() {
        return valores1;
    }
    public String getValores2() {
        return valores2;
    }
    //
    public void setF(int f){
        this.f=f;
    }
    public void setC(int c){
        this.c=c;
    }
    public void setValores1(String valores1){
        this.valores1 = valores1;
    }
    public void setValores2(String valores2){
        this.valores2 = valores2;
    }
    private int f , c;
    private String valores1, valores2;
}
