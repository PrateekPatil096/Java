
class Account{
    public String name;
    protected String email;
    private String password;
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
}

public class bank {
    public static void main(String[] args) {
        Account acc1=new Account();
        acc1.name="toji";
        acc1.email="toji@gmail.com";
        acc1.setPassword("abc");
        System.out.println(acc1.getPassword());
    }
}
