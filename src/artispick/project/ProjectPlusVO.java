package artispick.project;

import java.util.Date;

public class ProjectPlusVO {
	private String pj_name;
	private String image;
	private Date upload_date; 
	private int target; 
	private int total_price; 
	private Date deadline; 
	private Date sche_date; 
	private String pj_story; 
	private String refund; 
	private String bank; 
	private String account_name; 
	private int account; 
	private String id; 
	private int field_num; 
	private int goods_price; 
	private String goods_name; 
	private int store; 
	private int pj_num; 
	
	
	public ProjectPlusVO() {
		super();
		this.pj_name = pj_name;
		this.image = image;
		this.target = target;
		this.total_price = total_price;
		this.deadline = deadline;
		this.sche_date = sche_date;
		this.pj_story = pj_story;
		this.refund = refund;
		this.bank = bank;
		this.account_name = account_name;
		this.account = account;
		this.id = id;
		this.field_num = field_num;
		this.goods_price = goods_price;
		this.goods_name = goods_name;
		this.store = store;
		this.pj_num = pj_num;
	}


	public String getPj_name() {
		return pj_name;
	}


	public void setPj_name(String pj_name) {
		this.pj_name = pj_name;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Date getUpload_date() {
		return upload_date;
	}


	public void setUpload_date(Date upload_date) {
		this.upload_date = upload_date;
	}


	public int getTarget() {
		return target;
	}


	public void setTarget(int target) {
		this.target = target;
	}


	public int getTotal_price() {
		return total_price;
	}


	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}


	public Date getDeadline() {
		return deadline;
	}


	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}


	public Date getSche_date() {
		return sche_date;
	}


	public void setSche_date(Date sche_date) {
		this.sche_date = sche_date;
	}


	public String getPj_story() {
		return pj_story;
	}


	public void setPj_story(String pj_story) {
		this.pj_story = pj_story;
	}


	public String getRefund() {
		return refund;
	}


	public void setRefund(String refund) {
		this.refund = refund;
	}


	public String getBank() {
		return bank;
	}


	public void setBank(String bank) {
		this.bank = bank;
	}


	public String getAccount_name() {
		return account_name;
	}


	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}


	public int getAccount() {
		return account;
	}


	public void setAccount(int account) {
		this.account = account;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getField_num() {
		return field_num;
	}


	public void setField_num(int field_num) {
		this.field_num = field_num;
	}


	public int getGoods_price() {
		return goods_price;
	}


	public void setGoods_price(int goods_price) {
		this.goods_price = goods_price;
	}


	public String getGoods_name() {
		return goods_name;
	}


	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}


	public int getStore() {
		return store;
	}


	public void setStore(int store) {
		this.store = store;
	}


	public int getPj_num() {
		return pj_num;
	}


	public void setPj_num(int pj_num) {
		this.pj_num = pj_num;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + account;
		result = prime * result + ((account_name == null) ? 0 : account_name.hashCode());
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + ((deadline == null) ? 0 : deadline.hashCode());
		result = prime * result + field_num;
		result = prime * result + ((goods_name == null) ? 0 : goods_name.hashCode());
		result = prime * result + goods_price;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((pj_name == null) ? 0 : pj_name.hashCode());
		result = prime * result + pj_num;
		result = prime * result + ((pj_story == null) ? 0 : pj_story.hashCode());
		result = prime * result + ((refund == null) ? 0 : refund.hashCode());
		result = prime * result + ((sche_date == null) ? 0 : sche_date.hashCode());
		result = prime * result + store;
		result = prime * result + target;
		result = prime * result + total_price;
		result = prime * result + ((upload_date == null) ? 0 : upload_date.hashCode());
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
		ProjectPlusVO other = (ProjectPlusVO) obj;
		if (account != other.account)
			return false;
		if (account_name == null) {
			if (other.account_name != null)
				return false;
		} else if (!account_name.equals(other.account_name))
			return false;
		if (bank == null) {
			if (other.bank != null)
				return false;
		} else if (!bank.equals(other.bank))
			return false;
		if (deadline == null) {
			if (other.deadline != null)
				return false;
		} else if (!deadline.equals(other.deadline))
			return false;
		if (field_num != other.field_num)
			return false;
		if (goods_name == null) {
			if (other.goods_name != null)
				return false;
		} else if (!goods_name.equals(other.goods_name))
			return false;
		if (goods_price != other.goods_price)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (pj_name == null) {
			if (other.pj_name != null)
				return false;
		} else if (!pj_name.equals(other.pj_name))
			return false;
		if (pj_num != other.pj_num)
			return false;
		if (pj_story == null) {
			if (other.pj_story != null)
				return false;
		} else if (!pj_story.equals(other.pj_story))
			return false;
		if (refund == null) {
			if (other.refund != null)
				return false;
		} else if (!refund.equals(other.refund))
			return false;
		if (sche_date == null) {
			if (other.sche_date != null)
				return false;
		} else if (!sche_date.equals(other.sche_date))
			return false;
		if (store != other.store)
			return false;
		if (target != other.target)
			return false;
		if (total_price != other.total_price)
			return false;
		if (upload_date == null) {
			if (other.upload_date != null)
				return false;
		} else if (!upload_date.equals(other.upload_date))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ProjectPlusVO [pj_name=" + pj_name + ", image=" + image + ", upload_date=" + upload_date + ", target="
				+ target + ", total_price=" + total_price + ", deadline=" + deadline + ", sche_date=" + sche_date
				+ ", pj_story=" + pj_story + ", refund=" + refund + ", bank=" + bank + ", account_name=" + account_name
				+ ", account=" + account + ", id=" + id + ", field_num=" + field_num + ", goods_price=" + goods_price
				+ ", goods_name=" + goods_name + ", store=" + store + ", pj_num=" + pj_num + "]";
	}



	
}
