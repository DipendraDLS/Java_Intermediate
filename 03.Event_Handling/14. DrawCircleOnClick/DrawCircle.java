package DrawCircleOnClick;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawCircle extends JFrame
{
    public static void main(String[] args)
    {
        DrawCircle app = new DrawCircle();
        app.setVisible(true);
    }

    private ArrayList<Point> points = new ArrayList<>(); //Array List Create gareko 'Collections' ko conecpt ho jun hamilai afai padhnu vannu vako thyo sirle.
                                                         //MousePress gareko cha vani MouseActionListner run vayera yo 'point' vanni ArrayList ma Points haru auncha.
    public DrawCircle()
    {
        JPanel panel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g) //JPanel le diyeko method ho.
            {
                if(points.isEmpty())
                    return;

                int r = 10;
                for(Point p : points)
                {
                    g.drawOval(p.x - r, p.y - r, 2 * r, 2 * r); //yedi click gareko point should be a center then. i.e -> h=x-r, k=y-r
                }
            }
        };
        panel.setPreferredSize(new Dimension(500, 500));
        add(panel);

        panel.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                points.add(e.getPoint());
                repaint();
            }
        });

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}