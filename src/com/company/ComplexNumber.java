package com.company;

public class ComplexNumber {
    private int real;
    private int imaginary;

    ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber(){}

    public void setReal(int real){
        this.real = real;
    }
    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }
    public int getReal(){
        return this.real;
    }
    public int getImaginary(){
        return this.imaginary;
    }

    @Override
    public String toString(){
        return "re: " + real + " im: " + imaginary;
    }
}
