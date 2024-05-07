package com.azriel.assessment.rest;

import com.azriel.assessment.service.ICustomerInvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/invoice")
public class InvoiceController {

    private final ICustomerInvoiceService customerInvoiceService;
    @GetMapping("/tender-type")
    public Map<Long, String> getInvoiceTenderType(@RequestParam Long customerId) {

        return customerInvoiceService.getInvoiceTenderTypes(customerId);
    }
}
