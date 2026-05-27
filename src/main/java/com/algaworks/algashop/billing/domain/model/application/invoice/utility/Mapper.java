package com.algaworks.algashop.billing.domain.model.application.invoice.utility;

public interface Mapper {
    <T> T convert(Object o, Class<T> destinationClass);
}
