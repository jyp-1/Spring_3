package com.jy.s3;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jy.s3.model.board.QnaVO;
import com.jy.s3.service.board.QnaService;

@Controller
@RequestMapping(value = "/qna/**")
public class QnaController {
	
	@Inject
	private QnaService qnaService;
	
	@RequestMapping(value = "QnaList")
	public void QnaList(Model model, QnaVO qnaVO)throws Exception {
		List<QnaVO> ar = qnaService.QnaList(qnaVO);
		model.addAttribute("list", ar);
	}
	
	
	
}
