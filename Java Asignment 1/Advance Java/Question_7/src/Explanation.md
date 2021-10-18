It will raise the compilation error.

Output :
Compilation Error

/JavaHungry.java:16: error: exception ArrayIndexOutOfBoundsException has already been caught
catch (ArrayIndexOutOfBoundsException ex)
^
1 error


Reason: The main reason is all the catch blocks must be arranged from most 
specific to more general. If you have a catch clause for both 
ArrayIndexOutOfBoundsException and Exception, 
you must put the catch for ArrayIndexOutOfBoundsException first in your code.

Otherwise, ArrayIndexOutOfBoundsException would be caught by catch(Exception e),
because a catch argument can catch the specified exception or its subtypes. 
As a result compiler will stop you from defining catch clauses that can never 
be reached.