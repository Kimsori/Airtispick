package artispick.user;

import java.util.Date;

public class UserVO { //사용자 정보 저장 객체
	private String id;
	private String passwd;
	private String userName;
	private Date birth;
	private String gender;
	private String phone;
	private String email;
	private String artiName;
	private String intro;
	private String artiProfile;
	private Date visit;
	private Date regDate;
	private int field;

	public UserVO(){}
	
	public UserVO(String id){
		super();
		this.id = id;
	}

	public UserVO(String id, String passwd, String userName, Date birth, String gender, String phone, String email,
			String artiName, String intro, String artiProfile, Date visit, Date regDate, int field) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.userName = userName;
		this.birth = birth;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.artiName = artiName;
		this.intro = intro;
		this.artiProfile = artiProfile;
		this.visit = visit;
		this.regDate = regDate;
		this.field = field;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getArtiProfile() {
		return artiProfile;
	}

	public void setArtiProfile(String artiProfile) {
		this.artiProfile = artiProfile;
	}

	public Date getVisit() {
		return visit;
	}

	public void setVisit(Date visit) {
		this.visit = visit;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getField() {
		return field;
	}

	public void setField(int field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", passwd=" + passwd + ", userName=" + userName + ", birth=" + birth + ", gender="
				+ gender + ", phone=" + phone + ", email=" + email + ", artiName=" + artiName + ", intro=" + intro
				+ ", artiProfile=" + artiProfile + ", visit=" + visit + ", regDate=" + regDate + ", field=" + field
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artiName == null) ? 0 : artiName.hashCode());
		result = prime * result + ((artiProfile == null) ? 0 : artiProfile.hashCode());
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + field;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((intro == null) ? 0 : intro.hashCode());
		result = prime * result + ((passwd == null) ? 0 : passwd.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((regDate == null) ? 0 : regDate.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((visit == null) ? 0 : visit.hashCode());
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
		UserVO other = (UserVO) obj;
		if (artiName == null) {
			if (other.artiName != null)
				return false;
		} else if (!artiName.equals(other.artiName))
			return false;
		if (artiProfile == null) {
			if (other.artiProfile != null)
				return false;
		} else if (!artiProfile.equals(other.artiProfile))
			return false;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (field != other.field)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (intro == null) {
			if (other.intro != null)
				return false;
		} else if (!intro.equals(other.intro))
			return false;
		if (passwd == null) {
			if (other.passwd != null)
				return false;
		} else if (!passwd.equals(other.passwd))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (regDate == null) {
			if (other.regDate != null)
				return false;
		} else if (!regDate.equals(other.regDate))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (visit == null) {
			if (other.visit != null)
				return false;
		} else if (!visit.equals(other.visit))
			return false;
		return true;
	}

	
	
}