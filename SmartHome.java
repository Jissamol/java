abstract class Appliance {
    private int powerRating; // in watts

    public Appliance(int powerRating) {
        this.powerRating = powerRating;
    }

    // Encapsulation: Getter
    public int getPowerRating() {
        return powerRating;
    }

    // Encapsulation: Setter
    public void setPowerRating(int powerRating) {
        this.powerRating = powerRating;
    }

    // Abstract methods
    public abstract void turnOn();
    public abstract void turnOff();
}


class Fan extends Appliance {
    public Fan(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("Fan is turned ON. Power usage: " + getPowerRating() + "W");
    }

    public void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}


class Light extends Appliance {
    public Light(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("Light is turned ON. Power usage: " + getPowerRating() + "W");
    }

    public void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}


class AC extends Appliance {
    public AC(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("AC is turned ON. Power usage: " + getPowerRating() + "W");
    }

    public void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}



public class SmartHome {
    public static void main(String[] args) {
        Appliance fan = new Fan(75);
        Appliance light = new Light(20);
        Appliance ac = new AC(1500);

        System.out.println("\n--- Smart Home Appliance Control ---");
        fan.turnOn();
        fan.turnOff();

        light.turnOn();
        light.turnOff();

        ac.turnOn();
        ac.turnOff();
    }
}
