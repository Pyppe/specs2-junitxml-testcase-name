package fi.pyppe.specs2

import org.specs2.mutable.Specification

class ExampleSpec extends Specification {

  "This example" should {
    "given <N.1 FOOBAR> yield <n.1 foobar>" in {
      ok
    }
    "given N.1 FOOBAR yield n.1 foobar" in {
      ok
    }
    "given N1 FOOBAR yield n1 foobar" in {
      ok
    }
  }

}
