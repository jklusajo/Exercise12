package com.example.exercise12;

enum Shapes{
    SQUARE, RECTANGLE, CIRCLE, TRAPEZOID, RHOMBUS, TRIANGLE, OVAL, HEXAGON
}

public class Task1 {
    public static void main(String[] args){
        Shapes sh;
        System.out.println("Here are some of the known shapes:");

        Shapes allShapes[] = Shapes.values();
        for (Shapes s: allShapes)
        System.out.println(s + " " + s.ordinal());
    }
}