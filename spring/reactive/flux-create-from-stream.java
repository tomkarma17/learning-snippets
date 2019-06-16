@Test
public void createAFlux_fromStream() {
  Stream<String> fruitStream = Stream.of("Apple", "Orange", "Grape", "Banana", "Strawberry");

  Flux<String> fruitFlux = Flux.fromStream(fruitStream);

  // ... verify steps (same as with create from array)
}
