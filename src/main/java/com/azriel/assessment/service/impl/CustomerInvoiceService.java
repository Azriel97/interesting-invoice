package com.azriel.assessment.service.impl;

import com.azriel.assessment.mapper.InvoiceMapper;
import com.azriel.assessment.model.InvoiceModel;
import com.azriel.assessment.persistence.repository.InvoiceRepository;
import com.azriel.assessment.service.ICustomerInvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerInvoiceService implements ICustomerInvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceMapper invoiceMapper;

    @Override
    public Map<Long, String> getInvoiceTenderTypes(long customerId) {

        List<InvoiceModel> invoices = invoiceMapper.toModels(
                invoiceRepository.findAllByCustomerId(customerId));
        return invoices.stream().collect(Collectors.toMap(InvoiceModel::getInvoiceId,
                invoice -> invoice.getInvoiceData().getTenderDetails().getType()));
    }
}
