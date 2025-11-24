package com.eunbi.springtest.pension.repository;

import com.eunbi.springtest.pension.domain.Booking;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PensionRepository {

    public List<Booking> bookedList();

}
