/**
* Created by Owais Majid on 6/17/2017.
*/


// preVariables.kt
/*
* Defining local variables
*
* We have two types of Local Variables :
* 1- Immutable Variables -> val
*   {
*       1- Readonly
*   and 2- Assign Once (Can't be reassigned)
*       3- You can decelerate it and initialize it immediately
*    or 4- You can decelerate it then assign a value for it somewhere else
*   }
*/

//Example of How to :

fun valVariables(){

    val int = 5
    val str: String = "Some String"
    val bol = true
    val float: Float = 17.5f
    val double = 22.01

    val number: Int
    number = 5

    val long: Long
    long = 457845287528L

    val eDouble: Double
    eDouble = 784.5e10

    val bool: Boolean
    bool = false

}

/*
* 2- Mutable Variables -> var
*   {
*       1- Readable and Writable
*       2- You can reassign it
 *      3- 3- You can decelerate it and initialize it immediately
*    or 4- You can decelerate it then assign a value for it somewhere else
*   }
* */

//Example of How to :

fun varVariables(){

    var int = 5
    int /= 3

    var str: String = "Some String"
    str = "The str = $str"
    str.capitalize()


    var bol = true
    bol = 5 < 3

    var float: Float = 17.5f

    var double = 22.01

    var number: Int
    number = 5
    number += 2

    var long: Long
    long = 457845287528L
    long -= 577L

    var eDouble: Double
    eDouble = 784.5e10
    eDouble *= -5e10

    var bool: Boolean
    bool = false
    bool != bool

}

fun main(p: Array<String>){/* Body */}

var variablesIdentifier: DataType = value