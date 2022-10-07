// let fn=function()
// {
//     console.log(this===window)
// }

// fn(); //true

let o={
    cardId:123,
    getId:function()
    {
        console.log(this);
        return this.cardId;
    }
};

console.log(o.getId()); //123