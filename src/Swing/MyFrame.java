package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJDialog extends JDialog {
    /**
     实例化一个JDialog类对象，指定对话框的父窗体、窗体标题和类型
     */
    public MyJDialog(MyFrame frame){
        super(frame,"第一个JDialog窗体",true);
        Container container=getContentPane();
        container.add(new JLabel("这是一个对话框"));
        setBounds(120,120,100,100);
    }
}
/**
 * @author Chen
 */
public class MyFrame extends JFrame{
    public static void main(String[] args) {
        new MyFrame();
    }
    public MyFrame(){
        Container container=getContentPane();
        container.setLayout(null);
        JLabel jl = new JLabel("这是一个JFrame窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        JButton bl = new JButton("弹出对话框");
        bl.setBounds(10,10,100,21);
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });
        container.add(bl);
        container.setBackground(Color.white);
        setSize(200, 200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
