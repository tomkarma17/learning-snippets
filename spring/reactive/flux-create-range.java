@Test
public void createAFlux_range() {
  Flux<Integer> intervalFlux = Flux.range(1, 5);

  StepVerifier.create(intervalFlux)
    .expectNext(1)
    .expectNext(2)
    .expectNext(3)
    .expectNext(4)
    .expectNext(5)
    .verifyComplete();
}
