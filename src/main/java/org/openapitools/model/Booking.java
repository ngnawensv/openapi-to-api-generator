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
 * Booking
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class Booking {

  private Integer bookingId;

  private JsonNullable<String> customerName = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  private JsonNullable<String> altMobNo = JsonNullable.<String>undefined();

  private Integer serviceId;

  private Integer noOfMembers;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDate;

  private Boolean isWithFood;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime bookingDate;

  private Integer createdByUserId;

  private Double totalAmount;

  private Double advanceAmount;

  private JsonNullable<Double> remainingPaidAmount = JsonNullable.<Double>undefined();

  private Boolean isConfirmed;

  private JsonNullable<String> naration = JsonNullable.<String>undefined();

  private Double discount;

  private Boolean isDeleted;

  public Booking bookingId(Integer bookingId) {
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

  public Booking customerName(String customerName) {
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

  public Booking mobileNo(String mobileNo) {
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

  public Booking altMobNo(String altMobNo) {
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

  public Booking serviceId(Integer serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  */
  
  @Schema(name = "ServiceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceId")
  public Integer getServiceId() {
    return serviceId;
  }

  public void setServiceId(Integer serviceId) {
    this.serviceId = serviceId;
  }

  public Booking noOfMembers(Integer noOfMembers) {
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

  public Booking creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @Valid 
  @Schema(name = "CreationDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreationDate")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public Booking isWithFood(Boolean isWithFood) {
    this.isWithFood = isWithFood;
    return this;
  }

  /**
   * Get isWithFood
   * @return isWithFood
  */
  
  @Schema(name = "IsWithFood", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsWithFood")
  public Boolean getIsWithFood() {
    return isWithFood;
  }

  public void setIsWithFood(Boolean isWithFood) {
    this.isWithFood = isWithFood;
  }

  public Booking bookingDate(OffsetDateTime bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  /**
   * Get bookingDate
   * @return bookingDate
  */
  @Valid 
  @Schema(name = "BookingDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BookingDate")
  public OffsetDateTime getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(OffsetDateTime bookingDate) {
    this.bookingDate = bookingDate;
  }

  public Booking createdByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

  /**
   * Get createdByUserId
   * @return createdByUserId
  */
  
  @Schema(name = "CreatedByUserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedByUserId")
  public Integer getCreatedByUserId() {
    return createdByUserId;
  }

  public void setCreatedByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  public Booking totalAmount(Double totalAmount) {
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

  public Booking advanceAmount(Double advanceAmount) {
    this.advanceAmount = advanceAmount;
    return this;
  }

  /**
   * Get advanceAmount
   * @return advanceAmount
  */
  
  @Schema(name = "AdvanceAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AdvanceAmount")
  public Double getAdvanceAmount() {
    return advanceAmount;
  }

  public void setAdvanceAmount(Double advanceAmount) {
    this.advanceAmount = advanceAmount;
  }

  public Booking remainingPaidAmount(Double remainingPaidAmount) {
    this.remainingPaidAmount = JsonNullable.of(remainingPaidAmount);
    return this;
  }

  /**
   * Get remainingPaidAmount
   * @return remainingPaidAmount
  */
  
  @Schema(name = "RemainingPaidAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RemainingPaidAmount")
  public JsonNullable<Double> getRemainingPaidAmount() {
    return remainingPaidAmount;
  }

  public void setRemainingPaidAmount(JsonNullable<Double> remainingPaidAmount) {
    this.remainingPaidAmount = remainingPaidAmount;
  }

  public Booking isConfirmed(Boolean isConfirmed) {
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

  public Booking naration(String naration) {
    this.naration = JsonNullable.of(naration);
    return this;
  }

  /**
   * Get naration
   * @return naration
  */
  
  @Schema(name = "Naration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Naration")
  public JsonNullable<String> getNaration() {
    return naration;
  }

  public void setNaration(JsonNullable<String> naration) {
    this.naration = naration;
  }

  public Booking discount(Double discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Get discount
   * @return discount
  */
  
  @Schema(name = "Discount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Discount")
  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public Booking isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
  */
  
  @Schema(name = "IsDeleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsDeleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Booking booking = (Booking) o;
    return Objects.equals(this.bookingId, booking.bookingId) &&
        equalsNullable(this.customerName, booking.customerName) &&
        equalsNullable(this.mobileNo, booking.mobileNo) &&
        equalsNullable(this.altMobNo, booking.altMobNo) &&
        Objects.equals(this.serviceId, booking.serviceId) &&
        Objects.equals(this.noOfMembers, booking.noOfMembers) &&
        Objects.equals(this.creationDate, booking.creationDate) &&
        Objects.equals(this.isWithFood, booking.isWithFood) &&
        Objects.equals(this.bookingDate, booking.bookingDate) &&
        Objects.equals(this.createdByUserId, booking.createdByUserId) &&
        Objects.equals(this.totalAmount, booking.totalAmount) &&
        Objects.equals(this.advanceAmount, booking.advanceAmount) &&
        equalsNullable(this.remainingPaidAmount, booking.remainingPaidAmount) &&
        Objects.equals(this.isConfirmed, booking.isConfirmed) &&
        equalsNullable(this.naration, booking.naration) &&
        Objects.equals(this.discount, booking.discount) &&
        Objects.equals(this.isDeleted, booking.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, hashCodeNullable(customerName), hashCodeNullable(mobileNo), hashCodeNullable(altMobNo), serviceId, noOfMembers, creationDate, isWithFood, bookingDate, createdByUserId, totalAmount, advanceAmount, hashCodeNullable(remainingPaidAmount), isConfirmed, hashCodeNullable(naration), discount, isDeleted);
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
    sb.append("class Booking {\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    altMobNo: ").append(toIndentedString(altMobNo)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    noOfMembers: ").append(toIndentedString(noOfMembers)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    isWithFood: ").append(toIndentedString(isWithFood)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    advanceAmount: ").append(toIndentedString(advanceAmount)).append("\n");
    sb.append("    remainingPaidAmount: ").append(toIndentedString(remainingPaidAmount)).append("\n");
    sb.append("    isConfirmed: ").append(toIndentedString(isConfirmed)).append("\n");
    sb.append("    naration: ").append(toIndentedString(naration)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

