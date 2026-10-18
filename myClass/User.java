package myClass;

/**
 * User: 도서관 이용자 객체 나타내는 클래스. DB_Element를 상속받고stID를 고유번호로 사용함.
 *
 * @author (2025320012박현서)
 * @version (2026.10.18)
 */
public class User extends DB_Element
{
    private String name;
    private Integer stID;

    /**
     * User 클래스의 객체 생성자. 이용자 정보를 저장함.
     * @param  stID 학번
     * @param  name 이름
     */
    public User(int stID, String name)
    {
        this.stID = stID;
        this.name = name;
    }

    /**
     * 학번을 문자열로 반환
     * @return    학번 문자열
     */
    public String getID()
    {
        return stID.toString();
    }


    /**
     * 이용자 정보를 "[학번] 이름" 형식의 문자열로 반환
     * @return    이용자 정보 문자열
     */
    public String toString()
    {
        return "[" + stID + "] " + name;
    }
}