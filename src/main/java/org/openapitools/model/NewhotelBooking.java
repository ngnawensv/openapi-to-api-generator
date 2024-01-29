package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.HotelBookingDetail;
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
 * NewhotelBooking
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class NewhotelBooking {

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  private JsonNullable<String> email = JsonNullable.<String>undefined();

  private JsonNullable<String> aadharNo = JsonNullable.<String>undefined();

  private JsonNullable<String> city = JsonNullable.<String>undefined();

  private JsonNullable<String> address = JsonNullable.<String>undefined();

  private Integer bookingId;

  private Integer roomId;

  private Integer customerId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime bookingFromDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime bookingToDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  private Double bookingRate;

  private JsonNullable<String> naration = JsonNullable.<String>undefined();

  private Integer createdBy;

  @Valid
  private JsonNullable<List<@Valid HotelBookingDetail>> hotelBookingDetails = JsonNullable.<List<@Valid HotelBookingDetail>>undefined();

  public NewhotelBooking name(String name) {
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

  public NewhotelBooking mobileNo(String mobileNo) {
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

  public NewhotelBooking email(String email) {
    this.email = JsonNullable.of(email);
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public JsonNullable<String> getEmail() {
    return email;
  }

  public void setEmail(JsonNullable<String> email) {
    this.email = email;
  }

  public NewhotelBooking aadharNo(String aadharNo) {
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

  public NewhotelBooking city(String city) {
    this.city = JsonNullable.of(city);
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public JsonNullable<String> getCity() {
    return city;
  }

  public void setCity(JsonNullable<String> city) {
    this.city = city;
  }

  public NewhotelBooking address(String address) {
    this.address = JsonNullable.of(address);
    return this;
  }

  /**
   * Get address
   * @return address
  */
  
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public JsonNullable<String> getAddress() {
    return address;
  }

  public void setAddress(JsonNullable<String> address) {
    this.address = address;
  }

  public NewhotelBooking bookingId(Integer bookingId) {
    this.bookingId = bookingId;
    return this;
  }

  /**
   * Get bookingId
   * @return bookingId
  */
  
  @Schema(name = "bookingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookingId")
  public Integer getBookingId() {
    return bookingId;
  }

  public void setBookingId(Integer bookingId) {
    this.bookingId = bookingId;
  }

  public NewhotelBooking roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * Get roomId
   * @return roomId
  */
  
  @Schema(name = "roomId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roomId")
  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public NewhotelBooking customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  
  @Schema(name = "customerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerId")
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public NewhotelBooking bookingFromDate(OffsetDateTime bookingFromDate) {
    this.bookingFromDate = bookingFromDate;
    return this;
  }

  /**
   * Get bookingFromDate
   * @return bookingFromDate
  */
  @Valid 
  @Schema(name = "bookingFromDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookingFromDate")
  public OffsetDateTime getBookingFromDate() {
    return bookingFromDate;
  }

  public void setBookingFromDate(OffsetDateTime bookingFromDate) {
    this.bookingFromDate = bookingFromDate;
  }

  public NewhotelBooking bookingToDate(OffsetDateTime bookingToDate) {
    this.bookingToDate = bookingToDate;
    return this;
  }

  /**
   * Get bookingToDate
   * @return bookingToDate
  */
  @Valid 
  @Schema(name = "bookingToDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookingToDate")
  public OffsetDateTime getBookingToDate() {
    return bookingToDate;
  }

  public void setBookingToDate(OffsetDateTime bookingToDate) {
    this.bookingToDate = bookingToDate;
  }

  public NewhotelBooking createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public NewhotelBooking bookingRate(Double bookingRate) {
    this.bookingRate = bookingRate;
    return this;
  }

  /**
   * Get bookingRate
   * @return bookingRate
  */
  
  @Schema(name = "bookingRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookingRate")
  public Double getBookingRate() {
    return bookingRate;
  }

  public void setBookingRate(Double bookingRate) {
    this.bookingRate = bookingRate;
  }

  public NewhotelBooking naration(String naration) {
    this.naration = JsonNullable.of(naration);
    return this;
  }

  /**
   * Get naration
   * @return naration
  */
  
  @Schema(name = "naration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("naration")
  public JsonNullable<String> getNaration() {
    return naration;
  }

  public void setNaration(JsonNullable<String> naration) {
    this.naration = naration;
  }

  public NewhotelBooking createdBy(Integer createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  
  @Schema(name = "createdBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBy")
  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  public NewhotelBooking hotelBookingDetails(List<@Valid HotelBookingDetail> hotelBookingDetails) {
    this.hotelBookingDetails = JsonNullable.of(hotelBookingDetails);
    return this;
  }

  public NewhotelBooking addHotelBookingDetailsItem(HotelBookingDetail hotelBookingDetailsItem) {
    if (this.hotelBookingDetails == null || !this.hotelBookingDetails.isPresent()) {
      this.hotelBookingDetails = JsonNullable.of(new ArrayList<>());
    }
    this.hotelBookingDetails.get().add(hotelBookingDetailsItem);
    return this;
  }

  /**
   * Get hotelBookingDetails
   * @return hotelBookingDetails
  */
  @Valid 
  @Schema(name = "hotelBookingDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hotelBookingDetails")
  public JsonNullable<List<@Valid HotelBookingDetail>> getHotelBookingDetails() {
    return hotelBookingDetails;
  }

  public void setHotelBookingDetails(JsonNullable<List<@Valid HotelBookingDetail>> hotelBookingDetails) {
    this.hotelBookingDetails = hotelBookingDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewhotelBooking newhotelBooking = (NewhotelBooking) o;
    return equalsNullable(this.name, newhotelBooking.name) &&
        equalsNullable(this.mobileNo, newhotelBooking.mobileNo) &&
        equalsNullable(this.email, newhotelBooking.email) &&
        equalsNullable(this.aadharNo, newhotelBooking.aadharNo) &&
        equalsNullable(this.city, newhotelBooking.city) &&
        equalsNullable(this.address, newhotelBooking.address) &&
        Objects.equals(this.bookingId, newhotelBooking.bookingId) &&
        Objects.equals(this.roomId, newhotelBooking.roomId) &&
        Objects.equals(this.customerId, newhotelBooking.customerId) &&
        Objects.equals(this.bookingFromDate, newhotelBooking.bookingFromDate) &&
        Objects.equals(this.bookingToDate, newhotelBooking.bookingToDate) &&
        Objects.equals(this.createdDate, newhotelBooking.createdDate) &&
        Objects.equals(this.bookingRate, newhotelBooking.bookingRate) &&
        equalsNullable(this.naration, newhotelBooking.naration) &&
        Objects.equals(this.createdBy, newhotelBooking.createdBy) &&
        equalsNullable(this.hotelBookingDetails, newhotelBooking.hotelBookingDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(mobileNo), hashCodeNullable(email), hashCodeNullable(aadharNo), hashCodeNullable(city), hashCodeNullable(address), bookingId, roomId, customerId, bookingFromDate, bookingToDate, createdDate, bookingRate, hashCodeNullable(naration), createdBy, hashCodeNullable(hotelBookingDetails));
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
    sb.append("class NewhotelBooking {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    aadharNo: ").append(toIndentedString(aadharNo)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    bookingFromDate: ").append(toIndentedString(bookingFromDate)).append("\n");
    sb.append("    bookingToDate: ").append(toIndentedString(bookingToDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    bookingRate: ").append(toIndentedString(bookingRate)).append("\n");
    sb.append("    naration: ").append(toIndentedString(naration)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    hotelBookingDetails: ").append(toIndentedString(hotelBookingDetails)).append("\n");
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

