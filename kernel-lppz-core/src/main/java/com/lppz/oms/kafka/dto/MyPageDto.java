package com.lppz.oms.kafka.dto;

public class MyPageDto {
	private Integer pageSize;
	private Integer currPage;
	private String qstarttime;
	private String qendtime;
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getCurrPage() {
		return currPage;
	}
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	public String getQstarttime() {
		return qstarttime;
	}
	public void setQstarttime(String qstarttime) {
		this.qstarttime = qstarttime;
	}
	public String getQendtime() {
		return qendtime;
	}
	public void setQendtime(String qendtime) {
		this.qendtime = qendtime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyPageDto [pageSize=");
		builder.append(pageSize);
		builder.append(", currPage=");
		builder.append(currPage);
		builder.append(", qstarttime=");
		builder.append(qstarttime);
		builder.append(", qendtime=");
		builder.append(qendtime);
		builder.append("]");
		return builder.toString();
	}
	
}
