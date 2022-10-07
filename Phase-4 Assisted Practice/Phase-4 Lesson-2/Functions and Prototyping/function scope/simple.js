//Example 1
// function startCar(carId)
// {
//     let message="starting...";

// }
// startCar(123);
// console.log(message);//Error

//Example 2
// function startCar(cardId)
// {
//     let message="starting...";//function scope

//     //nested function
//     let startFn = function turnKey()
//     {
//         console.log(message);
//     };
//     startFn();
// }

// startCar(123);

//Example 3
function startCar( carId)
{
    let message="starting...";
    let startFn=function turnkey()
    {
        let message="override";

    };
    startFn;
    console.log(message);
}
startCar(123);