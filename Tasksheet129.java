// Animal interface with required methods
interface Animal {
    boolean feed(boolean timeToEat);  // Method to feed the animal
    void groom();                    // Method to groom the animal
    void pet();                       // Method to pet the animal
}

// Gorilla class implements the Animal interface
class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Put gorilla food into cage."); // lather, rinse, repeat
            return true;
        } else {
            System.out.println("Gorilla is not hungry right now.");
            return false;
        }
    }

    @Override
    public void groom() {
        System.out.println("Grooming the gorilla.");  // lather, rinse, repeat
    }

    @Override
    public void pet() {
        System.out.println("Pet at your own risk.");  // pet at your own risk
    }
}

// Main class to test the Gorilla class
public class Tasksheet129 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        // Feed the gorilla (time to eat is true)
        boolean fed = gorilla.feed(true);
        System.out.println("Fed: " + fed);

        // Groom the gorilla
        gorilla.groom();

        // Pet the gorilla
        gorilla.pet();
    }
}
