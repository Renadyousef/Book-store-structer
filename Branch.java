
package testbook;


public class Branch {
    private String name,location;
    private int phoneNum,numOfBooks;
      Book[]Booklist;
      public Branch(String n,String loc,int phone,int size){
          name=n;
          location=loc;
          phoneNum=phone;
          Booklist=new Book[size];
          numOfBooks=0;
                 
      }
      public Branch(Branch b){
          name=b.name;
          location=b.location;
          phoneNum=b.phoneNum;
         Booklist=new Book[b.Booklist.length];
         numOfBooks=0;
         for(int i=0;i<b.numOfBooks;i++)
             Booklist[numOfBooks++]=b.Booklist[i];//2 counters needed 1-1
          
      }
      public boolean addBook(Book bo){
          if(numOfBooks<Booklist.length){
            Booklist[numOfBooks++]=bo;  
            return true;}
          else return false;
          }
      public boolean findBook(String t){
        for(int i=0;i<numOfBooks;i++) 
            if(Booklist[i].getTitle().equalsIgnoreCase(t))
                return true;
            
            return false; 
      }

    @Override
    public String toString() {
        String str="Branch name"+name+"\n locaion:"+location+"\n phone number:"+phoneNum+"\n Number of books:"+numOfBooks;
       str+="\n All book info:\n";
       for(int i=0;i<numOfBooks;i++)
        str+=Booklist[i].toString();
       return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }

    public Book[] getBooklist() {
        return Booklist;
    }

    public void setBooklist(Book[] Booklist) {
        this.Booklist = Booklist;
    }
  
      
      }
    

