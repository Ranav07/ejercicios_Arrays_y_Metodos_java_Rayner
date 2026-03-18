public class inventario {
    public static void main(String[] args) {
        int[] productos = {10, 2, 5, 8, 1, 12, 3, 7};

        mostrarInventario(productos);
        System.out.println("Menos de 5 unidades: " + contarMenores5(productos));
        System.out.println("Mayor cantidad: " + mayorProducto(productos));

        verificarReposicion(productos);
    }

    public static void mostrarInventario(int[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + p[i]);
        }
    }

    public static int contarMenores5(int[] p) {
        int contador = 0;
        for (int cantidad : p) {
            if (cantidad < 5) {
                contador++;
            }
        }
        return contador;
    }

    public static int mayorProducto(int[] p) {
        int maximo = p[0];
        for (int cantidad : p) {
            if (cantidad > max) {
                maximo = cantidad;
            }
        }
        return maximo;
    }

    public static void verificarReposicion(int[] p) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] < 3) {
                System.out.println("Producto " + (i + 1) + " necesita reposición");
            }
        }
    }
}