package javabean;

/**
 * La clase {@code Suma} proporciona métodos para realizar operaciones de suma,
 * incluyendo la suma de números reales, enteros, la suma de tres números reales
 * y mantener un valor acumulado.
 *
 * <p>Esta clase ofrece las siguientes funcionalidades:</p>
 * <ul>
 *   <li>Suma de dos números reales</li>
 *   <li>Suma de dos números enteros</li>
 *   <li>Suma de tres números reales</li>
 *   <li>Acumulación de valores mediante un método acumulador</li>
 * </ul>
 *
 * @author Alexander Roman Diaz
 */
public class Suma {

    /**
     * Variable que almacena el valor acumulado de las sumas realizadas.
     */
    private double acumulado = 0;

    /**
     * Suma dos números reales.
     *
     * @param a Primer número real a sumar.
     * @param b Segundo número real a sumar.
     * @return El resultado de la suma de los dos números reales.
     */
    public double sumaReales(double a, double b) {
        return a + b;
    }

    /**
     * Suma dos números enteros.
     *
     * @param a Primer número entero a sumar.
     * @param b Segundo número entero a sumar.
     * @return El resultado de la suma de los dos números enteros.
     */
    public int sumaEnteros(int a, int b) {
        return a + b;
    }

    /**
     * Suma tres números reales.
     *
     * @param a Primer número real a sumar.
     * @param b Segundo número real a sumar.
     * @param c Tercer número real a sumar.
     * @return El resultado de la suma de los tres números reales.
     */
    public double sumaTresReales(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * Realiza una suma acumulada al valor almacenado en la variable {@code acumulado}.
     *
     * @param valor El valor a sumar al acumulado.
     */
    public void sumaAcumulada(double valor) {
        acumulado += valor;
    }

    /**
     * Obtiene el valor acumulado.
     *
     * @return El valor actual acumulado.
     */
    public double getAcumulado() {
        return acumulado;
    }
}