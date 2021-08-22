package bai4_class_and_object.bai_tap_4;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double geta() {
        return this.a;
    }

    private double getb() {
        return this.b;
    }

    private double getc() {
        return this.c;
    }

    private double getDiscriminant() {
        double delta = Math.pow(this.b,2) - 4 * this.a * this.c;
        return delta;
    }
    private double getRoot1(){
        if (this.getDiscriminant()>=0){
            double root1 = (-this.b+Math.pow(Math.pow(this.b,2)-4*this.a*this.c,0.5))/(2*this.a);
            return root1;
        }else  {
            return 0;
        }
    }
    private double getRoot2(){
        if (this.getDiscriminant()>=0){
            double root2 = (-this.b-Math.pow(Math.pow(this.b,2)-4*this.a*this.c,0.5))/(2*this.a);
            return root2;
        }else  {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Chương trình giải phương trình bậc 2 ax^2+bx+c=0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        System.out.println("a,b,c vừa nhập là: "+a+" "+b+" "+c);
        System.out.println("phương trình: "+a+"x^2 + "+b+"x + "+c+" = 0");
        QuadraticEquation QuadraticEquation1 = new QuadraticEquation(a,b,c);
        if(QuadraticEquation1.getDiscriminant()>0){
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("x1 = "+ QuadraticEquation1.getRoot1());
            System.out.println("x2 = "+ QuadraticEquation1.getRoot2());
        }else if(QuadraticEquation1.getDiscriminant()==0){
            System.out.println("Phương trình có 1 nghiệm kép:");
            System.out.println("x1 = x2 = "+ QuadraticEquation1.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }

    }

}
