package com.medinDev.accounts.service;

import com.medinDev.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
}
