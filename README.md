# guavatest
## 常用基本工具类
+ 1 Objects.equal方法，JDK7引入的Objects类提供了一样的方法Objects.equals
    ```
    Objects.equal("a", "a"); // returns true
    Objects.equal(null, "a"); // returns false
    Objects.equal("a", null); // returns false
    Objects.equal(null, null); // returns true
    ```
    
+ 2 Guava Collections 都是以 create 或是 of 这样的静态方法来构造对象
