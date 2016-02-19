package com.app;

public class DebugFilter implements Filter {
	
   public void execute(String request){
      if(request.length() == 4) {
          System.out.println("Request passed validation: " + request);
      } else {
          System.out.println("Request failed validation: " + request);
      }

   }
}