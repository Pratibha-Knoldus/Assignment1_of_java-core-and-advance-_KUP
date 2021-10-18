On executing the following code will raise an error.

java: non-static method methodA() cannot be referenced from a static context

Reason: We can’t use non-static method of outer class inside a static nested class directly. We have to instantiate the outer class.