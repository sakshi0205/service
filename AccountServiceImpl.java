package services;

import java.util.List;
import java.util.Scanner;

import dao.AccountDaoImpl;
import dao.UserAccountDao;
import AccountException.AccountNotFoundException;
import AccountException.InsufficientBalanceException;
import bean.UserMain;

public class AccountServiceImpl implements UserAccountService{
	Scanner sc = new Scanner(System.in);
	UserAccountDao dao=new AccountDaoImpl();
	

	@Override
	public Integer createUserAccount(Integer accountNo, String userPassword) {
		// TODO Auto-generated method stub
		
		return dao.createUserAccount(accountNo, userPassword);
	}

	@Override
	public Integer showBalance(Integer accountNo, String userPassword) {
		return dao.showBalance(accountNo, userPassword);
	}

	@Override
	public Integer deposite(Integer accountNo, String userPassword, Integer amount) {
		return dao.deposite(accountNo, userPassword, amount);
	}

	@Override
	public Integer withdraw(Integer accountNo, String userPassword, Integer amount) {
		return dao.withdraw(accountNo, userPassword, amount);
	}

	@Override
	public String fundTransfer(Integer accountNo,String userPassword,Integer destinationAccNo,Integer amount) {
		return dao.fundTransfer(accountNo, userPassword, destinationAccNo, amount);
	}

	@Override
	public Integer getUserAccountDetails(Integer accountNo,String userPassword) {
		return dao.getUserAccountDetails(accountNo, userPassword);
	}

	@Override
	public String printTransaction(Integer accountNo,String userPassword) {
		return dao.printTransaction(accountNo, userPassword);
		// TODO Auto-generated method stub
		
		
	}


	

	@Override
	public String nameCheck(String userName) {
		// TODO Auto-generated method stub
		
			while(true) {
				
				try {
					if(userName.matches("[A-Z a-z]{3,10}")) {
						return userName;
					}
					else {
						
						throw new Exception();
					}
				}
				catch(Exception ex) {
					System.out.println("------------Input Error----------------");
					System.out.println("Please enter username where length is greater than 2 and less than 10.");
					System.out.println("Enter again:[Enter exit to Login again]");
					userName = sc.nextLine();
					if(userName.equals("exit")) {
						return "exit";
					}
				}
			}
		}
	public  String passwordCheck(String userPassword) {
		while(true) {
			try {
				if(userPassword.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,16}$")) {
					return userPassword;
					
				}
				else {
					throw new Exception();
				}
			}
			catch(Exception ex){
				System.out.println("Please enter valid password(i.e-'Password123')");
				System.out.println("Enter again:[Enter exit to login again]");
				userPassword = sc.nextLine();
				if(userPassword.equals("exit")) {
					return "exit";
				}
			}
			
		}
	}

	@Override
	public String PhoneNumberCheck(String phoneNo) {
		while(true) {
			try {
				if(phoneNo.matches("[6-9][0-9]{9}")) {
					return phoneNo;
					
				}
				else {
					throw new Exception();
				}
			}
			catch(Exception ex){
				System.out.println("Enter valid mobile number(i.e - 10 digit only)");
				System.out.println("Enter again");
				phoneNo = sc.nextLine();
				if(phoneNo.equals("exit")) {
					return "exit";
				}
			}
			
		}
	}

	@Override
	public String EmailIdCheck(String emailId) {
		// TODO Auto-generated method stub
		while(true) {
			try {
				if(emailId.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
								+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
					return emailId;
					
				}
				else {
					throw new Exception();
				}
			}
			catch(Exception ex){
				System.out.println("Please enter valid email(i.e-'Password123@gmail.com')");
				System.out.println("Enter again:[Enter exit to login again]");
				emailId = sc.nextLine();
				if(emailId.equals("exit")) {
					return "exit";
				}
			}
			
		}
	}

	@Override
	public Integer validAccountNo(Integer accountNo) {
		// TODO Auto-generated method stub
		if(dao.validAccountNo(accountNo)) {
			return accountNo;
		}
		else {
			throw new AccountNotFoundException("Invalid Account Number");
		}
	
}
	public String checkBalance(String accountId,String amount) {
		if(dao.checkBalance(accountId, Integer.parseInt(amount))) { //Here we transfer amount to DAO class.
			return amount;
		}
		else {
			throw new InsufficientBalanceException("Insufficient amount");
		}

	}
	}
		


	
	


	
