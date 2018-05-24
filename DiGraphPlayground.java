package DiGraph_A5;

public class DiGraphPlayground {

  public static void main (String[] args) {
  
      // thorough testing is your responsibility
      //
      // you may wish to create methods like 
      //    -- print
      //    -- sort
      //    -- random fill
      //    -- etc.
      // in order to convince yourself your code is producing
      // the correct behavior
    exTest();
    }
  
    public static void exTest(){
      DiGraph d = new DiGraph();
      
      //Case3: (Add After Del 2)
      d.addNode(1,"f");
      d.addNode(2,"x");
      //d.numNodes==2;
      d.addEdge(0,"f","x",0,null);
      //numEdges==1;
      d.delNode("x"); //deleting node doesn't decrement numEdges
      //numNodes==1;
      //numEdges==0;
      d.addNode(2,"x");
      
      d.addEdge(0,"f","x",0,null);
      
      
      
      
      
      
//      d.addNode(1, "f");
//      d.addNode(3, "s");
//      d.addNode(7, "t");
//      d.addNode(0, "fo");
//      d.addNode(4, "fi");
//      d.addNode(6, "si");
//      d.addEdge(0, "f", "s", 0, null);
//      d.addEdge(1, "f", "si", 0, null);
//      d.addEdge(2, "s", "t", 0, null);
//      d.addEdge(3, "fo", "fi", 0, null);
//      d.addEdge(4, "fi", "si", 0, null);
//      d.addEdge(3, "fo", "fi", 0, null);
//      
//      d.addNode(10, "hello");
//      d.addNode(11, "bye");
//      d.addEdge(15, "hello", "bye", 0, null);
//      d.addEdge(20, "hello", "bye", 0, null);
      System.out.println("numEdges: "+d.numEdges());
      System.out.println("numNodes: "+d.numNodes());
      String[]topo=d.topoSort();
      printTOPO(topo);
      
    }
    public static void printTOPO(String[] toPrint){
      System.out.print("TOPO Sort: ");
      for (String string : toPrint) {
      System.out.print(string+" ");
    }
      System.out.println();
    }

}