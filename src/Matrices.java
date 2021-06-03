public class Matrices {

    public static void main(String[] args) {

        int matrizEnCero [][] = new int[4][4];
        int sumatoriaPorFila [];
        int sumatoriaPorColumnas [];


        // Imprime la matriz llena de ceros de 4x4
        for (int fila = 0; fila < matrizEnCero.length ; fila++) {
            for (int columna  = 0; columna < matrizEnCero[fila].length ; columna++) {

                // System.out.println("Posicion "+ fila +","+ columna + " valor "+ matrizEnCero[fila][columna]);


            }
        }




        int matrizAsignada [][] =  {{0,1,2,3},{4,5,6,7},{8,9,0,1}};

        // Imprime todas las posiciones de la matriz Asignada con numeros predefinidos.
        for (int fila = 0; fila <matrizAsignada.length ; fila++) {
            for (int columna = 0; columna < matrizAsignada[fila].length; columna++) {
                // System.out.println("Posicion "+ fila +","+ columna + " valor "+ matrizAsignada[fila][columna]);
            }

        }


        // Suma contenido de las filas y las columnas y las guarda en dos vectores
        // El vector sumatoriaPorFila contiene la suma de las filas
        // El vector sumatoriaPorColumnas contiene la suma de las columnas

        sumatoriaPorFila = new int[matrizAsignada.length];
        sumatoriaPorColumnas = new int[matrizAsignada[0].length];

        for (int fila = 0; fila <matrizAsignada.length ; fila++) {
            for (int columna = 0; columna < matrizAsignada[fila].length ; columna++) {

                sumatoriaPorFila[fila] += matrizAsignada[fila][columna];
                sumatoriaPorColumnas[columna] += matrizAsignada[fila][columna];

            }
        }

        // Imprime los vectores que continene en cada posicion la suma de las filas
        // y la suma de las columnas.
        for (int i = 0; i < sumatoriaPorFila.length ; i++) {
            System.out.println("sumatoriaPorFila = " + sumatoriaPorFila[i]);
            System.out.println("sumatoriaPorColumnas = " + sumatoriaPorColumnas[i]);
        }
    }



}
