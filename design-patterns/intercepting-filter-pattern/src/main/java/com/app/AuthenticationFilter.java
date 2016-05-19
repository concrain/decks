package com.app;

public class AuthenticationFilter implements Filter {
	
   public void execute(String request){
      if(request == "HOME") {
          String rev = new StringBuilder(request).reverse().toString();
          System.out.println("Authenticated by filter: " + rev);
      } else {
          System.out.println("Request sent was invalid: " + request);
      }

   }
}