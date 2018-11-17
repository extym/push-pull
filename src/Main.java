public class Main {
    public static void main(String[] args) {

        Person name = new Person();
        name.login = "z";
        name.setPassword("pass");
        //System.out.println(name);
        Person p2 = new Person("kid", "pas123","@gmail.com",123);
        System.out.println(p2);
        p2.show();
        String tmp = p2.show("123");
        System.out.println(temp);
        p2.validate(1);
        Person cl=new client("i","123","qweqwe",2);
        cl.validate(2);
    }
}
//https://javatalks.ru/topics/32409