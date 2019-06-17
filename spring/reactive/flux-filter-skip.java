@Test
public void skipAFew() {
  Flux<String> skipFlux = Flux.just("one", "two", "skip a few", "ninety nine", "one hundred").skip(3);

  StepVerifier.create(skipFlux)
    .expectNext("ninety nine", "one hundred")
    .verifyComplete();
}
