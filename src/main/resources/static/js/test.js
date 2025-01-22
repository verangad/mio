function testFunction()
{
    console.log("4534");
    fetch("/update", {
      method: "POST",
      body: JSON.stringify({
        proficiencies: "test",
        languages: "test2",
        completed: false
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}