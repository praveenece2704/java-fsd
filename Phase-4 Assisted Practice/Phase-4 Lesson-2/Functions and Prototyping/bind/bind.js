let o=
{
    carId:123,
    getId:function()
    {
        return this.carId;
    }
};

let newCar={carId:456};
let newFn=o.getId.bind(o);
console.log(newFn());// 123
let newFun=o.getId.bind(newCar);
console.log(newFun());//456