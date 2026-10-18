package DataBase;
import java.util.*;
import myClass.DB_Element;

/**
 * LibDB: 책DB, 이용자DB 모두를 표현하는 클래스
 *
 * @author (2025320012 박현서)
 * @version (2026.10.15)
 */
public class LibDB<T extends DB_Element>
{
    private ArrayList<T> db;

    /**
     * LibDB 클래스의 객체 생성자
     */
    public LibDB()
    {
        db = new ArrayList<T>();
    }

    /**
     * DB에 요소 1개 추가
     *
     * @param  element  추가할 요소
     */
    public void addElement(T element)
    {
        db.add(element);
    }

    /**
     * ID로 DB에 저장된 요소 검색
     * @param  id  찾을 요소의 ID
     * @return    찾은 요소, 없으면 null
     */
    public T findElement(String id)
    {
        Iterator<T> it = db.iterator();
        while (it.hasNext()){
            T element = it.next();
            if(element.getID().equals(id)){
                return element;
            }
        }
        return null;
    }

    /**
     * DB에 저장된 모든 요소 출력
     */
    public void printAllElements()
    {
        for(T element : db){
            System.out.println(element);
        }
    }
}