package exceptions;

public  class MovementException extends GameActionException {
	public MovementException() {
		super();
	}
	MovementException(String s){
		super(s);
	}
}
