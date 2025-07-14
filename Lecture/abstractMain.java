abstract class Game{
    abstract void play();
}
class Cricket extends Game{
    void play(){
        System.out.println("Cricket");
    }
}
class Tennis extends Game{
    void play(){
        System.out.println("Tennis");
    }
}

public class abstractMain {
    public static void main(String[] args) {
        Game cricketObj = new Cricket();
        Game tennisObj = new Tennis();
        cricketObj.play();
        tennisObj.play();
    }
}
