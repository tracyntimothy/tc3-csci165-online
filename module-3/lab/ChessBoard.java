import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;

class ChessBoard extends JPanel {

    private static final long serialVersionUID = 1L;
    private JFrame window = new JFrame();
    
    public ChessBoard() {
        initUI();
    }

    private void initUI() {
        window.add(this);
        window.setTitle("Chess Board");
        window.setSize(600, 600);
        window.setLocationRelativeTo(null);
        window.setBackground(Color.red);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

	// add your own drawing intructions in this method
    private void doDrawing(Graphics g) {

        
           /* RGB Colors:
            ================================================
            Black       => (0, 0, 0)        => low elevation
            Mid Grey    => (128, 128, 128)  => mid elevation
            White       => (255, 255, 255)  => high elevation

            Grey Scale colors are scaled in matching set of 3 numeric values
        */

        Graphics2D g2d = (Graphics2D) g;
       
        //<====> ADD YOUR DRAWING CODE HERE <==========>//
        g2d.setBackground(new Color(32, 97, 53));
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillRect(100, 100, 400, 400);
        for ( int i = 100; i <= 400; i +=100){
            for ( int j = 100; j <= 400; j+=100){
                g2d.clearRect(i, j, 50, 50);
            }
        }
       for(int i = 150; i <= 450; i += 100) {
            for (int j = 150; j <= 450; j+=100) {
                g2d.clearRect(i, j, 50, 50);
            }
       }
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() { 
                ChessBoard ex = new ChessBoard();
                ex.setVisible(true);
            }
        });
    } // end main
} // end class
