# Custom Data Structures in Java: MyStack & MyArrayList

---

## 🚀 Project Overview

This repository contains **custom implementations** of two core data structures in Java:

- **MyStack**: A fixed-size stack implemented with an integer array.
- **MyArrayList**: A fixed-capacity array list using an integer array.

These implementations focus on fundamental operations to help understand the internal mechanics of these data structures.

---

## 📚 Data Structures Description

### MyStack

- **Type:** Stack (Last In, First Out)
- **Implemented Operations:**
  - `push(int value)`: Add an element to the top of the stack.
  - `pop()`: Remove the top element from the stack.
  - `search(int value)`: Check if a value exists in the stack.
  - `size()`: Return the current number of elements.
- **Notes:** Uses a fixed-size array, and does not auto-resize when full.

### MyArrayList

- **Type:** Array List (simplified)
- **Implemented Operations:**
  - `add(int value)`: Append an element at the end of the list.
  - `remove(int value)`: Remove the first occurrence of the specified value.
  - `search(int value)`: Check if the list contains a value.
  - `size()`: Return the current number of elements.
- **Notes:** Uses a fixed-capacity array; automatic resizing is not implemented.

---

## 🛠️ Implementation & Usage

The `Implementation` class demonstrates how to:

- Use `MyStack` to push, pop, search, and check size.
- Use `MyArrayList` to add, remove, search, and check size.
- Display results of these operations on the console.
