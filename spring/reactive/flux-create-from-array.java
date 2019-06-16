@Test
public void createAFlux_fromArray() {
  String[] fruits = new String[] { "Apple", "Orange", "Grape", "Banana", "Strawberry" };

  Flux<String> fruitFlux = Flux.fromArray(fruits);

  StepVerifier.create(fruitFlux)
    .expectNext("Apple")
    .expectNext("Orange")
    .expectNext("Grape")
    .expectNext("Banana")
    .expectNext("Strawberry")
    .verifyComplete();
}
