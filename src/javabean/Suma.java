package javabean;

// Clase para operaciones de suma
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
