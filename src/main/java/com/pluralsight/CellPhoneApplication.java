package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone defaultPhone = new CellPhone();

        System.out.println("Default Owner: " + defaultPhone.getOwner());
        System.out.println("Default Serial Number: " + defaultPhone.getSerialNumber());
        System.out.println("Default Carrier: " + defaultPhone.getCarrier());
        System.out.println("Default Model: " + defaultPhone.getModel());
        System.out.println("Default Phone Number: " + defaultPhone.getPhoneNumber());


        defaultPhone.setSerialNumber(1223434567);
        defaultPhone.setModel("iPhone X");
        defaultPhone.setOwner("Dana Wyatt Holmes");

        System.out.println("\nAfter using setters:");
        System.out.println("Owner: " + defaultPhone.getOwner());
        System.out.println("Serial Number: " + defaultPhone.getSerialNumber());
        System.out.println("Model: " + defaultPhone.getModel());
        System.out.println("Owner: " + defaultPhone.getOwner());

    }
}
