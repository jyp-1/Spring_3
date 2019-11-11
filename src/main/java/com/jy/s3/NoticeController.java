package com.jy.s3;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jy.s3.dao.board.NoticeDAO;
import com.jy.s3.model.board.NoticeVO;
import com.jy.s3.service.board.NoticeService;

@Controller
@RequestMapping(value = "/notice/**")
public class NoticeController {
	
	@Inject
	private NoticeService noticeService;
	
	//list : notice/noticeList Get
	//		 /WEB-INF/views/notice/noticeList.jsp
	//메서드명 : noticeList
	
	@RequestMapping(value = "noticeList")
	public void noticeList(Model model, @RequestParam(required = false, defaultValue="1")int curPage)throws Exception {
		Map<String, Object> map = noticeService.noticeList(curPage);
		List<NoticeVO> ar = (List<NoticeVO>)map.get("list");
		int totalPage = (Integer)map.get("totalPage");
		model.addAttribute("list", ar );
		model.addAttribute("totalPage", totalPage);
	}
	@RequestMapping(value="noticeSelect")
	public void noticeSelect(Model model, int num) throws Exception{
		NoticeVO noticeVO = noticeService.noticeSelect(num);
		model.addAttribute("dto", noticeVO);
	}
	
	@RequestMapping(value="noticeWrite", method = RequestMethod.GET)
	public String noticeWrite() throws Exception{
		return "notice/noticeWrite";
	}
	
	@RequestMapping(value="noticeWrite", method = RequestMethod.POST)
	public ModelAndView noticeWrite(NoticeVO noticeVO) throws Exception{
		
		int result = noticeService.noticeInsert(noticeVO);
		
		String msg = "Fail";
		 	String path="./noticeList";
		 	
		ModelAndView mv = new ModelAndView();
		if(result>0) {
			msg="Success";
			path="./noticeList";
		}
		mv.addObject("msg", msg);
		mv.addObject("path", path);
		mv.setViewName("./layout/common_result");
		return mv;
	}
	

	@RequestMapping(value="noticeUpdate", method = RequestMethod.GET)
	public void noticeUpdate(Model model, int num) throws Exception{
		NoticeVO noticeVO = noticeService.noticeSelect(num);
		model.addAttribute("dto",noticeVO);
	}
	
	@RequestMapping(value="noticeUpdate", method = RequestMethod.POST)
	public ModelAndView noticeUpdate(NoticeVO noticeVO) throws Exception{
		int result = noticeService.noticeUpdate(noticeVO);
		
		String msg="fail";
		String path="";
		ModelAndView mv = new ModelAndView();
		if(result>0) {
			msg="Success";
			path="./noticeList";
			}
		mv.addObject("msg", msg);
		mv.addObject("path",path);
		mv.setViewName("./layout/common_result");
		return mv;
		
	
	}
	
	@RequestMapping(value ="noticeDelete")	
	public ModelAndView noticeDelete(int num) throws Exception {
		int result = noticeService.noticeDelete(num);
		
		String msg ="fail";
		String path = "";
		ModelAndView mv =  new ModelAndView();
		if(result>0) {
			msg="Success";
			path="./noticeList";
		}
		mv.addObject("msg", msg);
		mv.addObject("path",path);
		mv.setViewName("./layout/common_result");
		return mv;
	}
	
}
