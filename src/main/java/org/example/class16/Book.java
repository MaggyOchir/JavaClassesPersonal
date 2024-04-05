package org.example.class16;

import org.w3c.dom.ls.LSOutput;

/*Write Book class that will have 5 instance variables and 2 Constructors. While creating
an object make sure:
Instance variables are being initialized
Both Constructors are being executed
Create print info method and call it.*/
public class Book {
    String name;
    int noOfPage;
    String writer;
    int price;
    String coverColor;

    Book(String eName, int enoOfPage, String eWriter, int ePrice, String eCoverColor) {
        name = eName;
        noOfPage = enoOfPage;
        writer = eWriter;
        price = ePrice;
        coverColor = eCoverColor;
    }

    void printInfo() {
        System.out.println("Book " + name + " written by " + writer + " with " + coverColor + " cover and with " + noOfPage + " pages is sold for $" + price);
    }
    public static void main(String[] args) {
        Book a = new Book("Monte Kristo", 200, "Jack London", 100, "blue");
        a.printInfo();
        Book b = new Book("Java for dummies", 111, "Agshar", 2000, "black");
        b.printInfo();
    }
}
