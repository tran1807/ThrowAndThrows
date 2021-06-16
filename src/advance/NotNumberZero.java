package advance;

public class NotNumberZero extends Exception{

	String mess;

	public NotNumberZero(String mess) {
		super(mess);
		this.mess = mess;
	}

}
