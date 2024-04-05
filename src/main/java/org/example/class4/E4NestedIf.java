package org.example.class4;

public class E4NestedIf {

    public static void main(String[] args) {
        boolean mainDoor = false;
        boolean room1 = false;
        boolean room2 = true;
        if (mainDoor) {
            if (room1) {
                System.out.println("room1");
            } else {
                System.out.println("room1 is closed");
            }
        } else {
            System.out.println("Main door is closed");
        }if (room2) {
            System.out.println("room2 is open");
        }else{
            System.out.println("room2 is closed");

        }
    }
}