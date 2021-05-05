# Observer Design Pattern

The Observer Design Pattern allows you to register multiple objects (Observers) to "listen" for changes on another object (Subject).

## Use Case

Often in applications you want an object or collection of objects to be notified when an event occurs.
For example, having multiple aspects of a GUI update when the user selects an option from a menu.

The Observer Design Pattern allows this through the use of two simple Objects.

## Structure

The `Observer` is what actually _listens_ for change.
When a change occurs in the `Subject` on which it listens, it performs an appropriate response.

The `Subject` is the entity _being observed_.
It maintains its state and, when its state changes, notifies any registered `Observer`s that a change has occurred.

## Provided Code

In this repository, I have provided interfaces for `Observer` and `Subject`.
I chose interfaces as they provide a quick way for me to implement this pattern into existing projects.

To see an implementation of this design pattern, see the `Implementation/` folder.

## Acknowledgments

- [Refactoring.Guru](https://refactoring.guru/design-patterns/observer)
- [TutorialsPoint](https://www.tutorialspoint.com/design_pattern/observer_pattern.htm)
