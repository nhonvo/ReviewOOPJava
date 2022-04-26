## <ins>Tóm tắt</ins> 
| _       | class    | interface | method     | biến       | package    | hằng       |
|---------|----------|-----------|------------|------------|------------|------------|
| loại từ | danh từ  | tính từ   | động từ    | chữ cái    | chữ cái    | chữ cái    |
| bắt đầu | chữ  Hoa (or thêm chữ 'I' đầu) | chữ  Hoa  | chữ thường(**)  | chữ thường(**) | chữ thường(*) | chữ in Hoa(***) |

`
(*) Nếu tên chứa nhiều từ, nó nên được phân tách bằng dấu chấm (.) Như java.util, java.lang.`

`(**) nếu nhiều chữ ắt đầu nó bằng một chữ cái viết thường theo sau là một chữ cái viết hoa`

`(***)Nó nên được viết bằng chữ in hoa như RED, YELLOW. Nếu tên chứa nhiều từ, nó phải được phân tách bằng dấu gạch dưới (_)`

==>  lớp viết hoa chữ cái đầu, kiểu dữ liệu viết thường

1. Quy ước đặt tên `Class` trong Java
Tên Class trong Java nên tuân theo những quy ước sau:

Nó nên bắt đầu bằng chữ in Hoa.
Nó phải là một <ins>__*danh từ*__</ins> như Màu sắc, Nút, Hệ thống, Chủ đề, v.v.
Sử dụng các từ thích hợp, thay vì các từ viết tắt.

Ví dụ:

```
public class Employee{  
  //code somthing...
}
```

2. Quy ước đặt tên `Interface` trong Java
Tên Interface trong Java nên tuân theo những quy ước sau:

Nó nên bắt đầu bằng chữ in Hoa.
Nó phải là một <ins>__*tính từ*__</ins> như Runnable, Remote, ActionListener. Sử dụng các từ thích hợp, thay vì các từ viết tắt.

Ví dụ:
```
interface Printable{
  //code somthing...
}  
```
Một quy ước đặt tên Interface cũng rất phổ biến đó là sử dụng chữ I ở đầu tên, như:
```
interface IPrintable{
  //code somthing... 
}
```
3. Quy ước đặt tên `Method` trong Java
Tên Method trong Java nên tuân theo những quy ước sau:

Nó nên bắt đầu bằng chữ thường.
Nó phải là một <ins>__*động từ*__</ins> như main(), print(), println().
Nếu tên chứa nhiều từ, hãy bắt đầu nó bằng một chữ cái __*viết thường theo sau là một chữ cái viết hoa*__ như actionPerformed().

Ví dụ:
```
class Employee{
  //method  
  void draw(){  
    //code somthing...
  }
}
```
4. Quy ước đặt tên `Biến` trong Java
Tên biến trong Java nên tuân theo những quy ước sau:

Nó nên bắt đầu bằng một chữ cái viết thường như id, name.
<ins>
Không nên bắt đầu bằng các ký tự đặc biệt như ký hiệu &, $ (đô la), _ (gạch dưới).
</ins>
Nếu tên chứa nhiều từ, hãy bắt đầu bằng chữ cái viết thường theo sau là chữ cái viết hoa như firstName, lastName.
Tránh sử dụng các biến một ký tự như x, y, z.

Ví dụ:
```
class Employee{
  //variable
  int id;
  //code somthing...
} 
```
5. Quy ước đặt tên `Package` trong Java
Tên package trong Java nên tuân theo những quy ước sau:

Nó nên là một __`chữ cái viết thường`__ như java, lang.
Nếu tên chứa nhiều từ, nó nên được phân tách bằng dấu chấm (.) Như java.util, java.lang.

Ví dụ:
```
package com.javatpoint; //package
class Employee{
  //code somthing...
}
```
6. Quy ước đặt tên `Hằng` trong Java
Tên constant (Hằng) trong Java nên tuân theo những quy ước sau:

Nó nên được viết bằng chữ in hoa như RED, YELLOW.
Nếu tên chứa nhiều từ, nó phải được phân tách bằng dấu gạch dưới (_), chẳng hạn như MAX_PRIORITY.
Nó có thể chứa các chữ số nhưng không phải là bắt đầu bằng chữ số.

Ví dụ:
```
class Employee{  
 //constant
 static final int MIN_AGE = 18;
 //code somthing...
}
```
___
7. Quy ước đặt tên __`camelCase`__ trong Java
Java tuân theo cú pháp camelCase để đặt tên class, interface, method và variable.

Nếu tên được kết hợp với hai từ, từ thứ hai luôn luôn sẽ bắt đầu bằng chữ in hoa như actionPerformed(), FirstName, ActionEvent, ActionListener, v.v.

Kết hợp với các quy ước ở bên trên để đạt chuẩn nhất.

