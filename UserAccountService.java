package services;

import java.util.List;

import bean.UserMain;

public interface UserAccountService {
	 public Integer createUserAccount(Integer accountNo,String userPassword);
     public Integer showBalance(Integer accountNo,String userPassword);
     public Integer deposite(Integer accountNo,String userPassword,Integer amount);
     public Integer withdraw(Integer accountNo,String userPassword,Integer amount);
     public String fundTransfer(Integer accountNo,String userPassword,Integer destinationAccNo,Integer amount);
     public Integer getUserAccountDetails(Integer accountNo,String userPassword);
     public String printTransaction(Integer accountNo,String userPassword);
     
    //validation methods
     
    Integer validAccountNo(Integer accountNo);
	String nameCheck(String userName);
	String passwordCheck(String userPassword);
	String PhoneNumberCheck(String phoneNo);
	String EmailIdCheck(String emailId);
	String checkBalance(String accountId,String amount);

}

