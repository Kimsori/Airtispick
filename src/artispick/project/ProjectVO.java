package artispick.project;

import java.util.Date;

public class ProjectVO {
	private String pj_num;
	private String image;
	private String pj_name;
	private String arti_name;
	private int deadline;
	private int total;
	private int target;
	private String story;
	private int user_num;
	
	private int count; 
	
	public ProjectVO(){}
	
	public ProjectVO(String pj_num, String image, String pj_name, 
			String arti_name, int deadline, int total, int target) {
		super();
		this.pj_num = pj_num;
		this.image = image;
		this.pj_name = pj_name;
		this.arti_name = arti_name;
		this.deadline = deadline;
		this.total = total;
		this.target = target;
	}
	
	public ProjectVO(String pj_num, String image, String pj_name, 
			String arti_name, int deadline, int total, int target, int user_num) {
		super();
		this.pj_num = pj_num;
		this.image = image;
		this.pj_name = pj_name;
		this.arti_name = arti_name;
		this.deadline = deadline;
		this.total = total;
		this.target = target;
		this.user_num = user_num;
	}

	public String getPj_num() {
		return pj_num;
	}

	public void setPj_num(String pj_num) {
		this.pj_num = pj_num;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPj_name() {
		return pj_name;
	}

	public void setPj_name(String pj_name) {
		this.pj_name = pj_name;
	}

	public String getArti_name() {
		return arti_name;
	}

	public void setArti_name(String arti_name) {
		this.arti_name = arti_name;
	}

	public int getDeadline() {
		return deadline;
	}

	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public int getUser_num() {
		return user_num;
	}

	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arti_name == null) ? 0 : arti_name.hashCode());
		result = prime * result + count;
		result = prime * result + deadline;
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((pj_name == null) ? 0 : pj_name.hashCode());
		result = prime * result + ((pj_num == null) ? 0 : pj_num.hashCode());
		result = prime * result + ((story == null) ? 0 : story.hashCode());
		result = prime * result + target;
		result = prime * result + total;
		result = prime * result + user_num;
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
		ProjectVO other = (ProjectVO) obj;
		if (arti_name == null) {
			if (other.arti_name != null)
				return false;
		} else if (!arti_name.equals(other.arti_name))
			return false;
		if (count != other.count)
			return false;
		if (deadline != other.deadline)
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
		if (pj_num == null) {
			if (other.pj_num != null)
				return false;
		} else if (!pj_num.equals(other.pj_num))
			return false;
		if (story == null) {
			if (other.story != null)
				return false;
		} else if (!story.equals(other.story))
			return false;
		if (target != other.target)
			return false;
		if (total != other.total)
			return false;
		if (user_num != other.user_num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProjectVO [pj_num=" + pj_num + ", image=" + image + ", pj_name=" + pj_name + ", arti_name=" + arti_name
				+ ", deadline=" + deadline + ", total=" + total + ", target=" + target + ", story=" + story
				+ ", user_num=" + user_num + ", count=" + count + "]";
	}



}
