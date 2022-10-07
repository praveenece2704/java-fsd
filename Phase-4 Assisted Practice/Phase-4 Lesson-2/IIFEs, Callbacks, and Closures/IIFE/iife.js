//IIFE ---- > Immediately Invoked Function Expresion

// (function()
// {
//     console.log("in fucntion");
// })();

let app= (function ()
{
    let carId=123;
    console.log("in fucntion");
    return {};
})();

console.log(app);