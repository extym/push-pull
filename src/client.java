public class client extends  Person{

    private  int capcha;

    public client(String login, String password, String email, int capcha, int capcha) {
        super(login, password, email, capcha);
        this.capcha = capcha;

    }

    @Override
    public void validate(int Capcha) {
        if (capcha==1){
            return;
        }
        System.out.println("Только клиентские права");
    }

}
