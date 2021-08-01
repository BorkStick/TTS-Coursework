

async function showAvatar() {
        // read our json
    let response = await fetch('https://javascript.info/article/promise-chaining/user.json');

    let user = await response.json();

    // read github user
    let githubResponse = await fetch(`https://api.github.com/users/${user.name}`);
    let githubUser = await githubResponse.json();

    console.log(githubUser);
    
    // show the avatar
    let img = document.createElement("img");
    img.src = githubUser.avatar_url;

    img.className = "promise-avatar-example";
    document.body.append(img);


}

showAvatar();
showAvatar();
showAvatar();
showAvatar();