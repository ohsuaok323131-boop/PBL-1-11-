import DataBase.LibDB;
import myClass.*;
 
/**
 * App : 도서관관리시스템을 실행하는 클래스. 파일에서 이용자DB와 책DB를 만들어 출력하고 대출 작업을 처리한 후에 대출 현황을 출력.
 *
 * @author (2025957111 김가희)
 * @version (2026.10.18)
 */

public class App
{
    /**
     * 프로그램의 시작점. 시퀀스 다이어그램의 작업을 순서대로 처리
     * 
     */
    public static void main(String[] args)
    {
        //LibraryManagementSystem 객체 생성
        LibraryManagementSystem libMS = new LibraryManagementSystem();
 
        //이용자 파일에서 이용자DB 생성
        LibDB<User> userDB = libMS.setUserDB("c:\\Temp\\UserData2025.txt");
 
        //이용자 목록 출력
        System.out.println("----- 이용자 목록 출력 -----");
        libMS.printDB(userDB);
        System.out.println();
 
        //책 파일에서 책DB 생성
        LibDB<Book> bookDB = libMS.setBookDB("c:\\Temp\\BookData2025.txt");
 
        //책 목록 출력
        System.out.println("----- 책 목록 출력 -----");
        libMS.printDB(bookDB);
        System.out.println();
 
        //대출 작업 3건 처리
        libMS.borrowBook("2025320001","B02");
        libMS.borrowBook("2024320002","B03");
        libMS.borrowBook("2023320003","B04");
 
        //대출 현황 출력
        libMS.printLoanList();
    }
}