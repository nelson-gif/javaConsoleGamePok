package test;

import java.util.*;
import negocio.*;

public class test {
    public static void main(String[] args) {
        CatalogoImages a = new CatalogoImages();
        String imagePokemonIndex;
        imagePokemonIndex = a.getImageIndex(0);
        System.out.println("imagePokemonIndex = " + imagePokemonIndex);
        
        a.printImages();
        
    }
}
