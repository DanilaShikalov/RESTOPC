package demo.opc.controller;

import demo.opc.exception.MasterItemNotFound;
import demo.opc.model.DemoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestControllerAdvisor {
    @ExceptionHandler(value = {MasterItemNotFound.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public DemoResponse<Void> handlePetHelperExceptionItem(RuntimeException ex) {
        return DemoResponse.error(ex.getMessage(), null);
    }
}
