package org.web.borddto;

public class PagingClass {
	
	private int pNum; // 페이지 번호
	private int rowSize; // 한 페이지 당 레코드 수
	private int block; // 페이지 블록 수
	private int startNum; // 테이블에서 가져올 첫 번째 limit startNum, endNum
	private int endNum; // 테이블에서 가져올 개수 limit startNum, endNum
	private int total; // 전체 레코드
	private int allPage; // 전체 페이지
	private int startPage; // 시작 페이지
	private int endPage; // 마지막 페이지

	public PagingClass() {
	}

	public PagingClass(int pNum, int rowSize, int block, int startNum, 
			int endNum, int total, int allPage,int startPage, int endPage) {
		super();
		this.pNum = pNum;
		this.rowSize = rowSize;
		this.block = block;
		this.startNum = startNum;
		this.endNum = endNum;
		this.total = total;
		this.allPage = allPage;
		this.startPage = startPage;
		this.endPage = endPage;
	}

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	public int getRowSize() {
		return rowSize;
	}

	public void setRowSize(int rowSize) {
		this.rowSize = rowSize;
	}

	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAllPage() {
		return allPage;
	}

	public void setAllPage(int allPage) {
		this.allPage = allPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

}
