package ödevDört;

public class CustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getName() + customer.getLastName() + " isimli kullanıcı sisteme eklendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getName() + customer.getLastName() + " isimli kullanıcı sistemden başarıyla silindi. ");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getName() + customer.getLastName() + " isimli kullanıcının bilgileri güncellendi. ");
		
	}
	

}
