/**
 * Created by Owais Majid on 6/17/2017.
 */

// preNotVariables.kt
/*
* What you can Not do with Variables
*
*  1- Immutable Variables -> val
*  {
*       1- Can't leave it without initial value if haven't a dataType even you would assign a value after that
*       2- No reassign for val(s)
*       3- No modification allowed on val(s)
*  }
*/

// How Not to:
fun notVal(){
    val int
    // error : No type annotation or initial value

    val string
    // error : No type annotation or initial value

    string = "SomeString with $int"
    // error : val [int] must be initialized

    val boolean = true
    boolean = false
    // error: val cannot be reassigned
}



/*
* 2- Mutable Variables -> var
*   {
*       1- Can't leave it without initial value if haven't
*           a dataType even you would assign a value after that
*       2- You can't reassign it to an other dataType
*
*   }
* */

// How Not to:

fun notVar(){
    var someString
    someString = "Hola Amigo"

    var int = 5
    int = "String"
}