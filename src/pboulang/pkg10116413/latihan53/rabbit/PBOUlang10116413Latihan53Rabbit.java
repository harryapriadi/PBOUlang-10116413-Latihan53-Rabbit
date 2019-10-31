/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan53.rabbit;

/**
 *
 * @author Lenovo
 * NAMA  : Harry Apriadi
 * Kelas : PBOULANG
 * NIM   : 10116413
 * Deskripsi Tugas : Membuat Program Klasifikasi Binatang
 */
public class PBOUlang10116413Latihan53Rabbit {

    /**
     */
    protected static boolean vegetarian;
    protected static String eats;
    protected static int noOfLegs;
    private static String color;
    private static String name;
    
    public static void main(String[] args) {
        // TODO code application logic here
    Animal animal = new Animal(false, "grass", 4);
       Rabbit rabbit = new Rabbit("grey", "Peter", false, "grey", 4);
       System.out.println("Hello, His name is " + rabbit.getName());
       System.out.println(rabbit.getName() + " is Vegetarian? " + 
                          rabbit.vegetarian);
       System.out.println(rabbit.getName() + " eats " + animal.eats);
       System.out.println(rabbit.getName() + " has " + rabbit.noOfLegs + 
                          " legs.");
       System.out.println(rabbit.getName() + " color is " + rabbit.getColor());   
        
    }
    
}