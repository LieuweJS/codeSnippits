function shuffleArray(array) {
  for(let oldPos = array.length - 1; oldPos > 0; oldPos--) {
    const newPos = Math.floor(Math.random() * (oldPos+1));
    [array[oldPos], array[newPos]] = [array[newPos],array[oldPos]];
  }
  return array;
}
