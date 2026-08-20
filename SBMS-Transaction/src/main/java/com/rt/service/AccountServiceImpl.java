package com.rt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.entity.Account;
import com.rt.execption.InsufficientBalance;
import com.rt.repository.AccountRepository;

import jakarta.transaction.Transactional;

@Service
public class AccountServiceImpl implements  AccountService{
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account createAccount(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public Account getAccount(Long id) {
		return accountRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("account not found with id : "+id));
	}

	@Override
	@Transactional
	public void transferMoney(Long fromAccountId, Long toAccountId, Double amount) {
			System.out.println("Transaction Started");
			Account sender = getAccount(fromAccountId);
			Account receiver = getAccount(toAccountId);
			
			if(amount<=0) {
				throw new IllegalArgumentException("Amount must be greater than 0");
			}
			
			if(sender.getBalance() < amount) {
				throw new InsufficientBalance("balance insufficient");
			}
			
			sender.setBalance(sender.getBalance()-amount);
			
			accountRepository.save(sender);
			
			System.out.println("Amount debited from sender");
			
			receiver.setBalance(
	                receiver.getBalance() + amount
	        );

	        accountRepository.save(receiver);

	        System.out.println("Amount credited to receiver");

	        System.out.println("Transaction Completed");
	}
}
