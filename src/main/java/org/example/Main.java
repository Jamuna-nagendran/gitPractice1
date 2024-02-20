package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        System.out.print(c1.calculate(20,10));
    }
}

class Calculate {
    public int calculate(int a,int b){
        return a+b;
    }
}