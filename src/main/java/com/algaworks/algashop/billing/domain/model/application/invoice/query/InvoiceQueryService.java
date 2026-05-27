package com.algaworks.algashop.billing.domain.model.application.invoice.query;

public interface InvoiceQueryService {
    InvoiceOutput findByOrderId(String orderId);
}