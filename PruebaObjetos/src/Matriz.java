
public class Matriz {

    int filas;
    int columnas;
    int[][] matriz;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
    }

    public void llenarAletorio() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
    }

    public int minimo(int fila) {
        int menor = matriz[0][0];

        for (int i = fila; i <= fila; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        return menor;
    }
    
    public int mayor(int fila) {
        int mayor = matriz[0][0];

        for (int i = fila; i <= fila; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }

        return mayor;
    }

    public int numerosFaltantes(int inicio, int fin, int fila) {
        int contador = 0;
        int contadorfaltantes = 0;
        for (int i = inicio ; i < fin; i++) {
            contador = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                if(i != matriz[fila][j]) {
                    contador++;
                    if(contador == matriz[0].length) contadorfaltantes++;
                }
            }
        }
        return contadorfaltantes ;
    }
    
    
    public void NuevoArreglo(){
        int[] arreglo = new int[matriz.length];
        int numero;
        for (int i = 0; i < filas; i++) {        
                arreglo[i] = numerosFaltantes(minimo(i), mayor(i),i);
                System.out.println(arreglo[i]);
        }
        
    }

    public void imprimirMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
