package hilos.clase;

public class ProcesoD implements Runnable{
    private int m;
    public ProcesoD(int m){
        this.m=m;
    }
    public void fila(int m) {
        for(int i=0; i<m; i++){
            System.out.print("*");
        }
    }

    @Override
    public void run() {
        fila(m);
    }
}
