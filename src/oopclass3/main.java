/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopclass3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* int x = 10;
        int y = 12;
        short a = 5;
        float b = 5.6f;
        double z = 3.0;
        //x = x + 10;
        x += 10;//x = x+10;
        y -= 3;
        z = a + b + x + z;
        //z = (double)x / y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
         */

      // char arr[] = {'s','t','u','d','e','n','t'};

       /* arr[0] = 's';
        arr[1] = 't';
        arr[2] = 'u';
        arr[3] = 'd';
        arr[4] = 'e';
        arr[5] = 'n';
        arr[6] = 't';
*/

//        arr.toString();
//        System.out.println(arr);
        
        /*Scanner sc = new Scanner(System.in);
        
        System.out.println("input word");
        String word = sc.nextLine();
        
        word.toCharArray();
        
        
        for (int i =(word.length()-1) ; i >= 0; i--) {
            System.out.print(word.charAt(i));
            
        }*/
        
        Student first = new Student("avnish", 1236 , "ab");
        Student second = new Student("Jhon", 4789,"asd");
        Student third = new Student("ben", 7689,"asdd");
        Student fourth = new Student("mike", 7889,"a32sd");
        Student five = new Student("vlad", 7819,"543");
        
        Student arr[]=new Student[5];
        arr[0]=first;
        arr[1]=second;
        arr[2]=third;
        arr[3]=fourth;
        arr[4]=five;
        
        arr.toString();
        
        
        for (Student arr1 : arr) {
            System.out.println(arr1);
        }
        
                

    }

}
