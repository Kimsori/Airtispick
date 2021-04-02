package artispick.mypage;

import java.sql.Date;

public class MypageVO {
	private String id;
	private int pj_num;
	private String pj_name;
	private int pj_goods_num;
	private String goods_name;
	private int sponsor_order_detail_num;
	private String status; 
	private Date order_date;
	private int spon_total;
	private String image; 
	private int count; 
	
	private int spon_order_num;
	private int spon_price;
	private Date spon_date;

	public MypageVO(){}
	
	public MypageVO(String id, int pj_num, String pj_name, int pj_goods_num, String goods_name, 
			int sponsor_order_detail_num, String status, Date order_date, int spon_total, String image) {
		super();
		this.id = id;
		this.pj_num = pj_num;
		this.pj_name = pj_name;
		this.pj_goods_num = pj_goods_num;
		this.goods_name = goods_name;
		this.sponsor_order_detail_num = sponsor_order_detail_num;
		this.status = status;
		this.order_date = order_date;
		this.spon_total = spon_total;
		this.image = image;
	}
	
	public MypageVO(int pj_num, String pj_name, int spon_order_num, int spon_price, Date spon_date, 
			String id, String image) {
		super();
		this.pj_num = pj_num;
		this.pj_name = pj_name;
		this.spon_order_num = spon_order_num;
		this.spon_price = spon_price;
		this.spon_date = spon_date;
		this.id = id;
		this.image = image;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPj_num() {
		return pj_num;
	}

	public void setPj_num(int pj_num) {
		this.pj_num = pj_num;
	}

	public String getPj_name() {
		return pj_name;
	}

	public void setPj_name(String pj_name) {
		this.pj_name = pj_name;
	}

	public int getPj_goods_num() {
		return pj_goods_num;
	}

	public void setPj_goods_num(int pj_goods_num) {
		this.pj_goods_num = pj_goods_num;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public int getSponsor_order_detail_num() {
		return sponsor_order_detail_num;
	}

	public void setSponsor_order_detail_num(int sponsor_order_detail_num) {
		this.sponsor_order_detail_num = sponsor_order_detail_num;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public int getSpon_total() {
		return spon_total;
	}

	public void setSpon_total(int spon_total) {
		this.spon_total = spon_total;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSpon_order_num() {
		return spon_order_num;
	}

	public void setSpon_order_num(int spon_order_num) {
		this.spon_order_num = spon_order_num;
	}

	public int getSpon_price() {
		return spon_price;
	}

	public void setSpon_price(int spon_price) {
		this.spon_price = spon_price;
	}

	public Date getSpon_date() {
		return spon_date;
	}

	public void setSpon_date(Date spon_date) {
		this.spon_date = spon_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((goods_name == null) ? 0 : goods_name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((order_date == null) ? 0 : order_date.hashCode());
		result = prime * result + pj_goods_num;
		result = prime * result + ((pj_name == null) ? 0 : pj_name.hashCode());
		result = prime * result + pj_num;
		result = prime * result + ((spon_date == null) ? 0 : spon_date.hashCode());
		result = prime * result + spon_order_num;
		result = prime * result + spon_price;
		result = prime * result + spon_total;
		result = prime * result + sponsor_order_detail_num;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		MypageVO other = (MypageVO) obj;
		if (count != other.count)
			return false;
		if (goods_name == null) {
			if (other.goods_name != null)
				return false;
		} else if (!goods_name.equals(other.goods_name))
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
		if (order_date == null) {
			if (other.order_date != null)
				return false;
		} else if (!order_date.equals(other.order_date))
			return false;
		if (pj_goods_num != other.pj_goods_num)
			return false;
		if (pj_name == null) {
			if (other.pj_name != null)
				return false;
		} else if (!pj_name.equals(other.pj_name))
			return false;
		if (pj_num != other.pj_num)
			return false;
		if (spon_date == null) {
			if (other.spon_date != null)
				return false;
		} else if (!spon_date.equals(other.spon_date))
			return false;
		if (spon_order_num != other.spon_order_num)
			return false;
		if (spon_price != other.spon_price)
			return false;
		if (spon_total != other.spon_total)
			return false;
		if (sponsor_order_detail_num != other.sponsor_order_detail_num)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MypageVO [id=" + id + ", pj_num=" + pj_num + ", pj_name=" + pj_name + ", pj_goods_num=" + pj_goods_num
				+ ", goods_name=" + goods_name + ", sponsor_order_detail_num=" + sponsor_order_detail_num + ", status="
				+ status + ", order_date=" + order_date + ", spon_total=" + spon_total + ", image=" + image + ", count="
				+ count + ", spon_order_num=" + spon_order_num + ", spon_price=" + spon_price + ", spon_date="
				+ spon_date + "]";
	}

}
