package com.eunbi.springtest.pension.repository;

import com.eunbi.springtest.pension.domain.Booking;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface PensionRepository {

    public List<Booking> bookedList();

    public int insertBookingList(
            @RequestParam("name") String name
            , @RequestParam("headCount") int headCount
            , @RequestParam("day") int day
            , @RequestParam("date") LocalDate date
            , @RequestParam("phoneNumber") String phoneNumber);


    public int deleteBooking(@Param("id") int id);


}
