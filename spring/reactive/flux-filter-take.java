@Test
public void take() {
  Flux<String> nationalParkFlux = Flux.just("Yellowstone", "Yosemite", "Grand Canyon", "Zion", "Grand Teton")
    .take(3);

  StepVerifier.create(nationalParkFlux)
    .expectNext("Yellowstone", "Yosemite", "Grand Canyon")
    .verifyComplete();
}
