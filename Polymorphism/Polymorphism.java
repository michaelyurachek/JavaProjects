interface Instrument {
    String playSound();
}

class Guitar implements Instrument {
    String brand;

    Guitar(String brand) {
        this.brand = brand;
    }

    @Override
    public String playSound() {
        return brand + " guitar strums: Strum strum!";
    }
}

class Drum implements Instrument {
    String type;

    Drum(String type) {
        this.type = type;
    }

    @Override
    public String playSound() {
        return type + " drum beats: Boom boom!";
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Create an array of Instruments
        Instrument[] band = { new Guitar("Fender"), new Drum("Bass") };

        // Polymorphic behavior: call playSound() on each instrument
        for (Instrument inst : band) {
            System.out.println(inst.playSound());
        }
    }
}