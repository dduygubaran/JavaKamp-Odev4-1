package ödevDört;

public class VerificationManager implements Verification {

	@Override
	public void identityValidation(Customer customer) {
		
		if(customer.getName()=="Duygu " && customer.getLastName()=="Baran" 
				&& customer.getTc()=="12345678900" && customer.getBirthday()=="13.12.1995") {
			System.out.println("Sisteme başarılı bir şekilde giriş yaptınız. Hoş geldin "+ customer.getName().toUpperCase());
		}
		
		else {
			System.out.println("Hatalı giriş yaptınız. Lütfen kullanıcı bilgilerinizi kontrol edip tekrar giriş yapınız.");
		}	
	}
}
