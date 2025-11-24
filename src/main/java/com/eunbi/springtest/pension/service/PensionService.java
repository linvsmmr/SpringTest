package com.eunbi.springtest.pension.service;

import com.eunbi.springtest.pension.domain.Booking;
import com.eunbi.springtest.pension.repository.PensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PensionService {

    @Autowired
    private PensionRepository pensionRepository;

    public List<Booking> getBookedList() {

        List<Booking> bookingList = pensionRepository.bookedList();

        return bookingList;
    }
}
