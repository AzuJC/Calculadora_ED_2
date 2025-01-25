package javabean;
/**
 * Clase de operaciones de Producto
 * La clase {@code Producto} proporciona métodos para realizar el productos,
 * incluyendo el producto de números reales, enteros, el prodcuto de tres números reales
 * y la potencia.
 *  <p>Esta clase ofrece las siguientes funcionalidades:</p>
 *  <ul>
 *    <li>Producto de dos números reales</li>
 *    <li>Producto de dos números enteros</li>
 *    <li>Producto de tres números reales</li>
 *    <li>Potencia de un numero elevado a otro</li>
 *  </ul>
 *
 *
 * @author Alvaro Postigo Jimenez (alvaro.postigo440@comunidadunir.net)
 * @see Calculadora
 */
public class Producto {

    /**
     * Operación para el producto de dos números reales.
     * @param num1 - Primer número real que introducirá el usuario
     * @param num2 - Primer número real que introducirá el usuario
     * @return - Resultado de la operación del producto de dos números reales.
     */
    public double productoReales (double num1, double num2) {
        return num1*num2;
    }

    /**
     * Operación para el producto de dos números enteros.
     * @param num1 - Primer número que introducirá el usuario
     * @param num2 - Primer número entero que introducirá el usuario
     * @return - Resultado de la operación del producto de dos números enteros.
     */

    public int productoEnteros (int num1, int num2) {
        return num1*num2;
    }

    /**
     * Operación para el producto de tres números reales.
     * @param num1 - Número real que introducirá el usuario.
     * @param num2 - Número real que introducirá el usuario.
     * @param num3 - Número real que introducirá el usuario.
     * @return - Resultado de la operación del producto de tres numeros reales
     */
    public double productoTresReales (double num1, double num2, double num3) {
        return num1*num2*num3;
    }

    /**
     * Operacion para la potencia de dos numeros reales.
     * @param num1 - Número real que introducira el usuario.
     * @param num2 - Número real que introducira el usuario.
     * @return - Resultado de la operacion de potencia de dos numeros reales.
     */
    public double potencia (double num1, double num2) {
        return Math.pow(num1, num2);
    }

    /*
    *documentar casos especiales en caso de:
    * la calculadora no puede usar numeros negativos
    * que ocurriria si los numeros en la potencia son muy grandes
     */

}
