public class Person {
    private String login;
    private String password;
    private String email;
    int capcha;

    //public static void main(String[] args) {
    public void validate(int newCapcha) {
        //where 1- admin, 10 - user
        if (newCapcha == capcha && capcha == 1) {
            System.out.println("Получены админские права на Пк");
        }
        else System.out.println("Клиентские права на ПК");
    }


        public void show (){

        System.out.println(login+" "+ password);
    }

    public String show (String newPass){
         if (newPass.equals(password))
             return "Пароли совпадают";
             else this.password=newPass;
         else return login+""+ password;
    }

    public Person() {

    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Person(String login, String password, String email, int capcha) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.capcha = capcha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCapcha(int capcha) {
        this.capcha = capcha;
    }

    public int getCapcha() {
        return capcha;
    }

    @Override
    public String toString() {
        return "Person{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", capcha=" + capcha +
                '}';
    }
    //Person p2 = new Person("kid", "pas123","@gmail.com",123);

}


