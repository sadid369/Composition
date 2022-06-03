package com.timbuchalka;

public class Motherboard {
    private String models;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String models, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.models = models;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program"+programName+" is now loading...");
    }

    public String getModels() {
        return models;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
