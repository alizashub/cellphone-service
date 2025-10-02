package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        // CellPhone defaultPhone = new CellPhone();
        CellPhone callerPhone = new CellPhone();
        CellPhone calledPhone = new CellPhone();

        callerPhone.setOwner("Dana Wyatt");
        callerPhone.setPhoneNumber("855-555-111");

        calledPhone.setOwner("Alex Johnson");
        callerPhone.setPhoneNumber("934-555-2222");

//        display(calledPhone);
//        display(callerPhone);

        callerPhone.dial("123-456-7890");                   // calls first dial
        calledPhone.dial("987-654-3210", "Unknown Caller"); // calls overloaded dia
    }

        public static void display(CellPhone phone) {
            System.out.println("Owner: " + phone.getOwner());
            System.out.println("Phone Number: " + phone.getPhoneNumber());
            System.out.println("---------------------------");
        }
//
//        System.out.println("Default Owner: " + defaultPhone.getOwner());
//        System.out.println("Default Serial Number: " + defaultPhone.getSerialNumber());
//        System.out.println("Default Carrier: " + defaultPhone.getCarrier());
//        System.out.println("Default Model: " + defaultPhone.getModel());
//        System.out.println("Default Phone Number: " + defaultPhone.getPhoneNumber());
//        defaultPhone.setSerialNumber(1223434567);
//        defaultPhone.setModel("iPhone X");
//        defaultPhone.setOwner("Dana Wyatt Holmes");
//
//        System.out.println("\nAfter using setters:");
//        System.out.println("Owner: " + defaultPhone.getOwner());
//        System.out.println("Serial Number: " + defaultPhone.getSerialNumber());
//        System.out.println("Model: " + defaultPhone.getModel());
//        System.out.println("Owner: " + defaultPhone.getOwner());



}
