package negocio;

import domain.Pokemon;
import java.util.*;

public interface ICatalogoPokemon {
    
    
    
    Pokemon[] listPokemon();
    
    void printPokemons();
    
    void addPokemon(Pokemon pokemon);
    
    void editPokemon(Pokemon pokemon, String nombre, int pointLife, int attack);
    
}
