package com.supratik.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "KNA1")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "KUNNR", nullable = false, unique = true)
	public Long customerNumber;
	@Column(name = "NAME1")
	public String customerName;
	@Column(name = "VKORG")
	public String salesOrg;
	@Column(name = "BUKRS")
	public String companyCode;
	@Column(name = "GSTNO")
	public String gstNo;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Customer", referencedColumnName = "KUNNR")
	List<Address> address = new ArrayList<>();

	public Customer() {

	}

	public Customer(Long customerNumber, String customerName, String salesOrg, String companyCode, String gstNo,
			List<Address> address) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.salesOrg = salesOrg;
		this.companyCode = companyCode;
		this.gstNo = gstNo;
		this.address = address;
	}

	public Long getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSalesOrg() {
		return salesOrg;
	}

	public void setSalesOrg(String salesOrg) {
		this.salesOrg = salesOrg;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

}
