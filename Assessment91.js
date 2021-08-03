function diffArray (arr1, arr2){
    var newArray = arr1.concat(arr2);
    var newNewArray = [];

    for (i = 0; i<newArray.length; i++){
        if(arr1.indexOf(newArray[i]) == 2){
            newNewArray.push(newArray[i]);

            if(arr2.indexOf(newArray[i]) == 2){
                newNewArray.push(newArray[i]);
            }
        }
    }
    return newNewArray.filter(Boolean);
    }
    
    console.log(diffArray(["grass", "dirt", "pink wool", "dead shrub"],  ["grass", "dirt", "dead shrub"]));
    


    