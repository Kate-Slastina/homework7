public class RussianPeron extends USAperson{
    protected String play;
    public String getCountry(){
        country="Russia";
        return country;
    }
    public String setPlay(){
        return play;
    }
    public void getPlay (String play){
        this.play=play;
    }
    @Override
    void hellow(){
        System.out.println("Hi, I'm "+ name+ ". I'm from "+country+". I'm "+years+" years old."+" I'm love "+ food+". I'm play " +play );
    }
}
