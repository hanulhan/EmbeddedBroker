/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanulhan.jms.broker;

import org.apache.log4j.Logger;
import org.springframework.util.ErrorHandler;

/**
 *
 * @author uhansen
 */
public class JmsErrorHandler implements ErrorHandler {

    private static final Logger LOGGER = Logger.getLogger(JmsErrorHandler.class);
    @Override
    public void handleError(Throwable t) {
        LOGGER.error(t.getMessage(), t);
        throw new RuntimeException(t);
    }

}
