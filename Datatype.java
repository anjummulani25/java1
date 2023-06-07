//java program to find Size of int,float,doubleand char in your systemimport java.util.*;



class Datatype {
    public static void main(String[] args) {
        System.out.println("Size of int: " + (Integer.SIZE / 8) + " bytes.");
        System.out.println("Size of long: " + (Long.SIZE / 8) + " bytes.");
        System.out.println("Size of char: " + (Character.SIZE / 8) + " bytes.");
        System.out.println("Size of float: " + (Float.SIZE / 8) + " bytes.");
        System.out.println("Size of double: " + (Double.SIZE / 8) + " bytes.");
    }
}