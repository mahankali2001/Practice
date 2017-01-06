object abstractTypes extends App {
  abstract class Buffer {
    type T; val element: T
  }
  abstract class SeqBuffer {
    type T; val element: Seq[T]; def length = element.length
  }
  def newIntBuffer(el: Int) = new Buffer {
    type T = Int; val element = el
  }
  def newIntBuffer(el: Int*) = new SeqBuffer {
    type T = Int; val element = el
  }
  println(newIntBuffer(1).element)
  println(newIntBuffer(1, 2, 3).length)
  println(newIntBuffer(1, 2, 3).element(1) + newIntBuffer(1, 2, 3).element(0) + newIntBuffer(1, 2, 3).element(2))
}