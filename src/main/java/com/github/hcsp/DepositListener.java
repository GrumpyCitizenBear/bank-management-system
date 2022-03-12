package priv.zhaoxionghao.bankmanagementsystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DepositListener implements ActionListener {

    private JTextField jTextField;

    private JFrame jFrame;

    public DepositListener(JTextField jTextField, JFrame jFrame) {
        this.jTextField = jTextField;
        this.jFrame = jFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int depositnumber= Integer.parseInt(jTextField.getText());
        if (depositnumber <= 0 || depositnumber > 1000000 || depositnumber % 100 == 0 || depositnumber % 50 == 0) {
            //提示金额错误
        } else {

        }
    }
}
