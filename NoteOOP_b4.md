# Note java OOP _ **Lession 4 Generator-kết thừa**


- `_`__Overriding__`_` và `_`__Overloading__`_`
    - `_`__Overloading__`_`: Cho phép sửa code của một phương thức mà lớp con thừa kế từ lớp cha để lớp con phản ứng khác với lớp cha

    - `_`__Overriding__`_`: Cho phép sửa code của một hành vi mà lớp con thừa kế từ lớp cha để lớp con phản ứng khác với lớp cha
![over*](img/overiding-va-overloading-63739896651.9348.jpg)

| Overloading                                              | Overriding                                           |
|----------------------------------------------------------|------------------------------------------------------|
| Thể hiện đa hình tại compile time                        | Thể hiện đa hình tại runtime                         |
| Thêm hành vi cho phương thức                             | Thay đổi hành vi hiện tại của phương thức            |
| Có thể khác nhau về số lượng và kiểu dữ liệu của tham số | Số lượng và kiểu dữ liệu của tham số phải giống nhau |
| Xảy ra trong cùng một class                              | Xảy ra ở 2 class có quan hệ kế thừa                  |

- `_`__Tính đa hình__`_`:
    - Là đa hình thái, nhiều cách phản ứng khác nhau cho cùng một phương thức

    - Có được là nhờ kỹ thuật override phương thức giữa 2 lớp cha con.
    
- `_`__super__`_` : Truy cập các thuộc tính và hàm của lớp cha.

- `_`__final__`_` : không cho phép lớp con thay đổi một hàm nào đó của lớp cha

    - PS: Khi khai báo final một class: _Lớp đó không cho kế thừa_


- `_`*__lớp trong lớp__`_`*: Khi khai báo một lớp nằm trong một lớp khác
    - Lớp ngoài không được phép truy cập thẳng các thuộc tính và hàm của lớp trong. 
    - Lớp trong thì truy cập thẳng các thuộc tính và hàm của lớp ngoài.
    - Lớp ngoài muốn truy cập lớp trong thì phải định nghĩa một đối tượng lớp trong.

<style>
    .center {
        display: block;
        margin-left: auto;
        margin-right: auto;
}
</style>