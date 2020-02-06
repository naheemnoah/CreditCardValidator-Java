package atmCard;

public abstract class Card {

	public boolean validCard(String cardNo) throws CardException{
		boolean isValidCard;
		boolean validCardSize = CardValidator.isValidCardSize(cardNo);
		if(!validCardSize) {
			throw new CardException("Card is Invalid");
		}
		int evenCardSum = 0;
		int oddCardSum = 0;
		int digitSquared;
		for(int i = cardNo.length()-2; i >= 0; i=i-2) {
			int digit = Integer.parseInt(String.valueOf(cardNo.charAt(i))); 
			digitSquared = digit*2;
			
			if (digitSquared > 9) {
				evenCardSum+= (digitSquared % 10) + (digitSquared / 10);
			}
			else {evenCardSum+= digitSquared;}
		}
		
		for(int j = cardNo.length()-1; j >= 0; j=j-2) {
			int digit = Integer.parseInt(String.valueOf(cardNo.charAt(j))); 
			oddCardSum+= digit;
		}
		int cardSum = evenCardSum + oddCardSum;
		if(cardSum % 10 != 0) {
			isValidCard = false;
		}
		else{
			isValidCard = true;
		}
		
		return isValidCard;
	}
	
	public abstract void result(String cardNo) throws CardException;
}
