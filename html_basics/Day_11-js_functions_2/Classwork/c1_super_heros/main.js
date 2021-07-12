superHeroes = [
    ["Batman", "Bruce Wayne"],
    ["Spiderman", "Peter Parker"],
    ["The Flash", "Barry Allen"],
    ["Green Lantern", "Hal Jordan"],
    ["The Arrow", "Oliver Queen"]
  ]

  let secretIdentity = superHeroes.map(function(revealArray) {
    return revealArray.join(" is ")
  });

  console.log(secretIdentity.join("\n"));

