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
 * TempBooking
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class TempBooking {

  private Integer bookingId;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> city = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  private JsonNullable<String> state = JsonNullable.<String>undefined();

  private JsonNullable<String> altMobNo = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateOfStay;

  private Integer noOfMembers;

  private Boolean isConfirmed;

  public TempBooking bookingId(Integer bookingId) {
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

  public TempBooking name(String name) {
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

  public TempBooking city(String city) {
    this.city = JsonNullable.of(city);
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "City", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("City")
  public JsonNullable<String> getCity() {
    return city;
  }

  public void setCity(JsonNullable<String> city) {
    this.city = city;
  }

  public TempBooking mobileNo(String mobileNo) {
    this.mobileNo = JsonNullable.of(mobileNo);
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  */
  
  @Schema(name = "MobileNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MobileNo")
  public JsonNullable<String> getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(JsonNullable<String> mobileNo) {
    this.mobileNo = mobileNo;
  }

  public TempBooking state(String state) {
    this.state = JsonNullable.of(state);
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "State", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("State")
  public JsonNullable<String> getState() {
    return state;
  }

  public void setState(JsonNullable<String> state) {
    this.state = state;
  }

  public TempBooking altMobNo(String altMobNo) {
    this.altMobNo = JsonNullable.of(altMobNo);
    return this;
  }

  /**
   * Get altMobNo
   * @return altMobNo
  */
  
  @Schema(name = "AltMobNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AltMobNo")
  public JsonNullable<String> getAltMobNo() {
    return altMobNo;
  }

  public void setAltMobNo(JsonNullable<String> altMobNo) {
    this.altMobNo = altMobNo;
  }

  public TempBooking dateOfStay(OffsetDateTime dateOfStay) {
    this.dateOfStay = dateOfStay;
    return this;
  }

  /**
   * Get dateOfStay
   * @return dateOfStay
  */
  @Valid 
  @Schema(name = "DateOfStay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DateOfStay")
  public OffsetDateTime getDateOfStay() {
    return dateOfStay;
  }

  public void setDateOfStay(OffsetDateTime dateOfStay) {
    this.dateOfStay = dateOfStay;
  }

  public TempBooking noOfMembers(Integer noOfMembers) {
    this.noOfMembers = noOfMembers;
    return this;
  }

  /**
   * Get noOfMembers
   * @return noOfMembers
  */
  
  @Schema(name = "NoOfMembers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NoOfMembers")
  public Integer getNoOfMembers() {
    return noOfMembers;
  }

  public void setNoOfMembers(Integer noOfMembers) {
    this.noOfMembers = noOfMembers;
  }

  public TempBooking isConfirmed(Boolean isConfirmed) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TempBooking tempBooking = (TempBooking) o;
    return Objects.equals(this.bookingId, tempBooking.bookingId) &&
        equalsNullable(this.name, tempBooking.name) &&
        equalsNullable(this.city, tempBooking.city) &&
        equalsNullable(this.mobileNo, tempBooking.mobileNo) &&
        equalsNullable(this.state, tempBooking.state) &&
        equalsNullable(this.altMobNo, tempBooking.altMobNo) &&
        Objects.equals(this.dateOfStay, tempBooking.dateOfStay) &&
        Objects.equals(this.noOfMembers, tempBooking.noOfMembers) &&
        Objects.equals(this.isConfirmed, tempBooking.isConfirmed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, hashCodeNullable(name), hashCodeNullable(city), hashCodeNullable(mobileNo), hashCodeNullable(state), hashCodeNullable(altMobNo), dateOfStay, noOfMembers, isConfirmed);
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
    sb.append("class TempBooking {\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    altMobNo: ").append(toIndentedString(altMobNo)).append("\n");
    sb.append("    dateOfStay: ").append(toIndentedString(dateOfStay)).append("\n");
    sb.append("    noOfMembers: ").append(toIndentedString(noOfMembers)).append("\n");
    sb.append("    isConfirmed: ").append(toIndentedString(isConfirmed)).append("\n");
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

