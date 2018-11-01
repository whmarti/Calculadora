package com.app.ws; 

import javax.ws.rs.*; 

@Path("Calc") //Calculadora
public class tarea5
{

	@GET //Calcular
	@Path("calc/{oper1}/{oper2}/{opera}")
    @Produces({"text/plain"}) 
    public String calculo(@PathParam("oper1") String oper1,@PathParam("oper2") String oper2,@PathParam("opera") String opera)
    {
       
	   int num2= Integer.valueOf(oper2);
	   int res=0;
	   
	    if(opera.equalsIgnoreCase("suma"))
        {
		  String[] numeros = oper1.split("\\,", -1);

	      for (String i : numeros) {  
            res += Integer.parseInt(i);             
          } 
		  res +=num2;
		}
	    else if(opera.equalsIgnoreCase("resta"))
        {
		int num1=Integer.valueOf(oper1);
		 res=num1-num2;
		}
		 else if(opera.equalsIgnoreCase("multiplicacion"))
        {
		 String[] numeros = oper1.split("\\,", -1);
		  res=1;
	      for (String i : numeros) {  
            res *= Integer.parseInt(i);             
          } 
		 res=res*num2;
		}
		 else if(opera.equalsIgnoreCase("division"))
        {
		int num1=Integer.valueOf(oper1);
		  if (num2 == 0)
                res = -1;
            res = Math.round(num1 / num2);
		}
	   return Integer.toString(res);
    }


	
}
