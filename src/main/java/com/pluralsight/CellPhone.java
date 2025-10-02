package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    public CellPhone() { // no parameters so it goes to default
        serialNumber = 23423435;
        model = "Nokia 215";
        carrier = "AT&A";
        phoneNumber = "237-847-8123";
        owner = "Aliza";
    }

  //  public void dail (String phoneNumber){
   //     System.out.println(owner + "'s phone is calling" + " " + phoneNumber);

    public void dial(String phoneNumber) {
        System.out.println("Calling ... " + phoneNumber);
    }

    public void dial(String phoneNumber, String owner) {
        System.out.println("Unknown number calling ... " + owner);
    }


    public int getSerialNumber() {
        return serialNumber; }
    public void setSerialNumber( int serialNumber ){
        this.serialNumber = serialNumber;}
    public String getModel() {
        return model; }
    public void setModel ( String model ){
        this.model = model; }
    public String getCarrier() {
        return carrier; }
    public void setCarrier(String carrier){
        this.carrier = carrier; }
    public String getPhoneNumber() {
        return phoneNumber; }
    public void setPhoneNumber( String phoneNumber ) {
        this.phoneNumber = phoneNumber ;
    }
    public String getOwner() {
        return owner; }
    public void setOwner(String owner) {
        this.owner = owner; }



}