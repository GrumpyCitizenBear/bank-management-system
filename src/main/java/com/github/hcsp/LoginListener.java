package priv.zhaoxionghao.bankmanagementsystem;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//监听事件
public class LoginListener extends DBUtil implements ActionListener {

    private JTextField jt;//账号输入框对象
    private JPasswordField jp;//密码输入框对象


    private JFrame login;//定义一个窗体对象

    public LoginListener(JFrame login, JTextField jt, JPasswordField jp) {
        this.login = login;//获取登录界面
        this.jt = jt;//获取登录界面中的账号输入框对象
        this.jp = jp;//获取登录界面中的密码输入框对象
    }

    public void actionPerformed(ActionEvent e) {
        //利用get方法来获取账号和密码对象的文本信息，并用equal方法进行判断。最好不要用==，用==这个地方验证不过去。
        String cardID = jt.getText();
        String cardPwd = jp.getText();
        if (ifIsCorrectAccount(cardID, cardPwd)) {

            //满足条件，则生成一个新的界面
            AfterLoginUI al = new AfterLoginUI();
            al.afterLoginUI();

            // 通过我们获取的登录界面对象，用dispose方法关闭它
            login.dispose();
        }
    }

    private Boolean ifIsCorrectAccount(String cardID, String cardPwd) {
        return null;
    }
}