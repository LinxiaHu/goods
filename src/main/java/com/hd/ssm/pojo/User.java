package com.hd.ssm.pojo;

public class User {
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((activationcode == null) ? 0 : activationcode.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((loginname == null) ? 0 : loginname.hashCode());
		result = prime * result
				+ ((loginpass == null) ? 0 : loginpass.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
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
		User other = (User) obj;
		if (activationcode == null) {
			if (other.activationcode != null)
				return false;
		} else if (!activationcode.equals(other.activationcode))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (loginname == null) {
			if (other.loginname != null)
				return false;
		} else if (!loginname.equals(other.loginname))
			return false;
		if (loginpass == null) {
			if (other.loginpass != null)
				return false;
		} else if (!loginpass.equals(other.loginpass))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}

	private String uid;
    
    private String loginname;

    private String loginpass;

    private String email;

    private Boolean status;

    private String activationcode;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getLoginpass() {
        return loginpass;
    }

    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass == null ? null : loginpass.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getActivationcode() {
        return activationcode;
    }

    public void setActivationcode(String activationcode) {
        this.activationcode = activationcode == null ? null : activationcode.trim();
    }
}