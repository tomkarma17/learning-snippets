// Send raw messages
void send(MessageCreator messageCreator) throws JmsException;

void send(Destination destination, MessageCreator messageCreator) throws JmsException;

void send(String destinationName, MessageCreator messageCreator) throws JmsException;

// Send messages converted from objects
void convertAndSend(Object message) throws JmsException;

void convertAndSend(Destination destination, Object message) throws JmsException;

void convertAndSend(String destinationName, Object message) throws JmsException;

// Send messages converted from objects with post-processing
void convertAndSend(Object message, MessagePostProcessor postProcessor) throws JmsException;

void convertAndSend(Destination destination, Object message, MessagePostProcessor postProcessor) throws JmsException;

void convertAndSend(String destinationName, Object message, MessagePostProcessor postProcessor) throws JmsException;
