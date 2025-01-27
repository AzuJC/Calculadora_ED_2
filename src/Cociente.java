public class Cociente {

    /**
     * Realiza la división entre dos números reales.
     *
     * @param num1 El dividendo.
     * @param num2 El divisor. No puede ser 0.
     * @return El resultado de la división entre num1 y num2.
     * @todo Implementar manejo de excepciones personalizadas para divisores iguales a 0.
     */
    public static double dividorReales(double num1, double num2) {

        return num1 / num2;
    }

    /**
     * Realiza la división entre dos números enteros.
     *
     * @param num1 El dividendo.
     * @param num2 El divisor. No puede ser 0.
     * @return El resultado de la división entre num1 y num2.
     * @todo Implementar manejo de excepciones personalizadas para divisores iguales a 0.
     */
    public static int dividorEnteros(int num1, int num2) {

        return num1 / num2;
    }

    /**
     * Calcula el inverso de un número.
     *
     * @param num1 El número del que se desea calcular el inverso.
     * @return El valor inverso de num1.
     * @todo ArithmeticException si num1 es 0.
     */
    public static double inversoReal(double num1) {

        return 1 / num1;
    }

    /**
     * Calcula la raíz cuadrada de un número.
     *
     * @param num1 El número del que se desea calcular la raíz cuadrada.
     * @return La raíz cuadrada de num1.
     * @todo ArithmeticException si num1 es negativo.
     */
    public static double raiz(double num1) {

        return Math.sqrt(num1);
    }
}
