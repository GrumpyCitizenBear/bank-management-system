package priv.zhaoxionghao.bankmanagementsystem;

public class User {
    private String cardId;
    private String cardPwd;
    private String userName;
    private String userPhone;
    private int balance;
    //这里将金钱转换成分，提高精度

    public User(){}
    public User(String cardId, String cardPwd, String userName, String userPhone, int balance) {
        this.cardId = cardId;
        this.cardPwd = cardPwd;
        this.userName = userName;
        this.userPhone = userPhone;
        this.balance = balance;
    }

    public String getCardId() {
        return cardId;
    }

    public String getCardPwd() {
        return cardPwd;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public int getBalance() {
        return balance;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
