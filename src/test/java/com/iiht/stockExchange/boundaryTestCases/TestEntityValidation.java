// package com.iiht.stockExchange.boundaryTestCases;

// import static com.iiht.stockExchange.UtilTestClass.TestUtils.boundaryTestFile;
// import static com.iiht.stockExchange.UtilTestClass.TestUtils.currentTest;
// import static com.iiht.stockExchange.UtilTestClass.TestUtils.yakshaAssert;

// import java.io.IOException;
// import java.util.Set;

// import javax.validation.ConstraintViolation;
// import javax.validation.Validation;
// import javax.validation.Validator;
// import javax.validation.ValidatorFactory;

// import org.junit.Before;
// import org.junit.Test;

// import org.junit.runner.RunWith;
// import org.springframework.test.context.junit4.SpringRunner;

// import com.iiht.stockExchange.UtilTestClass.MasterData;
// import com.iiht.stockExchange.entity.CompanyDetails;
// import com.iiht.stockExchange.entity.StockPriceDetails;

// //@RunWith(SpringRunner.class)
// public class TestEntityValidation {
//     private Validator validator;
    
//     //----------------------------------------------------------------------------------------------
//     @Before
//     public void setUp() {
//     	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//         validator = factory.getValidator();
//     }

//     //----------------------------------------------------------------------------------------------
   
    
//     //----------------------------------------------------------------------------------------------
//    @Test
//     public void testPostCompanyDetailsFailed() throws IOException {
//     	CompanyDetails compDet = MasterData.getCompanyDetails();
//     	compDet.setCompanyProfile(null);
//         Set<ConstraintViolation<CompanyDetails>> violations = validator.validate(compDet);
// 	    yakshaAssert(currentTest(), !violations.isEmpty() ? true : false, boundaryTestFile);
//     }

//     //----------------------------------------------------------------------------------------------
    
    
//     //----------------------------------------------------------------------------------------------
//     @Test
//     public void testPostStockPriceDetailsFailed() throws IOException {
//     	StockPriceDetails spDet = MasterData.getStockPriceDetails();
//     	spDet.setCurrentStockPrice(null);
//     	Set<ConstraintViolation<StockPriceDetails>> violations = validator.validate(spDet);
// 	    yakshaAssert(currentTest(), !violations.isEmpty() ? true : false, boundaryTestFile);
//     }
// }
