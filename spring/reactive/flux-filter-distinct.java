@Test
public void distinct() {
  Flux<String> animalFlux = Flux.just("dog", "cat", "bird", "dog", "bird", "anteater")
    .distinct();

  StepVerifier.create(animalFlux)
    .expectNext("dog", "cat", "bird", "anteater")
    .verifyComplete();
}
