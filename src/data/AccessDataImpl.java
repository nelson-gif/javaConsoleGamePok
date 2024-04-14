package data;

import negocio.*;
import test.*;

public class AccessDataImpl implements IAccessData{
    IGame gameInteraction = new GameImpl();
    
    @Override
    public void exitGame(){
        System.exit(0);
    }
    
    @Override
    public boolean passwordVerification(String passEntered){
        return gameInteraction.isPasswordApproved(passEntered);
    }
    
}
