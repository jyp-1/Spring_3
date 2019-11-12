package com.jy.s3.dao.board;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.jy.s3.TestAbstractCase;
import com.jy.s3.model.board.QnaVO;

//@Run with를 계속 쓰는 것 보다는 TestAbstractCase를 상속 받아 사용
public class QnaDAOTest extends TestAbstractCase{

	@Inject
	private QnaDAO qnaDAO; 	//DAO가 잘 만들어지는 지 확인하기 (Inject 주입)
	
	//@Test												//DAO가 list가 0개가 아닌지를 확인
	public void qnaListTest() throws Exception{
		//List<QnaVO> ar = qnaDAO.qnaList();
		//assertNotEquals(0, ar.size());
	}
	
	//@Test
	 public void checkDAO(){			//DAO가 null인지 아닌지 확인 테스트
	  assertNotNull(qnaDAO);
	 }
	 
	 
	 
	 

}
