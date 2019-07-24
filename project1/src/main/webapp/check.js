let user = {};
let reimbs = [];

window.onload = function() {
    makeRequest();
}

function makeRequest() {
    // send a GET request to SessionServlet to obtain session information
    fetch("http://localhost:8082/project1/RequestCreation").then(function(response) {
        return response.json(); // parsing json data in the response as a JS object
    }).then(function(data) {
        // check whether there is a valid session
        //define behavior for when there is no valid user
        if (data.session === null) {
            window.location = "http://localhost:8082/project1/LoginServlet"
        } else {
            //define behavior for when a user is returned
            user = data;
            document.getElementById("EmployeeId").innerText = "Enter Employee ID " + user.id;
            document.getElementById("reimbAmount").innerText = "Enter Amount: " + user.reimbursementAmount;
            document.getElementById("FirstName").innerText = "First Name " + user.FirstName;
            document.getElementById("LastName").innerText = "Last Name " + user.LastName;

        }
    })
}

function approveRequest() {
    fetch("http://localhost:8082/project1/AllRequests").then(function(response) {
        return response.json();
    }).then(function(data) {
        if (data.session === null) {
            window.location = "http://localhost:8082/project1/EmployeeHome"
        } else {

            for (let i = 0; i < data.length; i++) {
                for (var key in data[i]) {
                    if (reimbs.indexOf(key) === -1) {
                        reimbs.push(key);
                    }
                }
            }
            table = document.getElementById("Henchmen");


        }


    })
}

function populateTable() {
    // declare array
    reimbs;
    for (var i = 0; i < Array.length; i++) {
        for (var key in Array[i]) {
            if (reimbs.indexOf(key) === -1)
                reimbs.push(key);
        }
    }
    table = document.getElementById("Henchmen");
    // add Json data to the table as rows
    for (var i = 0; i < Array.length; i++) {
        tr = table.insertRow(-1);
        for (var j = 0; j < reimbs.length; j++) {
            var tableCell = tr.insertCell;
            tableCell.innerHTML = Array[i][reimbs[j]];
        }
    }
}