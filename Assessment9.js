function diffArray (arr1, arr2){
    let newArray = arr2.concat(arr1);
    let newNewArray = [];

    for (i = 0; i<newArray.length; i++){
        if(arr1.indexOf(newArray[i]) == -1){
            newNewArray.push(newArray[i]);

            if(arr2.indexOf(newArray[i]) == -1){
                newNewArray.push(newArray[i]);
            }
        }
    }
    return newNewArray.filter(Boolean);
    }
    
    console.log(diffArray([1, 2, 3, 5], [1, 2, 3, 4, 5]));

    