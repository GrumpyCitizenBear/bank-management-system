package priv.zhaoxionghao.bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagementUI {
    public void managementUI(){
        javax.swing.JFrame jf = new javax.swing.JFrame();
        jf.setTitle("后台管理");
        jf.setSize(340, 500);//只对顶级容器有效
        jf.setDefaultCloseOperation(2);//窗体关闭时结束程序
        jf.setLocationRelativeTo(null);//居中
        jf.setResizable(false);

        //选择布局类型，定义流式布局的对象,并且设置每个组件之间相隔5cm
        java.awt.FlowLayout fl = new java.awt.FlowLayout(FlowLayout.CENTER, 5, 5);
        jf.setLayout(fl);//设置顶级容器的布局为流式布局

        //设置格式大小
        java.awt.Dimension dim1 = new java.awt.Dimension(340, 300);//图片大小
        java.awt.Dimension dim2 = new java.awt.Dimension(50, 50);//标签的大小
        java.awt.Dimension dim3 = new java.awt.Dimension(250, 30);//输入框的大小
        java.awt.Dimension dim4 = new java.awt.Dimension(100, 40);//按钮的大小

        //添加组件
        //添加图片，先要把图片加载到内存中。利用IamgeIcon类把图片加载到内存
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon("/Users/a/IdeaProjects/bank-management-system/bank登陆界面.jpeg");
        JLabel labpic = new JLabel(icon);//不可以直接把图片加到顶级容器中，需要先将其设置为标签
        labpic.setPreferredSize(dim1);
        jf.add(labpic);//再将标签加到顶级容器中

        //添加一个button按钮
        javax.swing.JButton adduser = new javax.swing.JButton();
        adduser.setText("添加用户");
        adduser.setPreferredSize(dim4);
        jf.add(adduser);

        adduser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //添加一个button按钮
        javax.swing.JButton deleteuser = new javax.swing.JButton();
        deleteuser.setText("删除用户");
        deleteuser.setPreferredSize(dim4);
        jf.add(deleteuser);

        deleteuser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //添加一个button按钮
        javax.swing.JButton back = new javax.swing.JButton();
        back.setText("返回");
        back.setPreferredSize(dim4);
        jf.add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.dispose();
            }
        });

        jf.setVisible(true);
    }
}
