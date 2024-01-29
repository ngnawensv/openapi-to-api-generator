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
 * WeddingMasterList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class WeddingMasterList {

  private JsonNullable<String> isConfermed = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> isAlacarte = JsonNullable.<Boolean>undefined();

  private JsonNullable<Integer> weddingPackageId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> packageName = JsonNullable.<String>undefined();

  private Integer weddingId;

  private Integer customerId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventDate;

  private JsonNullable<String> arrivalTime = JsonNullable.<String>undefined();

  private Double totalAmount;

  private Double advanceAmount;

  private JsonNullable<String> pcontact = JsonNullable.<String>undefined();

  private JsonNullable<String> customerName = JsonNullable.<String>undefined();

  private JsonNullable<String> bookingUId = JsonNullable.<String>undefined();

  public WeddingMasterList isConfermed(String isConfermed) {
    this.isConfermed = JsonNullable.of(isConfermed);
    return this;
  }

  /**
   * Get isConfermed
   * @return isConfermed
  */
  
  @Schema(name = "IsConfermed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsConfermed")
  public JsonNullable<String> getIsConfermed() {
    return isConfermed;
  }

  public void setIsConfermed(JsonNullable<String> isConfermed) {
    this.isConfermed = isConfermed;
  }

  public WeddingMasterList isAlacarte(Boolean isAlacarte) {
    this.isAlacarte = JsonNullable.of(isAlacarte);
    return this;
  }

  /**
   * Get isAlacarte
   * @return isAlacarte
  */
  
  @Schema(name = "IsAlacarte", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsAlacarte")
  public JsonNullable<Boolean> getIsAlacarte() {
    return isAlacarte;
  }

  public void setIsAlacarte(JsonNullable<Boolean> isAlacarte) {
    this.isAlacarte = isAlacarte;
  }

  public WeddingMasterList weddingPackageId(Integer weddingPackageId) {
    this.weddingPackageId = JsonNullable.of(weddingPackageId);
    return this;
  }

  /**
   * Get weddingPackageId
   * @return weddingPackageId
  */
  
  @Schema(name = "WeddingPackageId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WeddingPackageId")
  public JsonNullable<Integer> getWeddingPackageId() {
    return weddingPackageId;
  }

  public void setWeddingPackageId(JsonNullable<Integer> weddingPackageId) {
    this.weddingPackageId = weddingPackageId;
  }

  public WeddingMasterList packageName(String packageName) {
    this.packageName = JsonNullable.of(packageName);
    return this;
  }

  /**
   * Get packageName
   * @return packageName
  */
  
  @Schema(name = "PackageName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PackageName")
  public JsonNullable<String> getPackageName() {
    return packageName;
  }

  public void setPackageName(JsonNullable<String> packageName) {
    this.packageName = packageName;
  }

  public WeddingMasterList weddingId(Integer weddingId) {
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

  public WeddingMasterList customerId(Integer customerId) {
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

  public WeddingMasterList eventDate(OffsetDateTime eventDate) {
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

  public WeddingMasterList arrivalTime(String arrivalTime) {
    this.arrivalTime = JsonNullable.of(arrivalTime);
    return this;
  }

  /**
   * Get arrivalTime
   * @return arrivalTime
  */
  
  @Schema(name = "ArrivalTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ArrivalTime")
  public JsonNullable<String> getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(JsonNullable<String> arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public WeddingMasterList totalAmount(Double totalAmount) {
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

  public WeddingMasterList advanceAmount(Double advanceAmount) {
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

  public WeddingMasterList pcontact(String pcontact) {
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

  public WeddingMasterList customerName(String customerName) {
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

  public WeddingMasterList bookingUId(String bookingUId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeddingMasterList weddingMasterList = (WeddingMasterList) o;
    return equalsNullable(this.isConfermed, weddingMasterList.isConfermed) &&
        equalsNullable(this.isAlacarte, weddingMasterList.isAlacarte) &&
        equalsNullable(this.weddingPackageId, weddingMasterList.weddingPackageId) &&
        equalsNullable(this.packageName, weddingMasterList.packageName) &&
        Objects.equals(this.weddingId, weddingMasterList.weddingId) &&
        Objects.equals(this.customerId, weddingMasterList.customerId) &&
        Objects.equals(this.eventDate, weddingMasterList.eventDate) &&
        equalsNullable(this.arrivalTime, weddingMasterList.arrivalTime) &&
        Objects.equals(this.totalAmount, weddingMasterList.totalAmount) &&
        Objects.equals(this.advanceAmount, weddingMasterList.advanceAmount) &&
        equalsNullable(this.pcontact, weddingMasterList.pcontact) &&
        equalsNullable(this.customerName, weddingMasterList.customerName) &&
        equalsNullable(this.bookingUId, weddingMasterList.bookingUId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(isConfermed), hashCodeNullable(isAlacarte), hashCodeNullable(weddingPackageId), hashCodeNullable(packageName), weddingId, customerId, eventDate, hashCodeNullable(arrivalTime), totalAmount, advanceAmount, hashCodeNullable(pcontact), hashCodeNullable(customerName), hashCodeNullable(bookingUId));
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
    sb.append("class WeddingMasterList {\n");
    sb.append("    isConfermed: ").append(toIndentedString(isConfermed)).append("\n");
    sb.append("    isAlacarte: ").append(toIndentedString(isAlacarte)).append("\n");
    sb.append("    weddingPackageId: ").append(toIndentedString(weddingPackageId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    weddingId: ").append(toIndentedString(weddingId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    advanceAmount: ").append(toIndentedString(advanceAmount)).append("\n");
    sb.append("    pcontact: ").append(toIndentedString(pcontact)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    bookingUId: ").append(toIndentedString(bookingUId)).append("\n");
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

