```java
// interface I
    interface I {
        void foo();
    }

    // this class implements I
    class A implements I {
        public void foo() {}
    }

    // this class also implements I
    class B implements I {
        public void foo() {}
    }

    // C extends both - this won't compile
    // with error: class cannot extend multiple classes
    class C extends A, B {
        public void bar() {
            super.foo();
        }
    }

    // D extends one class and implements one interface
    // this is acceptable
    class D extends A implements I {
        public void bar() {
            super.foo();
        }
    }
```