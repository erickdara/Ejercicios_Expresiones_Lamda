package ejercicio3;

public class LamdaTest3 {
    public static void main(String[] args) {
        engine((x,y)-> x+y);
        engine((x,y)-> x/y);
        engine((x,y)-> x*y);
        engine((x,y)-> x%y);
    }

    private static void engine(Calculadora calculadora){
        int x=2, y=4;
        int resultado = calculadora.calcular(x,y);
        System.out.println(resultado);
    }
}
