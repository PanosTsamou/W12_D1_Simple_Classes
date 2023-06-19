public class Printer {
    private int pages;
    private int toner;

    public Printer(Integer pages, Integer toner){
        this.pages = pages;
        this.toner = toner;
    }
    public Integer pageLevel(){
        return this.pages;
    }
    public Integer tonerLevel(){
        return this.toner;
    }
    public void print(Integer pages, Integer copies){
        int totalPages = pages*copies;
        if (this.pages >= totalPages && this.toner>=totalPages){
            this.pages -= totalPages;
            this.toner -= totalPages;
        }
    }
}
