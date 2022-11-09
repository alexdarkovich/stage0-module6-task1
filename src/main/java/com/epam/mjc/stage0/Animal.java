package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return "This animal is mostly " + color + ". " +
                "It has " + numberOfPaws + (numberOfPaws == 1 ? " paw and " : " paws and ")
                + (hasFur == true ? "a" : "no") + " fur.";
    }

    public static void main(String[] args) {
        Animal animal = new Animal("red", 22, true);
        System.out.println(animal.getDescription());
    }
}
