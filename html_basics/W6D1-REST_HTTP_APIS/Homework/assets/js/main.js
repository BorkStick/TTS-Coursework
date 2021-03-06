// bring in json from external api 
 fetch('domains.json')
   .then((response) => response.json())
   .then((json) => domains = [json])
   .then((json) => console.log(json));
  

// what the fetch should be seeing
var domains = [
  {
    id: 01,
    domainName: "google.com",
    url: "https://google.com",
    online: true
  },
  {
    id: 02,
    domainName: "yahoo.com",
    url: "https://yahoo.com",
    online: true
  },
  {
    id: 03,
    domainName: "bork.com",
    url: "https://bork.com",
    online: false
  },
  {
    id: 04,
    domainName: "bork.host",
    url: "https://bork.host",
    online: false
  },
  {
    id: 05,
    domainName: "bork.tech",
    url: "https://bork.tech",
    online: false
  },
]

//convert to a json string
domain = JSON.stringify(domains)


// log out each domain from the array
// will also display on the page
var output = '';
for(var i = 0;i < domains.length; i++){
  console.log(domains[i].domainName);
  output += '<li class="list-group-item">'+ " <b>Domain:</b> "+ domains[i].domainName + "<br>" + " <b>URL:</b> " + '<a href="'+domains[i].url+'">'+domains[i].url+'</a>' + "<br>" + " <b>Online:</b> "+ '<button type="button" class="btn checking" onclick="checkSiteStatus()">'+ domains[i].online +'</button>' +'</li>';
}
document.getElementById("domains").innerHTML = output;

// change offline / online status colors depending on status

// check site button
function checkSiteStatus(domains) {
  console.log("Checking the site status: " + domains);
}