package katas;

public class Tamagotchi {
    private int hunger = 4;
    private int energy = 4;
    private int mood = 4;

    public String play() {
        hunger++;
        mood++;
        energy--;
        return getStatus();
    }

    public String eat() {
        hunger = Math.max(hunger - 2, 0);
        energy--;
        return getStatus();
    }

    public String sleep() {
        energy += 2;
        return getStatus();
    }

    private String getStatus() {
        if (mood > 8) return ":-)";
        if (energy < 3 && energy > 0) return "(-_-)";
        if (energy == 0) return "(-_-) zZZ";
        if (mood < 2) return "ఠ_ఠ";
        return ":-|";
    }

    public static void main(String[] args) {
        Tamagotchi pet = new Tamagotchi();
        System.out.println(pet.play());
        System.out.println(pet.eat());
        System.out.println(pet.sleep());
    }
}
