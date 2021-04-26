package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class student {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name ="firstname")
	private String firstName;
	@Column(name ="lastname")
	private String lastName;
	@Column(name ="emailId")
	private String emailId;
	
	@Column(name ="phonenumber")
	private String phonenumber;
	
	
	@Column(name ="Address")
	private String add;
	
	@Column(name ="AadharN")
	private String a;
	
	@Column(name ="Sugar_level")
	private String sl;
	
	
	@Column(name ="Blood_group")
	private String bg;
	
	
	@Column(name ="Any_Disease")
	private String d;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getphone() {
		return phonenumber;
	}
	public void setphone(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String getadd() {
		return add;
	}
	public void setadd(String add) {
		this.add = add;
	}
	
	public String getaadhar() {
		return a;
	}
	public void setaadhar(String a) {
		this.a = a;
	}
	
	
	public String getsl() {
		return sl;
	}
	public void setsl(String sl) {
		this.sl = sl;
	}
	
	
	public String getbg() {
		return bg;
	}
	public void setbg(String bg) {
		this.bg = bg;
	}
	
	
	public String getd() {
		return d;
	}
	public void setd(String d) {
		this.d = d;
	}
	
}

