package hilos.clase;

import javax.swing.*;
import java.awt.event.*;

public class ProcesoF extends JFrame {
    private JTextField campoMarca, campoModelo, campoPrecio;
    private JButton botonProcesar;

    public ProcesoF() {
        setTitle("Ingreso de Vehículo");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel etiquetaMarca = new JLabel("Marca:");
        etiquetaMarca.setBounds(20, 20, 80, 25);
        add(etiquetaMarca);

        campoMarca = new JTextField();
        campoMarca.setBounds(100, 20, 150, 25);
        add(campoMarca);

        JLabel etiquetaModelo = new JLabel("Modelo:");
        etiquetaModelo.setBounds(20, 60, 80, 25);
        add(etiquetaModelo);

        campoModelo = new JTextField();
        campoModelo.setBounds(100, 60, 150, 25);
        add(campoModelo);

        JLabel etiquetaPrecio = new JLabel("Precio:");
        etiquetaPrecio.setBounds(20, 100, 80, 25);
        add(etiquetaPrecio);

        campoPrecio = new JTextField();
        campoPrecio.setBounds(100, 100, 150, 25);
        add(campoPrecio);

        botonProcesar = new JButton("Procesar");
        botonProcesar.setBounds(90, 150, 120, 30);
        add(botonProcesar);

        botonProcesar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String marca = campoMarca.getText();
                String modelo = campoModelo.getText();
                String precio = campoPrecio.getText();

                JOptionPane.showMessageDialog(null, "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio);
            }
        });

        setVisible(true);

    }
}
