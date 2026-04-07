public class Sheep implements Animal {
    private Integer legs;
    private String sound;
    private String food;
    private String name;

    public Sheep() {
        this.legs = 4;
        this.sound = "Baa";
        this.food = "Grass";
        this.name = "Dolly";
    }

    public Sheep(Sheep target) {
        if (target != null) {
            this.legs = target.legs;
            this.sound = target.sound;
            this.food = target.food;
            this.name = target.name;
        }
    }

    public void setName(String name) { 
        this.name = name; 
        }
    public String getName() { 
        return name; 
        }
    
    public Integer getLegs() { 
        return legs; 
        }
    public String getSound() { 
        return sound; 
        }
    public String getFood() { 
        return food; 
        }

    @Override
    public Animal clone() { 
        return new Sheep(this); 
        }

    @Override
    public void makeSound() { 
        System.out.println(sound); 
        }

    @Override
    public String getType() { 
        return "Sheep"; 
        }
}