
// 5. Sign-up for the clone() contract.
// Each class calls "new" on itself FOR the client.
class Standard implements Prototype, Command {
  
  public String[] getHeader() {
    String[] header = {"ClientId", "Mpi", "UniqueId", "Ssn"};
    return header;
  }
    
  public Object clone() {
    return new Standard();
  }
  
  public String getName() {
    return "Standard";
  }
  
  public void execute() {
    System.out.println( "return with Standard Headers" );   
    System.out.println( "return with Standard Processors\n" );
  }
}
