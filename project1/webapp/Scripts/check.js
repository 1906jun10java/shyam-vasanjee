let user = {};
window.onload = function() {
	makeRequest();

}

function makeRequest() {

	fetch("http://localhost:8085/project1/session")
			.then(function(response) {
				return response.json();
			})
			.then(
					function(data) {
						if (data.session === null) {
							window.location = "http://localhost:8085/project1/LoginPage"
						} else {
							user = data
							console.log(data);
							document.getElementById("Amount").innerText = "Enter Amount: "
									+ user.reimbursementAmount;

						}
					})
}
