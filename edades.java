public class edades {
    public static void main(String[] args) {
        int[] edades = {15, 18, 20, 17, 22, 19, 16, 21, 23, 14};

        mostrarEdades(edades);
        System.out.println("Mayores de edad: " + contarMayores(edades));

        double promedio = promedioEdad(edades);
        System.out.println("Promedio: " + promedio);

        System.out.println("Por debajo del promedio: " + debajoPromedio(edades, promedio));
    }

    public static void mostrarEdades(int[] e) {
        for (int edad : e) {
            System.out.println(edad);
        }
    }

    public static int contarMayores(int[] e) {
        int contador = 0;
        for (int edad : e) {
            if (edad >= 18) {
                contador++;
            }
        }
        return contador;
    }

    public static double promedioEdad(int[] e) {
        int suma = 0;
        for (int edad : e) {
            suma += edad;
        }
        return (double) suma / e.length;
    }

    public static int debajoPromedio(int[] e, double promedio) {
        int contador = 0;
        for (int edad : e) {
            if (edad < promedio) {
                contador++;
            }
        }
        return contador;
    }
}