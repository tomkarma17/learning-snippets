@Test
public void filter() {
  Flux<String> nationalParkFlux = Flux.just("Yellowstone", "Yosemite", "Grand Canyon","Zion", "Grand Teton")
    .filter(np -> !np.contains(" "));

  StepVerifier.create(nationalParkFlux)
    .expectNext("Yellowstone", "Yosemite", "Zion")
    .verifyComplete();
}
