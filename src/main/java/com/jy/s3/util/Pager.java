package com.jy.s3.util;

public class Pager {



	private String kind;
	private String search;
		
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getSearch() {
		if(search==null) {
			search="";
		}
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	//DB///////////////////////////////////////////////////////////
	private Integer startRow;
	private Integer lastRow;
	
	
	public Integer getStartRow() {
		return startRow;
	}
	
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	
	public Integer getLastRow() {
		return lastRow;
	}
	
	public void setLastRow(Integer lastRow) {
		this.lastRow = lastRow;
	}
	
	
	
	////////////////////////////////////////////////////
	//view
	
	private Integer startNum;
	private Integer lastNum;
	private Integer curBlock;
	private Integer totalBlock;
	
	public Integer getStartNum() {
		return startNum;
	}
		
	public Integer getLastNum() {
		return lastNum;
	}
	
	public Integer getPerPage() {
		return perPage;
	}
	
	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}
	
	


	public Pager() {
		if(perPage ==null || perPage==0)
		perPage=10;
	}
	
	public Integer getTotalBlock() {
		return totalBlock;
	}
	
	public Integer getCurBlock() {
		return curBlock;
	}
	
	
	////////////////////////////////////////////////////////
	
	private Integer curPage;
	private Integer perPage;

	public Integer getCurPage() {
		if(this.curPage==null || curPage==0) {
			this.curPage=1;
		}
		return curPage;
	}

	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}
	
	
	public void makePager(int totalCount) {
		//1. 전체글의 갯수
		
		
		//2. 전체 페이지의 갯수
		int totalPage = totalCount/perPage;
		if(totalCount%perPage !=0) {
			totalPage++;
		}
		
		//3. 전체 블럭의 갯수 
		
		int perBlock = 5;
		totalBlock = totalPage/perBlock;
		if(totalPage%perBlock != 0) {
			totalBlock++;
		}
		
		//4. curPage를 이용해서 curBlock 구하기
		
		curBlock =curPage/5;
		if(curPage%5 !=0) {
			curBlock++;
		}
		
		//5. curBlock으로 startNum,lastNum 구하기
		startNum = (curBlock-1)*perBlock+1;
		lastNum = curBlock*5;
		
		if(curBlock == totalBlock) {
			lastNum =totalPage;
		}
		
	}
	
	

	public void makeRow() {
		//rownum 계산 
		this.startRow=(this.getCurPage()-1)*this.getPerPage()+1;
		this.lastRow = this.getCurPage()*this.getPerPage();
		
	}
	
	
}
