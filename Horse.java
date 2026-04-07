public class Horse implements Animal {
    private Integer legs;
    private String sound;
    private String food;
    private String color;

    public Horse() {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Hay";
        this.color = "Black"; 
    }

    public Horse(Horse target) {
        if (target != null) {
            this.legs = target.legs;
            this.sound = target.sound;
            this.food = target.food;
            this.color = target.color;
        }
    }

    public void setColor(String color) { 
        this.color = color; 
        }

    public String getColor() { 
        return color; 
        }

    @Override
    public Animal clone() { 
        return new Horse(this);
        }

    @Override
    public void makeSound() { 
        System.out.println(sound); 
        }

    @Override
    public String getType() { 
        return "Horse"; 
        }
}