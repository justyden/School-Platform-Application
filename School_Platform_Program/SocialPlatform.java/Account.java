import java.util.Scanner;

public class Account {
    protected String userName = "";
    protected String password = "";

    Account() {
        String userName = "";
        String password = "";
    }

    Account(String inputUserName, String inputPassword) {
        userName = inputUserName;
        password = inputPassword;
    }

    public void setAccountUsername(String userName) {
        this.userName = userName;
    }

    public String getAccountUsername() {
        return userName;
    }

    public void setAccountPassword(String password, String updatedPassword) {
        Scanner userInput = new Scanner(System.in);

        while (this.password != password) {
            System.out.println("Please input the correct password.");
            password = userInput.nextLine();
        }

        this.password = updatedPassword;
    }
}
