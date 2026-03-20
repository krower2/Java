/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarcosas;

/**
 *
 * @author pakoe
 */
public class ContarCosas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PesoObjetos item1 = new PesoObjetos("Banana", 3.00, 1.37);
        ContarObjetos item2 = new ContarObjetos("Pens", 4.5, 10);

        System.out.println(item1);
        System.out.println(item2);

    }
    
}
