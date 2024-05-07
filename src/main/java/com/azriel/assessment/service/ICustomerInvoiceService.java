package com.azriel.assessment.service;

import java.util.Map;

public interface ICustomerInvoiceService {

    Map<Long, String> getInvoiceTenderTypes(long customerId);
}
