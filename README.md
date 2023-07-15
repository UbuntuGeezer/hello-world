# hello-world

Repository of esoteric anomalies discovered in the re-learning curve of Linux world open-system coding in the 21st century.

About ME: A "has-been" systems analyst from Control Data's heyday in the
late 60's and 70's; left off software development about 20 years ago
after a brief stint as an embedded systems programmer using C++ and VB
on Windows system variants. The "coderman" took a break in the interim,
having been completely frustrated with Microsoft's stranglehold on the
industry and the exponetial growth of software that sucks. IMHO Borland
had the all-star of PC software development platforms. Their old C++ and
Object Oriented Programmming manuals were the best I ever saw in my
entire career, even to date. Their Paradox database system was the most
user-friendly and intuitively robust system I ever used. Phillipe Kahn
has my continued admiration.

About This. It has been a learning curve to get back into OOP with the newest developments in languages and tools, but I have
uncovered some interesting "behaviors" of the languages and classes as I claw my way back in. This repository is my way of sharing
coding samples that have been illuminating along the path of discovering 21st century application coding in the Linux world. It is
intended to be of interest to both novice and seasoned developer alike, as I tend to deviate from "normal" application development while
pursuing in-depth study of a new universe of knowledge. I welcome feedback and critiquing, but only after the initial volatile "I'm
right!" defense mechanism has completed processing. Hopefully, you can find some of my errant assumptions about how code SHOULD work amusing as you read my code.

Java-class-instantiation branch. The code in this branch demonstrates a 
quirk in JAVA scripts where if a given class instantiates a var1 of a
different class object <referenced-class> and invokes the constructor
new(), a separate var2 that is declared of the same <referenced class>
that invokes the new() constructor will destroy the original instance,
and both var1 and var2 will point to the same instance. However, if a
separate var2 is declared of type <referenced-class>, but does not
invoke the new() constructor, an assignment statement var2=var1 will
create a separate instance of the <referenced-class> object.
>>>>>>> 05815e34c68e73bfcd153a9280738f590fc252ad
