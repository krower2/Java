/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package television;

/**
 *
 * @author SALON202
 */
public class Television {

    public static void main(String[] args) {

        Canales tv = new Canales("LG", 50);

        tv.encender();
        tv.subirVolumen();
        tv.avanzarCanal();
        tv.avanzarCanal();
        tv.mute();
        tv.cambiarCanal(2); 
                System.out.println(tv);

    }
}
