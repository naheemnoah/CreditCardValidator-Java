package atmCard;

public class DiscoverCard extends Card{

	@Override
	public void result(String cardNo) throws CardException {
		// TODO Auto-generated method stub
		if(validCard(cardNo) == false){
			System.out.printf("%s", "This is not a valid Discover card");
			
		}
		else {
			System.out.printf("%s", "This is a valid Discover card");
		}
		
	}
}
