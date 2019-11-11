package com.jy.s3.service.board;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jy.s3.dao.board.QnaDAO;
import com.jy.s3.model.board.QnaVO;

@Service
public class QnaService {

	@Inject
	private QnaDAO qnaDAO;
	
	
	public List<QnaVO> QnaList(QnaVO qnaVO)throws Exception{
		return qnaDAO.qnaList(qnaVO);
	}
	
	
}
