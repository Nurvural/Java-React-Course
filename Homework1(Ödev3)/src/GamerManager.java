public class GamerManager implements GamerService{

    @Override
    public void add(Gamer gamer) {
        System.out.println("Oyuncu Eklendi: " + gamer.getName());
        
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Oyuncu güncellendi: " + gamer.getName());
        
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Oyuncu silindi: " + gamer.getName());
        
    }

  
}
