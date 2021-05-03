package ödevDört;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setName("Duygu ");
		customer.setLast("Baran");
		customer.setTc("12345678900");
		customer.setBirthday("13.12.1995");
		
		VerificationManager verificationManager = new VerificationManager();
		verificationManager.identityValidation(customer);

		Campaign campaign = new Campaign();
		campaign.setCampaignName("Fırsat kaçtı kaçıyor");
		Campaign campaign2 = new Campaign();
		campaign2.setCampaignName("İndirimi yakala çok ararsın sonra");
		
		Game game = new Game();
		game.setGameName("TEMPLE RUN");
		game.setGameCost(3.5);
		Game game2 = new Game();
		game2.setGameName("NINJA ARASHI");
		game2.setGameCost(5.99);
		
		System.out.println("");
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(customer);
		customerManager.delete(customer);
		customerManager.update(customer);
		
		System.out.println("");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.login(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign2);
		
		System.out.println("");
		
		GameManager gameManager = new GameManager();
		gameManager.sell(game, customer, campaign);
		GameManager gameManager2 = new GameManager();
		gameManager2.sell(game2, customer, campaign2);
		
	}
}
