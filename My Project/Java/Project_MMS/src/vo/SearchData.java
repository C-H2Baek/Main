package vo;

public class SearchData {

	private String searchcondition; // 검색 조건을 받을 변수
	private String searchValue;		// 검색 값을 받을 변호
	
	public String getSearchCondition() {
		return searchcondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchcondition = searchCondition;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
}
