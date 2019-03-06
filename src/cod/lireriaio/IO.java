/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod.lireriaio;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author fred
 */
public class IO {
    static Scanner ler = new Scanner(System.in);
    final static int CONSOLA = 1;
    final static int VENTANA = 2;
    public static int variableInt;
    public static float variableFloat;
    public static String variableString;

    
     /**
     * Metodo para introducir un int por consola o ventana
     * @param opciones Es un array para guardar los que queremos que muestre la ventana que nos preguntará que deseamos
     * @param b va convertir la opcion elegida en un numero para así entrar en uno de los apartados del switch
     */
    public static int introducir(int b) {
        String[] opciones={"CONSOLA","VENTANA"};
         b = JOptionPane.showOptionDialog(null,"Desea acceder por consola o por ventana?" ,null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,null);
        switch (b) {

            case 0:
                System.out.println("Introduzca su variable tipo int");
                int d = ler.nextInt();
                System.out.println("Ha introducidola variable tipo int con valor: " + d);
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "Introduzca su variable tipo int");
                int e = Integer.parseInt(JOptionPane.showInputDialog(null, "Ponga su int"));
                JOptionPane.showMessageDialog(null, "Ha introducido la variable tipo int con valor: " + e);
                break;
        }
        return b;
    }
     /**
     * Metodo para introducir un float por consola o ventana
     * @param opciones Es un array para guardar los que queremos que muestre la ventana que nos preguntará que deseamos
     * @param f va convertir la opcion elegida en un numero para así entrar en uno de los apartados del switch
     */
    public static float introducir(float f) {
        String[] opciones={"CONSOLA","VENTANA"};
         f = JOptionPane.showOptionDialog(null,"Desea acceder por consola o por ventana?" ,null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,null);
        switch ((int) f) {

            case 0:
                System.out.println("Introduzca su variable tipo float");
                float d = ler.nextFloat();
                System.out.println("Ha introducidola variable tipo float con valor: " + d);
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "Introduzca su variable tipo float");
                float e = Float.parseFloat(JOptionPane.showInputDialog(null, "Ponga su float"));
                JOptionPane.showMessageDialog(null, "Ha introducido la variable tipo float con valor: " + e);
                break;
        }
        return f;
    }
    
    /**
     * Metodo para introducir un String por consola o ventana
     * @param opciones Es un array para guardar los que queremos que muestre la ventana que nos preguntará que deseamos
     * @param o va convertir la opcion elegida en un numero para así entrar en uno de los apartados del switch
     */
    public static String introducir(String g) {
        String[] opciones={"CONSOLA","VENTANA"};
        int o = 0;
        g=Integer.toString(o);
        o = JOptionPane.showOptionDialog(null,"Desea acceder por consola o por ventana?" ,null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,null);
        switch (o) {

            case 0:
                System.out.println("Introduzca su variable tipo String");
                String d = ler.next();
                System.out.println("Ha introducidola variable tipo String con valor: " + d);
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "Introduzca su variable tipo String");
                String e = JOptionPane.showInputDialog(null, "Ponga su String");
                JOptionPane.showMessageDialog(null, "Ha introducido la variable tipo String con valor: " + e);
                break;
        }
        return g;
    }
    /**
     * Metodo para introducir un char por consola o ventana
     * @param opciones Es un array para guardar los que queremos que muestre la ventana que nos preguntará que deseamos
     * @param h va convertir la opcion elegida en un numero para así entrar en uno de los apartados del switch
     */
    public static char introducir(char h) {
        String[] opciones={"CONSOLA","VENTANA"};
        h = (char) JOptionPane.showOptionDialog(null,"Desea acceder por consola o por ventana?" ,null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,null);
        switch (h) {

            case 0:
                System.out.println("Introduzca su variable tipo char");
                String d = ler.next();
                System.out.println("Ha introducidola variable tipo char con valor: " + d);
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "Introduzca su variable tipo char");
                String e = JOptionPane.showInputDialog(null, "Ponga su char");
                JOptionPane.showMessageDialog(null, "Ha introducido la variable tipo char con valor: " + e);
                break;
        }
        return h;

}
}
