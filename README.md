### What is this?

This is an example repository demonstrating issue described in [etorreborre/specs2#537](https://github.com/etorreborre/specs2/issues/537).

### How to see it?

```bash
./sbt test
cat target/test-reports/fi.pyppe.specs2.ExampleSpec.xml | grep foobar
```
### What will I see?

```
<testcase classname="fi.pyppe.specs2.ExampleSpec" name="1 foobar&gt;" time="0.011">
</testcase><testcase classname="fi.pyppe.specs2.ExampleSpec" name="1 foobar" time="0.008">
</testcase><testcase classname="fi.pyppe.specs2.ExampleSpec" name="This example should::given N1 FOOBAR yield n1 foobar" time="0.008">
```
