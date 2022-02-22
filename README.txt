# visma-application
To compile and run this application:

cd visma-application
javac -d classes src/*.java
java -cp DIR/WHERE/APP/IS/classes App

DESCRIPTION:

This is my submission for Visma code test. I decided to "over engineer" the solution a bit, and apply the Abstract Factory design pattern.
The reasons that I chose to do it this way were the following:
- I have learned about design pattern theory in school, but never got to try it out in practice, and saw a chance here
- I wanted to demonstrate that with this solution, the application could in theory do more complicated things in addition to returning the action as a string

The trade offs are that this is a complicated solution for a simple problem, however the benefit is that it is more extensible with additional functionality (at least that is my intention! I am not 100% sure if I applied the pattern correctly).

The main take away is that I had fun with designing the solution this way :)

When the application runs, it asks for a URI, copy and paste them in the terminal. I tested the application on the URIs provided in the description email, and it should be able to detect bad identity, bad action, bad source, and bad parameter. At least some simple cases!
