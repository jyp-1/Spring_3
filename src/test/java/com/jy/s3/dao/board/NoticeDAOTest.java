package com.jy.s3.dao.board;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.jy.s3.TestAbstractCase;
import com.jy.s3.model.board.NoticeVO;
import com.jy.s3.util.Pager;


public class NoticeDAOTest extends TestAbstractCase{

	@Inject
	private NoticeDAO noticeDAO;
	
	//@Test
	public void checkDAO() throws Exception{
		assertNotNull(noticeDAO);
	}
	
	@Test
	public void noticeCountTest(Pager pager) throws Exception{
		 int count =noticeDAO.noticeCount(pager);
		 assertEquals(95, count);
	}
	
	public void noticeUpdateTest()throws Exception{
		
	}
	
	/*
	 * //@Test public void noticeListTest() throws Exception{ List<NoticeVO> li =
	 * noticeDAO.noticeList(); assertNotEquals(0, li.size()); }
	 */
	
	//@Test
	public void noticeSelectTest() throws Exception{
		NoticeVO noticeVO = noticeDAO.noticeSelect(2);
		assertNotNull(noticeVO);
	}
	
	//@Test
	public void noticeDeleteTest() throws Exception{
		int result=noticeDAO.noticeDelete(1);
		assertEquals(1, result);
	}
	
	
	//@Test
	public void noticeInsertTest() throws Exception {
		for(int i=0; i<120;i++) {
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setTitle("nt"+i);
		noticeVO.setWriter("nw"+i);
		noticeVO.setContents("nc"+i);
		int result = noticeDAO.noticeInsert(noticeVO);
		}
		/* assertEquals(1, result); */
	}
	
	
	
}
