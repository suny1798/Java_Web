// alert("欢迎来到天南大陆智能学习辅助系统！")



function show_alert(){
    alert("欢迎来到天南大陆智能学习辅助系统！")
}



show_alert();


function add(a, b){
    return a + b;
}


console.log(add(5, 10));



let User = {
    name: "张三",
    age: 20,
    greet (){
        alert("你好，" + this.name);
    }
}


alert(User.name);
User.greet();