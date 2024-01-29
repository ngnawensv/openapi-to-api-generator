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
 * VisitSearch
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class VisitSearch {

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<Integer> userId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> contactNo = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> frDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> toDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Integer> serviceId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> bookingUId = JsonNullable.<String>undefined();

  private JsonNullable<String> ticketNo = JsonNullable.<String>undefined();

  private Boolean isDone;

  public VisitSearch name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public VisitSearch userId(Integer userId) {
    this.userId = JsonNullable.of(userId);
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "UserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public JsonNullable<Integer> getUserId() {
    return userId;
  }

  public void setUserId(JsonNullable<Integer> userId) {
    this.userId = userId;
  }

  public VisitSearch contactNo(String contactNo) {
    this.contactNo = JsonNullable.of(contactNo);
    return this;
  }

  /**
   * Get contactNo
   * @return contactNo
  */
  
  @Schema(name = "ContactNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContactNo")
  public JsonNullable<String> getContactNo() {
    return contactNo;
  }

  public void setContactNo(JsonNullable<String> contactNo) {
    this.contactNo = contactNo;
  }

  public VisitSearch frDate(OffsetDateTime frDate) {
    this.frDate = JsonNullable.of(frDate);
    return this;
  }

  /**
   * Get frDate
   * @return frDate
  */
  @Valid 
  @Schema(name = "FrDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FrDate")
  public JsonNullable<OffsetDateTime> getFrDate() {
    return frDate;
  }

  public void setFrDate(JsonNullable<OffsetDateTime> frDate) {
    this.frDate = frDate;
  }

  public VisitSearch toDate(OffsetDateTime toDate) {
    this.toDate = JsonNullable.of(toDate);
    return this;
  }

  /**
   * Get toDate
   * @return toDate
  */
  @Valid 
  @Schema(name = "ToDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ToDate")
  public JsonNullable<OffsetDateTime> getToDate() {
    return toDate;
  }

  public void setToDate(JsonNullable<OffsetDateTime> toDate) {
    this.toDate = toDate;
  }

  public VisitSearch serviceId(Integer serviceId) {
    this.serviceId = JsonNullable.of(serviceId);
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  */
  
  @Schema(name = "ServiceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceId")
  public JsonNullable<Integer> getServiceId() {
    return serviceId;
  }

  public void setServiceId(JsonNullable<Integer> serviceId) {
    this.serviceId = serviceId;
  }

  public VisitSearch bookingUId(String bookingUId) {
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

  public VisitSearch ticketNo(String ticketNo) {
    this.ticketNo = JsonNullable.of(ticketNo);
    return this;
  }

  /**
   * Get ticketNo
   * @return ticketNo
  */
  
  @Schema(name = "TicketNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TicketNo")
  public JsonNullable<String> getTicketNo() {
    return ticketNo;
  }

  public void setTicketNo(JsonNullable<String> ticketNo) {
    this.ticketNo = ticketNo;
  }

  public VisitSearch isDone(Boolean isDone) {
    this.isDone = isDone;
    return this;
  }

  /**
   * Get isDone
   * @return isDone
  */
  
  @Schema(name = "IsDone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsDone")
  public Boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(Boolean isDone) {
    this.isDone = isDone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisitSearch visitSearch = (VisitSearch) o;
    return equalsNullable(this.name, visitSearch.name) &&
        equalsNullable(this.userId, visitSearch.userId) &&
        equalsNullable(this.contactNo, visitSearch.contactNo) &&
        equalsNullable(this.frDate, visitSearch.frDate) &&
        equalsNullable(this.toDate, visitSearch.toDate) &&
        equalsNullable(this.serviceId, visitSearch.serviceId) &&
        equalsNullable(this.bookingUId, visitSearch.bookingUId) &&
        equalsNullable(this.ticketNo, visitSearch.ticketNo) &&
        Objects.equals(this.isDone, visitSearch.isDone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(userId), hashCodeNullable(contactNo), hashCodeNullable(frDate), hashCodeNullable(toDate), hashCodeNullable(serviceId), hashCodeNullable(bookingUId), hashCodeNullable(ticketNo), isDone);
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
    sb.append("class VisitSearch {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    frDate: ").append(toIndentedString(frDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    bookingUId: ").append(toIndentedString(bookingUId)).append("\n");
    sb.append("    ticketNo: ").append(toIndentedString(ticketNo)).append("\n");
    sb.append("    isDone: ").append(toIndentedString(isDone)).append("\n");
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

