package domain;


public class Pokemon{
    
    private String name;
    private int currentLifePoint;
    private boolean alive;
    private int attack;
    private String image;
    private static int counterPokemonSelected;
    
    private Pokemon(){
        this.currentLifePoint = (int) (Math.random()*50 +50);
        this.attack = (int) (Math.random()*15 + 5);
        this.alive =  true;
        ++counterPokemonSelected;
    }
    
    public Pokemon(String name, String image){
        this();
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentLifePoint() {
        return currentLifePoint;
    }
    
    public void setCurrentLifePoint(int currentLifePoint){
        this.currentLifePoint = currentLifePoint;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getAttack() {
        return attack;
    }
    
    public void setAttack(int attack){
        this.attack = attack;
    }

    public static int getCounterPokemonSelected() {
        return counterPokemonSelected;
    }

    public String getImage(){
        return this.image;
    }
    
    public void setImage(String image){
        this.image = image;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pokemon{");
        sb.append("name=").append(name);
        sb.append(", currentLifePoint=").append(currentLifePoint);
        sb.append(", alive=").append(alive);
        sb.append(", attack=").append(attack);
        sb.append(", image=").append(image);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
