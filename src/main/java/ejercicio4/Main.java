package ejercicio4;

public class Main {
    public static void main(String[] args) {
        System.out.println(create().calculate(6,2));
    }

    private static CalculadoraLong create(){
        return (x,y) -> x / y;
    }
}
