public class numeros {
    public static void main(String[] args) {
        int[] numeros = {10, 55, 23, 88, 42, 67, 91, 34, 12, 76, 5, 60};

        mostrarNumeros(numeros);
        System.out.println("Pares: " + contarPares(numeros));
        System.out.println("Impares: " + contarImpares(numeros));

        System.out.println("Mayor: " + mayor(numeros));
        System.out.println("Menor: " + menor(numeros));

        System.out.println("Mayores a 50: " + mayores50(numeros));
    }

    public static void mostrarNumeros(int[] n) {
        for (int numero : n) {
            System.out.println(numero);
        }
    }

    public static int contarPares(int[] n) {
        int c = 0;
        for (int numero : n) {
            if (numero % 2 == 0) {
                c++;
            }
        }
        return c;
    }

    public static int contarImpares(int[] n) {
        int c = 0;
        for (int numero : n) {
            if (numero % 2 != 0) {
                c++;
            }
        }
        return c;
    }

    public static int mayor(int[] n) {
        int maximo = n[0];
        for (int numero : n) {
            if (numero > maximo) maximo = numero;
        }
        return maximo;
    }

    public static int menor(int[] n) {
        int minimo = n[0];
        for (int numero : n) {
            if (numero < minimo) minimo = numero;
        }
        return minimo;
    }

    public static int mayores50(int[] n) {
        int c = 0;
        for (int numero : n) {
            if (numero > 50) c++;
        }
        return c;
    }
}