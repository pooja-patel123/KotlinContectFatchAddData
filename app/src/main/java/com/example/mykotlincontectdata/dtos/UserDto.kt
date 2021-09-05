package bett.com.kotlinlistview.dtos

/**
 * Created by bett on 8/21/17.
 */
class UserDto {
    var name: String = ""
    var Number: String = ""

    constructor() {}

    constructor(name: String, Number: String) {
        this.name = name
        this.Number = Number
    }
}
