package artispick.adminDatail;

import java.sql.Date;

public class AdminDetailVO {
	
	private int noticeNum;
	private String title;
	private Date noticeDate;
	private int view;
	private String adminId;
	private String content;
	
	public AdminDetailVO() {
	}
	
	public int getNoticeNum() {
		return noticeNum;
	}
	public void setNoticeNum(int noticeNum) {
		this.noticeNum = noticeNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public AdminDetailVO(int noticeNum, String title, Date noticeDate, int view, String adminId, String content) {
		super();
		this.noticeNum = noticeNum;
		this.title = title;
		this.noticeDate = noticeDate;
		this.view = view;
		this.adminId = adminId;
		this.content = content;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminId == null) ? 0 : adminId.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((noticeDate == null) ? 0 : noticeDate.hashCode());
		result = prime * result + noticeNum;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + view;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminDetailVO other = (AdminDetailVO) obj;
		if (adminId == null) {
			if (other.adminId != null)
				return false;
		} else if (!adminId.equals(other.adminId))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (noticeDate == null) {
			if (other.noticeDate != null)
				return false;
		} else if (!noticeDate.equals(other.noticeDate))
			return false;
		if (noticeNum != other.noticeNum)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (view != other.view)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AdminVO [noticeNum=" + noticeNum + ", title=" + title + ", noticeDate=" + noticeDate + ", view=" + view
				+ ", adminId=" + adminId + ", content=" + content + "]";
	}
	
	
	
	
	
	
}