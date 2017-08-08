package model;
import javax.persistence.Entity;



import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user database table.
 * 
 */

@Table(name="User")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")

public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
    @Column
	private String ldesc;
    @Column
	private String sdesc;
    @Column
	private String url;
    @Column
	private int userid;
    
	public UserEntity() {
	}

	public String getLdesc() {
		return this.ldesc;
	}

	public void setLdesc(String ldesc) {
		this.ldesc = ldesc;
	}

	public String getSdesc() {
		return this.sdesc;
	}

	public void setSdesc(String sdesc) {
		this.sdesc = sdesc;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
    
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}