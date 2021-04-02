package artispick.pay;

import java.util.Date;

public class PayVO { //사용자 정보 저장 객체
	private int so_amount; 
	private int so_price; 
	private int pj_goods_num; 
	private int goods_price;
	
	private String goods_name;
	
	private String pj_name;
	private int sponsor_order_detail_num;
	
	private int pj_num;
	
	private int sponsor_order_num;
	
	private String addr;
	private String addr1;
	
	private int spon_order_num;
	private int spon_price;
	private String id;
	private String name;
	
	private int postcode;

	public PayVO(){}
	
	public PayVO(int pj_goods_num, int goods_price, String goods_name) {
		super();
		this.pj_goods_num = pj_goods_num;
		this.goods_price = goods_price;
		this.goods_name = goods_name;
	}

	public int getSo_amount() {
		return so_amount;
	}

	public void setSo_amount(int so_amount) {
		this.so_amount = so_amount;
	}

	public int getSo_price() {
		return so_price;
	}

	public void setSo_price(int so_price) {
		this.so_price = so_price;
	}

	public int getPj_goods_num() {
		return pj_goods_num;
	}

	public void setPj_goods_num(int pj_goods_num) {
		this.pj_goods_num = pj_goods_num;
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

	public String getPj_name() {
		return pj_name;
	}

	public void setPj_name(String pj_name) {
		this.pj_name = pj_name;
	}

	public int getSponsor_order_detail_num() {
		return sponsor_order_detail_num;
	}

	public void setSponsor_order_detail_num(int sponsor_order_detail_num) {
		this.sponsor_order_detail_num = sponsor_order_detail_num;
	}

	public int getPj_num() {
		return pj_num;
	}

	public void setPj_num(int pj_num) {
		this.pj_num = pj_num;
	}

	public int getSponsor_order_num() {
		return sponsor_order_num;
	}

	public void setSponsor_order_num(int sponsor_order_num) {
		this.sponsor_order_num = sponsor_order_num;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((addr1 == null) ? 0 : addr1.hashCode());
		result = prime * result + ((goods_name == null) ? 0 : goods_name.hashCode());
		result = prime * result + goods_price;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pj_goods_num;
		result = prime * result + ((pj_name == null) ? 0 : pj_name.hashCode());
		result = prime * result + pj_num;
		result = prime * result + postcode;
		result = prime * result + so_amount;
		result = prime * result + so_price;
		result = prime * result + spon_order_num;
		result = prime * result + spon_price;
		result = prime * result + sponsor_order_detail_num;
		result = prime * result + sponsor_order_num;
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
		PayVO other = (PayVO) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (addr1 == null) {
			if (other.addr1 != null)
				return false;
		} else if (!addr1.equals(other.addr1))
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
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
		if (postcode != other.postcode)
			return false;
		if (so_amount != other.so_amount)
			return false;
		if (so_price != other.so_price)
			return false;
		if (spon_order_num != other.spon_order_num)
			return false;
		if (spon_price != other.spon_price)
			return false;
		if (sponsor_order_detail_num != other.sponsor_order_detail_num)
			return false;
		if (sponsor_order_num != other.sponsor_order_num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PayVO [so_amount=" + so_amount + ", so_price=" + so_price + ", pj_goods_num=" + pj_goods_num
				+ ", goods_price=" + goods_price + ", goods_name=" + goods_name + ", pj_name=" + pj_name
				+ ", sponsor_order_detail_num=" + sponsor_order_detail_num + ", pj_num=" + pj_num
				+ ", sponsor_order_num=" + sponsor_order_num + ", addr=" + addr + ", addr1=" + addr1
				+ ", spon_order_num=" + spon_order_num + ", spon_price=" + spon_price + ", id=" + id + ", name=" + name
				+ ", postcode=" + postcode + "]";
	}


}