/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author nishom
 */
public class Power {
    public static void main(String[] args) {
        double d1 = Math.pow(8, 128);
        double d2 = Math.pow(8, 128);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(Math.max(d1, d2)); 
        System.out.println(Math.min(d1, d2)); 
    }
}
