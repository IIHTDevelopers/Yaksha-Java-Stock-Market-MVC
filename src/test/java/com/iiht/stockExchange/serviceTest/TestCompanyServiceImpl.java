package com.iiht.stockExchange.serviceTest;

import static com.iiht.stockExchange.UtilTestClass.TestUtils.businessTestFile;
import static com.iiht.stockExchange.UtilTestClass.TestUtils.currentTest;
import static com.iiht.stockExchange.UtilTestClass.TestUtils.yakshaAssert;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.iiht.stockExchange.UtilTestClass.MasterData;
import com.iiht.stockExchange.dao.CompanyDetailsDao;
import com.iiht.stockExchange.entity.CompanyDetails;
import com.iiht.stockExchange.service.CompanyServiceImpl;

public class TestCompanyServiceImpl {

	@Mock
	private CompanyDetailsDao companyDetailsDao;

	@InjectMocks
	private CompanyServiceImpl companyServiceImpl;
	
	// -------------------------------------------------------------------------------------------------------------------
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	//--------------------------------------------------------------------------------------------------------------------------------
	@Test
	public void testSaveCompanyDetailsServiceImplementation() throws Exception {
		boolean value = companyServiceImpl.saveCompany(MasterData.getCompanyDetails());
	    yakshaAssert(currentTest(), value ? true : false, businessTestFile);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------
	@Test 
	public void testViewAllCompanyDetailsServiceImplementation() throws Exception {
		List<CompanyDetails> list = new ArrayList<CompanyDetails>();
		list.add(MasterData.getCompanyDetails());
		list.add(MasterData.getCompanyDetails());
		when(companyDetailsDao.getAllCompanies()).thenReturn((List<CompanyDetails>) list);
		List<CompanyDetails> commentFromdb = companyServiceImpl.getAllCompanies();
		if(commentFromdb == null) {
			yakshaAssert(currentTest(), false, businessTestFile);
			return;
		}
	    yakshaAssert(currentTest(), commentFromdb == list ? true : false, businessTestFile);
	}
}