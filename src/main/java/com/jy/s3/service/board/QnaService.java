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
	
	
	public int qnaReply(QnaVO qnaVO) throws Exception{
		//부모의 정보를 알아와야함
		QnaVO parent = qnaDAO.qnaSelect(qnaVO.getNum());
		
		 int result = qnaDAO.qnaReplyUpdate(parent);
		 qnaVO.setRef(parent.getRef());
		 qnaVO.setStep(parent.getStep()+1);
		 qnaVO.setDepth(parent.getDepth()+1);
		 result = qnaDAO.qnaReply(qnaVO);
		 return result;
	}
	
	
	public QnaVO qnaSelect(int num) throws Exception{
		return qnaDAO.qnaSelect(num);
	}
	
	public int qnaWrite(QnaVO qnaVO)throws Exception{
		return qnaDAO.qnaWrite(qnaVO);
	}
	
	public List<QnaVO> qnaList(Pager pager)throws Exception{
		//받은 데이터 계산
		//DB에 보내기 위해서 
		pager.makeRow();
		pager.makePage(qnaDAO.qnaCount(pager));
		return qnaDAO.qnaList(pager);
	}
	
	
}
