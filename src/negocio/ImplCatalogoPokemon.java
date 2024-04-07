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
    public Pokemon[] listPokemon() {
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
        pokemons[counter++] = pokemon;
    }

    @Override
    public void editPokemon(Pokemon pokemon, String nombre, int pointLife, int attack) {
        pokemon.setName(nombre);
        pokemon.setCurrentLifePoint(pointLife);
        pokemon.setAttack(attack);
    }
    
    
    
}
