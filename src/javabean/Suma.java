package javabean;

// Clase para operaciones de suma
/*
 Esta clase implementará todos los métodos que están relacionados con la suma de la calculadora. Esta
clase tendrá los siguientes métodos:
1. Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
2. Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
3. Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.

* */
class Suma {
    private double acumulado = 0;

    public double sumaReales(double a, double b) {
        return a + b;
    }

    public int sumaEnteros(int a, int b) {
        return a + b;
    }

    public double sumaTresReales(double a, double b, double c) {
        return a + b + c;
    }

    public void sumaAcumulada(double valor) {
        acumulado += valor;
    }

    public double getAcumulado() {
        return acumulado;
    }
}
