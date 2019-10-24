package web.bordDTO;

public class PagingClass {
	
	private int pNum;//������ ��ȣ
	private int rowSize;// ���������緹�ڵ� ��
	private int block;//������ ��ϼ�
	private int startNum;//���̺��� ������ ù��° limit startnum,endNum
	private int endNum;//���̺��� ������ ���� limit startNum,endNum
	private int total;//��ü���ڵ�
	private int allPage;//��ü ������
	private int startPage;//���� ������
	private int endPage;//������ ������
	
	public PagingClass() {
		// TODO Auto-generated constructor stub
	}

	public PagingClass(int pNum, int rowSize, int block, int startNum, int endNum, int total, int allPage,
			int startPage, int endPage) {
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
