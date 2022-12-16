
package testbook;

/**
 *
 * @author renad
 */
public class TestBook {

    
    public static void main(String[] args) {
      BookStore jBookStore=new BookStore("King Jarir",30);
      Branch b1=new Branch("AlNafal","North Ring Road",011451,100);
      Branch b2=new Branch("Hayat Mall","King abdul Aziz Road",011275,100);
      Branch b3=new Branch("AlHamra","King Abduallah Road",011221,100);
     b1.addBook(new Book(341,"Sea of Strangers","Lang leav"));
      b1.addBook(new Book(509,"The Power of Now","Eckhart Tolle"));
     b2.addBook(new Book(570,"Thinking,Fast and Slow","Daniel Kahenman"));
     b2.addBook(new Book(659,"The Fault in our Stars","John Green"));
     b3.addBook(new Book(315,"The Luminaries","Eleanor Catton"));
     jBookStore.addBranch(b1);
     jBookStore.addBranch(b2);
     jBookStore.addBranch(b3);
     Branch[]arr=jBookStore.findUnfilledBranches();
     if(arr==null)
            System.out.println("there is no Branch found with book less than 2");
     else{
         System.out.println("All brunches in jBook Store that have less than 2 books:");
         for(int i=0;i<arr.length;i++)
             if(arr[i]!=null)
                 System.out.println(arr[i]);
     
     }
        System.out.println("Check where the book named\"The Fault in ouy stars\" is avaliable in  any branches:");
    if(jBookStore.searchForBook("The Fault in our Stars"))
            System.out.println("Found");
    else System.out.println("Not Found Sorry..");
    
         System.out.println("Check where the book named\"Reflexology\" is avaliable in  any branches:");
    if(jBookStore.searchForBook("Reflexology"))
            System.out.println("Found");
    else System.out.println("Not Found Sorry..");
    
        System.out.println("King Jarir inforation\n--------------------------------------------\n"+jBookStore);
    
            
    }
    
}
