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

    public int createBookedList(String name, int headCount, int day, LocalDate date, String phoneNumber, String state) {
        int count = pensionRepository.insertBookingList(name,headCount,day,date,phoneNumber, state);
        return count;
    }


    public int deleteBooking(int id) {

        int count = pensionRepository.deleteBooking(id);

        return count;
    }

    public int createBooking(
            String name
            , int headcount
            , int day
            , LocalDate date
            , String phoneNumber) {

        int count = pensionRepository.insertBookingList(name, headcount, day, date, phoneNumber, "대기중");

        return count;
    }

    public Booking getBooking(String name, String phoneNumber) {

        Booking booking = pensionRepository.selectBooking(name, phoneNumber);

        return booking;
    }


}
