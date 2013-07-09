package link.thinkonweb.spring;
import java.util.List;
public interface Service {
	void add(MemberVO vo);
	List<MemberVO> getList();
	MemberVO getSearch(int num);

}
