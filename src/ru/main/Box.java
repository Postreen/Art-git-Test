package ru.main;

public class Box {

    private static Integer staticField;
    private Integer Id;
    public String name;
    int size;

    public Box(Integer id, String name, int size) {
        Id = id;
        this.name = name;
        this.size = size;
    }

    public void publicMethod(int i) {
        System.out.println("Print - publicMethod");
    }
    private void privateMethod() {
        System.out.println("Print - privateMethod");
    }

}
