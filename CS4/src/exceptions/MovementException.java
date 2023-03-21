package exceptions;

public  class MovementException extends GameActionException {
	public MovementException() {
	}
	MovementException(String s){
		super(s);
	}
}
