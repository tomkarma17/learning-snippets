@GetMapping("/{id}")
public ResponseEntity<Taco> tacoById(@PathVariable("id") Long id) {
  Optional<Taco> optionalTaco = tacoRepository.findById(id);
  if (optionalTaco.isPresent()) {
    return new ResponseEntity<>(optionalTaco.get(), HttpStatus.OK);
  }
  return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
}
