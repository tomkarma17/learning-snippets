@Test
public void createAFlux_interval() {
  Flux<Long> intervalFlux = Flux.interval(Duration.ofSeconds(1)).take(5);

  StepVerifier.create(intervalFlux)
    .expectNext(0L)
    .expectNext(1L)
    .expectNext(2L)
    .expectNext(3L)
    .expectNext(4L)
    .verifyComplete();
}
