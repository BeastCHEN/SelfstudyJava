package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Chen
 */
public class Example1 extends JFrame {
    public static void main(String[] args) {
        new Example1().CreateJFrame("创建一个JFrame窗体");
    }
    public void CreateJFrame(String title){
        JFrame jf = new JFrame(title);
        Container container=jf.getContentPane(); //创建和获取一个容器
        JLabel jl = new JLabel("这是一个JFrame窗体"); //创建一个JLabel标签
        jl.setHorizontalAlignment(SwingConstants.CENTER); //居中
        container.add(jl); //标签添加到容器
        container.setBackground(Color.white);
        jf.setVisible(true); //窗口可视化
        jf.setSize(200,150);//窗口大小
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭方式
    }
}
