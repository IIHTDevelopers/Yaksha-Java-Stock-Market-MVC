package com.iiht.stockExchange.FunctionalTestCases;

import static com.iiht.stockExchange.UtilTestClass.TestUtils.businessTestFile;
import static com.iiht.stockExchange.UtilTestClass.TestUtils.currentTest;
import static com.iiht.stockExchange.UtilTestClass.TestUtils.yakshaAssert;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.iiht.stockExchange.controller.BusinessController;
import com.iiht.stockExchange.entity.CompanyDetails;
import com.iiht.stockExchange.entity.StockPriceDetails;
import com.iiht.stockExchange.service.CompanyService;
import com.iiht.stockExchange.service.StockMarketService;

public class TestBusinessController 
{
	@Mock
	private CompanyService companyService;

	@Mock
	private StockMarketService stockMarketService;

	@InjectMocks
	private BusinessController businessController;

	private MockMvc mockMvc;
	
	// -------------------------------------------------------------------------------------------------------------------
	/*
	 * Description	: This test is to perform setup for Mockito initiations
	 */
	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(businessController).build();
	}

	// -------------------------------------------------------------------------------------------------------------------
	/*
	 * Description	: This test is to perform Loading the landing page URL
	 */
	/*@Test
	public void testLoadingPageUrl() throws Exception {
		
			MvcResult result = this.mockMvc.perform(get("/")).andReturn();
			yakshaAssert(currentTest(), result.getModelAndView().getViewName().contentEquals("home") ? true : false, businessTestFile);
		
	    
	}*/

	// -------------------------------------------------------------------------------------------------------------------
	/*
	 * Description	: This test is to perform add new Company Details
	 */
	@Test 
	public void testAddCompanyDetails() throws Exception { 
		MvcResult result = this.mockMvc.perform(get("/addNewCompany")).andReturn();
	    yakshaAssert(currentTest(), result.getModelAndView().getViewName().contentEquals("addCompanyInfo") ? true : false, businessTestFile);
	}

	// -------------------------------------------------------------------------------------------------------------------
	/*
	 * Description	: This test is to perform view all the Company Details from database 
	 */
	@Test 
	public void testViewAllCompanyDetails() throws Exception { 
		List<CompanyDetails> cdList = new ArrayList<CompanyDetails>(); 
		cdList.add(new CompanyDetails());
		cdList.add(new CompanyDetails());	
		when(companyService.getAllCompanies()).thenReturn((List<CompanyDetails>) cdList);
		MvcResult result = this.mockMvc.perform(get("/listAllCompanies")).andReturn();
	    yakshaAssert(currentTest(), result.getModelAndView().getViewName().contentEquals("listAllCompanies") ? true : false, businessTestFile);
	}

	// -------------------------------------------------------------------------------------------------------------------
	/*
	 * Description	: This test is to perform check the null operation against view all Company Details 
	 */
	@Test 
	public void testViewAllCompanyDetailsCase() throws Exception {
		when(companyService.getAllCompanies()).thenReturn(null);
		MvcResult result = this.mockMvc.perform(get("/listAllCompanies")).andReturn(); 
	    yakshaAssert(currentTest(), result.getModelAndView().getViewName().contentEquals("home") ? true : false, businessTestFile);
	}
		
	// -------------------------------------------------------------------------------------------------------------------
	/*
	 * Description	: This test is to perform add new Stock Price Details
	 */
	@Test 
	public void testCommitStockPrices() throws Exception { 
		MvcResult result = this.mockMvc.perform(post("/saveStockPrices")).andReturn();
	    yakshaAssert(currentTest(), result.getModelAndView().getViewName().contentEquals("home") ? true : false, businessTestFile);
	}

	// -------------------------------------------------------------------------------------------------------------------
	/*
	 * Description	: This test is to perform view all the Company Details from database 
	 */
	@Test 
	public void testViewAllStockPriceDetails() throws Exception { 
		List<StockPriceDetails> spList = new ArrayList<StockPriceDetails>(); 
		spList.add(new StockPriceDetails());
		spList.add(new StockPriceDetails());
		when(stockMarketService.getAllStock()).thenReturn((List<StockPriceDetails>) spList);
		MvcResult result = this.mockMvc.perform(get("/showStockDetails")).andReturn();//.andExpect(status().isOk()).andExpect(view().name("displayStockDetails")).andReturn();
	    yakshaAssert(currentTest(), result.getModelAndView().getViewName().contentEquals("displayStockDetails") ? true : false, businessTestFile);
	}	

	// -------------------------------------------------------------------------------------------------------------------
	/*
	 * Description	: This test is to perform check the null operation against view all Stock Details 
	 */
	@Test 
	public void testViewAllStockPriceDetailsCase() throws Exception {
		when(stockMarketService.getAllStock()).thenReturn(null);
		MvcResult result = this.mockMvc.perform(get("/showStockDetails")).andReturn(); 
	    yakshaAssert(currentTest(), result.getModelAndView().getViewName().contentEquals("home") ? true : false, businessTestFile);
	}

	// -------------------------------------------------------------------------------------------------------------------
	/*
	 * Description	: This test is to perform view all the Stock Price Index from database 
	 */
	@Test 
	public void testViewAllStockPriceStatistics() throws Exception { 
		List<StockPriceDetails> spList = new ArrayList<StockPriceDetails>(); 
		spList.add(new StockPriceDetails());
		spList.add(new StockPriceDetails());
		when(stockMarketService.getAllStock()).thenReturn((List<StockPriceDetails>) spList);
		MvcResult result = this.mockMvc.perform(get("/showStockStatistics")).andReturn();
	    yakshaAssert(currentTest(), result.getModelAndView().getViewName().contentEquals("showStockStatistics") ? true : false, businessTestFile);
	}	

	// -------------------------------------------------------------------------------------------------------------------
	/*
	 * Description	: This test is to perform view all the Stock Price Index from database 
	 */
	@Test 
	public void testViewAllStockPriceStatisticsCase() throws Exception {
		when(stockMarketService.getAllStock()).thenReturn(null);
		MvcResult result = this.mockMvc.perform(get("/showStockStatistics")).andReturn(); 
	    yakshaAssert(currentTest(), result.getModelAndView().getViewName().contentEquals("home") ? true : false, businessTestFile);
	}
}





// -------------------------------------------------------------------------------------------------------------------
/*
 * Description	: This test is to perform add new Stock Price Details
 */
/*
 * @Test public void testSelectStockExchange() throws Exception { MvcResult
 * result =
 * this.mockMvc.perform(get("/selectStockExchange?stockExchange=NSE")).andExpect
 * (status().isOk()).andExpect(view().name("addStockPrices")).andReturn();
 * yakshaAssert(currentTest(), result.getResponse().getStatus() ==
 * HttpStatus.OK.value() ? true : false, businessTestFile); }
 */

// -------------------------------------------------------------------------------------------------------------------
/*
 * Description	: This test is to perform add new Stock Price Details
 */
/*
 * @Test public void testSelectCompanyName() throws Exception { MvcResult result
 * = this.mockMvc.perform(get(
 * "/selectCompanyName?companyName=Samsung+India+Pvt+Ltd")).andExpect(status().
 * isOk()).andExpect(view().name("addStockPrices")).andReturn();
 * yakshaAssert(currentTest(), result.getResponse().getStatus() ==
 * HttpStatus.OK.value() ? true : false, businessTestFile); }
 */

// -------------------------------------------------------------------------------------------------------------------
/*
 * Description	: This test is to perform add new Stock Price Details
 */
/*
 * @Test public void testCommitStockPrices() throws Exception { MvcResult result
 * =
 * this.mockMvc.perform(post("/commitStockPrices?stockId="+102+"&stockPrice="+25
 * .76+"&stockDate=08%2F10%2F2020&stockTime=10%3A30AM")).andExpect(status().isOk
 * ()).andExpect(view().name("home")).andReturn(); yakshaAssert(currentTest(),
 * result.getResponse().getStatus() == HttpStatus.OK.value() ? true : false,
 * businessTestFile); }
 */
// -------------------------------------------------------------------------------------------------------------------
/*
 * Description	: This test is to perform add new Stock Price Details
 */
/*
 * @Test public void testSelectStockExchange2() throws Exception { MvcResult
 * result =
 * this.mockMvc.perform(get("/selectStockExchange2?stockExchange=NSE")).
 * andExpect(status().isOk()).andExpect(view().name("displayStockDetails")).
 * andReturn(); yakshaAssert(currentTest(), result.getResponse().getStatus() ==
 * HttpStatus.OK.value() ? true : false, businessTestFile); }
 */

// -------------------------------------------------------------------------------------------------------------------
/*
 * Description	: This test is to perform add new Stock Price Details
 */
/*
 * @Test public void testSelectCompanyName2() throws Exception { MvcResult
 * result =
 * this.mockMvc.perform(get("/selectCompanyName2?companyName=Google")).andExpect
 * (status().isOk()).andExpect(view().name("displayStockDetails")).andReturn();
 * yakshaAssert(currentTest(), result.getResponse().getStatus() ==
 * HttpStatus.OK.value() ? true : false, businessTestFile); }
 */

// -------------------------------------------------------------------------------------------------------------------
/*
 * Description	: This test is to perform add new Stock Price Index Details
 */
/*
 * @Test public void testSelectStockExchange3() throws Exception { MvcResult
 * result =
 * this.mockMvc.perform(get("/selectStockExchange3?stockExchange=NSE")).
 * andExpect(status().isOk()).andExpect(view().name("stockPriceIndex")).
 * andReturn(); yakshaAssert(currentTest(), result.getResponse().getStatus() ==
 * HttpStatus.OK.value() ? true : false, businessTestFile); }
 */

// -------------------------------------------------------------------------------------------------------------------
/*
 * Description	: This test is to perform add new Stock Price Details
 */
/*
 * @Test public void testSelectCompanyName3() throws Exception { MvcResult
 * result =
 * this.mockMvc.perform(get("/selectCompanyName3?companyName=Google")).andExpect
 * (status().isOk()).andExpect(view().name("stockPriceIndex")).andReturn();
 * yakshaAssert(currentTest(), result.getResponse().getStatus() ==
 * HttpStatus.OK.value() ? true : false, businessTestFile); }
 */