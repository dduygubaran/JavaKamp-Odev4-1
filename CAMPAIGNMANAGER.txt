package ödevDört;

public class CampaignManager implements CampaignService{

	@Override
	public void login(Campaign campaign) {
		System.out.println(campaign.getCampaignName().toUpperCase() + " isimli kampanyadan yararlanabilirsiniz.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() .toUpperCase()+ " isimli kampanyanın geçerlilik süresi bitmiştir. Bir dahaki fırsatlarda görüşmek üzere...");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName().toUpperCase() + " isimli kampanya güncellenmektedir. Lütfen daha sonra yeniden deneyiniz.");
	}
	

}
