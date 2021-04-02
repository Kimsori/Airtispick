package artispick.shop;

import java.sql.Date;

public class ShopVO {
	
	private int shop_num;
	private String album_name; 
	private int album_price;
	private int store;
	private String image;
	
	private String field_name;
	private String album_content;
	private int delivery_account;
	private Date delivery_date;
	private String bank;
	private int bank_account;
	private String name;
	
	private Date order_date;
	private int amount;
	private int price;
	private int total;
	private String status;
	
	private int shop_order_detail_num;
	
	private String pj_name;
	private int total_price;
	private int achiev;
	private int totaldivi;
	private Date dividate;
	
	private String id;
	private Date dividatee;
	private int sponprice;
	private int totaldivie;
	
	public ShopVO(){}

	public ShopVO(int shop_num, String album_name, int album_price, int store, String image) {
		super();
		this.shop_num = shop_num;
		this.album_name = album_name;
		this.album_price = album_price;
		this.store = store;
		this.image = image;
	}
	
	public ShopVO(Date order_date, String album_name, int amount, int price, int total, String status) {
		super();
		this.order_date = order_date;
		this.album_name = album_name;
		this.amount = amount;
		this.price = price;
		this.total = total;
		this.status = status;
	}
	
	public ShopVO(String pj_name, int total_price, int achiev, int totaldivi, Date dividate){
		super();
		this.pj_name = pj_name;
		this.total_price = total_price;
		this.achiev = achiev;
		this.totaldivi = totaldivi;
		this.dividate = dividate;
	}
	
	public ShopVO(String pj_name, String id, Date dividatee, int sponprice, int totaldivie){
		super();
		this.pj_name = pj_name;
		this.id = id;
		this.dividatee = dividatee;
		this.sponprice = sponprice;
		this.totaldivie = totaldivie;
	}

	public int getShop_num() {
		return shop_num;
	}

	public void setShop_num(int shop_num) {
		this.shop_num = shop_num;
	}

	public String getAlbum_name() {
		return album_name;
	}

	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	public int getAlbum_price() {
		return album_price;
	}

	public void setAlbum_price(int album_price) {
		this.album_price = album_price;
	}

	public int getStore() {
		return store;
	}

	public void setStore(int store) {
		this.store = store;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getField_name() {
		return field_name;
	}

	public void setField_name(String field_name) {
		this.field_name = field_name;
	}

	public String getAlbum_content() {
		return album_content;
	}

	public void setAlbum_content(String album_content) {
		this.album_content = album_content;
	}

	public int getDelivery_account() {
		return delivery_account;
	}

	public void setDelivery_account(int delivery_account) {
		this.delivery_account = delivery_account;
	}

	public Date getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getBank_account() {
		return bank_account;
	}

	public void setBank_account(int bank_account) {
		this.bank_account = bank_account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getShop_order_detail_num() {
		return shop_order_detail_num;
	}

	public void setShop_order_detail_num(int shop_order_detail_num) {
		this.shop_order_detail_num = shop_order_detail_num;
	}

	public String getPj_name() {
		return pj_name;
	}

	public void setPj_name(String pj_name) {
		this.pj_name = pj_name;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public int getAchiev() {
		return achiev;
	}

	public void setAchiev(int achiev) {
		this.achiev = achiev;
	}

	public int getTotaldivi() {
		return totaldivi;
	}

	public void setTotaldivi(int totaldivi) {
		this.totaldivi = totaldivi;
	}

	public Date getDividate() {
		return dividate;
	}

	public void setDividate(Date dividate) {
		this.dividate = dividate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDividatee() {
		return dividatee;
	}

	public void setDividatee(Date dividatee) {
		this.dividatee = dividatee;
	}

	public int getSponprice() {
		return sponprice;
	}

	public void setSponprice(int sponprice) {
		this.sponprice = sponprice;
	}

	public int getTotaldivie() {
		return totaldivie;
	}

	public void setTotaldivie(int totaldivie) {
		this.totaldivie = totaldivie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + achiev;
		result = prime * result + ((album_content == null) ? 0 : album_content.hashCode());
		result = prime * result + ((album_name == null) ? 0 : album_name.hashCode());
		result = prime * result + album_price;
		result = prime * result + amount;
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + bank_account;
		result = prime * result + delivery_account;
		result = prime * result + ((delivery_date == null) ? 0 : delivery_date.hashCode());
		result = prime * result + ((dividate == null) ? 0 : dividate.hashCode());
		result = prime * result + ((dividatee == null) ? 0 : dividatee.hashCode());
		result = prime * result + ((field_name == null) ? 0 : field_name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((order_date == null) ? 0 : order_date.hashCode());
		result = prime * result + ((pj_name == null) ? 0 : pj_name.hashCode());
		result = prime * result + price;
		result = prime * result + shop_num;
		result = prime * result + shop_order_detail_num;
		result = prime * result + sponprice;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + store;
		result = prime * result + total;
		result = prime * result + total_price;
		result = prime * result + totaldivi;
		result = prime * result + totaldivie;
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
		ShopVO other = (ShopVO) obj;
		if (achiev != other.achiev)
			return false;
		if (album_content == null) {
			if (other.album_content != null)
				return false;
		} else if (!album_content.equals(other.album_content))
			return false;
		if (album_name == null) {
			if (other.album_name != null)
				return false;
		} else if (!album_name.equals(other.album_name))
			return false;
		if (album_price != other.album_price)
			return false;
		if (amount != other.amount)
			return false;
		if (bank == null) {
			if (other.bank != null)
				return false;
		} else if (!bank.equals(other.bank))
			return false;
		if (bank_account != other.bank_account)
			return false;
		if (delivery_account != other.delivery_account)
			return false;
		if (delivery_date == null) {
			if (other.delivery_date != null)
				return false;
		} else if (!delivery_date.equals(other.delivery_date))
			return false;
		if (dividate == null) {
			if (other.dividate != null)
				return false;
		} else if (!dividate.equals(other.dividate))
			return false;
		if (dividatee == null) {
			if (other.dividatee != null)
				return false;
		} else if (!dividatee.equals(other.dividatee))
			return false;
		if (field_name == null) {
			if (other.field_name != null)
				return false;
		} else if (!field_name.equals(other.field_name))
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (order_date == null) {
			if (other.order_date != null)
				return false;
		} else if (!order_date.equals(other.order_date))
			return false;
		if (pj_name == null) {
			if (other.pj_name != null)
				return false;
		} else if (!pj_name.equals(other.pj_name))
			return false;
		if (price != other.price)
			return false;
		if (shop_num != other.shop_num)
			return false;
		if (shop_order_detail_num != other.shop_order_detail_num)
			return false;
		if (sponprice != other.sponprice)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (store != other.store)
			return false;
		if (total != other.total)
			return false;
		if (total_price != other.total_price)
			return false;
		if (totaldivi != other.totaldivi)
			return false;
		if (totaldivie != other.totaldivie)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopVO [shop_num=" + shop_num + ", album_name=" + album_name + ", album_price=" + album_price
				+ ", store=" + store + ", image=" + image + ", field_name=" + field_name + ", album_content="
				+ album_content + ", delivery_account=" + delivery_account + ", delivery_date=" + delivery_date
				+ ", bank=" + bank + ", bank_account=" + bank_account + ", name=" + name + ", order_date=" + order_date
				+ ", amount=" + amount + ", price=" + price + ", total=" + total + ", status=" + status
				+ ", shop_order_detail_num=" + shop_order_detail_num + ", pj_name=" + pj_name + ", total_price="
				+ total_price + ", achiev=" + achiev + ", totaldivi=" + totaldivi + ", dividate=" + dividate + ", id="
				+ id + ", dividatee=" + dividatee + ", sponprice=" + sponprice + ", totaldivie=" + totaldivie + "]";
	}
	
	

}
