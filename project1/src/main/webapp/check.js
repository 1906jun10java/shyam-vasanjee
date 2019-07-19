

let user = {};

window.onload = function() {
	populateUser();
}

function populateUser() {
	
	fetch("http://localhost:8082/ServletDemo/session").then(function(response) {
		return response.json(); 
	}).then(function(data) {
		console.log(data);

		if(data.session === null) {
			window.location = "http://localhost:8082/ServletDemo/LoginServlet"
		} else {
			
			user = data;
			document.getElementById("username").innerText = "username: "+user.username;
			document.getElementById("firstname").innerText = "firstname: "+user.firstname;
			document.getElementById("lastname").innerText = "lastname: "+user.lastname;
			document.getElementById("email").innerText = "email: "+user.email;
		}
	})
}

