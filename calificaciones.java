public class calificaciones {
    public static void main(String[] args) {
        double[] notas = {3.5, 2.8, 4.0, 1.9, 3.2, 4.5, 2.5, 3.8};

        mostrarNotas(notas);
        double promedio = promedioNotas(notas);
        System.out.println("Promedio: " + promedio);

        System.out.println("Aprobados: " + aprobados(notas));
        System.out.println("Reprobados: " + reprobados(notas));

        System.out.println("Mayor nota: " + mayor(notas));
        System.out.println("Menor nota: " + menor(notas));
    }

    public static void mostrarNotas(double[] n) {
        for (double nota : n) {
            System.out.println(nota);
        }
    }

    public static double promedioNotas(double[] n) {
        double suma = 0;
        for (double nota : n) {
            suma += nota;
        }
        return suma / n.length;
    }

    public static int aprobados(double[] n) {
        int c = 0;
        for (double nota : n) {
            if (nota >= 3.0) c++;
        }
        return c;
    }

    public static int reprobados(double[] n) {
        return n.length - aprobados(n);
    }

    public static double mayor(double[] n) {
        double maximo = n[0];
        for (double nota : n) {
            if (nota > maximo) maximo = nota;
        }
        return maximo;
    }

    public static double menor(double[] n) {
        double minimo = n[0];
        for (double nota : n) {
            if (nota < minimo) minimo = nota;
        }
        return minimo;
    }
}