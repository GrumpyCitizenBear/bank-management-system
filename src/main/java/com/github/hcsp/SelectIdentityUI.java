package priv.zhaoxionghao.bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectIdentityUI {
    public SelectIdentityUI() {
    }

    public void selectIdentityUI() {
        JFrame siui = new JFrame();
        siui.setTitle("选择身份");
        siui.setSize(340, 500);//只对顶级容器有效
        siui.setDefaultCloseOperation(3);//窗体关闭时结束程序
        siui.setLocationRelativeTo(null);//居中
        siui.setResizable(false);

        //选择布局类型，定义流式布局的对象,并且设置每个组件之间相隔5cm
        java.awt.FlowLayout fl = new java.awt.FlowLayout(FlowLayout.CENTER, 5, 5);
        siui.setLayout(fl);//设置顶级容器的布局为流式布局

        java.awt.Dimension dim1 = new java.awt.Dimension(340, 300);//图片大小

        //添加组件
        //添加图片，先要把图片加载到内存中。利用IamgeIcon类把图片加载到内存
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon("/Users/a/IdeaProjects/bank-management-system/bank登陆界面.jpeg");
        JLabel labpic = new JLabel(icon);//不可以直接把图片加到顶级容器中，需要先将其设置为标签
        labpic.setPreferredSize(dim1);
        siui.add(labpic);//再将标签加到顶级容器中

        Dimension dim5 = new Dimension(100, 40);//按钮的大小
        //添加一个button按钮
        JButton user = new JButton();
        user.setText("用户");
        user.setPreferredSize(dim5);
        siui.add(user);

        //添加一个button按钮
        JButton manager = new JButton();
        manager.setText("管理员");
        manager.setPreferredSize(dim5);
        siui.add(manager);

        siui.setVisible(true);


        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login l = new Login();
                l.loginUI();
            }
        });

        manager.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManagementUI m=new ManagementUI();
                m.managementUI();
            }
        });
    }
}