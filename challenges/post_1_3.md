### Challenges from [Categories Great and Small](https://bartoszmilewski.com/2014/12/05/categories-great-and-small/)

- [X] Generate a free category from:
    - A graph with one node and no edges
    - A graph with one node and one (directed) edge (hint: this edge can be composed with itself)
    - A graph with two nodes and a single arrow between them
    - A graph with a single node and 26 arrows marked with the letters of the alphabet: a, b, c … z.

<p align="center">
  <img src="https://github.com/P3trur0/cattheo/blob/master/img/challenge_3_1.png?raw=true" alt="Cattheo"/>
</p>

<p align="center">
  <img src="https://github.com/P3trur0/cattheo/blob/master/img/challenge_3_1_2.png?raw=true" alt="Cattheo"/>
</p>

- [X] What kind of order is this?
    - A set of sets with the inclusion relation: A is included in B if every element of A is also an element of B.

**I think it is a partial order because it should be: something like A is less than B, but also,if A is included in B and B is included in A, than they must be equals (_antismimmetry_).**

    - C++ types with the following subtyping relation: T1 is a subtype of T2 if a pointer to T1 can be passed to a function that expects a pointer to T2 without triggering a compilation error.

**It is a preorder because here if T1 is subtype of T2 it is not possible the other way around**.

- [X] Considering that Bool is a set of two values True and False, show that it forms two (set-theoretical) monoids with respect to, respectively, operator `&&` (AND) and `||` (OR).

  See my implementation [here](https://github.com/P3trur0/cattheo/tree/master/src/main/scala/it/flatmap/cattheo/monoids) in the Scala package `it.flatmap.cattheo.monoids`;

- [X] Represent the Bool monoid with the AND operator as a category: List the morphisms and their rules of composition.

<p align="center">
  <img src="https://github.com/P3trur0/cattheo/blob/master/img/challenge_3_4.png?raw=true" alt="Cattheo"/>
</p>

**The morphisms are `&&`, the identity is `true`. The composition as following holds: `&&(f, true)` results as f**.

- [X] Represent addition modulo 3 as a monoid category.

**Here the identity morphism, according to the following definition "_The identity morphism is the neutral element of this product._" should be 0. Then we'll have other two morphisms, namely 1 and 2.**.



