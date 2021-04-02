package artispick.Qna;

public class QnaVO {

	@Override
	public String toString() {
		return "QnaVO [qna_num=" + qna_num + ", qna_title=" + qna_title + ", qna_content=" + qna_content
				+ ", qna_status=" + qna_status + ", id=" + id + ", admin_id=" + admin_id + "]";
	}
	public int getQna_num() {
		return qna_num;
	}
	public void setQna_num(int qna_num) {
		this.qna_num = qna_num;
	}
	public String getQna_title() {
		return qna_title;
	}
	public void setQna_title(String qna_title) {
		this.qna_title = qna_title;
	}
	public String getQna_content() {
		return qna_content;
	}
	public void setQna_content(String qna_content) {
		this.qna_content = qna_content;
	}
	public String getQna_status() {
		return qna_status;
	}
	public void setQna_status(String qna_status) {
		this.qna_status = qna_status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	private int qna_num;
	private String qna_title;
	private String qna_content;
	private String qna_status;
	private String id;
	private String admin_id;
	
	public QnaVO(){}
	public QnaVO(int qna_num, String qna_title, String qna_content, String qna_status, String id, String admin_id) {
		super();
		this.qna_num = qna_num;
		this.qna_title = qna_title;
		this.qna_content = qna_content;
		this.qna_status = qna_status;
		this.id = id;
		this.admin_id = admin_id;
	}

	
	
}
