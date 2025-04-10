class Planet {
    void describe() {
        System.out.println("Just another planet...");
    }
}

class Earth extends Planet {
    void describe() {
        System.out.println("Earth: Blue planet with life!");
    }
}

class Mars extends Planet {
    void describe() {
        System.out.println("Mars: The red planet, future home?");
    }
}

public class Main {
    public static void main(String[] args) {
        Planet[] solarSystem = { new Earth(), new Mars() };
        for (Planet p : solarSystem) {
            p.describe();
        }
    }
}
