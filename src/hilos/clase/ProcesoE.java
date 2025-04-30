package hilos.clase;

import javax.swing.*;

public class ProcesoE implements Runnable {
    private String s;
    public ProcesoE(String s){
        this.s=s;
    }
    public void pantalla(String s){
        System.out.println("xd");
        JOptionPane.showMessageDialog(null,s);
    }

    @Override
    public void run() {
        pantalla(s);
    }
}
