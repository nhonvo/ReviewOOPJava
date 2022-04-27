# Review_Object_oriented_programming_OOP_JAVA


</br>

Bài viết về chủ đề ôn tập cơ bản về OOP trong ngôn ngữ Java. Bài viết còn nhiều thiếu xót mong mọi người bỏ qua.

bài viết đính kèm code tham khảo lần lượt các chủ đề:

- Chương 1, 2, 3: Tổng hợp java
- Chương 5, 7: Trừu tượng
- Chương 6: Exception Hangding Ex
- Chương 8: Generic
  </br>

# Note java OOP \_ **Lession 1 - 2 -3 Java basic**

</br>

## <mark><b>Cách trình biên dịch Java hoạt động</b></mark>

- _**Class file**_:
  - Java class file có thể được dùng ở bất kỳ platform nào
  - Tính module hóa cao, class file dùng bộ nhớ tốt hơn file thực thi vì file thực thi cần một bước dịch nữa mới được CPU thực thi.
    <br><br>

<img src=".\img\cach-trinh-bien-dich-java-hoat-dong.jpg" alt="classfile" width="600"  class ="center"/>
</br>

- _**Cơ chế quản lý bộ nhớ của Java**_ gồm 2 heap, `static heap` và `dynamic heap`<br><br><br>

| ID                          | Static Heap                                     | Dynamic Heap                                        |
| --------------------------- | ----------------------------------------------- | --------------------------------------------------- |
| **1**                       | sử dụng để lưu trữ các biến cục bộ và gọi hàm   | sử dụng để lưu trữ các đối tượng trong Java         |
| **2** hết bộ nhớ JVM ném    | java.lang.StackOverFlowError                    | java.lang.OutOfMemoryError                          |
| **3** kích thước của bộ nhớ | ít hơn                                          | nhiều hơn                                           |
| **4**                       | bộ nhớ tĩnh chứa các class và code chương trình | bộ nhớ động chứa các đối tượng và code chương trình |

<img src=".\img\aa.png" alt="heap" width="600"  class ="center"/>

                Mô hình bộ nhớ tĩnh và bộ nhớ động

- <mark><b>JRE, JVM and JDK</b></mark>

  - _**JRE như là một java runtime environment**_, nó gồm có:
    - Java class loader chịu trách nhiệm nạp các classes và kết nối chúng với các thư viện Java (Java libraries)
    - _**Java virtual machine (JVM)**_ chịu trách nhiệm đảm bảo ứng dụng Java có đủ tài nguyên để chúng thực thi tốt trong thiết bị hoặc môi trường đám mây và là một phần mềm giả lập một máy tính, trong đó có tập lệnh định nghĩa các tác vụ java.exe

<image src="img\sth.jpg" class="center" width = "600">
                
                    Mô hình JRE và JVM

- _**JDK**_ cho phép các developer tạo các chương trình Java, trong đó các chương trình có thể được JVM và JRE xử lý và chạy.

<mark><b>Cách đặt tên (identifier) trong Java</b></mark>

    - Bắt đầu bằng ký tự, ký tự gạch dưới (underscore ‘_’ ) hay tự ‘$’
    - Sau ký tự đầu là các ký tự ký số hay ‘_’, ‘$’ , không dùng các ký tự khác như: khoảng trống, ký hiệu phép toán
    - Từ khóa và tên có tính chất case-sensitive (vd: Double, myData,...) viết hoa chữ cái đầu tiên hoặc thứ hai.

</br>

| \_      | class                         | interface | method           | biến             | package        | hằng               |
| ------- | ----------------------------- | --------- | ---------------- | ---------------- | -------------- | ------------------ |
| loại từ | danh từ                       | tính từ   | động từ          | chữ cái          | chữ cái        | chữ cái            |
| bắt đầu | chữ Hoa  | chữ Hoa(or thêm chữ 'I' đầu)   | chữ thường(\*\*) | chữ thường(\*\*) | chữ thường(\*) | chữ in Hoa(\*\*\*) |

` (*) Nếu tên chứa nhiều từ, nó nên được phân tách bằng dấu chấm (.) Như java.util, java.lang.`

`(**) nếu nhiều chữ ắt đầu nó bằng một chữ cái viết thường theo sau là một chữ cái viết hoa`

`(***)Nó nên được viết bằng chữ in hoa như RED, YELLOW. Nếu tên chứa nhiều từ, nó phải được phân tách bằng dấu gạch dưới (_)`

- <mark><b>Class & instance</b></mark>

  - class là một định nghĩa của các đối tượng cùng loại. Nói cách khác, một class là một bản thiết kế, bản mẫu, hoặc nguyên mẫu để định nghĩa và mô tả các `thuộc tính tĩnh (static attributes)` và các `hành vi động (dynamic behavior)` chung của tất cả các đối tượng cùng loại.

  - instance là một trường hợp cụ thể của một class. Tất cả các instance của một lớp có các thuộc tính tương tự như đã được mô tả trong class. Ví dụ: bạn có thể định nghĩa một class " Student " và tạo ba instance của " Student " cho " Peter ", " Paul " và " Pauline ".

- _Chi tiết_

  - Một class là một thực thể phần mềm được định nghĩa bởi lập trình viên, có tính trừu tượng, độc lập, có thể tái sử dụng bắt chước những thứ trong thực tế.
  - Một class là một chiếc hộp 3 ngăn chứa `tên (name)`, các `biến (variables)` và các `phương thức (methods)`.

  - Một class đóng gói các **cấu trúc dữ liệu (trong các biến)** và các **thuật toán (trong các phương thức)**. Các giá trị của các biến tạo thành `trạng thái (state)` của class. Các phương thức tạo thành các `hành vi (behaviors)` của class.
  - Một instance là một trường hợp cụ thế của class.

- <mark><b>Static and this</b></mark>

  - _**this**_: từ khóa `this` trong java là đối tượng đang thao tác
  - _**static**_ :
    - Khi bạn khai báo một biến là static, thì biến đó được gọi là biến tĩnh, hay biến static.
    - **_tiết kiệm bộ nhớ_** lấy bộ nhớ chỉ một lần trong Class Area tại thời gian tải lớp đó.
    - **_được dùng trong_** các biến, các phương thức, các khối, các lớp lồng nhau(nested class). Từ khóa static thuộc về lớp chứ không thuộc về instance(thể hiện) của lớp.
    - **_hạn chế_**
      - Phương thức static không thể sử dụng biến non-static hoặc gọi trực tiếp phương thức non-static.
      - Từ khóa this và super không thể được sử dụng trong ngữ cảnh static.

- <mark><b>Method and Constructor</b></mark>

  - _**Constructor**_: là một dạng đặc biệt của phương thức được sử dụng để khởi tạo các đối tượng.
    - Java Constructor được gọi tại thời điểm tạo đối tượng. Nó khởi tạo các giá trị để cung cấp dữ liệu cho các đối tượng(việc thường làm)
      - Constructor mặc định (không có tham số truyền vào)
      - Constructor tham số
      - Constructor copy
  - _**Method**_ là phương thức riêng của 1 đối tượng riêng biệt

<mark> _**Sự khác nhau giữa constructor và phương thức trong java**_ </mark>
</br>
| `Constructor` | `Phương thức` |
|------------------------------------------------------------------------------------|-------------------------------------------------------------------|
| Constructor được sử dụng để khởi tạo trạng thái của một đối tượng. | Phương thức được sử dụng để thể hiện hành động của một đối tượng. |
| Constructor không có kiểu trả về. | Phương thức có kiểu trả về. |
| Constructor được gọi ngầm. | Phương thức được gọi tường minh. |
| Trình biên dịch Java tạo ra constructor mặc định nếu bạn không có constructor nào. | Phương thức không được tạo ra bởi trình biên dịch Java. |
| Tên của constructor phải giống tên lớp. | Tên phương thức có thể giống hoặc khác tên lớp. |

</br>

<mark> _**Lỗi biên dịch và lỗi thực thi**_</mark>

- __`NoSuchMethodException`__: Lỗi do viết sai tên phương thức (hành vi) 
- __`IOexception`__: Lỗi nhập xuất 
- __`IllegalAccessException`__: Lỗi do truy cập class bị cấm 
- __`ArithmeticException`__: Lỗi do thực thi 1 phép toán
- __`SecurityException`__: Lỗi do truy cập bị cấm
- __`NullPointerException`__: Lỗi do truy xuất phương thức mà chưa khởi tạo 
- __`ArrayIndexOutOfBoundsException`__: Lỗi do truy cập ngoài tầm của mảng

| `Compile-Time Errors`                                                | `Runtime-Errors`                                                                       |
| -------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| These are the syntax errors which are detected by the compiler.      | These are the errors which are not detected by the compiler and produce wrong results. |
| They prevent the code from running as it detects some syntax errors. | They prevent the code from complete execution.                                         |
| It includes syntax errors such as missing of semicolon(;),           | It includes errors such as dividing a number by zero,                                  |
| misspelling of keywords and identifiers etc.                         | finding square root of a negative number etc.                                          |

</br>

<image src="./img/Group21-660x330.jpg" class ="center"></image>

                    Tổng hợp các loại lỗi

<mark> _**Các thư viện phổ biến trong Java**_</mark>

| **java.lang**                                                                       | **java.util**                                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| It Provides classes that are fundamental to the design of the Java programming      | It Provides the collections framework, formatted printing and scanning, array manipulation utilities, |
| language such as String, Math, and basic runtime support for threads and processes. | event model, date and time facilities, internationalization, and miscellaneous utility classes.       |

## **java.lang.\***

- chứa wapper viết hoa chữ cái đầu tiên, các phương thức
  ví dụ: Boolean, Char, Byte, Short, Integer, Long, Float, Double, String, Object + java.lang.io: chứa các hàm nhập xuất

## **java.until.\***

- chứa các framework phương thức toán học, collection, class, interface, , ....

ví dụ: Math, System, arrayList...

## **java.net.\***

- chức các phương thức lập trình luồng: multiple threads, socket, ...

ví dụ: URL, URLConnection, Socket, ServerSocket, ...

<mark>_**Access modify**_</mark>

<image src="./img/aaa.png" class="center"></image>

            Access modify

</br>

# Note java OOP \_ **Lession 4 Generator-kết thừa**

# Note java OOP \_ **Lession 5 Polymorphism-đa hình**

- `_`**Overriding**`_` và `_`**Overloading**`_` - `_`**Overloading**`_`: Cho phép sửa code của một phương thức mà lớp con thừa kế từ lớp cha để lớp con phản ứng khác với lớp cha

      - `_`__Overriding__`_`: Cho phép sửa code của một hành vi mà lớp con thừa kế từ lớp cha để lớp con phản ứng khác với lớp cha

  ![over*](img/overiding-va-overloading-63739896651.9348.jpg)

| Overloading                                              | Overriding                                           |
| -------------------------------------------------------- | ---------------------------------------------------- |
| Thể hiện đa hình tại compile time                        | Thể hiện đa hình tại runtime                         |
| Thêm hành vi cho phương thức                             | Thay đổi hành vi hiện tại của phương thức            |
| Có thể khác nhau về số lượng và kiểu dữ liệu của tham số | Số lượng và kiểu dữ liệu của tham số phải giống nhau |
| Xảy ra trong cùng một class                              | Xảy ra ở 2 class có quan hệ kế thừa                  |

- `_`**Tính đa hình**`_`:

  - Là đa hình thái, nhiều cách phản ứng khác nhau cho cùng một phương thức

  - Có được là nhờ kỹ thuật override phương thức giữa 2 lớp cha con.

- `_`**super**`_` : Truy cập các thuộc tính và hàm của lớp cha.

- `_`**final**`_` : không cho phép lớp con thay đổi một hàm nào đó của lớp cha

  - PS: Khi khai báo final một class: _Lớp đó không cho kế thừa_

- `_`_**lớp trong lớp**`_`\_: Khi khai báo một lớp nằm trong một lớp khác
  - Lớp ngoài không được phép truy cập thẳng các thuộc tính và hàm của lớp trong.
  - Lớp trong thì truy cập thẳng các thuộc tính và hàm của lớp ngoài.
  - Lớp ngoài muốn truy cập lớp trong thì phải định nghĩa một đối tượng lớp trong.

</br>

# Note java OOP \_ **Lession 6 EXCEPTION**

- **`NoSuchMethodException`**: Lỗi do viết sai tên phương thức (hành vi)
- **`IOexception`**: Lỗi nhập xuất
- **`IllegalAccessException`**: Lỗi do truy cập class bị cấm
- **`ArithmeticException`**: Lỗi do thực thi 1 phép toán
- **`SecurityException`**: Lỗi do truy cập bị cấm
- **`NullPointerException`**: Lỗi do truy xuất phương thức mà chưa khởi tạo
- **`ArrayIndexOutOfBoundsException`**: Lỗi do truy cập ngoài tầm của mảng

# Note java OOP \_ **Lession 7 Interface**

Interface: Là một lớp hoàn toàn trừu tượng
từ khóa: implements

<style>
    .center {
        /*  */
        display: block;
        margin-left: auto;
        margin-right: auto;
}
</style>

# Author

- Võ Thương Trường Nhơn
- Lê Hiếu Nghĩa