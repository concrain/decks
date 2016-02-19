public class Mail {
  public void from(String fromAddress) { System.out.println("from..."); }
  public void to(String toAddress) { System.out.println("to..."); }
  public void subject(String theSubject) { System.out.println("subject..."); }
  public void body(String theBody) { System.out.println("body..."); }
  public static void send(codeBlock) { 
    Mail mail = new Mail()
    codeBlock(mail)
    System.out.println("send..."); 
  }
}


Mail.send { mail ->
  mail.from('build@agiledeveloper.com')
  mail.to('venkats@agiledeveloper.com')
  mail.subject('build notification')
  mail.body('about the build on...')
}
