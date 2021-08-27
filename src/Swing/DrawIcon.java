package Swing;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;

public class DrawIcon implements Icon {
    private int width;
    private int height;

    @Override
    public int getIconHeight() {
        return this.height;
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }
    public DrawIcon(int width,int height){
        this.height=height;
        this.width=width;
    }
    @Override
    public void paintIcon(Component arg0, Graphics arg1, int x, int y){ //绘制一个圆形
        arg1.fillOval(x,y,width,height);
    }

    public static void main(String[] args) {
        DrawIcon icon = new DrawIcon(15, 15);
        JLabel j = new JLabel("test", icon, SwingConstants.CENTER);
        JFrame jf = new JFrame();
        Container c =jf.getContentPane();
        c.add(j);
        jf.setSize(100,100);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
