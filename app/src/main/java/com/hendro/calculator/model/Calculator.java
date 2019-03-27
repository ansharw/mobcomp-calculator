package com.hendro.calculator.model;

public class Calculator {
    private int a;
    private int b;
    private String operator;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int penjumlahan(int a, int b){
        return a+b;
    }

    public int pengurangan(int a, int b){
        return a-b;
    }

    public int perkalian(int a, int b){
        return a*b;
    }

    public int pembagian(int a, int b){
        return a/b;
    }

}
