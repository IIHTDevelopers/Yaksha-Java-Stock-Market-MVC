package com.iiht.stockExchange.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iiht.stockExchange.service.CompanyService;
import com.iiht.stockExchange.service.StockMarketService;

@SuppressWarnings("unused")
@Controller
public class BusinessController {

	@Autowired
	private CompanyService companyService;

	@Autowired
	private StockMarketService stockMarketService;

	// -----------------------------------------------------------------------------------------------
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String visitorPage(Model model)throws Exception {
		
		return "";
	}
	
	// -----------------------------------------------------------------------------------------------
	// 			1. ADD NEW COMPANY DETAILS FOR THE STOCK EXCHANGE
	// -----------------------------------------------------------------------------------------------
	@RequestMapping(value = "/addNewCompany", method = RequestMethod.GET)
	public String addNewCompany(Model model)throws Exception {
		
		return "";
	}
	// -----------------------------------------------------------------------------------------------
	@RequestMapping(value = "/saveNewCompany", method = RequestMethod.POST)
	public String saveNewCompany(HttpServletRequest request, Model model) throws Exception {
		return "";
	}
	
	// -----------------------------------------------------------------------------------------------
	// 			2. DISPLAY COMPANY DETAILS FOR A STOCK EXCHANGE
	// -----------------------------------------------------------------------------------------------
	@RequestMapping(value = "/listAllCompanies", method = RequestMethod.GET)
	public String listAllCompanies(Model model) {
		return "";
	}
	
	// -----------------------------------------------------------------------------------------------
	// 			3. ADD MULTIPLE STOCK PRICES FOR THE COMPANY
	// -----------------------------------------------------------------------------------------------
	@RequestMapping(value = "/addStockPrices", method = RequestMethod.GET)
	public String addStockPrices(Model model) {
		return "";
	}
	// -----------------------------------------------------------------------------------------------
	@RequestMapping(value = "/saveStockPrices", method = RequestMethod.POST)
	public String saveStockPrices(HttpServletRequest request, Model model) throws Exception {
		return "";
	}
	
	// -----------------------------------------------------------------------------------------------
	// 			4. STOCK DETAILS OF THE COMPANY
	// -----------------------------------------------------------------------------------------------
	@RequestMapping(value = "/showStockDetails", method = RequestMethod.GET)
	public String showStockDetails(Model model) {
		return "";
	}

	// -----------------------------------------------------------------------------------------------
	// 			5. STOCK PRICE INDEX OF THE COMPANY
	// -----------------------------------------------------------------------------------------------
	@RequestMapping(value = "/showStockStatistics", method = RequestMethod.GET)
	public String showStockStatistics(Model model) {
		return "";
	}
}
