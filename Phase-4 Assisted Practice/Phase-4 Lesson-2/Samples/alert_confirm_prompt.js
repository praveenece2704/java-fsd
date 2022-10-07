function msg()
{
    var verify=window.confirm("Do you agree the statement?");
    alert(verify);
    document.write(verify);
    document.getElementById("real").innerHTML=verify;
}

function msg1()
{
    var getvalue=window.prompt("Enter the name");
    document.write(getvalue);
}

function msg2()
{
    var a=parseInt(window.prompt("Enter a value"));
    var b=parseInt(window.prompt("Enter a value"));
    document.write(a+b);
}

function prime()
{
    var a=parseInt(window.prompt("Enter a value"));
    var flag=0;
    for(i=2;i<a/2;i++)
    {
        if(a%1==0)
        {
            document.write("prime number");
            flag=1;
            break;
        }
    }
    if(flag==0)
    {
        document.write("not a prime number");
    }
    
}