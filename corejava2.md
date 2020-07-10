1) The default value of a static integer variable of a class in Java is,
(a) 0
(b) 1
(c) Garbage value
(d) Null (e) -1.

2) What will be printed as the output of the following program?
public class testincr
{
public static void main(String args[])
{
int i = 0;
i = i++ + i;
System.out.println(“I = ” +i);
}
}
(a) I = 0
(b) I = 1
(c) I = 2
(d) I = 3
(e) Compile-time Error.

3) Multiple inheritance means,
(a) one class inheriting from more super classes
(b) more classes inheriting from one super class
(c) more classes inheriting from more super classes
(d) None of the above
(e) (a) and (b) above.
4) Which statement is not true in java language?
(a) A public member of a class can be accessed in all the packages.
(b) A private member of a class cannot be accessed by the methods of the same class.
(c) A private member of a class cannot be accessed from its derived class.
(d) A protected member of a class can be accessed from its derived class.
(e) None of the above.

5) To prevent any method from overriding, we declare the method as,
(a) static
(b) const
(c) final
(d) abstract
(e) none of the above.

6) Which one of the following is not true?
(a) A class containing abstract methods is called an abstract class.
(b) Abstract methods should be implemented in the derived class.
(c) An abstract class cannot have non-abstract methods.
(d) A class must be qualified as ‘abstract’ class, if it contains one abstract method.
(e) None of the above.
7) The fields in an interface are implicitly specified as,
(a) static only
(b) protected
(c) private
(d) both static and final
(e) none of the above.

8) What is the output of the following program:
public class testmeth
{
static int i = 1;
public static void main(String args[])
{
System.out.println(i+” , “);
m(i);
System.out.println(i);
}
public void m(int i)
{
i += 2;
}}
(a) 1 , 3
(b) 3 , 1
(c) 1 , 1
(d) 1 , 0
(e) none of the above.

9) Which of the following is not true?
(a) An interface can extend another interface.
(b) A class which is implementing an interface must implement all the methods of the
interface.
(c) An interface can implement another interface.
(d) An interface is a solution for multiple inheritance in java.
(e) None of the above.

10) Which of the following is true?
(a) A finally block is executed before the catch block but after the try block.
(b) A finally block is executed, only after the catch block is executed.
(c) A finally block is executed whether an exception is thrown or not.
(d) A finally block is executed, only if an exception occurs.
(e) None of the above.
11) Among these expressions, which is (are) of type String?
(a) “0”
(b) “ab” + “cd”
(c) ‘0’
(d) Both (A) and (B) above (e) (A), (B) and (C) above.

12) Consider the following code fragment
Rectangle r1 = new Rectangle();
r1.setColor(Color.blue);
Rectangle r2 = r1;
r2.setColor(Color.red);
After the above piece of code is executed, what are the colors of r1 and
r2 (in this order)?
(a) Color.blue
Color.red
(b) Color.blue
Color.blue
(c) Color.red
Color.red(d) Color.red
Color.blue
(e) None of the above.

13) What is the type and value of the following expression? (Notice the integer division)
-4 + 1/2 + 2*-3 + 5.0
(a) int -5
(b) double -4.5
(c) int -4
(d) double -5.0
(e) None of the above.

14) What is printed by the following statement?
System.out.print(“Hello,\nworld!”);
(a) Hello, \nworld!
(b) Hello, world!
(c) “Hello, \nworld!”
(d) None of the above.

15) Consider the two methods (within the same class)
public static int foo(int a, String s)
{
s = “Yellow”;
a=a+2;
return a;
}
public static void bar()
{
int a=3;
String s = “Blue”;
a = foo(a,s);
System.out.println(“a=”+a+” s=”+s);
}
public static void main(String args[])
{
bar();
}
What is printed on execution of these methods?(a) a = 3 s = Blue
(b) a = 5 s = Yellow
(c) a = 3 s = Yellow
(d) a = 5 s = Blue
(e) none of the above.

16) Which of the following variable declaration would NOT compile in a java program?
(a) int var;
(b) int VAR;
(c) int var1;
(d) int var_1;
(e) int 1_var;.

17) Consider the following class definition:
public class MyClass
{
private int value;
public void setValue(int i){ / code / }// Other methods...
}
The method setValue assigns the value of i to the instance field value. What could you write
for the implementation of setValue?
(a) value = i;
(b) this.value = i;
(c) value == i;
(d) Both (A) and (B) and above (e) (A), (B) and (C) above.

18) Which of the following is TRUE?
(a) In java, an instance field declared public generates a compilation error.
(b) int is the name of a class available in the package java.lang
(c) Instance variable names may only contain letters and digits.
(d) A class has always a constructor (possibly automatically supplied by the java compiler).
(e) The more comments in a program, the faster the program runs.

19) A constructor
(a) Must have the same name as the class it is declared within.
(b) Is used to create objects.
(c) May be declared private
(d) Both (A) and (B) above
(e) (a), (b) and (c) above.

20) Consider,
public class MyClass
{
public MyClass(){/code/}
// more code...
}
To instantiate MyClass, you would write?
(a) MyClass mc = new MyClass();
(b) MyClass mc = MyClass();
(c) MyClass mc = MyClass;
(d) MyClass mc = new MyClass;(e) The constructor of MyClass should be defined as, public void MyClass(){/code/}.

21) What is byte code in the context of Java?
(a) The type of code generated by a Java compiler.
(b) The type of code generated by a Java Virtual Machine.
(c) It is another name for a Java source file.
(d) It is the code written within the instance methods of a class.
(e) It is another name for comments written within a program.

22) What is garbage collection in the context of Java?
(a) The operating system periodically deletes all the java files available on the system.
(b) Any package imported in a program and not used is automatically deleted.
(c) When all references to an object are gone, the memory used by the object is automatically
reclaimed.
(d) The JVM checks the output of any Java program and deletes anything that doesn’t make
sense.
(e) Janitors working for Sun Micro Systems are required to throw away any Microsoft
documentation found in the employees’ offices.

23) You read the following statement in a Java program that compiles and executes.
submarine.dive(depth);
What can you say for sure?
(a) depth must be an int
(b) dive must be a method.
(c) dive must be the name of an instance field.
(d) submarine must be the name of a class
(e) submarine must be a method.

24) The java run time system automatically calls this method while garbage collection.
(a) finalizer()
(b) finalize()
(c) finally()
(d) finalized()
(e) none of the above.

25) The correct order of the declarations in a Java program is,
(a) Package declaration, import statement, class declaration
(b) Import statement, package declaration, class declaration
(c) Import statement, class declaration, package declaration
(d) Class declaration, import statement, package declaration
(e) Class declaration, package declaration, import statement.
