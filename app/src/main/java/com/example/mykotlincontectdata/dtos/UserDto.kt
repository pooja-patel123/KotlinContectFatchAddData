package bett.com.kotlinlistview.dtos


class UserDto {
    var name: String = ""
    var Number: String = ""

    constructor() {}

    constructor(name: String, Number: String) {
        this.name = name
        this.Number = Number
    }
}
