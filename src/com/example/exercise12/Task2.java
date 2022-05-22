package com.example.exercise12;

enum TrafficLightColor{
    RED, YELLOW, GREEN
}

class TrafficLightSimulator{
    TrafficLightColor tlc = TrafficLightColor.RED;

    public void changeColor(){
        switch (tlc){
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }
    }

    public String toString() {return " " + tlc;}
}
public class Task2 {
    public static void main(String[] args){
        TrafficLightSimulator t1 = new TrafficLightSimulator();
        for (int i = 0; i < 9; i++){
            System.out.println(t1);
            t1.changeColor();
        }
    }
}