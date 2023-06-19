public class Water_Bottle {
    private int volume;

    public Water_Bottle(){
        this.volume = 100;
    }

    public  Integer waterLevel(){
        return volume;
    }
    public void drink(){
        if (this.volume > 0){
            this.volume -= 10;
        }
    }
    public void empty(){
        this.volume = 0;
    }
    public  void full(){
        this.volume = 100;
    }
}
