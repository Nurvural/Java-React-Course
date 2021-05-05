public class CampaignManager implements CampaignService{

    @Override
    public void CamAdd(Campaign campaign) {
        System.out.println("Kampanya Eklendi: " + campaign.getCampaignName());
        
    }

    @Override
    public void CamUpdate(Campaign campaign) {
        System.out.println("Kampanya Güncellendi: " + campaign.getCampaignName());
        
    }

    @Override
    public void CamDelete(Campaign campaign) {
        System.out.println("Kampanya Silindi: " + campaign.getCampaignName());
        
    }
    

}
