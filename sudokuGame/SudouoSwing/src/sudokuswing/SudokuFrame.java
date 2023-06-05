package sudokuswing;

import javax.swing.*;
import java.awt.*;

public class SudokuFrame extends JFrame {

    private  SudokuPanel sPanel ;
 public SudokuFrame() throws HeadlessException
 {
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setTitle("Sudoku");
this.setMinimumSize(new Dimension(800,600));

    JMenuBar menuBar = new JMenuBar();
     JMenu file = new JMenu("Game");
     JMenu newGame = new JMenu("New Game");


     JMenuItem sixBysixGame = new JMenuItem("6 by 6 game");
     JMenuItem nineBynineGame = new JMenuItem("9 by 9 game");
     JMenuItem twelveBytwelveGame = new JMenuItem("12 by 12 game");

     newGame.add(sixBysixGame);
     newGame.add(nineBynineGame);
     newGame.add(twelveBytwelveGame);

     file.add(newGame);
     menuBar.add(file);
     this.setJMenuBar(menuBar);

     JPanel windowPanel = new JPanel();
     windowPanel.setLayout(new FlowLayout());
     windowPanel.setPreferredSize(new Dimension(800,600));

     sPanel = new SudokuPanel();
     windowPanel.add(sPanel);
     this.add(windowPanel);


 }


    public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
    @Override
    public void run() {
        SudokuFrame frame=new SudokuFrame();
        frame.setVisible(true);
    }
});

    }
}