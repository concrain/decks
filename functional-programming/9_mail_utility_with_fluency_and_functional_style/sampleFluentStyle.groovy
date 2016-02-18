public class Mail {
  public void from(String fromAddress) { System.out.println("from..."); }
  public void to(String toAddress) { System.out.println("to..."); }
  public void subject(String theSubject) { System.out.println("subject..."); }
  public void body(String theBody) { System.out.println("body..."); }
  public static void send(codeBlock) { 
    Mail mail = new Mail()
    //def clonedCodeBlock = codeBlock.clone()
    //clonedCodeBlock.delegate = mail
    //clonedCodeBlock()
    mail.with codeBlock
    System.out.println("send..."); 
  }
}


Mail.send { 
  from 'build@agiledeveloper.com'
  to 'venkats@agiledeveloper.com'
  subject 'build notification'
  body 'about the build on...'
}