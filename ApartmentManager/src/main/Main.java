package main;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        //person 1 and 2
        Person person1 = new Person();
        person1.setPersonId(101);
        person1.setFirstName("Aaron");
        person1.setLastName("Burrows");
        person1.setUserName("aaron.burrows");
        person1.setUpdated();

        Person person2 = new Person(102, "Harold", "Jenkins", "harold.jenkins");

        //print person 1 information
        System.out.println("Person ID:\t\t" + person1.getPersonId());
        System.out.println("First Name:\t\t" + person1.getFirstName());
        System.out.println("Last Name:\t\t" + person1.getLastName());
        System.out.println("User Name:\t\t" + person1.getUserName());
        System.out.println("Last Updated:\t\t"+ person1.getUpdated());
        System.out.println();

        //print person 2 information
        System.out.println("Person ID:\t\t" + person2.getPersonId());
        System.out.println("First Name:\t\t" + person2.getFirstName());
        System.out.println("Last Name:\t\t" + person2.getLastName());
        System.out.println("User Name:\t\t" + person2.getUserName());
        System.out.println("Last Updated:\t\t"+ person2.getUpdated());
        System.out.println();

        //apartment 1 and 2
        Apartment apartment1 = new Apartment();
        apartment1.setApartmentId(1001);
        apartment1.setLocation("Void Tunnel");
        apartment1.setApartmentNum("349 Terrace");
        apartment1.setSquareFeet(1500);
        apartment1.setPrice(1000.00);
        apartment1.setUpdated();

        Apartment apartment2 = new Apartment(2001, "Whispering Faults", "67 Banjo Way", 2000, 2500.55);

        //print apartment 1 information
        System.out.println("Apartment ID:\t\t" + apartment1.getApartmentId());;
        System.out.println("Location:\t\t" + apartment1.getLocation());
        System.out.println("Apartment #:\t\t" + apartment1.getApartmentNum());
        System.out.println("Square Feet:\t\t" + apartment1.getSquareFeet());
        System.out.println("Price:\t\t\t" + apartment1.getPrice());
        System.out.println("Last Updated:\t\t" + apartment1.getUpdated());
        System.out.println();

        //print apartment 2 information
        System.out.println("Apartment ID:\t\t" + apartment2.getApartmentId());;
        System.out.println("Location:\t\t" + apartment2.getLocation());
        System.out.println("Apartment #:\t\t" + apartment2.getApartmentNum());
        System.out.println("Square Feet:\t\t" + apartment2.getSquareFeet());
        System.out.println("Price:\t\t\t" + apartment2.getPrice());
        System.out.println("Last Updated:\t\t" + apartment2.getUpdated());
        System.out.println();

        //auto generated toString prints out the apartment information a little differently
        System.out.println(apartment1.toString());
        System.out.println();
        System.out.println(apartment2.toString());
        System.out.println();

        displayTotals(apartment1, apartment2); 
    }

    public static void displayTotals(Apartment apartment1, Apartment apartment2) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        int totalSquareFeet = apartment1.getSquareFeet() + apartment2.getSquareFeet();
        double totalRevenue = apartment1.getPrice() + apartment2.getPrice();

        System.out.println("Total Square Feet:\t" + totalSquareFeet);
        System.out.println("Total Monthly Revenue:\t" + currency.format(totalRevenue));
    }
    
}
