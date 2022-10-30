public class ChinesePerson extends RussianPeron{
    private String anime;
    public String getCountry(){
        country="China";
        return country;
    }

    public String getAnime() {
        return anime;
    }
    public void setAnime(String anime) {
        this.anime = anime;
    }
    @Override
    void hellow(){
        System.out.println("Ni hao, I'm "+ name+ ". I'm from "+country+". I'm "+years+" years old."+" I'm love "+ food+". I'm play " +play+". I'm watching anime "+ anime);
    }

}
