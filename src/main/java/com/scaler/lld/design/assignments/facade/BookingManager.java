package com.scaler.lld.design.assignments.facade;
import com.scaler.lld.design.assignments.facade.models.BookingConfirmation;
import com.scaler.lld.design.assignments.facade.models.BookingResult;
import com.scaler.lld.design.assignments.facade.models.PaymentStatus;
import com.scaler.lld.design.assignments.facade.services.*;

import java.time.LocalDate;

public class BookingManager {
    BookingFacade bookingFacade;

    public BookingManager(AvailabilityService availabilityService, PaymentService paymentService,
                          NotificationService notificationService, LoyaltyService loyaltyService,
                          AccommodationDetailsService accommodationDetailsService) {
        bookingFacade = new BookingFacade(availabilityService,paymentService,notificationService,loyaltyService,accommodationDetailsService);
    }

    public BookingResult bookAccommodation(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {
        return bookingFacade.doBooking(userId,accommodationId,checkInDate,checkOutDate);
    }

}