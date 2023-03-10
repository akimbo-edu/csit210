public class Alert {
    public static void main (String[] args) {
        System.out.println(" An Emergency Broadcast I created my second program");
        System.out.println("by your name");
    }
}

// 1. Change Alert to alert
//     - "The public type alert must be defined in its own file"
//     - Class name must match file name

// 2. Change Emergency to emergency
//     - No error because "Emergency" is part of a string, it is not an identifier or keyword

// 3. Remove the first quotation mark in the string
//     - "'An' cannot be resolved to a variable"...
//     - "An" is treated as an identifier because there is no double-quote, error thrown because "An" is not a declared variable

// 4. Remove the last quotation mark in the string.
//     - "String literal is not properly closed by a double-quote"
//     - String doesn't close, compiler can't find where it ends, ");" is treated as part of the string

// 5. Change main to man
//     - "Main method not found in file"
//     - Compiler doesn't have a program entry because of the lack of a "main" method

// 6. Change println to bogus
//     - "The method bogus(String) is undefined for the type PrintStream"
//     - A method "bogus" has not been defined

// 7. Remove the semicolon at the end of the println statement
//     - "Syntax error, insert ';' to complete BlockStatements"
//     - Missing semicolon to denote statement end to compiler

// 8. Remove the last brace in the program
//     - "Syntax error, insert '}' to complete ClassBody
//     - Class definition incomplete without brace to tell the compiler where it ends