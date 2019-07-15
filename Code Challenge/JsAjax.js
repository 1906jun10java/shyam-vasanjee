window.onload = function() {
    document.getElementById("Things").onclick = function() {
        sendAjaxGet('url', showThings);
    };
}



function sendjaxGet(url, func) {
    //step 1: obtain xhr object
    let xhr = new XMLHttpRequest() || new ActiveXObject("Micrsoft.HTTPRequest");
    //step 2: onstatereadychange 
    xhr.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                func(this);
            }
        }
        // step 3: prepare the request
    xhr.open("GET", url, true);
    //step 4: send the request
    xhr.send();
}

function showThings(xhr) {
    let thingObj = JSON.parse(xhr.responseText);
    console.log(thingObj);
    //get id functions
}