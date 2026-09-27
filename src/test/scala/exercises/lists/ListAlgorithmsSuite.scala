package exercises.lists

import munit.FunSuite

class ListAlgorithmsSuite extends FunSuite:

  test("partition splits the list") {
    val (even, odd) = ListAlgorithms.partition(List(1, 2, 3, 4, 5, 6))(_ % 2 == 0)
    assertEquals(even, List(2, 4, 6))
    assertEquals(odd, List(1, 3, 5))
  }

  test("groupConsecutive groups runs") {
    assertEquals(
      ListAlgorithms.groupConsecutive(List(1, 1, 2, 1, 1)),
      List(List(1, 1), List(2), List(1, 1))
    )
    assertEquals(ListAlgorithms.groupConsecutive(Nil), Nil)
  }

  test("groupBy groups by key") {
    val grouped = ListAlgorithms.groupBy(List("apple", "ant", "banana", "bat"))(_.head)
    assertEquals(grouped('a'), List("apple", "ant"))
    assertEquals(grouped('b'), List("banana", "bat"))
  }

  test("find returns the first match") {
    assertEquals(ListAlgorithms.find(List(1, 2, 3, 4))(_ % 2 == 0), Some(2))
    assertEquals(ListAlgorithms.find(List(1, 3, 5))(_ % 2 == 0), None)
  }

  test("exists detects at least one") {
    assertEquals(ListAlgorithms.exists(List(1, 3, 5))(_ % 2 == 0), false)
    assertEquals(ListAlgorithms.exists(List(1, 2, 3))(_ % 2 == 0), true)
  }

  test("forall checks all") {
    assertEquals(ListAlgorithms.forall(List(2, 4, 6))(_ % 2 == 0), true)
    assertEquals(ListAlgorithms.forall(List(2, 4, 5))(_ % 2 == 0), false)
  }

  test("count counts matches") {
    assertEquals(ListAlgorithms.count(List(1, 2, 3, 4, 5, 6))(_ % 2 == 0), 3)
  }

  test("sliding produces windows") {
    assertEquals(
      ListAlgorithms.sliding(List(1, 2, 3, 4), 2),
      List(List(1, 2), List(2, 3), List(3, 4))
    )
    assertEquals(ListAlgorithms.sliding(List(1, 2, 3), 1), List(List(1), List(2), List(3)))
  }

  test("intersperse inserts a separator") {
    assertEquals(ListAlgorithms.intersperse(List("a", "b", "c"), "-"), List("a", "-", "b", "-", "c"))
    assertEquals(ListAlgorithms.intersperse(Nil, "-"), Nil)
    assertEquals(ListAlgorithms.intersperse(List("a"), "-"), List("a"))
  }

  test("dedupe removes consecutive duplicates") {
    assertEquals(ListAlgorithms.dedupe(List(1, 1, 2, 2, 3, 1)), List(1, 2, 3, 1))
  }

  test("reverseIter reverses") {
    assertEquals(ListAlgorithms.reverseIter(List(1, 2, 3, 4)), List(4, 3, 2, 1))
    assertEquals(ListAlgorithms.reverseIter(Nil), Nil)
  }

end ListAlgorithmsSuite