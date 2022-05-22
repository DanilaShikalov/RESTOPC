package demo.opc.exception;

import java.text.MessageFormat;

public class MasterItemNotFound extends RuntimeException {
    public MasterItemNotFound(Long id) {
        super(MessageFormat.format("Item with id = {0} not found!", id));
    }
}
