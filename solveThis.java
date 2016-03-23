import java.util.ArrayList;


public class solveThis {
  private ArrayList<Integer> theCircle;

  
  public solveThis(int numofPeople){
    this.theCircle = new ArrayList<Integer>(numofPeople);
    for(int i=1; i <= numofPeople; i++){
      theCircle.add(i);
    }
    this.execute(theCircle);

  }
  
  private void execute(ArrayList<Integer> listOfPeople ){
    int i=1;
    while(listOfPeople.size() > 1){
      if(i >= listOfPeople.size()){
        i= i % listOfPeople.size();
      }
     listOfPeople.remove(i);
     i++;
    }
  }


  public void printAnswer(){
    System.out.println(theCircle.get(0) +" remained");
  }
  
 
  public static void main(String[] args) {
    solveThis b = new solveThis(20);
    b.printAnswer();
    }
    
  
}
