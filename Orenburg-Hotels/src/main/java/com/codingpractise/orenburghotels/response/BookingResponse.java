/**
 * 
 */
package com.codingpractise.orenburghotels.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mohsin Khan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
	private Long bookingId;

	private LocalDate checkedInDate;

	private LocalDate checkOutDate;

	private String guestFullName;

	private String guestEmail;

	private int numOfAdults;

	private int numOfChildren;

	private int totalNumOfGuests;

	private String bookingConfirmationCode;

	private RoomResponse room;

	public BookingResponse(Long bookingId, LocalDate checkedInDate, LocalDate checkOutDate,
			String bookingConfirmationCode) {
		this.bookingId = bookingId;
		this.checkedInDate = checkedInDate;
		this.checkOutDate = checkOutDate;
		this.bookingConfirmationCode = bookingConfirmationCode;
	}

}
