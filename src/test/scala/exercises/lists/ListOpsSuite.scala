package exercises.lists

import munit.FunSuite

class ListOpsSuite extends FunSuite:

  test("map transforms each element") {
    assertEquals(ListOps.map(List(1, 2, 3))(_ * 2), List(2, 4, 6))
    assertEquals(ListOps.map(List.empty[Int])(_ * 2), Nil)
  }

  test("filter keeps matching elements") {
    assertEquals(ListOps.filter(List(1, 2, 3, 4))(_ % 2 == 0), List(2, 4))
    assertEquals(ListOps.filter(Nil)(_ => true), Nil)
  }

  test("foldLeft sums from the left") {
    assertEquals(ListOps.foldLeft(List(1, 2, 3, 4))(0)(_ + _), 10)
    assertEquals(ListOps.foldLeft(List.empty[Int])(10)(_ + _), 10)
  }

  test("foldRight works") {
    assertEquals(ListOps.foldRight(List(1, 2, 3))(0)(_ + _), 6)
    assertEquals(ListOps.foldRight(List.empty[Int])(0)(_ + _), 0)
  }

  test("flatten concatenates") {
    assertEquals(ListOps.flatten(List(List(1, 2), List(3), Nil, List(4))), List(1, 2, 3, 4))
  }

  test("flatMap works") {
    assertEquals(
      ListOps.flatMap(List(1, 2, 3))(n => List(n, n)),
      List(1, 1, 2, 2, 3, 3)
    )
  }

  test("sum works") {
    assertEquals(ListOps.sum(List(1, 2, 3, 4)), 10)
    assertEquals(ListOps.sum(Nil), 0)
  }

  test("product works") {
    assertEquals(ListOps.product(List(1, 2, 3, 4)), 24)
    assertEquals(ListOps.product(Nil), 1)
  }

  test("max returns the maximum or None") {
    assertEquals(ListOps.max(List(3, 1, 4, 1, 5)), Some(5))
    assertEquals(ListOps.max(Nil), None)
  }

end ListOpsSuite