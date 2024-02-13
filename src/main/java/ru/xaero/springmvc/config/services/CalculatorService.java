package ru.xaero.springmvc.config.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements Action{
    private int a;
    private int b;

    public int multiplication(int a, int b){
        return a*b;
    }
    public int addition(int a, int b){
        return a+b;
    }
    public int subtraction(int a, int b){
        return a-b;
    }
    public int division(int a, int b){
        return a/b;
    }



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

    @Override
    public int action(String action, int a, int b) {
        int result = 0;
        switch (action){
            case "+":
                result = addition(a, b);
                break;
            case "-":
                result = subtraction(a, b);
                break;
            case "*":
                result = multiplication(a, b);
                break;
            case "/":
                result = division(a, b);
                break;
            default:
                result=0;
                break;
        }
        return result;
    }
}
