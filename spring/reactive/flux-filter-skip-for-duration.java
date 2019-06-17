@Test
public void skipAFewSeconds() {
  Flux<String> skipFlux = Flux.just("one", "two", "skip a few", "ninety nine", "one hundred")
    .delayElements(Duration.ofSeconds(1))
    .skip(Duration.ofSeconds(4));

  StepVerifier.create(skipFlux)
    .expectNext("ninety nine", "one hundred")
    .verifyComplete();
}
