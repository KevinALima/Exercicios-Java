/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package somador;
    import javax.swing.JOptionPane;

/**
 *
 * @author Patrícia Carla Soare
 */
public class Somador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int n, t = 0, p = 0, i = 0, a = 0, m = 0;
        do {
         n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: (Valor 0 interrompe)"));
         t += n;
    } while(n != 0); {
    }
        JOptionPane.showMessageDialog(null, "Total de valores: " + t);
        JOptionPane.showMessageDialog(null, "Total de pares: ");
        JOptionPane.showMessageDialog(null, "Total de ímpares: ");
        JOptionPane.showMessageDialog(null, "Acima de 100: ");
        JOptionPane.showMessageDialog(null, "Média de valores: ");
    }

}