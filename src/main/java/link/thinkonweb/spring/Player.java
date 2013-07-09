package link.thinkonweb.spring;

public class Player implements PlayerInterface {
    public void play () {
        System.out.println ( "playing music ...");
    }
    
    public String getMusic() {
    	return new String("some music");
    }
}