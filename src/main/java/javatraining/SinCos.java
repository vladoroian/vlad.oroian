package javatraining;

public class SinCos {

    public static void main (String [] args) {
        double angle = 30.0;
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        double result = Math.pow(sin, 2.0) + Math.pow(cos, 2.0);

        System.out.println("sin2(x) + cos2(x) = " + result);
    }
}
