# Unsafe Type Casting in Scala Generics

This repository demonstrates a common error in Scala: unsafe type casting using `asInstanceOf` within a generic class. The example shows how this can lead to runtime `ClassCastException`s if the type parameter `T` doesn't match the expected types in the `match` statement.

The `bug.scala` file contains the flawed code, while `bugSolution.scala` presents a safer alternative using pattern matching with type constraints or type classes.