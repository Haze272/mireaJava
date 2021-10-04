package stepanPackage.practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FootballManager extends JFrame {
    String name = "N/A", winner = "DRAW", lastScorrer = "N/A";
    int x = 0, y = 0;

    public FootballManager() {
        JButton Milan = new JButton("AC Milan");
        JButton Madrid = new JButton("Real Madrid");
        JLabel result = new JLabel("Result: " + x + " X " + y);
        JLabel last_scorer = new JLabel("Last Scorer: " + name);
        JLabel game_over = new JLabel(getWinner());

        add (Milan, BorderLayout.WEST);
        add (Madrid, BorderLayout.EAST);
        add (result, BorderLayout.CENTER);
        add (last_scorer, BorderLayout.NORTH);
        add (game_over, BorderLayout.SOUTH);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Milan.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent a) {
                x++;
                setLastScorrer("AC Milan");

                result.setText("Result: " + x + " X " + y);
                last_scorer.setText("Last Scorer: " + getLastScorrer());
                game_over.setText(getWinner());
            }
            public void mouseExited(MouseEvent a) {}
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

        Madrid.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent a) {
                y++;
                setLastScorrer("Real Madrid");

                result.setText("Result: " + x + " X " +y);
                last_scorer.setText("Last Scorer: " + getLastScorrer());
                game_over.setText(getWinner());
            }
            public void mouseExited(MouseEvent a) {}
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }

    protected void setLastScorrer(String lastScorrer) {
        this.lastScorrer = lastScorrer;
    }

    protected String getLastScorrer() {
        return this.lastScorrer;
    }

    protected String getWinner() {
        if (x > y) {
            return "Winner is AC Milan!";
        } else if (x < y) {
            return "Winner is Real Madrid!";
        } else if (x == y) {
            return "DRAW";
        } else {
            return "ERROR";
        }
    }
}
