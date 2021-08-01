// function loadJson(url) {
//     return fetch(url)
//       .then(response => {
//         if (response.status == 200) {
//           return response.json();
//         } else {
//           throw new Error(response.status);
//         }
//       });
//   }

//   loadJson('http://httpstat.us/500')
//     .catch(alert); // Error: 500


// function loadJson(url) {
//     return fetch(url)
//         .then(response => {
//             if (response.status == 200) {
//                 return response.json();
//             } else {
//                 throw new Error(response.status);
//             }
//         });
// }

// loadJson('http://httpstat.us/500')
//     .catch(alert); // Error: 500


let url ="https://google.com"


    async function loadJson(url) {
        let response = await fetch(url);
        if (response.status == 200) {
            let json = await response.json();
            return json;
        } else {
            console.log("error " + result);
            throw new Error(response.status);
        }
    }
    let result = loadJson(url);
    console.log("Results " + result);