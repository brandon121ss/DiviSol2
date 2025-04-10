import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;


public class Final2 {
    public static void main(String[] args) {
        // Crear la ventana 1
        JFrame ventana1 = new JFrame("Inicio de sesion");
        ventana1.setSize(300, 400);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setLocation(600, 100);
        ventana1.setLayout(null);
        
        //Texto agregado
        JLabel Iniiciodesesion = new JLabel("Iniciar sesion");
        Iniiciodesesion.setBounds(110,20,120,30);
        JLabel usuario = new JLabel("Usuario");
        usuario.setBounds(50,60,120,30);
        JLabel contraseña = new JLabel("Contraseña");
        contraseña.setBounds(50,90,120,30);
        
        //Cuadro de texto 
        JTextField nombre = new JTextField();
        nombre.setBounds(150,60,120,25);
        JTextField contra = new JTextField();
        contra.setBounds(150,90,120,25);

        // Crear un botón para abrir la ventana 2
        JButton botonAbrirVentana2 = new JButton("Iniciar sesion");
        botonAbrirVentana2.setBackground(Color.green);
        botonAbrirVentana2.setBounds(90,200,120,30);
        
        //Boton sin funcion
        JButton registro = new JButton("Registrarse");
        registro.setBounds(90,250,120,30);
        registro.setBackground(Color.blue);

        // imagen de la empresa
        ImageIcon calaca = new ImageIcon("Calaca.jpg");
        JLabel esqueleto = new JLabel(calaca);
        esqueleto.setBounds(10, 10,80,60);

        // Agregar el componenetes de la ventana1
        ventana1.add(esqueleto);
        ventana1.add(contra);
        ventana1.add(nombre);
        ventana1.add(contraseña);
        ventana1.add(usuario);
        ventana1.add(Iniiciodesesion);
        ventana1.add(registro);
        ventana1.add(botonAbrirVentana2);
       
       
        //Mostrar ventana
        ventana1.setVisible(true);
        




        // Acción al presionar el botón
        botonAbrirVentana2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // Crear y mostrar la ventana 2
                JFrame ventana2 = new JFrame("Menu");
                ventana2.setSize(350, 600);
                ventana2.setLocation(600, 100);
                ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana2.setLayout(null);

                
                //Crear botones de menu
                JButton Inventario = new JButton("Inventario");
                Inventario.setBounds(70,100,200,50);
                Inventario.setBackground(Color.green);
                JButton Config = new JButton("Configuracion");
                Config.setBounds(70,200,200,50);
                Config.setBackground(Color.blue);
                JButton DevyRe = new JButton("Devloluciones y reclamaciones");
                DevyRe.setBounds(70,300,200,50);
                DevyRe.setBackground(Color.green);
                JButton Contratos = new JButton("Contratos y acuerdos");
                Contratos.setBounds(70,400,200,50);
                Contratos.setBackground(Color.blue);

                
                
                //Elementos de la Ventana2
                ventana2.add(Inventario);
                ventana2.add(Config);
                ventana2.add(DevyRe);
                ventana2.add(Contratos);
                
                
                ventana2.setVisible(true);

                //Abrir ventana de inventario
                 Inventario.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame ventanaInv = new JFrame("Inventario");
                        ventanaInv.setSize(350, 300);
                        ventanaInv.setLocation(970, 100);
                        ventanaInv.setLayout(null);
                        //Bonotes de la ventanainventario
                       
                        JLabel tabla = new JLabel("Nada xdxdxdxdx");
                        tabla.setBounds(30,150,200,45);
                        ventanaInv.add(tabla);

                        ventanaInv.setVisible(true);
                    }
                });
                //Abrir ventana de Configuracion 
                Config.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame ventanaConf = new JFrame("Configuración");
                        ventanaConf.setSize(350, 450);
                        ventanaConf.setLocation(970, 150);
                        ventanaConf.setLayout(null);

                        //Botones de la ventana Configuracion
                        JButton EditP = new JButton("Editar Perfil");
                        EditP.setBounds(70,100,200,50);
                        EditP.setBackground(Color.green);
                        JButton Not = new JButton("Notificaciones");
                        Not.setBounds(70,200,200,50);
                        Not.setBackground(Color.blue);
                        JButton Ayuda = new JButton("Ayuda");
                        Ayuda.setBounds(70,300,200,50);
                        Ayuda.setBackground(Color.green);
                         
                        //Añadir elementos 
                        ventanaConf.add(EditP);
                        ventanaConf.add(Not);
                        ventanaConf.add(Ayuda);

                        
                        ventanaConf.setVisible(true);
                    }
                });
                //Abrir ventana Devoluciones
                DevyRe.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame ventanaDev = new JFrame("Devoluciones y reclamaciones");
                        ventanaDev.setSize(350, 450);
                        ventanaDev.setLocation(970, 200);
                        ventanaDev.setLayout(null);

                        //Botones de la ventana 
                        JButton DevP = new JButton("Devoluciones a Provedor");
                        DevP.setBounds(70,100,200,50);
                        DevP.setBackground(Color.green);
                        JButton DevC = new JButton("Devoluciones a Clientes");
                        DevC.setBounds(70,200,200,50);
                        DevC.setBackground(Color.blue);
                        JButton reclamaciones = new JButton("Reclamaciones");
                        reclamaciones.setBounds(70,300,200,50);
                        reclamaciones.setBackground(Color.green);

                        //Añadir elementos
                        ventanaDev.add(DevC);
                        ventanaDev.add(DevP);
                        ventanaDev.add(reclamaciones);
                         
                       
                        ventanaDev.setVisible(true);
                    }
                });
                 //Abrir ventana Contratos
                 Contratos.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame ventanaCont = new JFrame("Contratos y acuerdos");
                        ventanaCont.setSize(350, 450);
                        ventanaCont.setLocation(970, 250);
                        ventanaCont.setLayout(null);

                        //Apartados de la opcion 
                        JButton CP = new JButton("Contratos con provedores");
                        CP.setBounds(70,100,200,50);
                        CP.setBackground(Color.green);
                        JButton terminos = new JButton("Terminos y condiciones");
                        terminos.setBounds(70,200,200,50);
                        terminos.setBackground(Color.blue);
                        JButton Dis = new JButton("Distribuidores");
                        Dis.setBounds(70,300,200,50);
                        Dis.setBackground(Color.green);
                           
                        //Agregar elementos
                        ventanaCont.add(CP);
                        ventanaCont.add(terminos);
                        ventanaCont.add(Dis);
                        ventanaCont.setVisible(true);
                    }
                });

                // Cerrar la ventana 1
                ventana1.dispose();
            }
        });

        
    }
}

