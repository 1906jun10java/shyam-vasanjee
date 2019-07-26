let user = {};
window.onload = function() {
        EmpInfo();
        


    }
    

function populateUser() {
	
	fetch("http://localhost:8085/project1/session").then(function(response) {
		return response.json(); 
	}).then(function(data) {
		console.log(data);
		
		if(data.session === null) {
			window.location = "http://localhost:8085/project1/login"
		} else {
			//define behavior for when a user is returned
			user = data;
            console.log(data);
            document.getElementById("EmployeeId").innerText = "EmployeeID " + user.id;
            document.getElementById("username").innerText = "username"+user.username;
            document.getElementById("FirstName").innerText = "firstname"+user.firstName;
            document.getElementById("LastName").innerText = "lastname"+user.lastName;
            document.getElementById("title").innerText = "title"+user.title;
            document.getElementById("RRID").innerText = "RRID"+user.reimbursementRequestID;
		}
	})
}














//
//function getEmployeeInfo() {
//    let x = document.getElementById("display");
//    if (x.style.display === "hidden") {
//        x.style.display = "block";
//    } else {
//        x.style.display = "hidden";
//    }
//}
//
//
//function getRequests(url) {
//    fetch(url).then(function(response) {
//        let data = response.json();
//        return data;
//    }).then(function(data) {
//
//
//    })
//}
//
//function generateTable() {
//
//    var myTableDiv = document.getElementById("newTab");
//
//    var table = document.createElement('TABLE');
//    table.border = '1';
//
//    var tableBody = document.createElement('TBODY');
//    table.appendChild(tableBody);
//
//    for (var i = 0; i < 3; i++) {
//        var tr = document.createElement('TR');
//        tableBody.appendChild(tr);
//
//        for (var j = 0; j < 4; j++) {
//            var td = document.createElement('TD');
//            td.width = '75';
//            td.appendChild(document.createTextNode("Cell " + i + "," + j));
//            tr.appendChild(td);
//        }
//    }
//    myTableDiv.appendChild(table);

}