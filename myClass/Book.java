package myClass;

/**
 * Book 책 객체를 나타내는 클래스
 *
 * @author (2025320012 박현서)
 * @version (2026.10.15)
 */
public class Book extends DB_Element
{
    private String bookID;
    private String title;
    private String author;
    private String publisher;
    private int year;

    /**
     * Book 클래스의 객체 생성자
     * @param  bookID 등록번호
     * @param  title 책 제몬
     * @param  author 저자명
     * @param  publisher 출판사명
     * @param  year 출판년도
     */
    public Book(String bookID, String title, String author, String publisher, int year)
    {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    /**
     * 등록번호 반환
     * @return    등록번호
     */
    public String getID()
    {
        return bookID;
    }

    /**
     * 책 정보를 "(등록번호) 제목, 저자, 출판사, 출판년도" 형식의 문자열로 반환
     * @return    책 정보 문자열
     */
    public String toString()
    {
        return "(" + bookID + ") " + title + ", " + author + ", " + publisher + ", " + year;
    }
}