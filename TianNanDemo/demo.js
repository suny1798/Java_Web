// alert("欢迎来到天南大陆智能学习辅助系统！")



function show_alert(){
    alert("欢迎来到天南大陆智能学习辅助系统！")
}

// show_alert();


// function add(a, b){
//     return a + b;
// }


// console.log(add(5, 10));



// let User = {
//     name: "张三",
//     age: 20,
//     greet (){
//         alert("你好，" + this.name);
//     }
// }


// alert(User.name);
// User.greet();



// let Person ={
//     name: "李四",
//     age: 25,
//     gender: "男"
// }

// alert(JSON.stringify(Person));

// let Person2 = JSON.parse('{"name": "王五", "age": 30, "gender": "女"}');

// alert(Person2.name);
// alert(Person2.age);


//DOM操作示例

// let tittle = document.getElementById("tittle")

// alert(tittle.innerHTML);

//单个按钮
document.querySelector(".logout-link").addEventListener("click", function(){
    alert("登出成功！");
    }
);

//多个按钮
let btn = document.querySelectorAll(".btn-delete");

btn.forEach(function(item){
    item.addEventListener("click", function(){
        alert("删除成功！");
    })
});
let btn1 = document.querySelectorAll(".btn-edit");

btn1.forEach(function(item){
    item.addEventListener("click", function(){
        alert("编辑成功！");
    })
});


document.querySelector("#name").addEventListener("input", function(){
    console.log("输入了name！");
});
