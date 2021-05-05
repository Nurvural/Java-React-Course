public class GameManager implements GameService {

    @Override
    public void Gameadd(Game game) {
        System.out.println("Oyun Eklendi: " + game.getGameName());
        
    }

    @Override
    public void Gameupdate(Game game) {
        System.out.println("Oyun Güncellendi: " + game.getGameName());
        
    }

    @Override
    public void Gamedelete(Game game) {
        System.out.println("Oyun Silindi: " + game.getGameName());
        
    }


    
}
