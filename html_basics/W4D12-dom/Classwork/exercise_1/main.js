console.log("Script Loaded");
// Get the header element
let header = document.querySelector("header")
console.log("Header");
console.log(header);

// Get all the section elements
let section = document.querySelectorAll("section")
console.log("Section");
console.log(section);
// Get the section element with class="current"
let currentSection = document.querySelector("section.current")
console.log("currentSection");
console.log(currentSection);

// Get the section that comes after the current section
let afterCurrent = currentSection.nextElementSibling;
console.log("after current section");
console.log(afterCurrent);

// Get the h2 node from the section before the 'current' section
let myH2 = currentSection.previousElementSibling.firstElementChild;
console.log("My H2");
console.log(myH2);

// Get the div that contains the section that has an h2 with a class of 'highlight'
let myDiv = document.querySelector("h2.highlight").parentElement.parentElement;
console.log("My div");
console.log(myDiv);

// Get all the sections that contain an H2 (using a single statement);
let sectionsWithH2 = Array.from(document.querySelectorAll("section h2")).map(function(headline) {
    return headline.parentElement;
});
console.log("Sections that contain an H2");
console.log(sectionsWithH2);