
// 5. Sign-up for the clone() contract.
// Each class calls "new" on itself FOR the client.
class Quest implements Prototype, Command {
  
  public String[] getHeader() {
    String[] header = {"ClientId", "Mpi", "Ssn"};
    return header;
  }
  
  public Object clone() {
    return new Quest();
  }
  
  public String getName() {
    return "Quest";
  }
  
  public void execute() {
    System.out.println( "return with Quest Headers" );   
    System.out.println( "return with Quest Processors\n" );
  }
}
