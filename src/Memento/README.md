# Memento Design Pattern

The Memento Design Pattern allows you to save and restore snapshots of an object without leaking implementation details.

## Use Case

Users expect most applications to be able to allow them to "undo" an action that was just performed.
In addition, many applications allow users to undo multiple times.
To do this, the application needs some form of history which contains the previous states of itself.

The Memento pattern allows this to be achieved easily through just three simple parts.

## Structure

The `Originator` entity produces snapshots of its current state and can restore its state from a snapshot if provided.

The `Memento` entity acts as the snapshot itself.
It holds fields relevant to the state of the `Originator`.

The `Caretaker` entity is the manager of this pattern.
It possesses the knowledge of "why" and "when" to capture a snapshot or restore the `Originator`.
It typically holds a list of snapshots, effectively creating a history of previous states.

## Provided Code

In this repository, I have provided interfaces for `Memento`, `Originator`, and `Caretaker`.
There are plenty of ways to implement the Memento Design Pattern, from nested classes to interfaces.
I chose interfaces as they provide a quick way for me to implement this pattern into existing projects.

To see an implementation of this design pattern, see the `Implementation/` folder.
To see this implementation in action, execute the `MementoDriver`.

## Acknowledgements

- [Refactoring.Guru](https://refactoring.guru/design-patterns/memento)
- [TutorialsPoint](https://www.tutorialspoint.com/design_pattern/memento_pattern.htm)
- [Derek Banas](https://www.youtube.com/watch?v=jOnxYT8Iaoo)
