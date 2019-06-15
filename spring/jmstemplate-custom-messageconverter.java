@Bean
public MappingJackson2MessageConverter messageConverter() {
  MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
  messageConverter.setTypeIdPropertyName("_typeId");

  Map<String, Class<?>> typeIdMappings = new HashMap<String, Class<?>>();
  typeIdMappings.put("order", Order.class);
  messageConverter.setTypeIdMappings(typeIdMappings);

  return messageConverter;
}
