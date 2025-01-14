```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    value match {
      case x: Int => x + other.value.asInstanceOf[Int]
      case x: String => x + other.value.asInstanceOf[String]
      case _ => throw new Exception("Unsupported type")
    }
  }
}

object Main extends App {
  val obj1 = new MyClass(10)
  val obj2 = new MyClass(20)
  println(obj1.myMethod(obj2))

  val str1 = new MyClass("Hello")
  val str2 = new MyClass(" World")
  println(str1.myMethod(str2))
}
```