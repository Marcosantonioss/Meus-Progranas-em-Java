/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0,par=0,impar=0,cont=0,acima=0;
        float media;
        
        
        do
            {

                n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>informe um número..: <br><em>valor 0 interrompe</em></html>"));
                s+=n;
                
                if(n==0)
                {
                    break;
                }
                else{
                    
                if (n%2==0)
                    {
                        par++;
                    }
                else
                    {
                        impar++;
                    }
                if(n>100)
                  {
                    acima ++;
                  }
                cont++;
                }
            }
        while(n !=0);
            media = s/cont;
            JOptionPane.showMessageDialog(null, "<html>Resultado <br>_______________<br> " + "<br>Total de Valores: " + cont + "<br> Total Pares: " + par + "<br> Total Impares: " + impar + "<br> Acima de 100: " + acima + "<br> Media dos Valores: " + media+ "</html>");
    }
    
}
