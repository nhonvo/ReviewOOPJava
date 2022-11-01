# Note java OOP _ **Lession 1 - 2 -3 Java basic**


- <mark><b>Cách trình biên dịch Java hoạt động</b></mark>

- *__Class file__*: 
    - Java class file có thể được dùng ở bất kỳ platform nào
    - Tính module hóa cao,  class file dùng bộ nhớ tốt hơn file thực thi vì file thực thi cần một bước dịch nữa mới được CPU thực thi.
    <br><br>
    
<img src=".\img\cach-trinh-bien-dich-java-hoat-dong.jpg" alt="classfile" width="600"  class ="center"/>
</br>

- *__Cơ chế quản lý bộ nhớ của Java__* gồm 2 heap, `static heap` và ` dynamic heap `<br><br><br>

| ID                          | Static Heap                                     | Dynamic Heap                                        |
|-----------------------------|-------------------------------------------------|-----------------------------------------------------|
| **1**                       | sử dụng để lưu trữ các biến cục bộ và gọi hàm   | sử dụng để lưu trữ các đối tượng trong Java         |
| **2** hết bộ nhớ JVM ném    | java.lang.StackOverFlowError                    | java.lang.OutOfMemoryError                          |
| **3** kích thước của bộ nhớ | ít hơn                                          | nhiều hơn                                           |
| **4**                       | bộ nhớ tĩnh chứa các class và code chương trình | bộ nhớ động chứa các đối tượng và code chương trình |

<img src=".\img\aa.png" alt="heap" width="600"  class ="center"/>

                Mô hình bộ nhớ tĩnh và bộ nhớ động

- <mark><b>JRE, JVM and JDK</b></mark>


    - *__JRE như là một runtime environment__*, nó gồm có:
        - Java class loader chịu trách nhiệm nạp các classes và kết nối chúng với các thư viện Java (Java libraries)
        - *__Java virtual machine (JVM)__* chịu trách nhiệm đảm bảo ứng dụng Java có đủ tài nguyên để chúng thực thi tốt trong thiết bị hoặc môi trường đám mây và là một phần mềm giả lập một máy tính, trong đó có tập lệnh định nghĩa các tác vụ java.exe 

<image src="img\sth.jpg" class="center" width = "600">
                
                    Mô hình JRE và JVM 


- *__JDK__* cho phép các developer tạo các chương trình Java, trong đó các chương trình có thể được JVM và JRE xử lý và chạy.


<mark><b>Cách đặt tên (identifier) trong Java</b></mark>

    - Bắt đầu bằng ký tự, ký tự gạch dưới (underscore ‘_’ ) hay tự ‘$’ 
    - Sau ký tự đầu là các ký tự ký số hay ‘_’, ‘$’ , không dùng các ký tự khác như: khoảng trống, ký hiệu phép toán 
    - Từ khóa và tên có tính chất case-sensitive (vd: Double, myData,...) viết hoa chữ cái đầu tiên hoặc thứ hai.
</br>

| _       | class    | interface | method     | biến       | package    | hằng       |
|---------|----------|-----------|------------|------------|------------|------------|
| loại từ | danh từ  | tính từ   | động từ    | chữ cái    | chữ cái    | chữ cái    |
| bắt đầu | chữ  Hoa (or thêm chữ 'I' đầu) | chữ  Hoa  | chữ thường(**)  | chữ thường(**) | chữ thường(*) | chữ in Hoa(***) |

`
(*) Nếu tên chứa nhiều từ, nó nên được phân tách bằng dấu chấm (.) Như java.util, java.lang.`

`(**) nếu nhiều chữ ắt đầu nó bằng một chữ cái viết thường theo sau là một chữ cái viết hoa`

`(***)Nó nên được viết bằng chữ in hoa như RED, YELLOW. Nếu tên chứa nhiều từ, nó phải được phân tách bằng dấu gạch dưới (_)`


- <mark><b>Class & instance</b></mark>

    - class là một định nghĩa của các đối tượng cùng loại. Nói cách khác, một class là một bản thiết kế, bản mẫu, hoặc nguyên mẫu để định nghĩa và mô tả các `thuộc tính tĩnh (static attributes)` và các `hành vi động (dynamic behavior)` chung của tất cả các đối tượng cùng loại.
    
    - instance là một trường hợp cụ thể của một class. Tất cả các instance của một lớp có các thuộc tính tương tự như đã được mô tả trong class. Ví dụ: bạn có thể định nghĩa một class " Student " và tạo ba instance của " Student " cho " Peter ", " Paul " và " Pauline ".

- *Chi tiết*
    - Một class là một thực thể phần mềm được định nghĩa bởi lập trình viên, có tính trừu tượng, độc lập, có thể tái sử dụng bắt chước những thứ trong thực tế.
    - Một class là một chiếc hộp 3 ngăn chứa `tên (name)`, các `biến (variables)` và các `phương thức (methods)`.

    - Một class đóng gói các __cấu trúc dữ liệu (trong các biến)__ và các __thuật toán (trong các phương thức)__. Các giá trị của các biến tạo thành `trạng thái (state)` của class. Các phương thức tạo thành các `hành vi (behaviors)` của class.
    - Một instance là một trường hợp cụ thế của class.

- <mark><b>Static and this</b></mark>

    - *__this__*:  từ khóa  `this` trong java là đối tượng đang thao tác    
    - *__static__* : 
        - Khi bạn khai báo một biến là static, thì biến đó được gọi là biến tĩnh, hay biến static.
        - ***tiết kiệm bộ nhớ*** lấy bộ nhớ chỉ một lần trong Class Area tại thời gian tải lớp đó.
        - ***được dùng trong*** các biến, các phương thức, các khối, các lớp lồng nhau(nested class). Từ khóa static thuộc về lớp chứ không thuộc về instance(thể hiện) của lớp.
        - ***hạn chế***
            - Phương thức static không thể sử dụng biến non-static hoặc gọi trực tiếp phương thức non-static.
            - Từ khóa this và super không thể được sử dụng trong ngữ cảnh static.

- <mark><b>Method and Constructor</b></mark>

    - *__Constructor__*: là một dạng đặc biệt của phương thức được sử dụng để khởi tạo các đối tượng.
        - Java Constructor được gọi tại thời điểm tạo đối tượng. Nó khởi tạo các giá trị để cung cấp dữ liệu cho các đối tượng(việc thường làm)
            * Constructor mặc định (không có tham số truyền vào)
            * Constructor tham số
            * Constructor copy
    - *__Method__* là phương thức riêng của 1 đối tượng riêng biệt



<mark> *__Sự khác nhau giữa constructor và phương thức trong java__* </mark> 
</br>
| `Constructor`                                                                      | `Phương thức`                                                     |
|------------------------------------------------------------------------------------|-------------------------------------------------------------------|
| Constructor được sử dụng để khởi tạo trạng thái của một đối tượng.                 | Phương thức được sử dụng để thể hiện hành động của một đối tượng. |
| Constructor không có kiểu trả về.                                                  | Phương thức có kiểu trả về.                                       |
| Constructor được gọi ngầm.                                                         | Phương thức được gọi tường minh.                                  |
| Trình biên dịch Java tạo ra constructor mặc định nếu bạn không có constructor nào. | Phương thức không được tạo ra bởi trình biên dịch Java.           |
| Tên của constructor phải giống tên lớp.                                            | Tên phương thức có thể giống hoặc khác tên lớp.                   |

</br>

<mark> *__Lỗi biên dịch và lỗi thực thi__*</mark>

| `Compile-Time Errors`                                                | `Runtime-Errors`                                                                       |
|----------------------------------------------------------------------|----------------------------------------------------------------------------------------|
| These are the syntax errors which are detected by the compiler.      | These are the errors which are not detected by the compiler and produce wrong results. |
| They prevent the code from running as it detects some syntax errors. | They prevent the code from complete execution.                                         |
| It includes syntax errors such as missing of semicolon(;),           | It includes errors such as dividing a number by zero,                                  |
| misspelling of keywords and identifiers etc.                         | finding square root of a negative number etc.                                          |
</br>

<image src="./img/Group21-660x330.jpg" class ="center"></image>

                    Tổng hợp các loại lỗi

<mark> *__Các thư viện phổ biến trong Java__*</mark>

| __java.lang__                                                                       | __java.util__                                                                                         |
|-------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| It Provides classes that are fundamental to the design of the Java programming      | It Provides the collections framework, formatted printing and scanning, array manipulation utilities, |
| language such as String, Math, and basic runtime support for threads and processes. | event model, date and time facilities, internationalization, and miscellaneous utility classes.       |


## __java.lang.*__
- chứa wapper viết hoa chữ cái đầu tiên, các phương thức
ví dụ: Boolean, Char, Byte, Short, Integer, Long, Float, Double, String, Object
    + java.lang.io: chứa các hàm nhập xuất

## __java.until.*__
- chứa các framework phương thức toán học, collection, class, interface, , ....

ví dụ: Math, System, arrayList...

## __java.net.*__
- chức các phương thức lập trình luồng: multiple threads, socket, ...

ví dụ: URL, URLConnection, Socket, ServerSocket, ...

<mark>*__Access modify__*</mark>

<image src="./img/aaa.png" class="center"></image>

            Access modify 


<style>
    .center {
        display: block;
        margin-left: auto;
        margin-right: auto;
}
</style>

