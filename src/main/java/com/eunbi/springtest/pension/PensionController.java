package com.eunbi.springtest.pension;

import com.eunbi.springtest.ajax.domain.Favorites;
import com.eunbi.springtest.pension.domain.Booking;
import com.eunbi.springtest.pension.service.PensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

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

}
