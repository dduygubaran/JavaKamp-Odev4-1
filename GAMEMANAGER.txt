package ödevDört;

public class GameManager implements GameService{

	@Override
	public void sell(Game game, Customer customer, Campaign campaign) {
		System.out.println(customer.getName() + customer.getLastName() +" isimli kullanıcı "+ game.getGameName()+ " isimli oyunu " 
	+campaign.getCampaignName().toUpperCase() + " kampanyasından yararlanarak " + game.getGameCost() + " fiyatından almıştır." );
	}
}
