package com.example.hellofx2.model;

public class MyCalcul {
    private int value1;
    private int value2;


    public int calculate(String typeCalcul){
        if(typeCalcul.equalsIgnoreCase("+")){
            return this.getValue1() + this.getValue2();
        }else{
            return this.getValue1() - this.getValue2();
        }
    }

    // Constructor
    public MyCalcul(String value1, String value2) throws Exception{
        try {
            this.setValue1(value1);
            this.setValue2(value2);
        } catch (Exception e) {
            throw new Exception("Error on constructor: " + e.getMessage());
        }
    }

    // Getters and setters
    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1){
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public void setValue1(String value1Front) throws Exception{
        try {
            this.setValue1(Integer.parseInt(value1Front));
        } catch (Exception e) {
            throw new Exception("Error on setting value1. Error : " + e.getMessage());
        }
    }

    public void setValue2(String value2Front) throws Exception{
        try {
            this.setValue2(Integer.parseInt(value2Front));
        } catch (Exception e) {
            throw new Exception("Error on setting value1. Error : " + e.getMessage());
        }
    }
}
