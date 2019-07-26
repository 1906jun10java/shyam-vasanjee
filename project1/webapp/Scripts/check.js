let user ={};
window.onload = function() {
    makeRequest();
    
}

function makeRequest() {
    // send a GET request to SessionServlet to obtain session information
    fetch("http://localhost:8085/project1/RequestCreation").then(function(response) {
        return response.json(); // parsing json data in the response as a JS object
    }).then(function(data) {
        // check whether there is a valid session
        //define behavior for when there is no valid user
        if (data.session === null) {
            window.location = "http://localhost:8082/project1/LoginServlet"
        } else {
            user = data
            console.log(data);
            document.getElementById("reimbAmount").innerText = "Enter Amount: " + user.reimbursementAmount;
            docoument.getElementbyId("redirecrt").addEventlistener("click","EmployeeHomePage");

        }
    })
}


