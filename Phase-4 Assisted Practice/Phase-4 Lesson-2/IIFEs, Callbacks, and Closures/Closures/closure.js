let app=(function ()
{
    let carId=12;
    let getId=function()
    {
        return carId;
    }
    return {
        getId:getId
    };
})();

console.log(app.getId());

// let app=(function ()
// {
//     let carId=12;
//     let getId=function()
//     {
//         return carId;
//     }
//     return getId;
// })();

// console.log(app());