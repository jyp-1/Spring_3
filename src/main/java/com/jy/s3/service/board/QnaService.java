package com.jy.s3.service.board;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jy.s3.dao.board.QnaDAO;
import com.jy.s3.model.board.QnaVO;
import com.jy.s3.util.Pager;

@Service
public class QnaService {

	@Inject
	private QnaDAO qnaDAO;
	
	
	public List<QnaVO> qnaList(Pager pager)throws Exception{
		//받은 데이터 계산
		//DB에 보내기 위해서 
		pager.makeRow();
		pager.makePage(qnaDAO.qnaCount());
		return qnaDAO.qnaList(pager);
	}
	
	
}
