package ventana;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public JPanel panel;

    public Ventana() {


        setSize(500, 500); //Establecemos el teamaño de la ventana
        setTitle("Generador de Codigo QR"); // Establecer el titulo
        setLocation(100, 200); //Establecer la posicion de la ventana
        //setBounds(100,200,500,500);
        setLocationRelativeTo(null); //Null establece la pantalla en el centro de la pantalla
        //setResizable(false); //Metodo que impide cambiar tamaño de la pantalla
        setMinimumSize(new Dimension(200, 200)); //establece el tamaño minimo

        //this.getContentPane().setBackground(Color.BLACK); //Establecer color de la ventana

        iniciarComponentes();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {

        colocarPaneles();
        //colocarEtiqueta();
        //colocarBotones();
        //colocarRadioBotones();
        //colocaBotonesDeActivacion();
        //colocarCajaDeTexto();
        colocarAreasTexto();


    }


    private void colocarPaneles() {
        panel = new JPanel(); //creacion de un panel
        //panel.setBackground(Color.white); //establecemos el color del panel
        panel.setLayout(null);  //desactivar el diseño o layout
        this.getContentPane().add(panel); //Agregar panel a la ventana
    }


    private void colocarEtiqueta() {

        //etiqueta tipo texto
        JLabel etiqueta = new JLabel(); //crear etiqueta de texto
        etiqueta.setText("Generador de QR"); //Establecemos el texto de la etiqueta
        etiqueta.setBounds(85, 10, 300, 80);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Establecer alineacion horizontal del texto
        etiqueta.setForeground(Color.black); //establecer color de la letra de la etiqueta
        //etiqueta.setOpaque(true); //Establecemos pintar el fondo de la etiqueta
        //etiqueta.setBackground(Color.black); //Cambiar el color de fondo de la etiqueta
        etiqueta.setFont(new Font("cooper black", 0, 30)); //tipo de letra, normal,negrita o cursiva,tamaño
        panel.add(etiqueta); //agregar etiqueta al panel

        //etiqueta tipo imagen

        ImageIcon imagen = new ImageIcon("balon.jpg");
        JLabel etiqueta2 = new JLabel(new ImageIcon());
        etiqueta2.setBounds(60, 90, 400, 400);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);

    }

    private void colocarBotones() {
        JButton boton1 = new JButton();
        boton1.setText("Click"); //establecer el texto al boton
        boton1.setBounds(100, 100, 100, 40); //establecer la posicion del boton y el tamaño
        boton1.setEnabled(true);//establecemos el encendido del boton
        boton1.setMnemonic('a'); //establecemos el boton con el cual ocurre la interaccion alt + boton definido
        boton1.setFont(new Font("cooper Black", Font.BOLD, 20)); //establecemos la fuente de la letra
        boton1.setForeground(Color.blue); //Establecer el color de la letra del boton
        panel.add(boton1);


        //Boton 2 - boton de imagen

        JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);
        boton2.setOpaque(true);
        ImageIcon clickAqui = new ImageIcon("boton.png");
        boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.BLUE); //Establecemos el color de fondo del boton
        panel.add(boton2);

        //boton 3 - boton de bordes
        JButton boton3 = new JButton();
        boton3.setBounds(100, 300, 110, 50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 4, true));
        panel.add(boton3);


    }

    private void colocarRadioBotones() {
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", false);
        radioBoton1.setBounds(50, 100, 200, 50);
        radioBoton1.setEnabled(true);
        radioBoton1.setText("Programacion"); //colocar el nombre en e l radioboton
        radioBoton1.setFont(new Font("cooper black", 0, 20));
        panel.add(radioBoton1);

        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
        radioBoton2.setBounds(50, 150, 100, 50);
        panel.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);
        radioBoton3.setBounds(50, 200, 100, 50);
        panel.add(radioBoton3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);


    }

    private void colocaBotonesDeActivacion() {

        JToggleButton botonActivacion1 = new JToggleButton("Opcion 1", true);
        botonActivacion1.setBounds(50, 100, 100, 40);
        panel.add(botonActivacion1);

        JToggleButton botonActivacion2 = new JToggleButton("Opcion 2", false);
        botonActivacion2.setBounds(50, 150, 100, 40);
        panel.add(botonActivacion2);

        JToggleButton botonActivacion3 = new JToggleButton("Opcion 3", false);
        botonActivacion3.setBounds(50, 200, 100, 40);
        panel.add(botonActivacion3);

        ButtonGroup grupoBotonesActivados = new ButtonGroup();
        grupoBotonesActivados.add(botonActivacion1);
        grupoBotonesActivados.add(botonActivacion2);
        grupoBotonesActivados.add(botonActivacion3);


    }

    private void colocarCajaDeTexto() {
        JTextField cajaTexto = new JTextField("hola", 50);
        cajaTexto.setBounds(50, 50, 100, 30);
        cajaTexto.setText("Hola..."); //texto con el que inicializa la caja

        System.out.println("Textto en la caja: " + cajaTexto.getText());
        panel.add(cajaTexto);


    }

    private void colocarAreasTexto() {

        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Escribe el texto aqui...");
        areaTexto.append("\nEscribe por aqui... ");  //añade mas texto al area
        areaTexto.setEditable(true); //edita el area de texto

        System.out.println("El texto es " + areaTexto.getText());
        panel.add(areaTexto);

        //barras de desplazamiento



    }
}
