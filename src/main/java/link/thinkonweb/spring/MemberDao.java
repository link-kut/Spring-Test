package link.thinkonweb.spring;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MemberDao implements Service {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void add(MemberVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberVO> getList() {
		// TODO Auto-generated method stub
		String sql = "SELECT * from ipybookdb.Student";
		List<MemberVO> list = jdbcTemplate.query(sql, new RowMapper() {
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				MemberVO vo = new MemberVO();
				//vo.setNum(rs.getInt("num"));
				String idv = rs.getString("id");
				vo.setId(idv);
				vo.setName(rs.getString("name"));
				//vo.setLog(rs.getString("log"));
				return vo;
			}
		
		});
		return list;
	}

	@Override
	public MemberVO getSearch(int num) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
