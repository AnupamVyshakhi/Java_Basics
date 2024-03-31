package anupam.java;

public class AgeNotPossibleException extends Throwable{
  private String msg;
  public AgeNotPossibleException(String a)
  {
	  msg=a;
  }
  public String getMessage()
  {
	  return msg;
  }
}
