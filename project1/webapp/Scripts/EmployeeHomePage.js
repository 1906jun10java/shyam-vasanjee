let user = {};
window.onload = function() {
        EmpInfo();
        document.getElementById("empGen").addEventListener("click", EmpInfo);


    }
    // document.getElementById('hideMyEmployees').onclick=function(){
    //     document.getElementById('myEmployeeTable').style.visibility='hidden';
    //     document.getElementById('individualEmployee').style.visibility='hidden';
    //     document.getElementById('employeeRequestDetails').style.visibility='hidden';
    // }

function EmpInfo() {
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
            document.getElementById("EmployeeId").innerText = "Enter Employee ID " + user.id;
            document.getElementById("username").innerText = user.username;
            document.getElementById("FirstName").innerText = user.firstName;
            document.getElementById("LastName").innerText = user.lastName;
            document.getElementById("title").innerText = user.title;
            document.getElementById("RRID").innerText = user.reimbursementRequestID;
        }

    })
}

function getEmployeeInfo() {
    let x = document.getElementById("display");
    if (x.style.display === "hidden") {
        x.style.display = "block";
    } else {
        x.style.display = "hidden";
    }
}


function getRequests(url) {
    fetch(url).then(function(response) {
        let data = response.json();
        return data;
    }).then(function(data) {


    })
}

function generateTable() {

    var myTableDiv = document.getElementById("newTab");

    var table = document.createElement('TABLE');
    table.border = '1';

    var tableBody = document.createElement('TBODY');
    table.appendChild(tableBody);

    for (var i = 0; i < 3; i++) {
        var tr = document.createElement('TR');
        tableBody.appendChild(tr);

        for (var j = 0; j < 4; j++) {
            var td = document.createElement('TD');
            td.width = '75';
            td.appendChild(document.createTextNode("Cell " + i + "," + j));
            tr.appendChild(td);
        }
    }
    myTableDiv.appendChild(table);

}