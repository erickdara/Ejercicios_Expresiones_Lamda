package ejercicio4;

public class Principal {
    public static void main(String[] args) {
        // Solución de ambiguedades en los parametros cuando el compilador no pude
        // resolver el tipo en expresiones lambda
        //Opcpión con referencia o instancia de clase
        CalculadoraInt calI = (x,y) -> x + y;
        CalculadoraLong calL = (x,y) -> x + y;

        engine(calI);
        engine(calI);

        // Opción con tipo de dato para referenciar interfaz Long
        //engine((long x, long y) -> x + y);

        //Opción con casteo de clase
        //engine((CalculadoraLong) (x, y) -> x + y);
    }

    public static void engine(CalculadoraInt cal){

    }

    public static void engine(CalculadoraLong cal){

    }
}
