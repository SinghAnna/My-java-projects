package Library_Management;

class Library{
     String[] books;
     int No_Of_Books;
     Library(){
         this.books = new String[100];
         this.No_Of_Books = 0;
     }

     void AddBook(String book){
           this.books[No_Of_Books++] = book;
         System.out.println(book + " Book has been Added Successfully! ");
     }

     void ShowAvailableBook(){
         System.out.println("Available Book In Library");
         for (String book : this.books){
              if (book == null){
                  continue;
              }
             System.out.println(" * "+ book);
         }
     }

     void IssueBook(String book){
         for(int i = 0; i < this.books.length; i++){
             if (this.books[i].equals(book)){
                 System.out.println("The book has been Issued :- "+ book);
                 this.books[i]=null;
                 return;
             }
         }
         System.out.println("This Book Don't Exist");
     }

     void returnBook(String book){
         AddBook(book);
     }

}
public class LibraryManagement_1 {
    public static void main(String[] args) {
        Library library = new Library();
        library.AddBook("Operating System");
        library.AddBook("C++");
        library.AddBook("Java");
        library.AddBook("Python");
        //library.ShowAvailableBook();
        library.AddBook("JavaScript");
        library.IssueBook("Java");
        library.ShowAvailableBook();
        
    }
}
