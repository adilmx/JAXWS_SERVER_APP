package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import model.Account;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "accountService")
public class AccountService {
	@WebMethod(operationName = "conversion")
	public double conversion(@WebParam(name = "mt") double mt) {
		return mt * 12;
	}

	@WebMethod
	public Account getAccount(@WebParam(name = "id") Long id) {
		return new Account(id, new Date(), id * 1000, false);
	}

	@WebMethod
	public List<Account> getAll() {
		List<Account> accounts = new ArrayList<>();
		accounts.add(getAccount(1L));
		accounts.add(getAccount(2L));
		accounts.add(getAccount(3L));
		return accounts;
	}
}
