package com.eunbi.springtest.pension.service;

import com.eunbi.springtest.pension.domain.Booking;
import com.eunbi.springtest.pension.repository.PensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

    public int createBookedList(String name, int headCount, int day, LocalDate date, String phoneNumber) {
        int count = pensionRepository.insertBookingList(name,headCount,day,date,phoneNumber);
        return count;
    }


    public int deleteBooking(int id) {

        int count = pensionRepository.deleteBooking(id);

        return count;
    }


}
