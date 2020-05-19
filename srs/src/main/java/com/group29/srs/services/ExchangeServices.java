package com.group29.srs.services;

import com.group29.srs.model.*;
import com.group29.srs.repository.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeServices {
    @Autowired
    ExchangeRepository exchangeRepository;

    public List<Exchange_School> getExchangeInfoById(Long id) {
        return exchangeRepository.getExchangeInfoById(id);
    }
}