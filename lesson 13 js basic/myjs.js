 console.log("hello js external");

var num = 10;
num = "xxx";

var arr = [18, 'xxx', [1,2]];
arr.push(true);

var obj = {name: "zhou", age: 24}
 // obj.age打点引用耗性能，一般不用
 // 24
 // obj['age']
 // 24
 var keyVal = 'name';
 // obj[keyVal]
 // 'zhou'

 var str;
 console.log(str);
 //undefined
test;// js运行阶段：定义：初始扫描代码，检查有无错误，预编译：声明变量，这时候没有发生赋值，js不知道test对应的函数是什么，所以打印不出来!
test(10, 20);//hoisting,函数调用发生在执行阶段，这时候赋值已经发生，js知道test(10,20)上哪找函数，所以这么调用没问题
 function test(a, b)
 {
     console.log("test a+b:");
     console.log(a + b);
     return a + b;
 }

 var result =  test(1, 2);
 var reult = test();//undefined + undefined = NaN(not a number), undefined + any type = string

 //testFn();//报错：匿名函数不能hoisting，因为预编译
 var testFn = function()//匿名函数的定义方法：不指定函数名，只是赋给了一个变量声明变量的时候，声明在预编译，执行
 {
     console.log("anonymous function");
 }
 testFn();

 (function()
 {
     var a = 11;
     console.log("IIFE")
 })();//立即执行函数：第一个括号表示定义，第二个表示执行
 //立即执行函数相比匿名函数的优点：gc友好，变量作用域隔离好。尤其是一个html引用多个.js文件时，尤其优势，
 //像var a = 10;的定义方式，这个a是属于window的全局变量，如果多个.js都有叫a的变量，就会出现重复

 console.log(1 == "1");//true，两个=比较值
 console.log(1 === "1");//false，三个=号比较数据类型