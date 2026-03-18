public class temperaturasSemana {

    public static void main(String[] args) {
        double[] temperaturas = {25.5, 27.0, 26.3, 28.1, 29.0, 24.8, 26.7};

        mostrarTemperaturas(temperaturas);
        double promedio = calcularPromedio(temperaturas);
        System.out.println("Promedio: " + promedio);

        System.out.println("Temperatura más alta: " + temperaturaMaxima(temperaturas));

        System.out.println("Dias con temperatura mayor al promedio:");
        diasMayorPromedio(temperaturas, promedio);
    }

    public static void mostrarTemperaturas(double[] t) {
        for (double temperatura : t) {
            System.out.println(temperatura);
        }
    }

    public static double calcularPromedio(double[] t) {
        double suma = 0;
        for (double temperatura : t) {
            suma += temperatura;
        }
        return suma / t.length;
    }

    public static double temperaturaMaxima(double[] t) {
        double maximo = t[0];
        for (double temp : t) {
            if (temp > max) {
                maximo = temp;
            }
        }
        return maximo;
    }

    public static void diasMayorPromedio(double[] t, double promedio) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] > promedio) {
                System.out.println("Día " + (i + 1) + ": " + t[i]);
            }
        }
    }
}