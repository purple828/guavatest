1、Builder模式
当设计类的构造方法或静态工厂的参数超过几个时，Builder 模式是一个不错的选择，特别是如果许多参数是可选的或相同类型的。客户端代码比使用伸缩构造方法（telescoping constructors）更容易读写，并且 builder 比 JavaBeans 更安全。
格式一般是：
     StudentTo studentTo = new StudentTo.Builder().classesId(1).personId(2).build();
