/*
 * ContractDetails.java
 */
package com.ib.client;

public class ContractDetails {
	public Contract	m_summary;
	public String	m_marketName;
	public String	m_tradingClass;
	public double	m_minTick;
	public int	    m_priceMagnifier;
	public String	m_orderTypes;
	public String	m_validExchanges;
	public int	    m_underConId;
	public String	m_longName;
	public String	m_contractMonth;
	public String	m_industry;
	public String	m_category;
	public String	m_subcategory;
	public String	m_timeZoneId;
	public String	m_tradingHours;
	public String	m_liquidHours;
	
	// BOND values
	public String	m_cusip;
	public String	m_ratings;
	public String	m_descAppend;
	public String	m_bondType;
	public String	m_couponType;
	public boolean	m_callable	        = false;
	public boolean	m_putable	        = false;
	public double	m_coupon	        = 0;
	public boolean	m_convertible	    = false;
	public String	m_maturity;
	public String	m_issueDate;
	public String	m_nextOptionDate;
	public String	m_nextOptionType;
	public boolean	m_nextOptionPartial	= false;
	public String	m_notes;
	
	public ContractDetails() {
		m_summary = new Contract();
		m_minTick = 0;
		m_underConId = 0;
	}
	
	public ContractDetails(final Contract p_summary, final String p_marketName,
	        final String p_tradingClass,
	        final double p_minTick, final String p_orderTypes,
	        final String p_validExchanges, final int p_underConId,
	        final String p_longName,
	        final String p_contractMonth, final String p_industry,
	        final String p_category, final String p_subcategory,
	        final String p_timeZoneId, final String p_tradingHours,
	        final String p_liquidHours) {
		m_summary = p_summary;
		m_marketName = p_marketName;
		m_tradingClass = p_tradingClass;
		m_minTick = p_minTick;
		m_orderTypes = p_orderTypes;
		m_validExchanges = p_validExchanges;
		m_underConId = p_underConId;
		m_longName = p_longName;
		m_contractMonth = p_contractMonth;
		m_industry = p_industry;
		m_category = p_category;
		m_subcategory = p_subcategory;
		m_timeZoneId = p_timeZoneId;
		m_tradingHours = p_tradingHours;
		m_liquidHours = p_liquidHours;
	}
}