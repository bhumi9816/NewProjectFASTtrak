import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnit_Payment {

	
	private Payment paymentForAccount1;
	private Payment paymentForAccount2;
	private Payment paymentTester1;
	private Vehicle car1;
	
	@Test
	void TestingValidCreationOfPaymentObjectDefaultConstructor() {
		paymentForAccount1 = new Payment();
		String ExpectedCardName = "";
		String ExpectedCardNum = "";
		String ExpectedExpDate = "";
		String ExpectedCcv = "";
		double ExpectedAcctBalance = 0.0;
		
		String ActualCardName = paymentForAccount1.getCardName();
		String ActualCardNum = paymentForAccount1.getCardNum();
		String ActualExpDate = paymentForAccount1.getExpDate();
		String ActualCcv = paymentForAccount1.getCCV();
		double ActualAcctBalance = paymentForAccount1.getBalance();
		
		assertEquals(ExpectedCardName,ActualCardName,"Card name should be an empty string");
		assertEquals(ExpectedCardNum,ActualCardNum,"Card number should be an empty string");
		assertEquals(ExpectedExpDate,ActualExpDate,"Card exp date should be an empty string");
		assertEquals(ExpectedCcv,ActualCcv,"Card ccv should be an empty string");
		assertEquals(ExpectedAcctBalance,ActualAcctBalance,"Account Balance should be 0");
	}
	
	@Test
	void TestingValidCreationOfPaymentObjectCustomConstructor() {
		paymentForAccount2 = new Payment("VISA", "3793545081662306", "162021", "582");
		
		String ActualCardName = paymentForAccount2.getCardName();
		String ActualCardNum = paymentForAccount2.getCardNum();
		String ActualExpDate = paymentForAccount2.getExpDate();
		String ActualCcv = paymentForAccount2.getCCV();
		
		//Test Card Name
		//Case for no input
		assertTrue(ActualCardName!="", "Error, no card name entered");
		
		
		//Test Card Number
		//Case for no input
		assertTrue(ActualCardNum!="", "Error, no card number entered");
		//Case for input
		assertTrue(paymentForAccount2.validateCreditCardNumber(paymentForAccount2.getCardNum()), "Credit card number must be 16 digits long");
		
		
		//Test Card Exp Date
		//Case for no input
		assertTrue(ActualExpDate!="", "Error, no expiration date entered");
		//Case for input
		assertTrue(paymentForAccount2.validateExpDate(paymentForAccount2.getExpDate()), "Credit card expiration date must be 6 digits");
		
		
		//Test Card CCV
		//Case for no input
		assertTrue(ActualCcv!="", "Error, no ccv entered");
		//Case for input
		assertTrue(paymentForAccount2.validateCCV(paymentForAccount2.getCCV()), "Credit card ccv must be 3 digits long");
		
		//Test Account Balance
		paymentForAccount2.loadAccount("50");
		double ActualAcctBalance = paymentForAccount2.getBalance();
		assertTrue(ActualAcctBalance >=0, "Account balance must be greater than or equal to 0");
	}
	
	@Test
	void TestingSampleTransaction() {
		paymentTester1 = new Payment("VISA", "3793545081662306", "162021", "582");
		paymentTester1.loadAccount("50");
		System.out.println(paymentTester1.receiveCharge());
	}
}
