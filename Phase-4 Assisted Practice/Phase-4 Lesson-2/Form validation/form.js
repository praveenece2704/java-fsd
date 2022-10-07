function f1()
{
    let value=document.validate.user.value;
    console.log(value);
    if(value=="")
    {
        alert("name should not be empty");
    }
    else
    {
        document.write("welcome"+value);
    }
}