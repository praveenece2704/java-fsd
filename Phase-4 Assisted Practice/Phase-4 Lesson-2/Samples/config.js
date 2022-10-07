function msg(user,password)
{
    if(user!=null && password!=null)
    {
    
    document.write(user+" "+password);
    document.getElementById("real").innerHTML="Registered successfully, Welcome " +user+" ";
    }
    else
    {
    document.getElementById("real").innerHTML="Invalid details";
    }
}
