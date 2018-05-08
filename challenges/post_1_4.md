### Challenges from [Kleisli Categories](https://bartoszmilewski.com/2014/12/23/kleisli-categories/)

A function that is not defined for all possible values of its argument is called a partial function. It’s not really a function in the mathematical sense, so it doesn’t fit the standard categorical mold. It can, however, be represented by a function that returns an embellished type optional:

```c++
template<class A> class optional {
    bool _isValid;
    A    _value;
public:
    optional()    : _isValid(false) {}
    optional(A v) : _isValid(true), _value(v) {}
    bool isValid() const { return _isValid; }
    A value() const { return _value; }
};
```

As an example, here’s the implementation of the embellished function safe_root:

```c++
optional<double> safe_root(double x) {
    if (x >= 0) return optional<double>{sqrt(x)};
    else return optional<double>{};
}
```

Here’s the challenge:

Construct the Kleisli category for partial functions (define composition and identity).
Implement the embellished function `safe_reciprocal` that returns a valid reciprocal of its argument, if it’s different from zero.
Compose safe_root and `safe_reciprocal` to implement `safe_root_reciprocal` that calculates sqrt(1/x) whenever possible.

**My implementation is [here](https://github.com/P3trur0/cattheo/tree/master/src/main/scala/it/flatmap/cattheo/kleisli) in the Scala package `it.flatmap.cattheo.kleisli`**.


