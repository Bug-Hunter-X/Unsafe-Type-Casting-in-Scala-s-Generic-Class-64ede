```scala
sealed trait MyType
case class MyInt(value: Int) extends MyType
case class MyString(value: String) extends MyType

class MyClass[T <: MyType](val value: T) {
  def myMethod(other: MyClass[T]): MyType = (value, other.value) match {
    case (MyInt(x), MyInt(y)) => MyInt(x + y)
    case (MyString(x), MyString(y)) => MyString(x + y)
    case _ => throw new Exception("Unsupported type combination")
  }
}

object Main extends App {
  val obj1 = new MyClass(MyInt(10))
  val obj2 = new MyClass(MyInt(20))
  println(obj1.myMethod(obj2))

  val str1 = new MyClass(MyString("Hello"))
  val str2 = new MyClass(MyString(" World"))
  println(str1.myMethod(str2))
}
```