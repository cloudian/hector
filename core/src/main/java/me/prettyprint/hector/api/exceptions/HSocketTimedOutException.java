package me.prettyprint.hector.api.exceptions;


/**
 * @author Ran Tavory (rantav@gmail.com)
 */
public final class HSocketTimedOutException extends HectorException {

  private static final long serialVersionUID = 6830964658496659924L;

  public HSocketTimedOutException(String s) {
    super(s);
  }
  public HSocketTimedOutException(String s, Throwable t) {
    super(s, t);
  }
  public HSocketTimedOutException(Throwable t) {
    super(t);
  }
}
