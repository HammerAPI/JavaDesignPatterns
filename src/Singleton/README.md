# Singleton Design Pattern

The Singleton Design Pattern states that only a single instance of an object should be created and that instance should be easily accessible.

## Use Case

When working with GUI applications, often times clicking a button will open a new window.
It would be very inefficient for a new window to be created each time the button is clicked.
The Singleton pattern allows for only a single instance of the new window to exist, with each subsequent button press simple retrieving that instance.

## Structure

The `Singleton` entity is the entity in which only one instance can exist.
The class itself has a `static` reference to itself that can either be initialized at runtime ("Early Instantiation") or when needed ("Lazy Instantiation").
The constructor of this class is `private`, and the only way to access it is to call the class's `getInstance()` method.
Calling this method will return the single instance of the `Singleton` class.
In Lazy Instantiation, this method would check if the current instance is null and, if so, create a new instance.

## Provided Code

In this repository, I have provided an implementation of the `Singleton` under the `Singleton/Implementation/` directory.
In addition, there is a `SingletonDriver` under the `Singleton/` folder which showcases how it can be used.

## Acknowledgements

- [javatpoint](https://www.javatpoint.com/singleton-design-pattern-in-java)
- [TutorialsPoint](https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm)
