package myClass;

/**
 * User: 도서관 이용자 객체 나타내는 클래스. DB_Element를 상속받고stID를 고유번호로 사용함.
 *
 * @author 20253----- 박현서
 * @version (2026.10.18)
 */
public class User extends DB_Element
{
    private String name;
    private Integer stID;

    /**
     * User 클래스의 객체 생성자. 이용자 정보를 저장함.
     * 
     */
    public User(int stID, String name)
    {
        this.stID = stID;
        this.name = name;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String getID()
    {
        return stID.toString();
    }


    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public String toString()
    {
        return "[" + stID + "] " + name;
    }
}