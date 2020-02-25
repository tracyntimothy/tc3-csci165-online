import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;
import java.io.FileReader;
import java.lang.System;
import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;

class MatrixStuff extends JPanel {

    private static final long serialVersionUID = 1L;
    private JFrame window = new JFrame();
    
    public MatrixStuff() {
        initUI();
    }

    private void initUI() {
        window.add(this);
        window.setTitle("Matrix Stuff");
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

        g2d.drawString(Integer.toString(myArray[i][j], 10, 10));
   
        /*(public static int findMax(int[][] matrix) {

        }
        public static int findMin(int[][] matrix) {

        }
        public static int findMaxOfRow(int[][] matrix, int row) {

        }
        public static int findMinOfRow(int[][] matrix, int row) {

        }
        public static int findMaxOfColumn(int[][] matrix, int column) {

        }
        public static int findMinOfColumn(int[][] matrix, int column) {

        }
        public static void fillArrayColumnMajor(int[][] matrix) {

        }
        public static void printRow(int[][] matrix, int row, int num_cols) {

        }
        public static int smallestChange(int[][] matrix) {

        }*/
    }
         public static void fillArrayRowMajor(int[][] matrix) {
            try {
            
            String numberFile = fileName;
            BufferedReader br = new BufferedReader(new FileReader(numberFile));
            
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 20; j++) {
                   myArray[i][j] = Integer.parseInt(br.readLine(i, j)); 
                }
                myArray[i][j] = Integer.parseInt(br.readLine());
            }//end fillArray for 
        br.close();     
            }//end fillArray try
            
            catch(IOException e) {
                System.out.println("Houston, we have a problem!!!");
            }//end fillArray catch
            

        }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() { 
                String filename = "numbers.txt";
                int [][] myArray = new int [50][20];
                MatrixStuff ex = new MatrixStuff();
                ex.setVisible(true);

            }
        });
    } // end main
} // end class
