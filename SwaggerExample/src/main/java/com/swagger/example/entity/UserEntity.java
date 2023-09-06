package com.swagger.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer Uid;
	private String Uname;
	private String Uaddress;
public Integer getUid() {
		return Uid;
	}
	public void setUid(Integer uid) {
		Uid = uid;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getUaddress() {
		return Uaddress;
	}
	public void setUaddress(String uaddress) {
		Uaddress = uaddress;
	}
	@Override
	public String toString() {
		return "UserEntity [Uid=" + Uid + ", Uname=" + Uname + ", Uaddress=" + Uaddress + "]";
	}
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
