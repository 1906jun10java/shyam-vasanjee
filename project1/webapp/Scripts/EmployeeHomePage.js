let user = {};
window.onload = function() {
        populateUser();
        


    }
    

function populateUser() {
	
	fetch("http://localhost:8085/project1/session").then(function(response) {
		return response.json(); 
	}).then(function(data) {
		console.log(data);
		
		if(data.session === null) {
			window.location = "http://localhost:8085/project1/LoginPage"
		} else {
			
			user = data;
            
            document.getElementById("EmployeeId").innerText = "EmployeeID:  " + user.id;
            document.getElementById("username").innerText = "username: "+user.username;
            document.getElementById("FirstName").innerText = "firstname: "+user.firstName;
            document.getElementById("LastName").innerText = "lastname: "+user.lastName;
            document.getElementById("title").innerText = "title: "+user.title;
            document.getElementById("RRID").innerText = "RRID: "+user.reimbursementRequestID;
		}
	})
}














