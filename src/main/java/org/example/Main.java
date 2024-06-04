package org.example;

class Main {
    public static void main(String[] args) {

        boolean rs2 = 계산기.is_a_bigger_than_b(10, 20);
        System.out.println(rs2);
        rs2 = 계산기.is_a_bigger_than_b(240, 20);
        System.out.println(rs2);
        rs2 = 계산기.is_a_bigger_than_b(20, 20);
        System.out.println(rs2);

    }
}

class 계산기 {

    static boolean is_a_bigger_than_b(int a, int b) {
        boolean c = a > b;
        return c;
    }





}