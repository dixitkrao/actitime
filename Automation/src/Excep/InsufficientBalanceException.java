package Excep;

public class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String m)
	{
		super(m);
	}
}
