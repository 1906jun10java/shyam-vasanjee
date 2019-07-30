user = {};
window.onload = function() {
    UpdateEmployeeInfo();
}

function UpdateEmployeeInfo() {
    fetch("http://localhost:8085/project1/session").then(
        function(response) {
            return response.json();
            //console.log(response);
        }).then(function(data) {
        if (data.session === null) {
            window.location = "http://localhost:8085/project1/LoginPage";
        } else {
            user = data;
            console.log(data);

            
            document.getElementById("username").innerText = user.username;
            document.getElementById("password").innerText = user.password;
            document.getElementById("title").innerText = user.title;

        }

    })
}