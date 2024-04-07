package domain;

public class Player {
    
    private String name;
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private int numberOfAttacks;
    private int counterGame;
    private int counterOfAttacksReceived;
    private boolean gameLost;
    
    public Player(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon getPokemon1() {
        return pokemon1;
    }

    public void setPokemon1(Pokemon pokemon1) {
        this.pokemon1 = pokemon1;
    }

    public Pokemon getPokemon2() {
        return pokemon2;
    }

    public void setPokemon2(Pokemon pokemon2) {
        this.pokemon2 = pokemon2;
    }

    public int getNumberOfAttacks() {
        return numberOfAttacks;
    }

    public int getCounterGame() {
        return counterGame;
    }

    public int getCounterOfAttacksReceived() {
        return counterOfAttacksReceived;
    }

    public boolean isGameLost() {
        return gameLost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player{");
        sb.append("name=").append(name);
        sb.append(", pokemon1=").append(pokemon1);
        sb.append(", pokemon2=").append(pokemon2);
        sb.append(", numberOfAttacks=").append(numberOfAttacks);
        sb.append(", counterGame=").append(counterGame);
        sb.append(", counterOfAttacksReceived=").append(counterOfAttacksReceived);
        sb.append(", gameLost=").append(gameLost);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
