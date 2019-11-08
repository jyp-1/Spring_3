package com.jy.s3.service.board;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jy.s3.dao.board.NoticeDAO;
import com.jy.s3.model.board.NoticeVO;

@Service
public class NoticeService {
		
		@Inject
		private NoticeDAO noticeDAO;
		
		public int noticeInsert(NoticeVO noticeVO) throws Exception{
			return noticeDAO.noticeInsert(noticeVO);
		}
		
		public int noticeDelete(int num)throws Exception {
			return noticeDAO.noticeDelete(num);
		}
		
		public List<NoticeVO> noticeList() throws Exception{
			return noticeDAO.noticeList();
		}
		public NoticeVO noticeSelect(int num) throws Exception{
			return noticeDAO.noticeSelect(num);
		}
		public int noticeUpdate(NoticeVO noticeVO) throws Exception{
			return noticeDAO.noticeUpdate(noticeVO);
		}
		
		
}