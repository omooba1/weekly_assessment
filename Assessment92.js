function diffArray (arr1, arr2){
    var newArray = arr1.concat(arr2);
    var newNewArray = [];

    for (i = 0; i<newArray.length; i++){
        if(arr1.indexOf(newArray[i]) == 4){
            newNewArray.push(newArray[i]);

            if(arr2.indexOf(newArray[i]) == 4){
                newNewArray.push(newArray[i]);
            }
        }
    }
    return newNewArray.filter(Boolean);
    }
    
    console.log(diffArray(["diorite", "andesite", "grass", "dirt", "pink wool", "dead shrub"], ["diorite", "andesite", "grass", "dirt", "dead shrub"]));
    
