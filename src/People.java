public class  People {
    protected int years=18;
    protected String country;
    protected String name;
    public int setHeight(){
        return years;
    }
    public String setCountry(){
        return country;
    }
    public String setName(){
        return name;
    }
    public void getName(String personName){
        name = personName;
    }
    public void getCountry( String personCountry) {
        country = personCountry;
    }
    public void getYears(int personYears){
        if ( personYears>0){
            years=personYears;
        }
    }
    void hellow(){
        System.out.println("Hellow, I'm "+ name+ ". I'm from "+country+". I'm "+years+" years old.");
    }
}
