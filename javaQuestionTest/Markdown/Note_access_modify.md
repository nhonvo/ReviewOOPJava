<style>

.center {
    display: block;
    margin-left: auto;
    margin-right: auto;
    width: 450px;
    height: 100px
}
</style>

<image src="./img/aaa.png" class="center"></image>

            Access modify

```java
class a{
    public and protected and private and protected oke
}
// Cùng lớp 
----------------------------------------------------
package a;
class a{
    public and protected and protected oke
}
class b{
    public and protected and protected oke
}
b =  new a;
// Cùng gói, khác lớp
----------------------------------------------------
package a;
class a{
    public and protected and `friendly` oke
}
class b extends a{
    public and protected and `friendly` oke
}
b =  new a;
// Lớp con trong cùng gói với lớp cha
----------------------------------------------------
package a;
class a{
    public oke 
}
package b;
class b{
    public oke 
}
b =  new a; 
// khác lớp, khác gói
----------------------------------------------------
package a;
class a{
    public and protected oke
}
package b;
import a.*;

class b extends a{
    public and protected oke
}
b =  new a; 
// Lớp con khác gói với lớp cha
```

--- ------------------------------

| __java.lang__                                                                       | __java.util__                                                                                         |
|-------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| It Provides classes that are fundamental to the design of the Java programming      | It Provides the collections framework, formatted printing and scanning, array manipulation utilities, |
| language such as String, Math, and basic runtime support for threads and processes. | event model, date and time facilities, internationalization, and miscellaneous utility classes.       |


## java.lang.*
- chứa wapper viết hoa chữ cái đầu tiên, các phương thức
ví dụ: Boolean, Char, Byte, Short, Integer, Long, Float, Double, String, Object
    + java.lang.io: chứa các hàm nhập xuất

## java.until.*
- chứa các framework phương thức toán học, collection, class, interface, , ....

ví dụ: Math, System, arrayList...

## java.net.*
- chức các phương thức lập trình luồng: multiple threads, socket, ...

ví dụ: URL, URLConnection, Socket, ServerSocket, ...
