package swingapp.SwingDemo;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;
public class SwingDemo extends javax.swing.JFrame {
   Image img = Toolkit.getDefaultToolkit().getImage("D:\\Java\\Project X\\src\\swingapp\\bg.jpg");
   public SwingDemo() throws IOException {
      this.setContentPane(new JPanel() {
         @Override
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, -1500, -500, null);
         }
      });
      pack();
      setVisible(true);
      
   }
   public static void main(String[] args) throws Exception {
      new SwingDemo();
   }
}