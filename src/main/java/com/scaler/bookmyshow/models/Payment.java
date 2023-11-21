package com.scaler.bookmyshow.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Payment extends BaseModel{
    private int amount;

    private int refNo;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.ORDINAL)
    private PaymentType paymentType;
}
