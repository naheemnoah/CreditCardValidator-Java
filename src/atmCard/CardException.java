package atmCard;

public class CardException extends Exception{
	
	Exception exception = new Exception();
	
	public CardException(String message) {
		super(message);
	}
}
