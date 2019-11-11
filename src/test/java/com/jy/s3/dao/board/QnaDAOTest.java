package com.jy.s3.dao.board;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.jy.s3.TestAbstractCase;


public class QnaDAOTest extends TestAbstractCase{

	@Inject
	private QnaDAO qnaDAO;
	
	
	 //@Test 
	 public void checkDAO()throws Exception{
	  assertNotNull(qnaDAO);
	 }
	 
	 
	 

}
