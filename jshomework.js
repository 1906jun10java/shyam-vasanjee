// writea function that represents the fibonnacci sequence
function fibonnacci(index) {
    if (index === 1) {
        return 0;
    } else if (index === 2 || index === 3) {
        return 1;
    } else {
        return fibonnacci(index - 2) + fibonnacci(index - 1);
    }



}
// factorial function
function factorial(index) {
    if (index === 0) {
        return 1;
    } else {
        return index * factorial(index - 1);
    }
}
// sort arrays
function sortArrays(arrays) {
    num = arrays.length;
    temp = 0;
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n - (i + 1); j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

            }
        }
    }
    return arr;
}

function rotation(arrays, num) {
    // remove from front and push from the back (Queue)
    let temp = 0;
    let length = parseInt(arrays.length);
    let num = parseInt(num);
    if (num > length) {
        num = (length + num) % length;
        console.log(num);
        for (let i = 0; i < num; i++) {
            temp = arrays.shift(); // moves all the values forward and 
            arrays.push(temp); // removes the first

        }
        return arrays;


    }
}


function matchCheck(char1, char2) {
    if (char1 === "(" && char2 === ")") {
        return true;
    } else if (char1 === "{" && char2 === "}") {
        return true;
    } else if (char1 === "[" && char2 === "]") {
        return true;
    } else {
        return false;
    }
}

let bracketCheck = function(str) {
    let bucket = str.split('');
    let num = parseInt(str.length)
    if (num == 0) {
        return true;
    }
    if (num == 1) {
        return false;
    }
    if (bucket[0] === '(') {
        if (bucket[num - 1] === ')') {
            bucket.pop();
            bucket.shift();
        }
    } else if (bucket[0] === '[') {
        if (bucket[num - 1] === ']') {
            bucket.pop();
            bucket.shift();
        }
    } else if (bucket[0] === '{') {
        if (bucket[num - 1] === '}') {
            bucket.pop();
            bucket.shift();
        }
    } else {
        return false;
    }
    return bracketCheck(str);
}