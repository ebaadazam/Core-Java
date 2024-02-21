The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors such as IOException, SQLException,ClassNotFoundException and Runtime Exceptions which includes IndexOutOfBoundsException, ArithmeticException, NullPointerException, NumberFormatException etc so that the normal flow of the application can be maintained. The core advantage of exception handling is to maintain the normal flow of the application. Suppose there are 10 statements in a Java program and an exception occurs at statement 5; the rest of the code will not be executed, i.e., statements 6 to 10 will not be executed. However, when we perform exception handling, the rest of the statements will be executed. That is why we use exception handling in Java.<br><br>
The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses: <b>Exception</b> and <b>Error</b>.<br>
There are mainly two types of exceptions: Checked and Unchecked. An error is considered as the unchecked exception. However, according to Oracle, there are three types of exceptions namely:<br>
<b>1 Checked Exception</b><br>
<b>2 Unchecked Exception</b><br>
<b>3 Error</b><br>

<b>Types of Exceptions</b><br>
Java defines several types of exceptions that relate to its various class libraries. Java also allows users to define their own exceptions.<br>
Exceptions can be categorized in two ways:<br>

<b>1. Built-in Exceptions</b><br>
Built-in exceptions are the exceptions that are available in Java libraries. These exceptions are suitable to explain certain error situations.<br>
<b>A. Checked Exception</b><br>
Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.<br>
<b>B. Unchecked Exception</b><br>
The unchecked exceptions are just opposite to the checked exceptions. The compiler will not check these exceptions at compile time. In simple words, if a program throws an unchecked exception, and even if we didn’t handle or declare it, the program would not give a compilation error.<br>
<b>2. User-Defined Exceptions</b><br>
Sometimes, the built-in exceptions in Java are not able to describe a certain situation. In such cases, users can also create exceptions, which are called ‘user-defined Exceptions’.<br>

