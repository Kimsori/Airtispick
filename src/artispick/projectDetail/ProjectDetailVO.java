package artispick.projectDetail;

import java.sql.Date;

public class ProjectDetailVO {
	
	private int pjNum;
	private String pjName;
	private int target;
	private int totalPrice;
	private int percent;
	private String field;
	private int deadline;
	private int sponCount;
	private String image;
	private Date scheDate;
	private String pjStory;
	private String refund;
	private String artiName;
	private String intro;
	private String goodsCount;
	
	private int PJNum;
	private String PJName;
	private int totalSpon;
	private String sponGoodsName;
	private int store;
	private int sponCon;
	
	
	public ProjectDetailVO() {
		
	}


	public int getPjNum() {
		return pjNum;
	}


	public void setPjNum(int pjNum) {
		this.pjNum = pjNum;
	}


	public String getPjName() {
		return pjName;
	}


	public void setPjName(String pjName) {
		this.pjName = pjName;
	}


	public int getTarget() {
		return target;
	}


	public void setTarget(int target) {
		this.target = target;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	public int getPercent() {
		return percent;
	}


	public void setPercent(int percent) {
		this.percent = percent;
	}


	public String getField() {
		return field;
	}


	public void setField(String field) {
		this.field = field;
	}


	public int getDeadline() {
		return deadline;
	}


	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}


	public int getSponCount() {
		return sponCount;
	}


	public void setSponCount(int sponCount) {
		this.sponCount = sponCount;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Date getScheDate() {
		return scheDate;
	}


	public void setScheDate(Date scheDate) {
		this.scheDate = scheDate;
	}


	public String getPjStory() {
		return pjStory;
	}


	public void setPjStory(String pjStory) {
		this.pjStory = pjStory;
	}


	public String getRefund() {
		return refund;
	}


	public void setRefund(String refund) {
		this.refund = refund;
	}


	public String getArtiName() {
		return artiName;
	}


	public void setArtiName(String artiName) {
		this.artiName = artiName;
	}


	public String getIntro() {
		return intro;
	}


	public void setIntro(String intro) {
		this.intro = intro;
	}


	public String getGoodsCount() {
		return goodsCount;
	}


	public void setGoodsCount(String goodsCount) {
		this.goodsCount = goodsCount;
	}


	public int getPJNum() {
		return PJNum;
	}


	public void setPJNum(int pJNum) {
		PJNum = pJNum;
	}


	public String getPJName() {
		return PJName;
	}


	public void setPJName(String pJName) {
		PJName = pJName;
	}


	public int getTotalSpon() {
		return totalSpon;
	}


	public void setTotalSpon(int totalSpon) {
		this.totalSpon = totalSpon;
	}


	public String getSponGoodsName() {
		return sponGoodsName;
	}


	public void setSponGoodsName(String sponGoodsName) {
		this.sponGoodsName = sponGoodsName;
	}


	public int getStore() {
		return store;
	}


	public void setStore(int store) {
		this.store = store;
	}


	public int getSponCon() {
		return sponCon;
	}


	public void setSponCon(int sponCon) {
		this.sponCon = sponCon;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PJName == null) ? 0 : PJName.hashCode());
		result = prime * result + PJNum;
		result = prime * result + ((artiName == null) ? 0 : artiName.hashCode());
		result = prime * result + deadline;
		result = prime * result + ((field == null) ? 0 : field.hashCode());
		result = prime * result + ((goodsCount == null) ? 0 : goodsCount.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((intro == null) ? 0 : intro.hashCode());
		result = prime * result + percent;
		result = prime * result + ((pjName == null) ? 0 : pjName.hashCode());
		result = prime * result + pjNum;
		result = prime * result + ((pjStory == null) ? 0 : pjStory.hashCode());
		result = prime * result + ((refund == null) ? 0 : refund.hashCode());
		result = prime * result + ((scheDate == null) ? 0 : scheDate.hashCode());
		result = prime * result + sponCon;
		result = prime * result + sponCount;
		result = prime * result + ((sponGoodsName == null) ? 0 : sponGoodsName.hashCode());
		result = prime * result + store;
		result = prime * result + target;
		result = prime * result + totalPrice;
		result = prime * result + totalSpon;
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
		ProjectDetailVO other = (ProjectDetailVO) obj;
		if (PJName == null) {
			if (other.PJName != null)
				return false;
		} else if (!PJName.equals(other.PJName))
			return false;
		if (PJNum != other.PJNum)
			return false;
		if (artiName == null) {
			if (other.artiName != null)
				return false;
		} else if (!artiName.equals(other.artiName))
			return false;
		if (deadline != other.deadline)
			return false;
		if (field == null) {
			if (other.field != null)
				return false;
		} else if (!field.equals(other.field))
			return false;
		if (goodsCount == null) {
			if (other.goodsCount != null)
				return false;
		} else if (!goodsCount.equals(other.goodsCount))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (intro == null) {
			if (other.intro != null)
				return false;
		} else if (!intro.equals(other.intro))
			return false;
		if (percent != other.percent)
			return false;
		if (pjName == null) {
			if (other.pjName != null)
				return false;
		} else if (!pjName.equals(other.pjName))
			return false;
		if (pjNum != other.pjNum)
			return false;
		if (pjStory == null) {
			if (other.pjStory != null)
				return false;
		} else if (!pjStory.equals(other.pjStory))
			return false;
		if (refund == null) {
			if (other.refund != null)
				return false;
		} else if (!refund.equals(other.refund))
			return false;
		if (scheDate == null) {
			if (other.scheDate != null)
				return false;
		} else if (!scheDate.equals(other.scheDate))
			return false;
		if (sponCon != other.sponCon)
			return false;
		if (sponCount != other.sponCount)
			return false;
		if (sponGoodsName == null) {
			if (other.sponGoodsName != null)
				return false;
		} else if (!sponGoodsName.equals(other.sponGoodsName))
			return false;
		if (store != other.store)
			return false;
		if (target != other.target)
			return false;
		if (totalPrice != other.totalPrice)
			return false;
		if (totalSpon != other.totalSpon)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ProjectDetailVO [pjNum=" + pjNum + ", pjName=" + pjName + ", target=" + target + ", totalPrice="
				+ totalPrice + ", percent=" + percent + ", field=" + field + ", deadline=" + deadline + ", sponCount="
				+ sponCount + ", image=" + image + ", scheDate=" + scheDate + ", pjStory=" + pjStory + ", refund="
				+ refund + ", artiName=" + artiName + ", intro=" + intro + ", goodsCount=" + goodsCount + ", PJNum="
				+ PJNum + ", PJName=" + PJName + ", totalSpon=" + totalSpon + ", sponGoodsName=" + sponGoodsName
				+ ", store=" + store + ", sponCon=" + sponCon + "]";
	}


	
	
	
	

}
