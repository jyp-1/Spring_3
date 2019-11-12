package com.jy.s3.dao.board;

import java.util.List;

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
	
	
	public int qnaCount() throws Exception{
		return sqlSession.selectOne(NAMESPACE+"qnaCount");
	}
	
	public List<QnaVO> qnaList (Pager pager)throws Exception{
		return sqlSession.selectList(NAMESPACE+"qnaList", pager);
	}
	
	
	
	
	
}
