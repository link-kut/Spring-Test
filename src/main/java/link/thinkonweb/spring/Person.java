package link.thinkonweb.spring;

public class Person implements PersonPlayer{
    private String name;
    private PlayerInterface player;
    
    public Person() {
    	
    }
  
    public String getName () {
        return name;
    }
  
    public void setName (String name) {
        this.name = name;
    }
  
    public void setPlayer (PlayerInterface player) {
        this.player = player;
    }
  
    public void listenMusic () {
        //this.player.play ();
    	System.out.println("playing");
    }
    
    public String getMusicTitle () {
        return "listening " + this.player.getMusic();
    }
}