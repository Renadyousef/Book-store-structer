
package testbook;


public class BookStore {
   private String name;
   private int numOfBranches;//counter=0 in counstructers after intlizing
   Branch[]branches;
   public BookStore(String n,int Size){
       name=n;
       branches=new Branch [Size];
       numOfBranches=0;
       
   }
   public boolean addBranch(Branch b){
       if(isFull())
       return false;
       else
       {
           branches[numOfBranches++]=new Branch(b);
           return true;}
     
       }
   public boolean isFull(){
   if(numOfBranches==branches.length)
       return true;
   else return false;
           
   }
   public Branch[] findUnfilledBranches(){
      Branch[] list=new Branch[numOfBranches] ;
      int j=0;//counter for the new array of how many array i have
      for(int i=0;i<numOfBranches;i++)
           if(branches[i].getNumOfBooks()<2)
          list[j++]=new Branch(branches[i]);//comp
      
      if(j==0) return null;
      return list;
   }
   public boolean searchForBook(String title){
       for(int i=0;i<numOfBranches;i++)
      if(branches[i].findBook(title))
          return true; 
       return false;
   }
   public String toString(){
     String str="Book Store Name:"+name+"\n number of branches:"+numOfBranches+"\n";
     for(int i=0;i<numOfBranches;i++)
     str+=branches[i].toString()+"\n";
     return str;
   }

    
}
