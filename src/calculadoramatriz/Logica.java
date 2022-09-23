package calculadoramatriz;

import javax.swing.JOptionPane;

public class Logica {

    Objetos obj = new Objetos();

    public static void main(String[] args) {
    }

    //suma
    public void Suma() {
        // recivir y proteger el numero de filas y columnas
        obj.setF(Integer.parseInt(JOptionPane.showInputDialog("Numero de filas: ")));
        obj.setC(Integer.parseInt(JOptionPane.showInputDialog("Numero de columnas: ")));
        // Recivir y proteger valores de las matrices
        String valores1 = JOptionPane.showInputDialog("Numeros correspondientes a la matriz 1, Separandolos con espacio: ");
        obj.setValores1(valores1);
        String valores2 = JOptionPane.showInputDialog("Numeros correspondientes a la matriz 2, Separandolos con espacio: ");
        obj.setValores2(valores2);
        // Convertir los String con los valores de las matrices a vectores
        String[] ma1 = valores1.split(" ");
        String[] ma2 = valores2.split(" ");
        // Crear la matriz con la que se trabajara
        int matriz1[][] = new int[obj.getF() + 1][obj.getC() + 1];
        int matriz2[][] = new int[obj.getF() + 1][obj.getC() + 1];
        // Almacenar el vector en la matriz
        int k = 0;
        for (int i = 0; i < obj.getF(); i++) {
            for (int j = 0; j < obj.getC(); j++) {
                matriz1[i][j] = Integer.parseInt(ma1[k]);
                matriz2[i][j] = Integer.parseInt(ma2[k]);
                k++;
            }
        }
        // Crear matriz para guardar el resultado
        int matriz3[][] = new int[obj.getF() + 1][obj.getC() + 1];

        for (int i = 0; i < obj.getF(); i++) {
            for (int j = 0; j < obj.getC(); j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        // Imprimir resultado
        String resultado = "";
        for (int i = 0; i < obj.getF(); i++) {
            for (int j = 0; j < obj.getC(); j++) {
                resultado += matriz3[i][j];
                resultado = resultado + " ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    //resta
    public void Resta() {
        // recivir y proteger el numero de filas y columnas
        obj.setF(Integer.parseInt(JOptionPane.showInputDialog("Numero de filas: ")));
        obj.setC(Integer.parseInt(JOptionPane.showInputDialog("Numero de columnas: ")));
        // Recivir y proteger valores de las matrices
        String valores1 = JOptionPane.showInputDialog("Numeros correspondientes a la matriz 1, (Separandolos con espacio): ");
        obj.setValores1(valores1);
        String valores2 = JOptionPane.showInputDialog("Numeros correspondientes a la matriz 2, (Separandolos con espacio): ");
        obj.setValores2(valores2);
        // Convertir los String con los valores de las matrices a vectores
        String[] ma1 = valores1.split(" ");
        String[] ma2 = valores2.split(" ");
        // Crear la matriz con la que se trabajara
        int matriz1[][] = new int[obj.getF() + 1][obj.getC() + 1];
        int matriz2[][] = new int[obj.getF() + 1][obj.getC() + 1];
        // Almacenar el vector en la matriz
        int k = 0;
        for (int i = 0; i < obj.getF(); i++) {
            for (int j = 0; j < obj.getC(); j++) {
                matriz1[i][j] = Integer.parseInt(ma1[k]);
                matriz2[i][j] = Integer.parseInt(ma2[k]);
                k++;
            }
        }
        // Crear matriz para guardar el resultado
        int matriz3[][] = new int[obj.getF() + 1][obj.getC() + 1];

        for (int i = 0; i < obj.getF(); i++) {
            for (int j = 0; j < obj.getC(); j++) {
                matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        // Imprimir resultado
        String resultado = "";
        for (int i = 0; i < obj.getF(); i++) {
            for (int j = 0; j < obj.getC(); j++) {
                resultado += matriz3[i][j];
                resultado = resultado + " ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    //Traza
    public void Traza() {
        // recivir y proteger el tamaño de la matriz
        obj.setF(Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la matriz: ")));
        // Recivir y proteger valores de las matrices
        String valores1 = JOptionPane.showInputDialog("Numeros correspondientes a la matriz, (Separandolos con espacio): ");
        obj.setValores1(valores1);
        // Convertir los String con los valores de las matrices a vectores
        String[] ma1 = valores1.split(" ");
        // Crear la matriz con la que se trabajara
        int matriz1[][] = new int[obj.getF() + 1][obj.getF() + 1];
        // Almacenar el vector en la matriz
        int k = 0;
        for (int i = 0; i < obj.getF(); i++) {
            for (int j = 0; j < obj.getF(); j++) {
                matriz1[i][j] = Integer.parseInt(ma1[k]);
                k++;
            }
        }
        // Calcular la traza
        int traza = 0;
        for (int i = 0; i < obj.getF(); i++) {
            for (int j = 0; j < obj.getF(); j++) {
                if (i == j) {
                    traza += matriz1[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El resultado de la traza es: " + traza);
    }

    //Determinante
    public void Determinante() {
        // Recivir y proteger el tamaño de la matriz
        obj.setF(Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la matriz (Solofinciona para matrices de tamaño 1,2,3): ")));
        // Recivir y proteger valores de las matrices
        String valores1 = JOptionPane.showInputDialog("Numeros correspondientes a la matriz, (Separandolos con espacio): ");
        obj.setValores1(valores1);
        // Convertir los String con los valores de las matrices a vectores
        String[] ma1 = valores1.split(" ");
        // Crear la matriz con la que se trabajara
        int matriz1[][] = new int[obj.getF() + 1][obj.getF() + 1];
        // Almacenar el vector en la matriz
        int k = 0;
        for (int i = 0; i < obj.getF(); i++) {
            for (int j = 0; j < obj.getF(); j++) {
                matriz1[i][j] = Integer.parseInt(ma1[k]);
                k++;
            }    
        }
        int determinante=0;
        if(obj.getF()==1){
            determinante = matriz1[0][0];
        }
        if(obj.getF()==2){
            determinante = (matriz1[0][0]*matriz1[1][1])-(matriz1[0][1]*matriz1[1][0]);
        }
        if(obj.getF()==3){
            determinante = (((matriz1[0][0]*matriz1[1][1]*matriz1[2][2])+(matriz1[1][0]*matriz1[2][1]*matriz1[0][2])+(matriz1[2][0]*matriz1[0][1]*matriz1[1][2]))-((matriz1[1][0]*matriz1[0][1]*matriz1[2][2])+(matriz1[0][0]*matriz1[2][1]*matriz1[1][2])+(matriz1[2][0]*matriz1[1][1]*matriz1[0][2])));
        }
        JOptionPane.showMessageDialog(null, "El resultado de la determinante es: " + determinante);
    }
}
