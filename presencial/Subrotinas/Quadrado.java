public class Quadrado {
    public static double area( double lado){
        return lado * lado;
    }

    public static double diagonal( double lado){
        return lado * Math.sqrt(2);
    }

    public static double perimetro( double lado){
        return lado * 4;
    }
}
