abstract class Instrument {
    abstract void play();
    abstract void adjust();
    
    String what() {
        return "Instrument";
    }
}

class Wind extends Instrument {
    @Override
    void play() {
        System.out.println("Wind instrument played");
    }
    
    @Override
    String what() {
        return "Wind";
    }
    
    @Override
    void adjust() {
        System.out.println("Wind instrument tuned properly");
    }
}

class Percussion extends Instrument {
    @Override
    void play() {
        System.out.println("Percussion instrument played");
    }
    
    @Override
    String what() {
        return "Percussion";
    }
    
    @Override
    void adjust() {
        System.out.println("Percussion instrument tuned properly");
    }
}

class Stringed extends Instrument {
    @Override
    void play() {
        System.out.println("Stringed instrument played");
    }
    
    @Override
    String what() {
        return "Stringed";
    }
    
    @Override
    void adjust() {
        System.out.println("Stringed instrument tuned properly");
    }
}

class Woodwind extends Wind {
    @Override
    void play() {
        System.out.println("Woodwind instrument played");
    }
    
    @Override
    String what() {
        return "Woodwind";
    }
}

class Brass extends Wind {
    @Override
    void play() {
        System.out.println("Brass instrument played");
    }
    
    @Override
    String what() {
        return "Brass";
    }
}

public class Main {
    public static void main(String[] args) {
        Instrument i1 = new Wind();
        Instrument i2 = new Stringed();
        Instrument i3 = new Percussion();
        Wind i4 = new Woodwind();
        Wind i5 = new Brass();

        i1.play();
        i2.play();
        i3.play();
        i4.play();
        i5.play();

        System.out.println(i1.what());
        System.out.println(i2.what());
        System.out.println(i3.what());
        System.out.println(i4.what());
        System.out.println(i5.what());

        i1.adjust();
        i2.adjust();
        i3.adjust();
        i4.adjust();
        i5.adjust();
    }
}