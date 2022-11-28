package Login;

public class Main {
    public static void main(String[] args){

    IdandPass idandPass = new IdandPass();

    LoginPage loginPage = new LoginPage(idandPass.getlogininfo());
    }
}
