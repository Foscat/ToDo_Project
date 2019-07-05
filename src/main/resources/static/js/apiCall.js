console.log("connected");

apiJoke = () => {

    var queryUrl = "http://api.icndb.com/jokes/random/";

    $.ajax({
        url: queryUrl,
        method: "GET"
    })
    .then((res) => {
        // console.log(res);

        var jokeId = res.value.id;
        var jokeBody = res.value.joke;

        console.log(jokeBody);

    })
};

apiJoke();