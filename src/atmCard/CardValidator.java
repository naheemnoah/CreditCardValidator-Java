package atmCard;

public class CardValidator {
	
	public static boolean isValidCardSize(String card) {
		boolean cardSize = true;
		if(card.length() >= 12 && card.length() <= 15) {
			cardSize = false;
		}
		return cardSize;
	}
	
}
