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
 * WeddingPackageMasterList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class WeddingPackageMasterList {

  private JsonNullable<String> isConfermed = JsonNullable.<String>undefined();

  private Integer weddingId;

  private Integer customerId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventDate;

  private JsonNullable<String> arrivalTime = JsonNullable.<String>undefined();

  private JsonNullable<String> relieveTime = JsonNullable.<String>undefined();

  private Double totalAmount;

  private Double advanceAmount;

  private JsonNullable<String> details = JsonNullable.<String>undefined();

  private Boolean isDeleted;

  private JsonNullable<String> pcontact = JsonNullable.<String>undefined();

  private JsonNullable<String> scontact = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> customerName = JsonNullable.<String>undefined();

  private JsonNullable<String> bookingUId = JsonNullable.<String>undefined();

  private Integer userId;

  private JsonNullable<String> userName = JsonNullable.<String>undefined();

  private JsonNullable<String> weddingPackageName = JsonNullable.<String>undefined();

  private Integer lastUpdatedBy;

  private JsonNullable<String> lastUpdatedUser = JsonNullable.<String>undefined();

  private JsonNullable<String> venue = JsonNullable.<String>undefined();

  private JsonNullable<Double> SGST = JsonNullable.<Double>undefined();

  private JsonNullable<Double> CGST = JsonNullable.<Double>undefined();

  private JsonNullable<Double> discount = JsonNullable.<Double>undefined();

  public WeddingPackageMasterList isConfermed(String isConfermed) {
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

  public WeddingPackageMasterList weddingId(Integer weddingId) {
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

  public WeddingPackageMasterList customerId(Integer customerId) {
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

  public WeddingPackageMasterList eventDate(OffsetDateTime eventDate) {
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

  public WeddingPackageMasterList arrivalTime(String arrivalTime) {
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

  public WeddingPackageMasterList relieveTime(String relieveTime) {
    this.relieveTime = JsonNullable.of(relieveTime);
    return this;
  }

  /**
   * Get relieveTime
   * @return relieveTime
  */
  
  @Schema(name = "RelieveTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RelieveTime")
  public JsonNullable<String> getRelieveTime() {
    return relieveTime;
  }

  public void setRelieveTime(JsonNullable<String> relieveTime) {
    this.relieveTime = relieveTime;
  }

  public WeddingPackageMasterList totalAmount(Double totalAmount) {
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

  public WeddingPackageMasterList advanceAmount(Double advanceAmount) {
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

  public WeddingPackageMasterList details(String details) {
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

  public WeddingPackageMasterList isDeleted(Boolean isDeleted) {
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

  public WeddingPackageMasterList pcontact(String pcontact) {
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

  public WeddingPackageMasterList scontact(String scontact) {
    this.scontact = JsonNullable.of(scontact);
    return this;
  }

  /**
   * Get scontact
   * @return scontact
  */
  
  @Schema(name = "SContact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SContact")
  public JsonNullable<String> getScontact() {
    return scontact;
  }

  public void setScontact(JsonNullable<String> scontact) {
    this.scontact = scontact;
  }

  public WeddingPackageMasterList createdDate(OffsetDateTime createdDate) {
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

  public WeddingPackageMasterList customerName(String customerName) {
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

  public WeddingPackageMasterList bookingUId(String bookingUId) {
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

  public WeddingPackageMasterList userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "UserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public WeddingPackageMasterList userName(String userName) {
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

  public WeddingPackageMasterList weddingPackageName(String weddingPackageName) {
    this.weddingPackageName = JsonNullable.of(weddingPackageName);
    return this;
  }

  /**
   * Get weddingPackageName
   * @return weddingPackageName
  */
  
  @Schema(name = "WeddingPackageName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WeddingPackageName")
  public JsonNullable<String> getWeddingPackageName() {
    return weddingPackageName;
  }

  public void setWeddingPackageName(JsonNullable<String> weddingPackageName) {
    this.weddingPackageName = weddingPackageName;
  }

  public WeddingPackageMasterList lastUpdatedBy(Integer lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  */
  
  @Schema(name = "LastUpdatedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastUpdatedBy")
  public Integer getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(Integer lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public WeddingPackageMasterList lastUpdatedUser(String lastUpdatedUser) {
    this.lastUpdatedUser = JsonNullable.of(lastUpdatedUser);
    return this;
  }

  /**
   * Get lastUpdatedUser
   * @return lastUpdatedUser
  */
  
  @Schema(name = "LastUpdatedUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastUpdatedUser")
  public JsonNullable<String> getLastUpdatedUser() {
    return lastUpdatedUser;
  }

  public void setLastUpdatedUser(JsonNullable<String> lastUpdatedUser) {
    this.lastUpdatedUser = lastUpdatedUser;
  }

  public WeddingPackageMasterList venue(String venue) {
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

  public WeddingPackageMasterList SGST(Double SGST) {
    this.SGST = JsonNullable.of(SGST);
    return this;
  }

  /**
   * Get SGST
   * @return SGST
  */
  
  @Schema(name = "SGST", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SGST")
  public JsonNullable<Double> getSGST() {
    return SGST;
  }

  public void setSGST(JsonNullable<Double> SGST) {
    this.SGST = SGST;
  }

  public WeddingPackageMasterList CGST(Double CGST) {
    this.CGST = JsonNullable.of(CGST);
    return this;
  }

  /**
   * Get CGST
   * @return CGST
  */
  
  @Schema(name = "CGST", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CGST")
  public JsonNullable<Double> getCGST() {
    return CGST;
  }

  public void setCGST(JsonNullable<Double> CGST) {
    this.CGST = CGST;
  }

  public WeddingPackageMasterList discount(Double discount) {
    this.discount = JsonNullable.of(discount);
    return this;
  }

  /**
   * Get discount
   * @return discount
  */
  
  @Schema(name = "Discount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Discount")
  public JsonNullable<Double> getDiscount() {
    return discount;
  }

  public void setDiscount(JsonNullable<Double> discount) {
    this.discount = discount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeddingPackageMasterList weddingPackageMasterList = (WeddingPackageMasterList) o;
    return equalsNullable(this.isConfermed, weddingPackageMasterList.isConfermed) &&
        Objects.equals(this.weddingId, weddingPackageMasterList.weddingId) &&
        Objects.equals(this.customerId, weddingPackageMasterList.customerId) &&
        Objects.equals(this.eventDate, weddingPackageMasterList.eventDate) &&
        equalsNullable(this.arrivalTime, weddingPackageMasterList.arrivalTime) &&
        equalsNullable(this.relieveTime, weddingPackageMasterList.relieveTime) &&
        Objects.equals(this.totalAmount, weddingPackageMasterList.totalAmount) &&
        Objects.equals(this.advanceAmount, weddingPackageMasterList.advanceAmount) &&
        equalsNullable(this.details, weddingPackageMasterList.details) &&
        Objects.equals(this.isDeleted, weddingPackageMasterList.isDeleted) &&
        equalsNullable(this.pcontact, weddingPackageMasterList.pcontact) &&
        equalsNullable(this.scontact, weddingPackageMasterList.scontact) &&
        equalsNullable(this.createdDate, weddingPackageMasterList.createdDate) &&
        equalsNullable(this.customerName, weddingPackageMasterList.customerName) &&
        equalsNullable(this.bookingUId, weddingPackageMasterList.bookingUId) &&
        Objects.equals(this.userId, weddingPackageMasterList.userId) &&
        equalsNullable(this.userName, weddingPackageMasterList.userName) &&
        equalsNullable(this.weddingPackageName, weddingPackageMasterList.weddingPackageName) &&
        Objects.equals(this.lastUpdatedBy, weddingPackageMasterList.lastUpdatedBy) &&
        equalsNullable(this.lastUpdatedUser, weddingPackageMasterList.lastUpdatedUser) &&
        equalsNullable(this.venue, weddingPackageMasterList.venue) &&
        equalsNullable(this.SGST, weddingPackageMasterList.SGST) &&
        equalsNullable(this.CGST, weddingPackageMasterList.CGST) &&
        equalsNullable(this.discount, weddingPackageMasterList.discount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(isConfermed), weddingId, customerId, eventDate, hashCodeNullable(arrivalTime), hashCodeNullable(relieveTime), totalAmount, advanceAmount, hashCodeNullable(details), isDeleted, hashCodeNullable(pcontact), hashCodeNullable(scontact), hashCodeNullable(createdDate), hashCodeNullable(customerName), hashCodeNullable(bookingUId), userId, hashCodeNullable(userName), hashCodeNullable(weddingPackageName), lastUpdatedBy, hashCodeNullable(lastUpdatedUser), hashCodeNullable(venue), hashCodeNullable(SGST), hashCodeNullable(CGST), hashCodeNullable(discount));
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
    sb.append("class WeddingPackageMasterList {\n");
    sb.append("    isConfermed: ").append(toIndentedString(isConfermed)).append("\n");
    sb.append("    weddingId: ").append(toIndentedString(weddingId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    relieveTime: ").append(toIndentedString(relieveTime)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    advanceAmount: ").append(toIndentedString(advanceAmount)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    pcontact: ").append(toIndentedString(pcontact)).append("\n");
    sb.append("    scontact: ").append(toIndentedString(scontact)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    bookingUId: ").append(toIndentedString(bookingUId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    weddingPackageName: ").append(toIndentedString(weddingPackageName)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    lastUpdatedUser: ").append(toIndentedString(lastUpdatedUser)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
    sb.append("    SGST: ").append(toIndentedString(SGST)).append("\n");
    sb.append("    CGST: ").append(toIndentedString(CGST)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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

