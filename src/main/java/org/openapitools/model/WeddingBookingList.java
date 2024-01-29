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
 * WeddingBookingList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class WeddingBookingList {

  private Integer monthDay;

  private Integer weddingId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventDate;

  private Double totalAmount;

  private JsonNullable<String> details = JsonNullable.<String>undefined();

  private JsonNullable<String> pcontact = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> customerName = JsonNullable.<String>undefined();

  private JsonNullable<String> bookingUId = JsonNullable.<String>undefined();

  private JsonNullable<String> userName = JsonNullable.<String>undefined();

  private JsonNullable<String> venue = JsonNullable.<String>undefined();

  public WeddingBookingList monthDay(Integer monthDay) {
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

  public WeddingBookingList weddingId(Integer weddingId) {
    this.weddingId = weddingId;
    return this;
  }

  /**
   * Get weddingId
   * @return weddingId
  */
  
  @Schema(name = "WeddingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WeddingId")
  public Integer getWeddingId() {
    return weddingId;
  }

  public void setWeddingId(Integer weddingId) {
    this.weddingId = weddingId;
  }

  public WeddingBookingList eventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Get eventDate
   * @return eventDate
  */
  @Valid 
  @Schema(name = "EventDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EventDate")
  public OffsetDateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }

  public WeddingBookingList totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  */
  
  @Schema(name = "TotalAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalAmount")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public WeddingBookingList details(String details) {
    this.details = JsonNullable.of(details);
    return this;
  }

  /**
   * Get details
   * @return details
  */
  
  @Schema(name = "Details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Details")
  public JsonNullable<String> getDetails() {
    return details;
  }

  public void setDetails(JsonNullable<String> details) {
    this.details = details;
  }

  public WeddingBookingList pcontact(String pcontact) {
    this.pcontact = JsonNullable.of(pcontact);
    return this;
  }

  /**
   * Get pcontact
   * @return pcontact
  */
  
  @Schema(name = "PContact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PContact")
  public JsonNullable<String> getPcontact() {
    return pcontact;
  }

  public void setPcontact(JsonNullable<String> pcontact) {
    this.pcontact = pcontact;
  }

  public WeddingBookingList createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "CreatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedDate")
  public JsonNullable<OffsetDateTime> getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(JsonNullable<OffsetDateTime> createdDate) {
    this.createdDate = createdDate;
  }

  public WeddingBookingList customerName(String customerName) {
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

  public WeddingBookingList bookingUId(String bookingUId) {
    this.bookingUId = JsonNullable.of(bookingUId);
    return this;
  }

  /**
   * Get bookingUId
   * @return bookingUId
  */
  
  @Schema(name = "BookingUId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BookingUId")
  public JsonNullable<String> getBookingUId() {
    return bookingUId;
  }

  public void setBookingUId(JsonNullable<String> bookingUId) {
    this.bookingUId = bookingUId;
  }

  public WeddingBookingList userName(String userName) {
    this.userName = JsonNullable.of(userName);
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  
  @Schema(name = "UserName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserName")
  public JsonNullable<String> getUserName() {
    return userName;
  }

  public void setUserName(JsonNullable<String> userName) {
    this.userName = userName;
  }

  public WeddingBookingList venue(String venue) {
    this.venue = JsonNullable.of(venue);
    return this;
  }

  /**
   * Get venue
   * @return venue
  */
  
  @Schema(name = "Venue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Venue")
  public JsonNullable<String> getVenue() {
    return venue;
  }

  public void setVenue(JsonNullable<String> venue) {
    this.venue = venue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeddingBookingList weddingBookingList = (WeddingBookingList) o;
    return Objects.equals(this.monthDay, weddingBookingList.monthDay) &&
        Objects.equals(this.weddingId, weddingBookingList.weddingId) &&
        Objects.equals(this.eventDate, weddingBookingList.eventDate) &&
        Objects.equals(this.totalAmount, weddingBookingList.totalAmount) &&
        equalsNullable(this.details, weddingBookingList.details) &&
        equalsNullable(this.pcontact, weddingBookingList.pcontact) &&
        equalsNullable(this.createdDate, weddingBookingList.createdDate) &&
        equalsNullable(this.customerName, weddingBookingList.customerName) &&
        equalsNullable(this.bookingUId, weddingBookingList.bookingUId) &&
        equalsNullable(this.userName, weddingBookingList.userName) &&
        equalsNullable(this.venue, weddingBookingList.venue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthDay, weddingId, eventDate, totalAmount, hashCodeNullable(details), hashCodeNullable(pcontact), hashCodeNullable(createdDate), hashCodeNullable(customerName), hashCodeNullable(bookingUId), hashCodeNullable(userName), hashCodeNullable(venue));
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
    sb.append("class WeddingBookingList {\n");
    sb.append("    monthDay: ").append(toIndentedString(monthDay)).append("\n");
    sb.append("    weddingId: ").append(toIndentedString(weddingId)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    pcontact: ").append(toIndentedString(pcontact)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    bookingUId: ").append(toIndentedString(bookingUId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
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

