/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miriam Martín Amat
 */
public class Tema19 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        
        

        if (i % 2 != 0) {
            array[i] *= -1;
        }
      }
        mostrararray(array);
    }

    static void mostrararray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + ": " + a[i]);
        }
    }
}

