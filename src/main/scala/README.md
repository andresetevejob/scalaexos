# Copy method of case class scala
Scala FAQ: When you create a case class in Scala,
a copy method is generated for your case class. What does this copy method do?

In short, it lets you make a copy of an object, where a “copy” is different than a clone,
because with a copy you can change fields as desired during the copying process.
The copy method is important in functional programming, where values (val) are immutable.
