package hilos.clase;

public class ProcesoB extends Thread{
    private int n;
    public ProcesoB(int n){
        this.n=n;
    }
    public void contar(int n){
        for(int i=1; i<n; i++){
            System.out.println("La cuenta es:"+i);
        }
    }
    public void run(){
        for(int i=1; i<n; i++){
            System.out.println("La cuenta es:"+i);
            try{
                sleep(2000);//pausa la ejercición del hilo
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
