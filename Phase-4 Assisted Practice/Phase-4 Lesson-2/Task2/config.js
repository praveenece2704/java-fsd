function fun1()
{
    var v1=document.form1.id.value;
    var v2=document.form1.name.value;
    var v3=document.form1.pass.value;
    var v4=document.form1.gender.value;
    // var v5=document.form1.cricket.value;
    // var v6=document.form1.football.value;
    let v5 = document.querySelector("#cricket");
    var v7=document.form1.dob.value;
    var v8=document.form1.sub.value;
   
    var v9=document.form1.tarea.value;
    if(v1.length>=8 && v1!="")
    {
        if(v2.length>=8 && v2.length<=15 && v2!="")
        {
             if(v3.includes("@") && v3!="")
             {
                   if(v4!="")
                   {
                        // if(v5.checked)
                        // {
                            if(v7!="")
                            {
                                if(v8!="")
                                {
                                    if(v9!="")
                                    {
                                        document.write("Successfull");
                                    }
                                    else
                                    {
                                        alert("textarea should not be null");
                                    }
                                }
                                else
                                {
                                    alert("subject should not be null");
                                }
                            }
                            else
                            {
                                alert("Dob should not be null");
                            }
                        //}
                        // else
                        // {
                        //     alert("Hobby should not be null");
                        // }
                   }
                   else
                   {
                        alert("Select the gender");
                   }
             }
             else
             {
                alert("Password should contains @");
             }
        }
        else
        {
            alert("Name should be between 8 and 15 characters");
        }
       
    }
    else
    {
        alert("Userid must be greater than or equal to 8 characters");
    }
}