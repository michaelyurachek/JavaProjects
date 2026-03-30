class Device {
    void status() {
        System.out.println("This is a general device.");
    }
}

class Phone extends Device {
    @Override
    void status() {
        System.out.println("This is a Phone. It can make calls and send texts.");
    }
}

class Laptop extends Device {
    @Override
    void status() {
        System.out.println("This is a Laptop. It can run programs and browse the internet.");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Device d = new Device();
        Device p = new Phone();
        Device l = new Laptop();

        d.status(); // General device
        p.status(); // Phone specific
        l.status(); // Laptop specific
    }
}