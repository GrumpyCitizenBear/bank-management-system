package priv.zhaoxionghao.bankmanagementsystem;

import java.util.Scanner;

public class Bank {
    public void isUsersOrManagers() {
        int n;
        Scanner selectidentity = new Scanner(System.in);
        n = selectidentity.nextInt();
        if (n == 1) {
            //用户操作
        } else if (n == 2) {
            //管理员操作
        } else {
            System.out.println("输入错误，请重试");
        }

    }

    private void userOperations() {

        User user=new User();

        int useroperationnumber;
        Scanner useroperationnumberin = new Scanner(System.in);
        useroperationnumber = useroperationnumberin.nextInt();
        if (useroperationnumber == 1) {
            //存款
        } else if (useroperationnumber == 2) {
            //取款
        } else if (useroperationnumber == 3) {
            //余额
        } else if (useroperationnumber == 0) {
            //break;
        }
    }

    public Boolean ifIsCorrectAccount(String cardID,String cardPwd) {

        int depositnumber;
        Scanner depositnumberin = new Scanner(System.in);
        depositnumber = depositnumberin.nextInt();
        return true;

    }


}
