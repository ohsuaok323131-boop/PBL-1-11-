package myClass;


/**
 * DB_Element: 데이터베이스(이용자DB, 책DB)에 저장되는 요소의 추상 클래스. Book, User는 DB_Element를 상속받아서 구현.
 *
 * @author (2025320012 박현서, 2025957111 김가희)
 * @version (최종 수정 - 2026.10.19)
 */
public abstract class DB_Element
{
    /**
     * 요소의 고유번호 문자열로 반환
     *
     * @return    요소의 고유번호(문자열)
     */
    public abstract String getID();
}