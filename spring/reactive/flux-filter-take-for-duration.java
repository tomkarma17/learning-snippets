@Test
public void take() {
  Flux<String> nationalParkFlux = Flux.just("Yellowstone", "Yosemite", "Grand Canyon", "Zion", "Grand Teton")
    .delayElements(Duration.ofSeconds(1))
    .take(Duration.ofMillis(3500));

  StepVerifier.create(nationalParkFlux)
    .expectNext("Yellowstone", "Yosemite", "Grand Canyon")
    .verifyComplete();
}
