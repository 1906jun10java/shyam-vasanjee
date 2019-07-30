let reimbs;
window.onload = function() {
    employeePendingRequests();

}

function employeePendingRequests() {

    fetch("http://localhost:8085/project1/EmployeePendingReqs").then(function(response) {
        return response.json();
    }).then(function(data) {
        console.log(data);

        if (data === null) {
            window.location = "http://localhost:8085/project1/LoginPage"
        } else {
        	reimbs = data;

            for (i = 0; i < reimbs.length; i++) {
                let li = document.createElement("li");
                let employee = `${reimbs[i].firstName} ${reimbs[i].lastName}`;
                let employeeID = reimbs[i].id;
                let amount = reimbs[i].reimbursementAmount;
                let requestID = reimbs[i].reimbursementRequestID;
                let requestStatusType = reimbs[i].reimbursementStatus;
                let PendingReqs = document.createTextNode(`RequestID: ${requestID} for ${employee} (EmployeeID: ${employeeID}) - $${amount} - Status: ${requestStatusType}`);

                li.appendChild(PendingReqs);
                document.getElementById("EmployeePendingReqs").appendChild(li);
            }

        }
    })
}