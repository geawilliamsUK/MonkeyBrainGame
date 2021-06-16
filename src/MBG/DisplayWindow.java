package MBG;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DisplayWindow extends JFrame implements MouseListener, MouseMotionListener{
    Canvas c;

    DisplayWindow(){
        super("Monkey Brain Game");
        c = new Canvas(){
            public void paint(Graphics g){
                g.setColor(Color.gray);

                g.setFont(new Font("Bold", 1, 20));

                g.drawString("Welcome to MBG", 110, 90);
            }
        };
        c.setBackground(Color.WHITE);
        c.addMouseListener(this);
        c.addMouseMotionListener(this);
        add(c);
        setSize(400, 200);
        setVisible(true);
    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
