// Interface for class Musician
interface Musician{
    void playInstrument();
}

// Class Pianist implementing the Musician interface
class Pianist implements Musician {
    public void playInstrument() {
        System.out.println("Pianist: Plays the piano with finesse.");
    }
}

// Class Violinist extending Pianist and implementing the Musician interface
class Violinist extends Pianist {
    public void playInstrument() {
        System.out.println("Violinist: Creates beautiful melodies on the violin.");
    }
}

// Class Cellist extending Violinist
class Cellist extends Violinist {
    void specificMethodCellist() {
        System.out.println("Cellist: Uses the cello to produce rich, deep sounds.");
    }
}

// Class Flutist extending Cellist and implementing the Musician interface
class Flutist extends Cellist   {
    public void playInstrument() {
        System.out.println("Flutist: Plays enchanting tunes on the flute.");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Flutist musicianA = new Flutist();
        Musician musicianB = new Pianist(); // You can create another musician of the same type
        Pianist musicianC = new Violinist();
        Pianist musicianD = new Violinist();
        musicianA.playInstrument(); // Calls the playInstrument method in class Flutist
        musicianB.playInstrument(); // Calls the playInstrument method in class Pianist
        musicianC.playInstrument(); // Calls the playInstrument method in class Viollinist
        musicianD.playInstrument(); // Calls the playInstrument method in class Violinist
    }
}


