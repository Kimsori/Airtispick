package artispick.shopCart;

public class ShopCartVO {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + price;
		result = prime * result + shop_cart_num;
		result = prime * result + shop_num;
		result = prime * result + ((shop_title == null) ? 0 : shop_title.hashCode());
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
		ShopCartVO other = (ShopCartVO) obj;
		if (amount != other.amount)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (price != other.price)
			return false;
		if (shop_cart_num != other.shop_cart_num)
			return false;
		if (shop_num != other.shop_num)
			return false;
		if (shop_title == null) {
			if (other.shop_title != null)
				return false;
		} else if (!shop_title.equals(other.shop_title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ShopCartVO [shop_cart_num=" + shop_cart_num + ", shop_num=" + shop_num + ", id=" + id + ", amount="
				+ amount + ", shop_title=" + shop_title + ", price=" + price + "]";
	}
	public int getShop_cart_num() {
		return shop_cart_num;
	}
	public void setShop_cart_num(int shop_cart_num) {
		this.shop_cart_num = shop_cart_num;
	}
	public int getShop_num() {
		return shop_num;
	}
	public void setShop_num(int shop_num) {
		this.shop_num = shop_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getShop_title() {
		return shop_title;
	}
	public void setShop_title(String shop_title) {
		this.shop_title = shop_title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int shop_cart_num;
	private int shop_num;
	private String id;
	private int amount;
	private String shop_title;
	private int price;
	
	public ShopCartVO(){}
	public ShopCartVO(int shop_cart_num, int shop_num, String id, int amount, String shop_title, int price) {
		super();
		this.shop_cart_num = shop_cart_num;
		this.shop_num = shop_num;
		this.id = id;
		this.amount = amount;
		this.shop_title = shop_title;
		this.price = price;
	}
	
	
	
}
