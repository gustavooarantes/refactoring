# SOLID

## 1) Single Responsibility Principle:
- Each module should have one, and only one, reason to change. This means that a module should have but a single, well-defined responsibility/job.

## 2) Open-Closed Principle:
- Software artifacts should be open for extension, but closed for modification. In an architectural level, functionalities are separated based on how, why, and when they change, and then organized into a hierarchy of components, where the higher-level components in this hierarchy (the ones that will contain the business rules/core logic of the application) are protected from changes made to lower-level components, but can still be used by the latter.

## 3) Liskov Substitution Principle:
- If for each object *o1* of type *S* there is an object *o2* of type *T* such that for all programs P defined in terms of T, the behavior of P is unchanged when *o1* is substituted for *o2* then *S* is a subtype of *T*. In other words, objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.

## 4) Interface Segregation Principle:
- Clients should not be forced to depend on methods they don't use.

## 5) Dependency Inversion Principle:
- (a) high-level modules should not depend upon low-level modules. Both should depend upon abstractions. (b) abstractions should not depend upon details, but rather details should depend upon abstractions. This implies that stable software architectures avoid depending on volatile concretions, favoring the use of stable abstract interfaces. Some of the good coding practices that derive from this principle are: *don't refer to a volatile concrete class, don't derive from a volatile concrete class, don't override concrete functions, and never mention the name of anything concrete and volatile*.
