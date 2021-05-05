public class Game extends Gamer{
    
    private int id;
    private String gameName;
    private String price;
    
    
    public Game() {
    }
  

    public Game(int id, String gameName, String price) {
        this.id = id;
        this.gameName = gameName;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
   

    

}
