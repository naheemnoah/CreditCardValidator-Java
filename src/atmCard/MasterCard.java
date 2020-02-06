package atmCard;

public class MasterCard extends Card{
	@Override
	public void result(String cardNo) throws CardException {
		// TODO Auto-generated method stub
		if(validCard(cardNo) == false){
			System.out.printf("%s", "This is not a valid Mastercard");
			
		}
		else {
			System.out.printf("%s", "This is a valid Mastercard");
		}
	}
}
