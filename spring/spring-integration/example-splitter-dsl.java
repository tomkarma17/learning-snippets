return IntegrationFlows
  ...
    .split(orderSplitter())
    .<Object, String> route(
      p -> {
        if (p.getClass().isAssignableFrom(BillingInfo.class)) {
          return "BILLING_INFO";
        } else {
          return "LINE_ITEMS";
        }
      }, mapping -> mapping
        .subFlowMapping("BILLING_INFO", sf -> sf
          .<BillingInfo> handle((billingInfo, h) -> {
              ...
          }))
        .subFlowMapping("LINE_ITEMS", sf -> sf
          .split()
          .<LineItem> handle((lineItem, h) -> {
            ...
          }))
    )
.get();
