fun main(){
    var name: Names = Names("Six Bedroom Flat", "Mr. David Iyoboyi", "No. 153", "New York City", "USA")
    println(name.houseName)
    println(name.ownerOfHouse)
    println(name.streetNumber)
    println(name.streetName)
    println(name.location)


    var list: ListOfFood = ListOfFood("Rice", "Beans", "Eba", "Fried Rice", "portage",)
    println(list.nameFood1)
    println(list.nameFood2)
    println(list.nameFood3)
    println(list.nameFood4)
    println(list.nameFood5)


    var cars: Cars = Cars("Toyotal Camry", "2021", "Blue")
    println(cars.carName)
    println(cars.carModel)
    println(cars.carColor)


    var schools: Schools = Schools("Nana Secondary School", "Three Buildings", "4, link Road, Warri")
    pritnln(schools.schlName)
    pritln(schools.schlBuilding)
    println(schools.schlLocation)


    var houses: Houses = Houses("Two Bedroom flat", "Three Bedroom Selfcon")
    println(houses.house1)
    println(houses.house2)


}

class Names{
    var houseName: String = ""
    var ownerOfHouse: String = ""
    var streetNumber: String = ""
    var streetName: String = ""
    var location: String = ""

    constructor(houseName: String, streetNumber: String, streetName: String, location: String, ownerOfHouse: String){
        this.houseName = houseName
        this.ownerOfHouse = ownerOfHouse
        this.streetNumber = streetNumber
        this.streetName = streetName
        this.location = location
    }

}

class ListOfFood{
    var nameFood1: String = ""
    var nameFood2: String = ""
    var nameFood3: String = ""
    var nameFood4: String = ""
    var nameFood5: String = ""

    constructor(nameFood1: String, nameFood2: String, nameFood3: String, nameFood4: String, nameFood5: String){
        this.nameFood1 = nameFood1
        this.nameFood2 = nameFood2
        this.nameFood3 = nameFood3
        this.nameFood4 = nameFood4
        this.nameFood5 = nameFood5
    }

}

class Cars{
    var carName: String = ""
    var carModel: String = ""
    var carColor: String = ""

    constructor(carName: String, carModel: String, carColor: String){
        this.carName = carName
        this.carModel = carModel
        this.carColor = carColor
    }

}

class Schools{
    var schlName: String = ""
    var schlBuilding: String = ""
    var schlLocation: String = ""

    constructor(schName: String, schlBuilding: String, schlLocation: String){
        this.schlName = schlName
        this.schlBuilding = schlBuilding
        this.schlLocation = schlLocation
    }

}

class Houses{
    var house1: String = ""
    var house2: String = ""

    constructor(house1: String, house2: String){
        this.house1 = house1
        this.house2 = house2
    }

}