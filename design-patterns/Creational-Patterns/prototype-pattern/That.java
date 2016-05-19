
// 5. Sign-up for the clone() contract.
// Each class calls "new" on itself FOR the client.
class That implements Prototype, Command {
    
  public Object clone() {
    return new That();
  }
  
  public String getName() {
    return "That";
  }
  
  public void execute() {
    System.out.println( "That: execute" );
  }
}
