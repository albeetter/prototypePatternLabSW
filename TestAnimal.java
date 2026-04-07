public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep = registry.createSheep();
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();

        System.out.println(sheep.getType() + " named " + ((Sheep) sheep).getName());
        System.out.println(cow.getType() + " sounds " + ((Cow) cow).getSound());
        System.out.println(horse.getType() + " color is " + ((Horse) horse).getColor());
        
        Animal sheep2 = registry.createSheep();
        ((Sheep) sheep2).setName("Molly");
        System.out.println(sheep2.getType() + " named " + ((Sheep) sheep2).getName());
        
        Animal cow2 = registry.createCow();
        ((Cow) cow2).setFood("Grass");
        ((Cow) cow2).setSound("Maa!");
        System.out.println(cow2.getType() + " sounds " + ((Cow) cow2).getSound());
        System.out.println(cow2.getType() + " eats " + ((Cow) cow2).getFood());
        
        Animal horse2 = registry.createHorse();
        ((Horse) horse2).setColor("Brown");
        System.out.println(horse2.getType() + " is " + ((Horse) horse2).getColor());
        
        // --- USING ALL REMAINING ATTRIBUTES & METHODS ---
        System.out.println("\n--- Farm Trivia ---");
        
        System.out.println("Did you know? Every animal here has " + ((Sheep) sheep).getLegs() + " legs.");
        
        System.out.println("The " + sheep.getType() + " loves to eat " + ((Sheep) sheep).getFood() + " and says " + ((Sheep) sheep).getSound() + ".");
        System.out.println("The " + horse.getType() + " loves to eat " + ((Horse) horse).getFood() + " and when it speaks, it sounds like:");
        
        System.out.print("Horse 1 goes: ");
        horse.makeSound(); 
        System.out.print("Cow 2 goes: ");
        cow2.makeSound();
    }
}