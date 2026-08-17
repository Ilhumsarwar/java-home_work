
class library{
    
    static int totalIssued = 0;
    
    String books[];
    int issuedBooks[];

    void issueBook(int i){
        if(issuedBooks[i] == 0){
            issuedBooks[i] = 1;
            totalIssued++;
        }
        else{
            System.out.println("This book is issued");
        }
    }
}


public class library_static {
    public static void main(String[] args){
        Class seminarLibrary = new library();
        
    }
}