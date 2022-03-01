package asa.com.bankbalanceanddispensingsystem.exception;

import asa.com.bankbalanceanddispensingsystem.BankBalanceandDispensingSystemApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackageClasses = BankBalanceandDispensingSystemApplication.class)
@Slf4j
public class AsaExceptionHandler {

  @ExceptionHandler(Exception.class)
  public ResponseEntity<String> exceptionHandler(Exception e) {
    return ResponseEntity.badRequest().body(e.getMessage());
  }
}
