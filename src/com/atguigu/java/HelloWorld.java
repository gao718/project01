package com.atguigu.java;

import java.util.ArrayList;
/*
快捷键的使用
1   执行(run)     alt+r
2   提示补全(class Name Completion)     alt+/
3   单行注释        ctrl+/
4   多行注释        ctrl + shift + /
5   向下复制 一行     ctrl+alt+down
6   删除一行或选中行    ctrl +d
7   向下移动行       alt+down
8   向上移动行       alt+up
9   向下开始新的一行    shift+enter
10  向上开始新的一行    ctrl+shift+enter
11  如何查看源码      ctrl+选中指定的结构 或 ctrl+shift+t
12  万能解错/生成返回值变量    alt+enter
13  退回到前一个编辑界面      alt + enter
14  进入到下一个编辑界面      alt + right
15  查看继承关系      F4

16  格式化代码       ctrl+shift+F
17  提示方法参数类型    ctrl+alt+/
18  复制代码        ctrl + c
19  撤销            ctrl + z
20  反撤销          ctrl + y
21  剪切            ctrl + x
22  粘贴            ctrl + v
23  保存            ctrl + s
24  全选            ctrl + a
25  选中数行,整体往后移动     tab
26  选中数行,整体往前移动     ctrl + tab
27  查看类的结构:类似于eclipse的outlind       ctrl+o
28  重构:修改变量名与方法名(rename)        alt+shift+y
29  大写转小写/小写转大写(toggle case)    ctrl+shift+y
30  生成构造器/get/set/toString           alt+shift+s

31  查看文档说明      F2
32  收起所有的方法    alt+shift+c
33  打开所有方法      alt+shift+x
34  打开代码所在硬盘文件夹     ctrl+shift+x
35  生成try-catch等           alt+shift+z
36  局部变量抽取为成员变量     alt+shift+f
37  查找/替换(当前)   ctrl+f
38  查找(全局)        ctrl+h
39  查找文件          double Shift
40  查看类的继承结构图         ctrl+shift+u
41  查看方法的多层重写结构     ctrl+alt+h
42  添加到收藏(add to favorites)     ctrl+alt+f
43  抽取方法          alt+shift+m
44  打开最近修改的文件         ctrl+E
45  关闭当前打开的代码栏       ctrl+w
46  关闭打开的所有代码栏       ctrl+shift+w
47  快速搜索类中的错误         ctrl+shift+q
48  选择要粘贴的内容           ctrl+shift+v
49  查找方法在哪里被调用        ctrl+shift+h
*/
public class HelloWorld {

    private static int num;

    public HelloWorld(){

    }

    private static final int INITIAL_SIZE = 10;

    public static void main(String[] args){

        System.out.println("hello world!!!");
        System.out.println("hello world!!!");

        ArrayList list1 = new ArrayList();

       /* ArrayList list1 = null;

       synchronized ()*/

        Date date = new Date();

        list1.add(0,123);

//        method1();
    }

    public static void method(){

        num = 0;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
