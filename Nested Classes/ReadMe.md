In Java, Nested Classes allow you to define a class within a class. We use nested class in a situation when a class is closely associated with another class and is only intented to be used in the context of the outer class. This creates a clear relationship between two classes.<br>
Nested Classes are divided into two primary categories: Static Nested Classes and Non-Static Nested Classes(Inner Classes). Each type serves different purposes and has its own characteristics.<br>

<h6>Static Nested Classes</h6><br>
A Static Nested Class is a static class defined at the member level. It can be instantiated without an instance of the outer class, which means it cannot access the instance variables of the outer class directly. It cannot access the non static members of the outer class. Instead, it interacts with the outer class and its members, including private ones and static ones ofcourse, through an object reference.<br>

Non-Static Nested Classes(Inner Classes)<br>
Non-Static Nested Classes are also called Inner classes. They are defined within the scope of another class and have access to all the members (including private members) of the outer class. They are associated with an instance of the outer class and can therefore access its instance methods and fields directly. Inner classes can be further categorized into:<br>

a). Local Inner Classes<br>
A Local Inner Class is defined within a block, typically within a method of the outer class. They are not accessible outside the block where they are defined and can only be instantiated within that block. They can access final or effectively final local variables in addition to the members of the outer class.<br>

b). Anonymous Inner Classes<br>
An Anonymous Inner Class is a local inner class without a name and is declared and instantiated all at once, typically at the point of invocation of a method that requires an instance of an interface or abstract class. They are used for implementing interfaces or extending classes in a concise manner.<br>
