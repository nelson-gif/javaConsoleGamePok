package negocio;

import domain.Pokemon;
import java.util.*;

public class ImplCatalogoPokemon implements ICatalogoPokemon{
    
    private final Pokemon pokemons[];
    private int counter;
    
    public ImplCatalogoPokemon(){
        this.pokemons = new Pokemon[20];
        this.counter = 0;
    }
    
    @Override
    public Pokemon[] getPokemon() {
        return this.pokemons;
    }
    
    @Override
    public void printPokemons(){
        for(Pokemon pokemon: pokemons){
            System.out.println("pokemon = " + pokemon);
        }
    }

    @Override
    public void addPokemon(Pokemon pokemon) {
        boolean exist = false;
        
        for(int i = 0; i < counter; i++){
            String nameOnList = pokemons[i].getName();
            
            if(pokemon.getName().equalsIgnoreCase(nameOnList)){
                exist = true;
            }
        }
        
        if(exist){
            System.out.println("The pokemon already exists, please add another one");
        }else{
            pokemons[counter++] = pokemon;
            System.out.println("Pokemon was added succesfully");
        }
    }

    @Override
    public void editPokemon(Pokemon pokemon, String nombre, int pointLife, int attack) {
        pokemon.setName(nombre);
        pokemon.setCurrentLifePoint(pointLife);
        pokemon.setAttack(attack);
    }
    
    
    
}
