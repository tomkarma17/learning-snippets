public IntegrationFlow numberRoutingFlow(AtomicInteger source) {
  return IntegrationFlows
    ...
      .<Integer, String>route(n -> n%2==0 ? "EVEN":"ODD", mapping -> mapping
        .subFlowMapping("EVEN", sf -> sf
          .<Integer, Integer>transform(n -> n * 10)
          .handle((i,h) -> { ... })
          )
        .subFlowMapping("ODD", sf -> sf
          .transform(RomanNumbers::toRoman)
          .handle((i,h) -> { ... })
          )
        )
      .get();
}
