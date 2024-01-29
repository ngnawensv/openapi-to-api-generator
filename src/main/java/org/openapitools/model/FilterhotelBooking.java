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
 * FilterhotelBooking
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class FilterhotelBooking {

  private JsonNullable<Integer> roomId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> aadharNo = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> bookingFromDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> bookingToDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Integer> createdBy = JsonNullable.<Integer>undefined();

  public FilterhotelBooking roomId(Integer roomId) {
    this.roomId = JsonNullable.of(roomId);
    return this;
  }

  /**
   * Get roomId
   * @return roomId
  */
  
  @Schema(name = "roomId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roomId")
  public JsonNullable<Integer> getRoomId() {
    return roomId;
  }

  public void setRoomId(JsonNullable<Integer> roomId) {
    this.roomId = roomId;
  }

  public FilterhotelBooking aadharNo(String aadharNo) {
    this.aadharNo = JsonNullable.of(aadharNo);
    return this;
  }

  /**
   * Get aadharNo
   * @return aadharNo
  */
  
  @Schema(name = "aadharNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aadharNo")
  public JsonNullable<String> getAadharNo() {
    return aadharNo;
  }

  public void setAadharNo(JsonNullable<String> aadharNo) {
    this.aadharNo = aadharNo;
  }

  public FilterhotelBooking name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public FilterhotelBooking mobileNo(String mobileNo) {
    this.mobileNo = JsonNullable.of(mobileNo);
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  */
  
  @Schema(name = "mobileNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileNo")
  public JsonNullable<String> getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(JsonNullable<String> mobileNo) {
    this.mobileNo = mobileNo;
  }

  public FilterhotelBooking bookingFromDate(OffsetDateTime bookingFromDate) {
    this.bookingFromDate = JsonNullable.of(bookingFromDate);
    return this;
  }

  /**
   * Get bookingFromDate
   * @return bookingFromDate
  */
  @Valid 
  @Schema(name = "bookingFromDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookingFromDate")
  public JsonNullable<OffsetDateTime> getBookingFromDate() {
    return bookingFromDate;
  }

  public void setBookingFromDate(JsonNullable<OffsetDateTime> bookingFromDate) {
    this.bookingFromDate = bookingFromDate;
  }

  public FilterhotelBooking bookingToDate(OffsetDateTime bookingToDate) {
    this.bookingToDate = JsonNullable.of(bookingToDate);
    return this;
  }

  /**
   * Get bookingToDate
   * @return bookingToDate
  */
  @Valid 
  @Schema(name = "bookingToDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookingToDate")
  public JsonNullable<OffsetDateTime> getBookingToDate() {
    return bookingToDate;
  }

  public void setBookingToDate(JsonNullable<OffsetDateTime> bookingToDate) {
    this.bookingToDate = bookingToDate;
  }

  public FilterhotelBooking createdBy(Integer createdBy) {
    this.createdBy = JsonNullable.of(createdBy);
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  
  @Schema(name = "createdBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBy")
  public JsonNullable<Integer> getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(JsonNullable<Integer> createdBy) {
    this.createdBy = createdBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterhotelBooking filterhotelBooking = (FilterhotelBooking) o;
    return equalsNullable(this.roomId, filterhotelBooking.roomId) &&
        equalsNullable(this.aadharNo, filterhotelBooking.aadharNo) &&
        equalsNullable(this.name, filterhotelBooking.name) &&
        equalsNullable(this.mobileNo, filterhotelBooking.mobileNo) &&
        equalsNullable(this.bookingFromDate, filterhotelBooking.bookingFromDate) &&
        equalsNullable(this.bookingToDate, filterhotelBooking.bookingToDate) &&
        equalsNullable(this.createdBy, filterhotelBooking.createdBy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(roomId), hashCodeNullable(aadharNo), hashCodeNullable(name), hashCodeNullable(mobileNo), hashCodeNullable(bookingFromDate), hashCodeNullable(bookingToDate), hashCodeNullable(createdBy));
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
    sb.append("class FilterhotelBooking {\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    aadharNo: ").append(toIndentedString(aadharNo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    bookingFromDate: ").append(toIndentedString(bookingFromDate)).append("\n");
    sb.append("    bookingToDate: ").append(toIndentedString(bookingToDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

