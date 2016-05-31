
// 5. Sign-up for the clone() contract.
// Each class calls "new" on itself FOR the client.
class Walkin implements Prototype, Command {
  
  public String[] getHeader() {
    String[] header = {"ClientId", "Mpi"};
    return header;
  }
  
  public Object clone() {
    return new Walkin();
  }
  
  public String getName() {
    return "Walkin";
  }
  
  public void execute() {
    System.out.println( "return with Walkin Headers" );   
    System.out.println( "return with Walkin Processors\n" );
  }
}
