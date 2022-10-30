public class USAperson extends People{
    protected String food;
    public String getCountry(){
        country="USA";
        return country;
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    @Override
    void hellow(){
        System.out.println("Hi, I'm "+ name+ ". I'm from "+country+". I'm "+years+" years old."+" I'm love "+ food);
    }

}
