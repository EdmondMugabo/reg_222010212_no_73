// Interface for class Leader
interface leader {
    void leadereadCountry();
}

// Class President implementing the Leader interface
class President {
    public void leadCountry() {
        System.out.println("President: Leads the country with wisdom and authority.");
    }
}

// Class PrimeMinister extending President and implementing the Leader interface
class PrimeMinister extends President {
    public void leadCountry() {
        System.out.println("Prime Minister: Governs the country and makes important decisions.");
    }
}

// Class Governor extending PrimeMinister
class Governor extends PrimeMinister {
    void specificMethodGovernor() {
        System.out.println("Governor: Manages the affairs of a state with diligence.");
    }
}

// Class Mayor extending Governor and implementing the Leader interface
class Mayor extends Governor {
    public void leadCountry() {
        System.out.println("Mayor: Manages the local affairs of a city.");
    }
}

public class Leader {
    public static void main(String[] args) {
        Mayor leaderA = new Mayor();
        President leaderB = new President(); // You can create another leader of the same type
        President leaderC = new Mayor();
        President leaderD = new PrimeMinister();
        leaderA.leadCountry(); // Calls the leadCountry method in class Mayor
        leaderB.leadCountry(); // Calls the leadCountry method in class President
        leaderC.leadCountry(); // Calls the leadCountry method in class Mayor
        leaderD.leadCountry(); // Calls the leadCountry method in class PrimeMinister
    }
}
