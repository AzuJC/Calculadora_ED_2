package test;

// Clase principal para probar la calculadora
public class Calculadora {
    public static void main(String[] args) {
        Suma suma = new Suma();
        Resta resta = new Resta();
        Producto producto = new Producto();
        Cociente cociente = new Cociente();

        // Ejemplos de uso
        System.out.println("Suma de reales: " + suma.sumaReales(5.2, 3.8));
        System.out.println("Suma acumulada: ");
        suma.sumaAcumulada(10);
        suma.sumaAcumulada(15);
        System.out.println(suma.getAcumulado());

        System.out.println("Resta de enteros: " + resta.restaEnteros(10, 4));
        resta.restaAcumulada(5);
        System.out.println("Resta acumulada: " + resta.getAcumulado());

        System.out.println("Producto de reales: " + producto.productoReales(2.5, 4));
        System.out.println("Potencia: " + producto.potencia(2, 3));

        try {
            System.out.println("División de reales: " + cociente.divisionReales(10, 2));
            System.out.println("Raíz de 16: " + cociente.raiz(16));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
