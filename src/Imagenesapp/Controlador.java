package Imagenesapp;
import java.awt.Image;
import java.io.IOException;

import javax.swing.JFrame;

public class Controlador {
        private JFrame ventana;
	   private Modelo modelo;
	   private Vista vista;

	   public Controlador() {
	      modelo = new Modelo(getImagen());
	      vista = new Vista(modelo.getImagen());
	      ventana = new JFrame("Dibujando Imagen");
	      ventana.add(vista);
	      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      ventana.setSize(300, 300);
	      ventana.setVisible(true);
	   }

	   private Image getImagen() {
	      //Cargamos la imagen a dibujar
	      ImageIcon icono = new ImageIcon("imagen.jpg");
	      return icono.getImage();
	   }

	   public static void main(String[] args) {
	      new Controlador();
	   }
	}
	
private static final int TAMANO_PEQUENO = 20;

protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    try {
        Image imagen = ImageIO.read(new File("C:\\Users\\imagenes\\OIP.jfif"));
        g.drawImage(imagen, 0, 0, this);

   
        int ancho = getWidth();
        int7 alto = getHeight();
        int cantidad = Math.min(20000, ancho * alto / TAMANO_PEQUENO);
        for (int i = 0; i < cantidad; i++) {
            int x = (int)(Math.random() * ancho);
            int y = (int)(Math.random() * alto);
            g.drawImage(imagen, x, y, TAMANO_PEQUENO, TAMANO_PEQUENO, this);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

