@Bean
@Router(inputChannel="numberChannel")
public AbstractMessageRouter evenOddRouter() {
  return new AbstractMessageRouter() {

    @Override
    protected Collection<MessageChannel> determineTargetChannels(Message<?> message) {
      Integer number = (Integer) message.getPayload();
      if (number % 2 == 0) {
        return Collections.singleton(evenChannel());
      }
      return Collections.singleton(oddChannel());
    }

  };
}

@Bean
public MessageChannel evenChannel() {
  return new DirectChannel();
}

@Bean
public MessageChannel oddChannel() {
  return new DirectChannel();
}
