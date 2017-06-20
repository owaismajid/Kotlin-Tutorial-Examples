/**
* Created by Owais Majid on 6/20/2017.
*/

//TypeInterface.kt

    // Basic Types
fun main (arg: Array<String>){

/*1*/   // Numbers---------------------------------------
/*
val/var Name:   Type    = Value             //Size */
    val long:   Long    = 4874214699752L    //64 bits
    val int:    Int     = 1248777           //32 bits
    val short:  Short   = 457               //16 bits
    val byte:   Byte    = 110               //8  bits
    val double: Double  = 95478.254         //64 bits
    val float:  Float   = 75488.254F        //32 bits 



    // To find the Max and the Min Values that type can hold
    // Use the Constant MAX_VALUE and MIN_VALUE

    //Example of How to :

    println("Long Max: ${Long.MAX_VALUE} , Min: ${Long.MAX_VALUE}")
            //Long  Max: 9223372036854775807 , Min: 9223372036854775807

    println("Short Max: ${Short.MAX_VALUE} , Min: ${Short.MAX_VALUE}")
            //Short Max: 32767 , Min: 32767

    println("Int Max: ${Int.MAX_VALUE} , Min: ${Int.MAX_VALUE}")
            //Int Max: 2147483647 , Min: 2147483647

    println("Byte Max: ${Byte.MAX_VALUE} , Min: ${Byte.MAX_VALUE}")
            //Byte Max: 127 , Min: 127
    println("Double Max: ${Double.MAX_VALUE} , Min: ${Double.MAX_VALUE}")
            //Double Max: 1.7976931348623157E308 , Min: 1.7976931348623157E308

    println("Float Max: ${Float.MAX_VALUE} , Min: ${Float.MAX_VALUE}")
            //Float Max: 3.4028235E38 , Min: 3.4028235E38


    //Number literal
    val hexadecimal = 0xAB
    val binary = 0b01010101

    

/*2*/   // Booleans---------------------------------------

    val True: Boolean = true
    val False: Boolean = false

/*3*/    // Chars---------------------------------------

    val charA:      Char = 'A'  // A
    val charZ:      Char = 'Z'  // Z
    val char_a:     Char = 'a'  // a
    val char_f:     Char = 'f'  // f
    val charEscape: Char = '\n' //New Line
    val charUni:    Char = '\u0636' // ض
    val char1:      Char = '1'  // 1 !not a number

/*3*/    // Strings---------------------------------------

    val string:      String = "Some Text"
    val stringEscape:String = "New \n Line"
    val stringRow:   String = """1st Line
                                2nd Line
                                3rd Line """
    // Strings Templates
    val varTemplate: String = "var $charUni = ض"
    val moreTemplate:String = "Floor($double) = ${double.toInt()}"
    println(moreTemplate)       //Floor(95478.254) = 95478

/*3*/    // Arrays---------------------------------------

    //          index: [0][1][2][3][4] , length = 5 or (Last index + 1)
    val array = arrayOf(5, 3, 4, 1, 15)
    var TArray: Array<String> = arrayOf("One", "Five" , "Three")
    TArray[1] = "Two" // Changing an element by providing its Key
    val SArray = Array(5, {e -> e * e})
    // To print the Array Use [name of array].forEach()
    TArray.forEach{ print("$it ") } // One Two Three 
    SArray.forEach{ print("$it ") } // 0 1 4 9 16 

}


