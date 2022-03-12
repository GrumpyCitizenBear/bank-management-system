package priv.zhaoxionghao.bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithdrawalUI {
    public void withdrawalUI() {
        JFrame jf = new JFrame();
        jf.setTitle("取款");
        jf.setSize(340, 500);//只对顶级容器有效
        jf.setDefaultCloseOperation(2);//窗体关闭时结束程序
        jf.setLocationRelativeTo(null);//居中
        jf.setResizable(false);

        //选择布局类型，定义流式布局的对象,并且设置每个组件之间相隔5cm
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 5, 5);
        jf.setLayout(fl);//设置顶级容器的布局为流式布局

        //设置格式大小
        Dimension dim1 = new Dimension(340, 300);//图片大小
        Dimension dim2 = new Dimension(250, 50);//标签的大小
        Dimension dim3 = new Dimension(250, 30);//输入框的大小
        Dimension dim4 = new Dimension(100, 40);//按钮的大小

        //添加组件
        //添加图片，先要把图片加载到内存中。利用IamgeIcon类把图片加载到内存
        ImageIcon icon = new ImageIcon("/Users/a/IdeaProjects/bank-management-system/bank登陆界面.jpeg");
        JLabel labpic = new JLabel(icon);//不可以直接把图片加到顶级容器中，需要先将其设置为标签
        labpic.setPreferredSize(dim1);
        jf.add(labpic);//再将标签加到顶级容器中

        //添加“账号”标签
        JLabel labname = new JLabel();
        labname.setText("请输入取款金额：");
        labname.setPreferredSize(dim2);
        jf.add(labname);

        //添加账号输入框，并添加监控事件
        JTextField textname = new JTextField();
        textname.setPreferredSize(dim3);
        jf.add(textname);

        //添加一个button按钮
        JButton confirm = new JButton();
        confirm.setText("确定");
        confirm.setPreferredSize(dim4);
        jf.add(confirm);

        confirm.addActionListener(new ActionListener() {
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
