/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Autoppal {
    
    //main + tab
    public static void main(String[] args) {
        Auto objAuto= new Auto();
        System.out.println(objAuto.getMarca());
        System.out.println(objAuto.getModelo());
        
        Auto objAuto2= new Auto("KIA", "MORNING","BENCINA", 2022, 1500);
        System.out.println(objAuto2.getMarca());
        System.out.println(objAuto2.getModelo());
    }
}
