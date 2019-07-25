user = {};
window.onload = function() {
    EmpInfo();
    //document.getElementById('display').addEventListener('click', EmpInfo);


}

// function getRequests(){
//     fetch("localhost:8085/project1/SessionServlet").then(
//         function(response){
//             var data = response.json();
//             return response.json();
//         }).then(function(data){
//             document.
//         }
//     )
// }
function EmpInfo() {
    fetch("http://localhost:8085/project1/SessionServlet").then(
        function(response) {
            return response.json();
            console.log(data);
        }).then(function(data) {
        if (data.session === null) {
            window.location = "http://localhost:8085/project1/LoginPage";
        }
        user = data;
        document.getElementById("EmployeeId").innerText = "Enter Employee ID " + user.id;
        document.getElementById("username").innerText = "Username " + user.username;
        document.getElementById("FirstName").innerText = "First Name " + user.FirstName;
        document.getElementById("LastName").innerText = "Last Name " + user.LastName;
        document.getElementById("title").innerText = "Title " + user.title;
        document.getElementById("RRID").innerText = "RRID  " + user.reimbursementRequestID;


    })
}