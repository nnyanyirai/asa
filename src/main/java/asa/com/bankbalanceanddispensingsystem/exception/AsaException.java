package asa.com.bankbalanceanddispensingsystem.exception;

public class AsaException extends RuntimeException{
  public AsaException() {
    super();
  }

  public AsaException(String message) {
    super(message);
  }

  public AsaException(String message, Throwable cause) {
    super(message, cause);
  }

  public AsaException(Throwable cause) {
    super(cause);
  }

  protected AsaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
