package org.example;

public class Calculator {

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiplyByZero(int a){
        return 0;
    }

    public int abs(int a){
        if (a > 0){
            return a;
        }
        else{
            return -a;
        }
    }

}
