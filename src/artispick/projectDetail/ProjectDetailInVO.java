package artispick.projectDetail;

public class ProjectDetailInVO {
	
	private int pjNum;
	private String pj_name;
	private int pj_goods_num;
	private int goods_price;
	private String goods_name;
	private int store;
	private int spon_con;
	
	public ProjectDetailInVO(){}
	
	public ProjectDetailInVO(int pjNum, String pj_name, int pj_goods_num, int goods_price, 
			String goods_name, int store) {
		super();
		this.pjNum = pjNum;
		this.pj_name = pj_name;
		this.pj_goods_num = pj_goods_num;
		this.goods_price = goods_price;
		this.goods_name = goods_name;
		this.store = store;
	}

	public ProjectDetailInVO(int pjNum, String pj_name, int pj_goods_num, int goods_price, 
			String goods_name, int store, int spon_con) {
		super();
		this.pjNum = pjNum;
		this.pj_name = pj_name;
		this.pj_goods_num = pj_goods_num;
		this.goods_price = goods_price;
		this.goods_name = goods_name;
		this.store = store;
		this.spon_con = spon_con;
	}

	public int getPjNum() {
		return pjNum;
	}

	public void setPjNum(int pjNum) {
		this.pjNum = pjNum;
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

	public int getSpon_con() {
		return spon_con;
	}

	public void setSpon_con(int spon_con) {
		this.spon_con = spon_con;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goods_name == null) ? 0 : goods_name.hashCode());
		result = prime * result + goods_price;
		result = prime * result + pjNum;
		result = prime * result + pj_goods_num;
		result = prime * result + ((pj_name == null) ? 0 : pj_name.hashCode());
		result = prime * result + spon_con;
		result = prime * result + store;
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
		ProjectDetailInVO other = (ProjectDetailInVO) obj;
		if (goods_name == null) {
			if (other.goods_name != null)
				return false;
		} else if (!goods_name.equals(other.goods_name))
			return false;
		if (goods_price != other.goods_price)
			return false;
		if (pjNum != other.pjNum)
			return false;
		if (pj_goods_num != other.pj_goods_num)
			return false;
		if (pj_name == null) {
			if (other.pj_name != null)
				return false;
		} else if (!pj_name.equals(other.pj_name))
			return false;
		if (spon_con != other.spon_con)
			return false;
		if (store != other.store)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProjectDetailInVO [pjNum=" + pjNum + ", pj_name=" + pj_name + ", pj_goods_num=" + pj_goods_num
				+ ", goods_price=" + goods_price + ", goods_name=" + goods_name + ", store=" + store + ", spon_con="
				+ spon_con + "]";
	}


}
