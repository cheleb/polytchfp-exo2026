package exercises.lists

import munit.FunSuite

class ListBasicsSuite extends FunSuite:

  test("head returns first or None") {
    assertEquals(ListBasics.head(List(1, 2, 3)), Some(1))
    assertEquals(ListBasics.head(Nil), None)
  }

  test("tail returns rest or None") {
    assertEquals(ListBasics.tail(List(1, 2, 3)), Some(List(2, 3)))
    assertEquals(ListBasics.tail(Nil), None)
  }

  test("last returns last or None") {
    assertEquals(ListBasics.last(List(1, 2, 3)), Some(3))
    assertEquals(ListBasics.last(Nil), None)
  }

  test("init removes the first element") {
    assertEquals(ListBasics.init(List(1, 2, 3)), List(2, 3))
    assertEquals(ListBasics.init(Nil), Nil)
  }

  test("isEmpty detects empty") {
    assertEquals(ListBasics.isEmpty(Nil), true)
    assertEquals(ListBasics.isEmpty(List(1)), false)
  }

  test("reverse reverses") {
    assertEquals(ListBasics.reverse(List(1, 2, 3)), List(3, 2, 1))
    assertEquals(ListBasics.reverse(Nil), Nil)
  }

  test("zip stops at the shorter list") {
    assertEquals(
      ListBasics.zip(List(1, 2, 3), List("a", "b")),
      List((1, "a"), (2, "b"))
    )
  }

  test("take and drop work") {
    assertEquals(ListBasics.take(List(1, 2, 3, 4), 2), List(1, 2))
    assertEquals(ListBasics.drop(List(1, 2, 3, 4), 2), List(3, 4))
    assertEquals(ListBasics.take(List(1, 2), 10), List(1, 2))
  }

  test("get returns element or None") {
    assertEquals(ListBasics.get(List(10, 20, 30), 1), Some(20))
    assertEquals(ListBasics.get(List(10, 20, 30), 5), None)
  }

end ListBasicsSuite