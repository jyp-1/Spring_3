package com.jy.s3.dao.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jy.s3.model.board.QnaVO;
import com.jy.s3.util.Pager;

@Repository
public class QnaDAO {
	
	//DAO의 역할 - DB연결 및 데이터를 쿼리문으로 작성 하는 등 역할 
	@Inject
	private SqlSession sqlSession;		//DB 연결,sql문 불러오기
	
	private static final String NAMESPACE="qnaMapper."; 
	
	
	
	public int qnaReplyUpdate(QnaVO qnaVO) throws Exception{
		return sqlSession.update(NAMESPACE+"qnaReplyUpdate", qnaVO);
	}
	
	
	public int qnaReply(QnaVO qnaVO)throws Exception {
		return sqlSession.insert(NAMESPACE+"qnaReply", qnaVO);
	}
		
	public QnaVO qnaSelect(int num) throws Exception{
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("num", num);
		return sqlSession.selectOne(NAMESPACE+"qnaSelect", map);
	}
	
	public int qnaWrite(QnaVO qnaVO)throws Exception {
		return sqlSession.insert(NAMESPACE+"qnaWrite",qnaVO);
	}
	
	public int qnaCount(Pager pager) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"qnaCount",pager);
	}
	
	public List<QnaVO> qnaList (Pager pager)throws Exception{
		return sqlSession.selectList(NAMESPACE+"qnaList", pager);
	}
	
	
	
	
	
}
