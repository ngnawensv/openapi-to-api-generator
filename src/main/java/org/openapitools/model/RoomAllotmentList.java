package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RoomAllotmentList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class RoomAllotmentList {

  private Integer bookingId;

  private Integer allotId;

  private Integer roomId;

  private Boolean isConfirmed;

  private JsonNullable<String> roomNo = JsonNullable.<String>undefined();

  private Integer customerId;

  private JsonNullable<String> customerName = JsonNullable.<String>undefined();

  private JsonNullable<String> bookingDetails = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> bookingDate = JsonNullable.<OffsetDateTime>undefined();

  private Integer monthDay;

  public RoomAllotmentList bookingId(Integer bookingId) {
    this.bookingId = bookingId;
    return this;
  }

  /**
   * Get bookingId
   * @return bookingId
  */
  
  @Schema(name = "BookingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BookingId")
  public Integer getBookingId() {
    return bookingId;
  }

  public void setBookingId(Integer bookingId) {
    this.bookingId = bookingId;
  }

  public RoomAllotmentList allotId(Integer allotId) {
    this.allotId = allotId;
    return this;
  }

  /**
   * Get allotId
   * @return allotId
  */
  
  @Schema(name = "AllotId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AllotId")
  public Integer getAllotId() {
    return allotId;
  }

  public void setAllotId(Integer allotId) {
    this.allotId = allotId;
  }

  public RoomAllotmentList roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * Get roomId
   * @return roomId
  */
  
  @Schema(name = "RoomId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoomId")
  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public RoomAllotmentList isConfirmed(Boolean isConfirmed) {
    this.isConfirmed = isConfirmed;
    return this;
  }

  /**
   * Get isConfirmed
   * @return isConfirmed
  */
  
  @Schema(name = "IsConfirmed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsConfirmed")
  public Boolean getIsConfirmed() {
    return isConfirmed;
  }

  public void setIsConfirmed(Boolean isConfirmed) {
    this.isConfirmed = isConfirmed;
  }

  public RoomAllotmentList roomNo(String roomNo) {
    this.roomNo = JsonNullable.of(roomNo);
    return this;
  }

  /**
   * Get roomNo
   * @return roomNo
  */
  
  @Schema(name = "RoomNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoomNo")
  public JsonNullable<String> getRoomNo() {
    return roomNo;
  }

  public void setRoomNo(JsonNullable<String> roomNo) {
    this.roomNo = roomNo;
  }

  public RoomAllotmentList customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  
  @Schema(name = "CustomerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CustomerId")
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public RoomAllotmentList customerName(String customerName) {
    this.customerName = JsonNullable.of(customerName);
    return this;
  }

  /**
   * Get customerName
   * @return customerName
  */
  
  @Schema(name = "CustomerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CustomerName")
  public JsonNullable<String> getCustomerName() {
    return customerName;
  }

  public void setCustomerName(JsonNullable<String> customerName) {
    this.customerName = customerName;
  }

  public RoomAllotmentList bookingDetails(String bookingDetails) {
    this.bookingDetails = JsonNullable.of(bookingDetails);
    return this;
  }

  /**
   * Get bookingDetails
   * @return bookingDetails
  */
  
  @Schema(name = "BookingDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BookingDetails")
  public JsonNullable<String> getBookingDetails() {
    return bookingDetails;
  }

  public void setBookingDetails(JsonNullable<String> bookingDetails) {
    this.bookingDetails = bookingDetails;
  }

  public RoomAllotmentList bookingDate(OffsetDateTime bookingDate) {
    this.bookingDate = JsonNullable.of(bookingDate);
    return this;
  }

  /**
   * Get bookingDate
   * @return bookingDate
  */
  @Valid 
  @Schema(name = "BookingDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BookingDate")
  public JsonNullable<OffsetDateTime> getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(JsonNullable<OffsetDateTime> bookingDate) {
    this.bookingDate = bookingDate;
  }

  public RoomAllotmentList monthDay(Integer monthDay) {
    this.monthDay = monthDay;
    return this;
  }

  /**
   * Get monthDay
   * @return monthDay
  */
  
  @Schema(name = "MonthDay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MonthDay")
  public Integer getMonthDay() {
    return monthDay;
  }

  public void setMonthDay(Integer monthDay) {
    this.monthDay = monthDay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomAllotmentList roomAllotmentList = (RoomAllotmentList) o;
    return Objects.equals(this.bookingId, roomAllotmentList.bookingId) &&
        Objects.equals(this.allotId, roomAllotmentList.allotId) &&
        Objects.equals(this.roomId, roomAllotmentList.roomId) &&
        Objects.equals(this.isConfirmed, roomAllotmentList.isConfirmed) &&
        equalsNullable(this.roomNo, roomAllotmentList.roomNo) &&
        Objects.equals(this.customerId, roomAllotmentList.customerId) &&
        equalsNullable(this.customerName, roomAllotmentList.customerName) &&
        equalsNullable(this.bookingDetails, roomAllotmentList.bookingDetails) &&
        equalsNullable(this.bookingDate, roomAllotmentList.bookingDate) &&
        Objects.equals(this.monthDay, roomAllotmentList.monthDay);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, allotId, roomId, isConfirmed, hashCodeNullable(roomNo), customerId, hashCodeNullable(customerName), hashCodeNullable(bookingDetails), hashCodeNullable(bookingDate), monthDay);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomAllotmentList {\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    allotId: ").append(toIndentedString(allotId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    isConfirmed: ").append(toIndentedString(isConfirmed)).append("\n");
    sb.append("    roomNo: ").append(toIndentedString(roomNo)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    bookingDetails: ").append(toIndentedString(bookingDetails)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    monthDay: ").append(toIndentedString(monthDay)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

