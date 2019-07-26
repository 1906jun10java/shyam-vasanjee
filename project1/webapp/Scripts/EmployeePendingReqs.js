let reimbs = [];
window.onload = function() {
    employeePendingRequests();

}

function employeePendingRequests() {

    fetch("http://localhost:8085/project1/EmployeePendingReqs").then(function(response) {
        return response.json();
    }).then(function(data) {
        console.log(data);

        if (data.session === null) {
            window.location = "http://localhost:8085/project1/LoginPage"
        } else {

            for (i = 0; i < data.length; i++) {
                let li = document.createElement("li");
                let employee = `${data[i].FirstName} ${data[i].LastName}`;
                let employeeID = data[i].id;
                let amount = data[i].reimbursementAmount;
                let requestID = data[i].reimbursementRequestID;
                let requestStatusType = data[i].reimbursementStatusType;
                let PendingReqs = document.createTextNode(`RequestID: ${requestID} for ${employee} (EmployeeID: ${employeeID}) - $${amount} - Status: ${requestStatusType}`);

                li.appendChild(PendingReqs);
                document.getElementById("empPendingReqs").appendChild(li);
            }

        }
    })
}