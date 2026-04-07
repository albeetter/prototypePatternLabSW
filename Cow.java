public class Cow implements Animal {
    private Integer legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Grass";
    }

    public Cow(Cow target) {
        if (target != null) {
            this.legs = target.legs;
            this.sound = target.sound;
            this.food = target.food;
        }
    }

    public void setSound(String sound) { 
        this.sound = sound; 
        }

    public String getSound() {
        return sound; 
        }

    public void setFood(String food) { 
        this.food = food; 
        }
    public String getFood() { 
        return food; 
        }

    @Override
    public Animal clone() { 
        return new Cow(this); 
        }

    @Override
    public void makeSound() { 
        System.out.println(sound); 
        }

    @Override
    public String getType() { 
        return "Cow"; 
        }
}