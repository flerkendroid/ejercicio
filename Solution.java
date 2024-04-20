class Solution {
    public static void main(String[] args) {
        int[] a = {0,2,44,2};

        System.out.println("Valores de a:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        reemplazaPrimerElemento(a);

        System.out.println("Valores de a:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void reemplazaPrimerElemento(int[] arreglo) {
        arreglo[0] = 100;
    }

}