var fileInput;
var pfpWrapper;

window.onload = function() {
    pfpWrapper = document.getElementById("pfpBox");
    fileInput = document.getElementById("fileUpload");

    pfpWrapper.addEventListener("click", function() {
      changeImage(this);
    });
}

function changeImage(input) {
    let [file] = fileInput.files

    const reader = new FileReader();
    reader.onload = (e) => {
    pfpWrapper.src = e.target.result;
    };

    reader.onerror = (err) => {
     console.error("Error reading file:", err);
     alert("An error occurred while reading the file.");
    };

    reader.readAsDataURL(file);
}
