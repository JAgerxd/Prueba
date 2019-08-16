package ventana;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana() {

        setSize(500, 500); //Establecemos el teamaño de la ventana
        setTitle("Generador de Codigo QR"); // Establecer el titulo
        setLocation(100,200); //Establecer la posicion de la ventana
        //setBounds(100,200,500,500);
        setLocationRelativeTo(null); //Null establece la pantalla en el centro de la pantalla
        //setResizable(false); //Metodo que impide cambiar tamaño de la pantalla
        setMinimumSize(new Dimension(200,200)); //establece el tamaño minimo

        //this.getContentPane().setBackground(Color.BLACK); //Establecer color de la ventana

        iniciarComponentes();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel(); //creacion de un panel
        //panel.setBackground(Color.green); //establecemos el color del panel
        panel.setLayout(null);  //desactivar el diseño o layout
        this.getContentPane().add(panel); //Agregar panel a la ventana

        //etiqueta tipo texto
        JLabel etiqueta = new JLabel(); //crear etiqueta de texto
        etiqueta.setText("Hola"); //Establecemos el texto de la etiqueta
        etiqueta.setBounds(85,100,300,80);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Establecer alineacion horizontal del texto
        etiqueta.setForeground(Color.white); //establecer color de la letra de la etiqueta
        //etiqueta.setOpaque(true); //Establecemos pintar el fondo de la etiqueta
        //etiqueta.setBackground(Color.black); //Cambiar el color de fondo de la etiqueta
        etiqueta.setFont(new Font("Arial",Font.PLAIN,30)); //tipo de letra, normal,negrita o cursiva,tamaño
        panel.add(etiqueta); //agregar etiqueta al panel

        //etiqueta tipo imagen



    }

}
