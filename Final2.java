import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font; //darle estilo al texto de componentes gráficos
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

public class Final2 {
    

    static class Producto {
        private int numero;
        private String nombre;
        private double precio;
        private int cantidad;

        public Producto(int numero, String nombre, double precio, int cantidad) {
            this.numero = numero;
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        public int getNumero() { return numero; }
        public String getNombre() { return nombre; }
        public double getPrecio() { return precio; }
        public int getCantidad() { return cantidad; }
    }

    static ArrayList<Producto> listaProductos = new ArrayList<>();
    static DefaultTableModel modeloTabla;




    public static void main(String[] args) {
        
        // Crear la ventana 1
        JFrame ventana1 = new JFrame("Inicio de sesion");
        ventana1.setSize(300, 400);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setLocation(600, 100);
        ventana1.setLayout(null);
        ventana1.getContentPane().setBackground(Color.black);
        
        //Texto agregado
        JLabel Divisol = new JLabel("Divisol");
        Divisol.setBounds(90,20,120,30);
        Divisol.setForeground(Color.WHITE);
        Divisol.setFont(new Font("Times New Roman", Font.BOLD, 32));
        JLabel Iniiciodesesion = new JLabel("Iniciar sesion");
        Iniiciodesesion.setBounds(90,50,200,30);
        Iniiciodesesion.setForeground(Color.WHITE);
        Iniiciodesesion.setFont(new Font("Times New Roman", Font.BOLD, 22));
        JLabel usuario = new JLabel("Correo electroico");
        usuario.setForeground(Color.WHITE);
        usuario.setBounds(90,90,120,30);
        JLabel contraseña = new JLabel("Contraseña");
        contraseña.setForeground(Color.WHITE);
        contraseña.setBounds(110,160,120,30);
        
        //Cuadro de texto 
        JTextField nombre = new JTextField();
        nombre.setBounds(70,120,150,25);
        nombre.setBackground(Color.red);
        JTextField contra = new JTextField();
        contra.setBounds(70,190,150,25);
        contra.setBackground(Color.red);

        // Crear un botón para abrir la ventana 2
        JButton botonAbrirVentana2 = new JButton("Iniciar sesion");
        botonAbrirVentana2.setBackground(Color.red);
        botonAbrirVentana2.setBounds(90,250,120,30);
        botonAbrirVentana2.setForeground(Color.WHITE);
        
        //Boton sin funcion
        JButton registro = new JButton("Registrarse");
        registro.setBounds(90,300,120,30);
        registro.setBackground(Color.red);
        registro.setForeground(Color.WHITE);

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
        ventana1.add(Divisol);
       
       
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
                ventana2.getContentPane().setBackground(Color.black);
                
                //Crear botones de menu
                JButton Inventario = new JButton("Inventario");
                Inventario.setBounds(70,200,200,50);
                Inventario.setBackground(Color.RED);
                Inventario.setForeground(Color.WHITE);       
                JButton Config = new JButton("Configuracion");
                Config.setBounds(10,100,150,40);
                Config.setBackground(Color.red);
                Config.setForeground(Color.WHITE);       
                JButton DevyRe = new JButton("Devloluciones y reclamaciones");
                DevyRe.setBounds(70,300,200,50);
                DevyRe.setBackground(Color.red);
                DevyRe.setForeground(Color.WHITE);       
                JButton Contratos = new JButton("Contratos y acuerdos");
                Contratos.setBounds(70,400,200,50);
                Contratos.setBackground(Color.red);
                Contratos.setForeground(Color.WHITE);       

                
                
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
                        ventanaInv.setLayout(new BorderLayout());
                        ventanaInv.getContentPane().setBackground(Color.black);
                        

                        //Bonotes de la ventanainventario
                        String[] columnas = {"Num.", "Nombre", "Precio", "Cantidad"};
                        modeloTabla = new DefaultTableModel(columnas, 0);
                        JTable tabla = new JTable(modeloTabla);
                        JScrollPane scrollPane = new JScrollPane(tabla);
                        ventanaInv.add(scrollPane, BorderLayout.CENTER);

                        JPanel panelBotones = new JPanel();
                        JButton btnAgregar = new JButton("Agregar");
                        JButton btnEliminar = new JButton("Eliminar");
                        JButton btnEditar = new JButton("Editar");
                        JButton btnGuardar = new JButton("Guardar Cambios");

                        Font botonFont = new Font("Times New Roman", Font.BOLD, 14);
                        for (JButton b : new JButton[]{btnAgregar, btnEliminar, btnEditar, btnGuardar}) {
                         b.setFont(botonFont);
                         panelBotones.add(b);
                        }
                         ventanaInv.add(panelBotones, BorderLayout.SOUTH);

                    btnAgregar.addActionListener(x -> {
                    Producto nuevo = new Producto(1, "Producto X", 10.0, 5);
                    listaProductos.add(nuevo);
                    modeloTabla.addRow(new Object[]{nuevo.getNumero(), nuevo.getNombre(), nuevo.getPrecio(), nuevo.getCantidad()});
                });

                       
                        

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
                        ventanaConf.getContentPane().setBackground(Color.black);

                        //Botones de la ventana Configuracion
                        JButton EditP = new JButton("Editar Perfil");
                        EditP.setBounds(70,100,200,50);
                        EditP.setBackground(Color.red);
                        EditP.setForeground(Color.WHITE);
                        JButton Not = new JButton("Notificaciones");
                        Not.setBounds(70,200,200,50);
                        Not.setBackground(Color.red);
                        Not.setForeground(Color.WHITE);
                        JButton Ayuda = new JButton("Ayuda");
                        Ayuda.setBounds(70,300,200,50);
                        Ayuda.setBackground(Color.red);
                        Ayuda.setForeground(Color.WHITE);
                         
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
                        ventanaDev.getContentPane().setBackground(Color.black);

                        //Botones de la ventana 
                        JButton DevP = new JButton("Devoluciones a Provedor");
                        DevP.setBounds(70,100,200,50);
                        DevP.setBackground(Color.red);
                        DevP.setForeground(Color.WHITE);
                        JButton DevC = new JButton("Devoluciones a Clientes");
                        DevC.setBounds(70,200,200,50);
                        DevC.setBackground(Color.red);
                        DevC.setForeground(Color.WHITE);
                        JButton reclamaciones = new JButton("Reclamaciones");
                        reclamaciones.setBounds(70,300,200,50);
                        reclamaciones.setBackground(Color.red);
                        reclamaciones.setForeground(Color.WHITE);

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
                        ventanaCont.getContentPane().setBackground(Color.black);

                        ImageIcon imagen = new ImageIcon("C:/Users/Brandon/Downloads/233.jpg");
                        Image img = imagen.getImage("233.jpg"); // Obtener la imagen original
                        Image nuevaImagen = img.getScaledInstance(50, 40, Image.SCALE_SMOOTH); // Redimensionar
                        imagen = new ImageIcon(nuevaImagen); // Asignar la imagen redimensionada

                        //Apartados de la opcion 
                        JButton CP = new JButton("Contratos con provedores");
                        CP.setBounds(70,100,200,50);
                        CP.setBackground(Color.red);
                        CP.setForeground(Color.WHITE);
                        JButton terminos = new JButton("Terminos y condiciones");
                        terminos.setBounds(70,200,200,50);
                        terminos.setBackground(Color.red);
                        terminos.setForeground(Color.WHITE);
                        JButton Dis = new JButton("Distribuidores");
                        Dis.setBounds(70,300,200,50);
                        Dis.setBackground(Color.red);
                        Dis.setForeground(Color.WHITE);
                           
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
