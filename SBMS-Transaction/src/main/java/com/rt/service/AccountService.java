package com.rt.service;

import com.rt.entity.Account;

public interface AccountService {
	
	public Account createAccount(Account account);
	
	public Account getAccount(Long id);
	
	public void transferMoney(Long fromAccountId, Long toAccountId, Double amount);
}
