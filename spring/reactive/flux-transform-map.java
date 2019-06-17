@Test
public void map() {
  Flux<Player> playerFlux = Flux.just("Michael Jordan", "Scottie Pippen", "Steve Kerr")
    .map(n -> {
      String[] split = n.split("\\s");
      return new Player(split[0], split[1]);
    });

  StepVerifier.create(playerFlux)
    .expectNext(new Player("Michael", "Jordan"))
    .expectNext(new Player("Scottie", "Pippen"))
    .expectNext(new Player("Steve", "Kerr"))
    .verifyComplete();
}
