// How to add headers when using convertAndSend()

@Override
public void sendOrder(Order order) {
  rabbit.convertAndSend("tacocloud.order.queue", order, new MessagePostProcessor() {

    @Override
    public Message postProcessMessage(Message message) throws AmqpException {
      MessageProperties props = message.getMessageProperties();
      props.setHeader("X_ORDER_SOURCE", "WEB");
      return message;
    }

  });
}
