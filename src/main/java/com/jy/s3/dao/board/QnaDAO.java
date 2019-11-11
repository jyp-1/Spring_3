package com.jy.s3.dao.board;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jy.s3.model.board.QnaVO;

@Repository
public class QnaDAO {
	
	
	@Inject
	private SqlSession sqlSession;
	private static final String NAMESPACE="QnaMapper.";
	
	public List<QnaVO> qnaList (QnaVO qnaVO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"qnaList", qnaVO);
	}
	
	
	
	
	
}
