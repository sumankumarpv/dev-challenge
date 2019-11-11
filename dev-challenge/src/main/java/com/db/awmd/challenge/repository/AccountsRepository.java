package com.db.awmd.challenge.repository;

import com.db.awmd.challenge.domain.Account;
import com.db.awmd.challenge.domain.AccountUpdate;
import com.db.awmd.challenge.exception.DuplicateAccountIdException;

import java.math.BigDecimal;
import java.util.List;

public interface AccountsRepository {
  /*
   * for create a new account 
   */
  void createAccount(Account account) throws DuplicateAccountIdException;

  /*
   * to get the 
   */
  Account getAccount(String accountId);
  
  List<Account> getAccounts();

  void clearAccounts();

  boolean updateAccountsBatch(List<AccountUpdate> accountUpdates);

}
