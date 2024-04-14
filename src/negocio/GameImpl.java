package negocio;

public class GameImpl implements IGame{

    private final String PASSWORD = "201800694";
    
    @Override
    public void exitGame() {
        System.exit(0);
    }
    
    @Override
    public boolean isPasswordApproved(String passEntered){
        return passEntered.equals(PASSWORD);
    }
    
    
    
    
}
