package com.iiht.stockExchange.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CompanyDetails")
public class CompanyDetails implements Serializable {

	private static final long serialVersionUID = 7203557872090360571L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "companyCode")
	private Long companyCode;
	
	
	@Column(name = "stockExchange")
	private String stockExchange;

	
	@Column(name = "companyName")
	private String companyName;

	
	@Column(name = "companyCEO")
	private String companyCEO;

	
	@Column(name = "turnover", precision=10, scale=2)
	private Double turnover;

	
	@Column(name = "boardOfDirectors")
	private String boardOfDirectors;

	
	@Column(name = "companyProfile")
	private String companyProfile;								// Brief writeup, about companies Services/Product, etc…
	
	@OneToMany(cascade= {CascadeType.MERGE})
	@JoinColumn(name="companyCode")
	private Set<StockPriceDetails> StockPriceDetails;

	
	
	public Long getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(Long companyCode) {
		this.companyCode = companyCode;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCEO() {
		return companyCEO;
	}

	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}

	public Double getTurnover() {
		return turnover;
	}

	public void setTurnover(Double turnover) {
		this.turnover = turnover;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getCompanyProfile() {
		return companyProfile;
	}

	public void setCompanyProfile(String companyProfile) {
		this.companyProfile = companyProfile;
	}

	public Set<StockPriceDetails> getStockPriceDetails() {
		return StockPriceDetails;
	}

	public void setStockPriceDetails(Set<StockPriceDetails> stockPriceDetails) {
		StockPriceDetails = stockPriceDetails;
	}
	
	
	
}

