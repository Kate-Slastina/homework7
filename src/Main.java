import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        People i= new People();
        i.getName("Galya");
        i.getCountry("Russia");
        i.getYears(75);
        i.hellow();
        USAperson n=new USAperson();
        n.getName("Mark");
        n.getCountry();
        n.getYears(56);
        n.setFood("burger");
        n.hellow();
        RussianPeron o= new RussianPeron();
        o.getName("Vova");
        o.getCountry();
        o.getYears(16);
        o.setFood("Borsch");
        o.getPlay("Minecraft");
        o.hellow();
        ChinesePerson m= new ChinesePerson();
        m.getName("Lee");
        m.getCountry();
        m.getYears(19);
        m.setFood("doshirak");
        m.getPlay("Genshin Impact");
        m.setAnime("Attack of the titans");
        m.hellow();
    }
}