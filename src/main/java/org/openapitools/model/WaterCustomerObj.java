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
 * WaterCustomerObj
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class WaterCustomerObj {

  private Integer visitId;

  private Integer customerId;

  private Integer packageId;

  private Double discount;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> mobile = JsonNullable.<String>undefined();

  private JsonNullable<String> emailId = JsonNullable.<String>undefined();

  private JsonNullable<String> city = JsonNullable.<String>undefined();

  private JsonNullable<String> ticketNo = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> ticketDate = JsonNullable.<OffsetDateTime>undefined();

  private Boolean isDelete;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDate;

  private Double remainingPaidAmt;

  private JsonNullable<Integer> reference = JsonNullable.<Integer>undefined();

  private JsonNullable<String> referenceMode = JsonNullable.<String>undefined();

  private JsonNullable<String> paymentBy = JsonNullable.<String>undefined();

  private JsonNullable<String> paymentDetails = JsonNullable.<String>undefined();

  private Boolean isAdvance;

  private JsonNullable<Integer> userId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> user = JsonNullable.<String>undefined();

  private JsonNullable<Integer> noOfMembers = JsonNullable.<Integer>undefined();

  private Double totalAmount;

  private JsonNullable<Integer> serviceId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> service = JsonNullable.<String>undefined();

  private Double advance;

  private Double remaining;

  private JsonNullable<Integer> adults = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> childrens = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> rate = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> adultRate = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> childRate = JsonNullable.<Integer>undefined();

  private JsonNullable<String> bookingUId = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> bookingToDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> cityOthr = JsonNullable.<String>undefined();

  private Boolean isDone;

  private JsonNullable<String> isConfirm = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> confirmDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> reason = JsonNullable.<String>undefined();

  private JsonNullable<String> message = JsonNullable.<String>undefined();

  private Boolean result;

  public WaterCustomerObj visitId(Integer visitId) {
    this.visitId = visitId;
    return this;
  }

  /**
   * Get visitId
   * @return visitId
  */
  
  @Schema(name = "VisitId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VisitId")
  public Integer getVisitId() {
    return visitId;
  }

  public void setVisitId(Integer visitId) {
    this.visitId = visitId;
  }

  public WaterCustomerObj customerId(Integer customerId) {
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

  public WaterCustomerObj packageId(Integer packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * Get packageId
   * @return packageId
  */
  
  @Schema(name = "PackageId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PackageId")
  public Integer getPackageId() {
    return packageId;
  }

  public void setPackageId(Integer packageId) {
    this.packageId = packageId;
  }

  public WaterCustomerObj discount(Double discount) {
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

  public WaterCustomerObj name(String name) {
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

  public WaterCustomerObj mobile(String mobile) {
    this.mobile = JsonNullable.of(mobile);
    return this;
  }

  /**
   * Get mobile
   * @return mobile
  */
  
  @Schema(name = "Mobile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mobile")
  public JsonNullable<String> getMobile() {
    return mobile;
  }

  public void setMobile(JsonNullable<String> mobile) {
    this.mobile = mobile;
  }

  public WaterCustomerObj emailId(String emailId) {
    this.emailId = JsonNullable.of(emailId);
    return this;
  }

  /**
   * Get emailId
   * @return emailId
  */
  
  @Schema(name = "EmailId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EmailId")
  public JsonNullable<String> getEmailId() {
    return emailId;
  }

  public void setEmailId(JsonNullable<String> emailId) {
    this.emailId = emailId;
  }

  public WaterCustomerObj city(String city) {
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

  public WaterCustomerObj ticketNo(String ticketNo) {
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

  public WaterCustomerObj ticketDate(OffsetDateTime ticketDate) {
    this.ticketDate = JsonNullable.of(ticketDate);
    return this;
  }

  /**
   * Get ticketDate
   * @return ticketDate
  */
  @Valid 
  @Schema(name = "TicketDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TicketDate")
  public JsonNullable<OffsetDateTime> getTicketDate() {
    return ticketDate;
  }

  public void setTicketDate(JsonNullable<OffsetDateTime> ticketDate) {
    this.ticketDate = ticketDate;
  }

  public WaterCustomerObj isDelete(Boolean isDelete) {
    this.isDelete = isDelete;
    return this;
  }

  /**
   * Get isDelete
   * @return isDelete
  */
  
  @Schema(name = "IsDelete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsDelete")
  public Boolean getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(Boolean isDelete) {
    this.isDelete = isDelete;
  }

  public WaterCustomerObj createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @Valid 
  @Schema(name = "CreateDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreateDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public WaterCustomerObj remainingPaidAmt(Double remainingPaidAmt) {
    this.remainingPaidAmt = remainingPaidAmt;
    return this;
  }

  /**
   * Get remainingPaidAmt
   * @return remainingPaidAmt
  */
  
  @Schema(name = "RemainingPaidAmt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RemainingPaidAmt")
  public Double getRemainingPaidAmt() {
    return remainingPaidAmt;
  }

  public void setRemainingPaidAmt(Double remainingPaidAmt) {
    this.remainingPaidAmt = remainingPaidAmt;
  }

  public WaterCustomerObj reference(Integer reference) {
    this.reference = JsonNullable.of(reference);
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  
  @Schema(name = "Reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reference")
  public JsonNullable<Integer> getReference() {
    return reference;
  }

  public void setReference(JsonNullable<Integer> reference) {
    this.reference = reference;
  }

  public WaterCustomerObj referenceMode(String referenceMode) {
    this.referenceMode = JsonNullable.of(referenceMode);
    return this;
  }

  /**
   * Get referenceMode
   * @return referenceMode
  */
  
  @Schema(name = "ReferenceMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReferenceMode")
  public JsonNullable<String> getReferenceMode() {
    return referenceMode;
  }

  public void setReferenceMode(JsonNullable<String> referenceMode) {
    this.referenceMode = referenceMode;
  }

  public WaterCustomerObj paymentBy(String paymentBy) {
    this.paymentBy = JsonNullable.of(paymentBy);
    return this;
  }

  /**
   * Get paymentBy
   * @return paymentBy
  */
  
  @Schema(name = "PaymentBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentBy")
  public JsonNullable<String> getPaymentBy() {
    return paymentBy;
  }

  public void setPaymentBy(JsonNullable<String> paymentBy) {
    this.paymentBy = paymentBy;
  }

  public WaterCustomerObj paymentDetails(String paymentDetails) {
    this.paymentDetails = JsonNullable.of(paymentDetails);
    return this;
  }

  /**
   * Get paymentDetails
   * @return paymentDetails
  */
  
  @Schema(name = "PaymentDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentDetails")
  public JsonNullable<String> getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(JsonNullable<String> paymentDetails) {
    this.paymentDetails = paymentDetails;
  }

  public WaterCustomerObj isAdvance(Boolean isAdvance) {
    this.isAdvance = isAdvance;
    return this;
  }

  /**
   * Get isAdvance
   * @return isAdvance
  */
  
  @Schema(name = "IsAdvance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsAdvance")
  public Boolean getIsAdvance() {
    return isAdvance;
  }

  public void setIsAdvance(Boolean isAdvance) {
    this.isAdvance = isAdvance;
  }

  public WaterCustomerObj userId(Integer userId) {
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

  public WaterCustomerObj user(String user) {
    this.user = JsonNullable.of(user);
    return this;
  }

  /**
   * Get user
   * @return user
  */
  
  @Schema(name = "User", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("User")
  public JsonNullable<String> getUser() {
    return user;
  }

  public void setUser(JsonNullable<String> user) {
    this.user = user;
  }

  public WaterCustomerObj noOfMembers(Integer noOfMembers) {
    this.noOfMembers = JsonNullable.of(noOfMembers);
    return this;
  }

  /**
   * Get noOfMembers
   * @return noOfMembers
  */
  
  @Schema(name = "NoOfMembers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NoOfMembers")
  public JsonNullable<Integer> getNoOfMembers() {
    return noOfMembers;
  }

  public void setNoOfMembers(JsonNullable<Integer> noOfMembers) {
    this.noOfMembers = noOfMembers;
  }

  public WaterCustomerObj totalAmount(Double totalAmount) {
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

  public WaterCustomerObj serviceId(Integer serviceId) {
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

  public WaterCustomerObj service(String service) {
    this.service = JsonNullable.of(service);
    return this;
  }

  /**
   * Get service
   * @return service
  */
  
  @Schema(name = "Service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Service")
  public JsonNullable<String> getService() {
    return service;
  }

  public void setService(JsonNullable<String> service) {
    this.service = service;
  }

  public WaterCustomerObj advance(Double advance) {
    this.advance = advance;
    return this;
  }

  /**
   * Get advance
   * @return advance
  */
  
  @Schema(name = "Advance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Advance")
  public Double getAdvance() {
    return advance;
  }

  public void setAdvance(Double advance) {
    this.advance = advance;
  }

  public WaterCustomerObj remaining(Double remaining) {
    this.remaining = remaining;
    return this;
  }

  /**
   * Get remaining
   * @return remaining
  */
  
  @Schema(name = "Remaining", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Remaining")
  public Double getRemaining() {
    return remaining;
  }

  public void setRemaining(Double remaining) {
    this.remaining = remaining;
  }

  public WaterCustomerObj adults(Integer adults) {
    this.adults = JsonNullable.of(adults);
    return this;
  }

  /**
   * Get adults
   * @return adults
  */
  
  @Schema(name = "Adults", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Adults")
  public JsonNullable<Integer> getAdults() {
    return adults;
  }

  public void setAdults(JsonNullable<Integer> adults) {
    this.adults = adults;
  }

  public WaterCustomerObj childrens(Integer childrens) {
    this.childrens = JsonNullable.of(childrens);
    return this;
  }

  /**
   * Get childrens
   * @return childrens
  */
  
  @Schema(name = "Childrens", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Childrens")
  public JsonNullable<Integer> getChildrens() {
    return childrens;
  }

  public void setChildrens(JsonNullable<Integer> childrens) {
    this.childrens = childrens;
  }

  public WaterCustomerObj rate(Integer rate) {
    this.rate = JsonNullable.of(rate);
    return this;
  }

  /**
   * Get rate
   * @return rate
  */
  
  @Schema(name = "Rate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Rate")
  public JsonNullable<Integer> getRate() {
    return rate;
  }

  public void setRate(JsonNullable<Integer> rate) {
    this.rate = rate;
  }

  public WaterCustomerObj adultRate(Integer adultRate) {
    this.adultRate = JsonNullable.of(adultRate);
    return this;
  }

  /**
   * Get adultRate
   * @return adultRate
  */
  
  @Schema(name = "AdultRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AdultRate")
  public JsonNullable<Integer> getAdultRate() {
    return adultRate;
  }

  public void setAdultRate(JsonNullable<Integer> adultRate) {
    this.adultRate = adultRate;
  }

  public WaterCustomerObj childRate(Integer childRate) {
    this.childRate = JsonNullable.of(childRate);
    return this;
  }

  /**
   * Get childRate
   * @return childRate
  */
  
  @Schema(name = "ChildRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChildRate")
  public JsonNullable<Integer> getChildRate() {
    return childRate;
  }

  public void setChildRate(JsonNullable<Integer> childRate) {
    this.childRate = childRate;
  }

  public WaterCustomerObj bookingUId(String bookingUId) {
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

  public WaterCustomerObj bookingToDate(OffsetDateTime bookingToDate) {
    this.bookingToDate = JsonNullable.of(bookingToDate);
    return this;
  }

  /**
   * Get bookingToDate
   * @return bookingToDate
  */
  @Valid 
  @Schema(name = "BookingToDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BookingToDate")
  public JsonNullable<OffsetDateTime> getBookingToDate() {
    return bookingToDate;
  }

  public void setBookingToDate(JsonNullable<OffsetDateTime> bookingToDate) {
    this.bookingToDate = bookingToDate;
  }

  public WaterCustomerObj cityOthr(String cityOthr) {
    this.cityOthr = JsonNullable.of(cityOthr);
    return this;
  }

  /**
   * Get cityOthr
   * @return cityOthr
  */
  
  @Schema(name = "CityOthr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CityOthr")
  public JsonNullable<String> getCityOthr() {
    return cityOthr;
  }

  public void setCityOthr(JsonNullable<String> cityOthr) {
    this.cityOthr = cityOthr;
  }

  public WaterCustomerObj isDone(Boolean isDone) {
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

  public WaterCustomerObj isConfirm(String isConfirm) {
    this.isConfirm = JsonNullable.of(isConfirm);
    return this;
  }

  /**
   * Get isConfirm
   * @return isConfirm
  */
  
  @Schema(name = "isConfirm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isConfirm")
  public JsonNullable<String> getIsConfirm() {
    return isConfirm;
  }

  public void setIsConfirm(JsonNullable<String> isConfirm) {
    this.isConfirm = isConfirm;
  }

  public WaterCustomerObj confirmDate(OffsetDateTime confirmDate) {
    this.confirmDate = JsonNullable.of(confirmDate);
    return this;
  }

  /**
   * Get confirmDate
   * @return confirmDate
  */
  @Valid 
  @Schema(name = "confirmDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confirmDate")
  public JsonNullable<OffsetDateTime> getConfirmDate() {
    return confirmDate;
  }

  public void setConfirmDate(JsonNullable<OffsetDateTime> confirmDate) {
    this.confirmDate = confirmDate;
  }

  public WaterCustomerObj reason(String reason) {
    this.reason = JsonNullable.of(reason);
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  
  @Schema(name = "Reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reason")
  public JsonNullable<String> getReason() {
    return reason;
  }

  public void setReason(JsonNullable<String> reason) {
    this.reason = reason;
  }

  public WaterCustomerObj message(String message) {
    this.message = JsonNullable.of(message);
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "Message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Message")
  public JsonNullable<String> getMessage() {
    return message;
  }

  public void setMessage(JsonNullable<String> message) {
    this.message = message;
  }

  public WaterCustomerObj result(Boolean result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  
  @Schema(name = "Result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Result")
  public Boolean getResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaterCustomerObj waterCustomerObj = (WaterCustomerObj) o;
    return Objects.equals(this.visitId, waterCustomerObj.visitId) &&
        Objects.equals(this.customerId, waterCustomerObj.customerId) &&
        Objects.equals(this.packageId, waterCustomerObj.packageId) &&
        Objects.equals(this.discount, waterCustomerObj.discount) &&
        equalsNullable(this.name, waterCustomerObj.name) &&
        equalsNullable(this.mobile, waterCustomerObj.mobile) &&
        equalsNullable(this.emailId, waterCustomerObj.emailId) &&
        equalsNullable(this.city, waterCustomerObj.city) &&
        equalsNullable(this.ticketNo, waterCustomerObj.ticketNo) &&
        equalsNullable(this.ticketDate, waterCustomerObj.ticketDate) &&
        Objects.equals(this.isDelete, waterCustomerObj.isDelete) &&
        Objects.equals(this.createDate, waterCustomerObj.createDate) &&
        Objects.equals(this.remainingPaidAmt, waterCustomerObj.remainingPaidAmt) &&
        equalsNullable(this.reference, waterCustomerObj.reference) &&
        equalsNullable(this.referenceMode, waterCustomerObj.referenceMode) &&
        equalsNullable(this.paymentBy, waterCustomerObj.paymentBy) &&
        equalsNullable(this.paymentDetails, waterCustomerObj.paymentDetails) &&
        Objects.equals(this.isAdvance, waterCustomerObj.isAdvance) &&
        equalsNullable(this.userId, waterCustomerObj.userId) &&
        equalsNullable(this.user, waterCustomerObj.user) &&
        equalsNullable(this.noOfMembers, waterCustomerObj.noOfMembers) &&
        Objects.equals(this.totalAmount, waterCustomerObj.totalAmount) &&
        equalsNullable(this.serviceId, waterCustomerObj.serviceId) &&
        equalsNullable(this.service, waterCustomerObj.service) &&
        Objects.equals(this.advance, waterCustomerObj.advance) &&
        Objects.equals(this.remaining, waterCustomerObj.remaining) &&
        equalsNullable(this.adults, waterCustomerObj.adults) &&
        equalsNullable(this.childrens, waterCustomerObj.childrens) &&
        equalsNullable(this.rate, waterCustomerObj.rate) &&
        equalsNullable(this.adultRate, waterCustomerObj.adultRate) &&
        equalsNullable(this.childRate, waterCustomerObj.childRate) &&
        equalsNullable(this.bookingUId, waterCustomerObj.bookingUId) &&
        equalsNullable(this.bookingToDate, waterCustomerObj.bookingToDate) &&
        equalsNullable(this.cityOthr, waterCustomerObj.cityOthr) &&
        Objects.equals(this.isDone, waterCustomerObj.isDone) &&
        equalsNullable(this.isConfirm, waterCustomerObj.isConfirm) &&
        equalsNullable(this.confirmDate, waterCustomerObj.confirmDate) &&
        equalsNullable(this.reason, waterCustomerObj.reason) &&
        equalsNullable(this.message, waterCustomerObj.message) &&
        Objects.equals(this.result, waterCustomerObj.result);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(visitId, customerId, packageId, discount, hashCodeNullable(name), hashCodeNullable(mobile), hashCodeNullable(emailId), hashCodeNullable(city), hashCodeNullable(ticketNo), hashCodeNullable(ticketDate), isDelete, createDate, remainingPaidAmt, hashCodeNullable(reference), hashCodeNullable(referenceMode), hashCodeNullable(paymentBy), hashCodeNullable(paymentDetails), isAdvance, hashCodeNullable(userId), hashCodeNullable(user), hashCodeNullable(noOfMembers), totalAmount, hashCodeNullable(serviceId), hashCodeNullable(service), advance, remaining, hashCodeNullable(adults), hashCodeNullable(childrens), hashCodeNullable(rate), hashCodeNullable(adultRate), hashCodeNullable(childRate), hashCodeNullable(bookingUId), hashCodeNullable(bookingToDate), hashCodeNullable(cityOthr), isDone, hashCodeNullable(isConfirm), hashCodeNullable(confirmDate), hashCodeNullable(reason), hashCodeNullable(message), result);
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
    sb.append("class WaterCustomerObj {\n");
    sb.append("    visitId: ").append(toIndentedString(visitId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    ticketNo: ").append(toIndentedString(ticketNo)).append("\n");
    sb.append("    ticketDate: ").append(toIndentedString(ticketDate)).append("\n");
    sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    remainingPaidAmt: ").append(toIndentedString(remainingPaidAmt)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    referenceMode: ").append(toIndentedString(referenceMode)).append("\n");
    sb.append("    paymentBy: ").append(toIndentedString(paymentBy)).append("\n");
    sb.append("    paymentDetails: ").append(toIndentedString(paymentDetails)).append("\n");
    sb.append("    isAdvance: ").append(toIndentedString(isAdvance)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    noOfMembers: ").append(toIndentedString(noOfMembers)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    advance: ").append(toIndentedString(advance)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
    sb.append("    childrens: ").append(toIndentedString(childrens)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    adultRate: ").append(toIndentedString(adultRate)).append("\n");
    sb.append("    childRate: ").append(toIndentedString(childRate)).append("\n");
    sb.append("    bookingUId: ").append(toIndentedString(bookingUId)).append("\n");
    sb.append("    bookingToDate: ").append(toIndentedString(bookingToDate)).append("\n");
    sb.append("    cityOthr: ").append(toIndentedString(cityOthr)).append("\n");
    sb.append("    isDone: ").append(toIndentedString(isDone)).append("\n");
    sb.append("    isConfirm: ").append(toIndentedString(isConfirm)).append("\n");
    sb.append("    confirmDate: ").append(toIndentedString(confirmDate)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

