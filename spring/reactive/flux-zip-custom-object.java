@Test
public void zipFluxesToObject() {
  Flux<String> characterFlux = Flux.just("Garfield", "Kojak", "Barbossa");
  Flux<String> foodFlux = Flux.just("Lasagna", "Lollipops", "Apples");

  Flux<String> zippedFlux = Flux.zip(characterFlux, foodFlux, (c, f) -> c + " eats " + f);

  StepVerifier.create(zippedFlux)
    .expectNext("Garfield eats Lasagna")
    .expectNext("Kojak eats Lollipops")
    .expectNext("Barbossa eats Apples")
    .verifyComplete();
}
