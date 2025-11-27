package com.eunbi.springtest.pension;

import com.eunbi.springtest.ajax.domain.Favorites;
import com.eunbi.springtest.pension.domain.Booking;
import com.eunbi.springtest.pension.service.PensionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/pension")
@Controller
public class PensionController {

    @Autowired
    private PensionService pensionService;

    @GetMapping("/home")
    public String mainPage() {
        return "pension/mainMenu";
    }

    @GetMapping("/booking")
    public String booking() {
        return "pension/booking";
    }

    @GetMapping("/booking-list")
    public String bookingList(Model model) {

        List<Booking> bookingList = pensionService.getBookedList();

        model.addAttribute("bookingList", bookingList);

        return "pension/bookingList";
    }


    // 사이트 이름, 주소를 전달 받고, 저장하는 API
    @ResponseBody
    @GetMapping("/add")
    public Map<String, String> addBookingList(
            @RequestParam("name") String name
            , @RequestParam("headCount") int headCount
            , @RequestParam("day") int day
            , @RequestParam("date") @DateTimeFormat(pattern = "yyyyMMdd") LocalDate date
            , @RequestParam("phoneNumber") String phoneNumber
            , @RequestParam("state") String state) {

        int count = pensionService.createBookedList(name,headCount,day,date,phoneNumber,state);

        Map<String, String> resultMap = new HashMap<>();
        // 성공 : {"result":"success"}
        // 실패 : {"result":"fail"}

        if(count == 1) {
            resultMap.put("result", "success");
        } else {
            resultMap.put("result", "fail");
        }

        return resultMap;
    }


    @ResponseBody
    @GetMapping("/remove")
    public Map<String, String> deleteBooking(@RequestParam("id") int id) {

        int count = pensionService.deleteBooking(id);

        Map<String, String> resultMap = new HashMap<>();
        // {"result":"success"}
        // {"result":"fail"}

        if(count == 1) {
            resultMap.put("result", "success");
        } else {
            resultMap.put("result", "fail");
        }

        return resultMap;

    }


    @ResponseBody
    @GetMapping("/search")
    public Map<String, Object> searchBooking(
            @RequestParam("name") String name
            , @RequestParam("phoneNumber") String phoneNumber) {

        Booking booking = pensionService.getBooking(name, phoneNumber);

        Map<String, Object> resultMap = new HashMap<>();

        if(booking != null) {
            resultMap.put("result", "success");
            resultMap.put("booking", booking);
        } else {
            resultMap.put("result", "fail");
        }
        return resultMap;

    }

}
