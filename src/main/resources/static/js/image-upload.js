function updateProfilePicture(blob)
{
    let proficiencies = document.getElementById("proficiencies").value
    let languages = document.getElementById("languages").value

    fetch("/updateProfilePicture", {
      method: "POST",
      body: JSON.stringify({
        pfp: blob
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
}


function readURL(input) {
  if (input.files && input.files[0]) {
    var reader = new FileReader();

    reader.onload = function (e) {
      $('#pfp').attr('src', e.target.result);
    };



    reader.readAsDataURL(input.files[0]);
  }
}

