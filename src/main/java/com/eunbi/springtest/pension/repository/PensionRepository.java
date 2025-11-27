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
            @Param("name") String name
            , @Param("headCount") int headCount
            , @Param("day") int day
            , @Param("date") LocalDate date
            , @Param("phoneNumber") String phoneNumber
            , @Param("state") String state);


    public int deleteBooking(@Param("id") int id);

    public Booking selectBooking(
            @Param("name") String name
            , @Param("phoneNumber") String phoneNumber);


}
