package artispick.project;

import java.sql.Date;

public class ProjectBuyVO {
	String addr; 
	Date perform_date; 
	String status; 
	String name; 
	String id; 
	int so_amount; 
	Date order_date; 
	int so_price; 
	int sponsor_order_num; 
	int pj_goods_num;
	
	
	public ProjectBuyVO() {
		super();
		this.addr = addr;
		this.perform_date = perform_date;
		this.status = status;
		this.name = name;
		this.id = id;
		this.so_amount = so_amount;
		this.order_date = order_date;
		this.so_price = so_price;
		this.sponsor_order_num = sponsor_order_num;
		this.pj_goods_num = pj_goods_num;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public Date getPerform_date() {
		return perform_date;
	}


	public void setPerform_date(Date perform_date) {
		this.perform_date = perform_date;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getSo_amount() {
		return so_amount;
	}


	public void setSo_amount(int so_amount) {
		this.so_amount = so_amount;
	}


	public Date getOrder_date() {
		return order_date;
	}


	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}


	public int getSo_price() {
		return so_price;
	}


	public void setSo_price(int so_price) {
		this.so_price = so_price;
	}


	public int getSponsor_order_num() {
		return sponsor_order_num;
	}


	public void setSponsor_order_num(int sponsor_order_num) {
		this.sponsor_order_num = sponsor_order_num;
	}


	public int getPj_goods_num() {
		return pj_goods_num;
	}


	public void setPj_goods_num(int pj_goods_num) {
		this.pj_goods_num = pj_goods_num;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((order_date == null) ? 0 : order_date.hashCode());
		result = prime * result + ((perform_date == null) ? 0 : perform_date.hashCode());
		result = prime * result + pj_goods_num;
		result = prime * result + so_amount;
		result = prime * result + so_price;
		result = prime * result + sponsor_order_num;
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
		ProjectBuyVO other = (ProjectBuyVO) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
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
		if (order_date == null) {
			if (other.order_date != null)
				return false;
		} else if (!order_date.equals(other.order_date))
			return false;
		if (perform_date == null) {
			if (other.perform_date != null)
				return false;
		} else if (!perform_date.equals(other.perform_date))
			return false;
		if (pj_goods_num != other.pj_goods_num)
			return false;
		if (so_amount != other.so_amount)
			return false;
		if (so_price != other.so_price)
			return false;
		if (sponsor_order_num != other.sponsor_order_num)
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
		return "ProjectBuyVO [addr=" + addr + ", perform_date=" + perform_date + ", status=" + status + ", name=" + name
				+ ", id=" + id + ", so_amount=" + so_amount + ", order_date=" + order_date + ", so_price=" + so_price
				+ ", sponsor_order_num=" + sponsor_order_num + ", pj_goods_num=" + pj_goods_num + "]";
	}
	
	


	
	
}
