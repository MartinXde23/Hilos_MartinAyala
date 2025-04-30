package test;

import hilos.clase.*;

public class test {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Martín Andres");
        p.setFechaNacimiento("08 de agosto de 2002");
        p.setDireccion("Quito, Solca");

        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Fecha: "+p.getFechaNacimiento());
        System.out.println("Dirección: "+p.getDireccion());

        Auto a = new Auto();
        a.setMarca("Toyota");
        a.setModelo("Supra");
        a.setPrecio(80000);

        System.out.println("Marca: "+a.getMarca());
        System.out.println("Modelo: "+a.getModelo());
        System.out.println("Precio: "+a.getPrecio());

        ProcesoF f = new ProcesoF();
        /*
        ProcesoA a = new ProcesoA("Andres");
        ProcesoB b = new ProcesoB(200);
        ProcesoC c = new ProcesoC(5);
        Runnable x = new ProcesoD(100);
        Thread d = new Thread(x);
        Runnable y = new ProcesoE("Hola como estás?");
        Thread e = new Thread(y);
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        */
    }
}
