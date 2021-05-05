public class App {

    public static void main(String[] args) {
        
        Gamer gamer1=new Gamer();
		gamer1.setId(1);
		gamer1.setName("NUR");
		gamer1.setSurname("VURAL");
	
		Game game1=new Game();
		game1.setId(1);
		game1.setGameName("Counter Strike");
		game1.setPrice("600");
		
		Campaign campaign1=new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignName("Counter Strike");
		campaign1.setDiscount(60);
		
		GamerManager gamerManager=new GamerManager();
		gamerManager.add(gamer1);
        gamerManager.update(gamer1);
        gamerManager.delete(gamer1);
			
		CampaignManager campaignManager=new CampaignManager();
        campaignManager.CamAdd(campaign1);
        campaignManager.CamUpdate(campaign1);
        campaignManager.CamDelete(campaign1);
		
		GameManager gameManager=new GameManager();
        gameManager.Gameadd(game1);
        gameManager.Gameupdate(game1);
        gameManager.Gamedelete(game1);
    }
}

