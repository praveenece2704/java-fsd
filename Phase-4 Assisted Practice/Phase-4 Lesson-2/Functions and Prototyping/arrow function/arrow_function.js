// let getId = () => 123;

// console.log(getId()); //123

// let getId = prefix => prefix +123;
// console.log(getId('ID: ')); //ID: 123

// let getId=(prefix,suffix)=> prefix + 123 + suffix;

// console.log(getId('ID: ','!'))// ID: 123!


let getId=(prefix,suffix)=> 
{
   return prefix + 123 + suffix;
}

console.log(getId('ID: ','!'))// ID: 123!
