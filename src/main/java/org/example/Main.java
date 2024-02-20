package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        System.out.print(c1.add(10,20));
    }
}

class Calculate {
    public int add(int a,int b){
        return a+b;
    }
}