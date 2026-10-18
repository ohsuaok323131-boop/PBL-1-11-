import java.util.*;
import myClass.*;
import DataBase.LibDB;

/**
 * 도서관 관리 시스템에서 수행하게 되는 처리 작업을 정의한 클래스. 이용자 DB, 책 DB, 대출 DB를 가지고 파일 입력과 대출, 출력 작업 수행.
 *
 * @author (2025957111 김가희, !20253----- 오수아)
 * @version (2025.10.18)
 */
public class LibraryManagementSystem
{
    private LibDB<Book> bookDB;
    private HashMap<User,Book> loanDB;
    private LibDB<User> userDB;
    /**
     * LibraryManagementSystem 클래스의 객체 생성자. 이용자 DB, 책 DB, 대출 DB 생성.
     */
    public LibraryManagementSystem()
    {
        userDB=new LibDB<User>();
        bookDB=new LibDB<Book>();
        loanDB=new HashMap<User,Book>();
    }
    /**
     * 이용자 파일에서 데이터를 읽어서 이용자 DB를 생성.
     *
     * @param  userFile: 이용자 데이터 파일 경로
     * @return    이용자DB
     */
    public LibDB<User> setUserDB(String userFile)
    {
        return null;
    }
     /**
     * 책 파일에서 데이터를 읽어 책DB를 만듦.
     *
     * @param  bookFile: 책 데이터 파일 경로
     * @return     책DB
     */
    public LibDB<Book> setBookDB(String bookFile)
    {
        return null;
    }
    /**
     * 이용자와 책을 각각 DB에서 찾아서 대출DB에 등록. 이용자나 책을 찾지 못하면 등록하지 않음.
     *
     * @param  userID : 이용자 고유 식별 번호(학번)
     * @param  bookID : 책 등록 번호
     */
    public void borrowBook(String userID, String bookID)
    {
        User user = userDB.findElement(userID);
        Book book = bookDB.findElement(bookID);
        if (user != null && book != null)
        {
            loanDB.put(user, book);
        }
    }
    /**
     * 책DB 또는 이용자DB에 저장된 모든 요소를 출력.
     * 
     * @param  db : 출력할 데이터베이스
     */
    public <T extends DB_Element> void printDB(LibDB<T> db)
    {
        db.printAllElements();
    }
    /**
     * 대출DB에 저장된 대출 현황(이용자 ===> 대출한 책)을 출력.
     */
    public void printLoanList()
    {
        System.out.println("----- 대출 현황 -----");
        Set<User> keys = loanDB.keySet();
        Iterator<User> it = keys.iterator();
        while (it.hasNext())
        {
            User user = it.next();
            System.out.println(user + " ===> " + loanDB.get(user));
        }
        System.out.println("--------------------");
    }
}