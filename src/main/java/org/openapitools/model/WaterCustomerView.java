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
 * WaterCustomerView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class WaterCustomerView {

  private Integer visitId;

  private Integer customerId;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> mobile = JsonNullable.<String>undefined();

  private JsonNullable<String> ticketNo = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> ticketDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Integer> noOfMembers = JsonNullable.<Integer>undefined();

  private Double totalAmount;

  private JsonNullable<String> service = JsonNullable.<String>undefined();

  private JsonNullable<String> user = JsonNullable.<String>undefined();

  private JsonNullable<Integer> adults = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> childrens = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> adultRate = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> childRate = JsonNullable.<Integer>undefined();

  private JsonNullable<String> bookingUId = JsonNullable.<String>undefined();

  private Boolean isDone;

  private JsonNullable<String> isConfirm = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> confirmDate = JsonNullable.<OffsetDateTime>undefined();

  public WaterCustomerView visitId(Integer visitId) {
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

  public WaterCustomerView customerId(Integer customerId) {
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

  public WaterCustomerView name(String name) {
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

  public WaterCustomerView mobile(String mobile) {
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

  public WaterCustomerView ticketNo(String ticketNo) {
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

  public WaterCustomerView ticketDate(OffsetDateTime ticketDate) {
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

  public WaterCustomerView noOfMembers(Integer noOfMembers) {
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

  public WaterCustomerView totalAmount(Double totalAmount) {
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

  public WaterCustomerView service(String service) {
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

  public WaterCustomerView user(String user) {
    this.user = JsonNullable.of(user);
    return this;
  }

  /**
   * Get user
   * @return user
  */
  
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public JsonNullable<String> getUser() {
    return user;
  }

  public void setUser(JsonNullable<String> user) {
    this.user = user;
  }

  public WaterCustomerView adults(Integer adults) {
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

  public WaterCustomerView childrens(Integer childrens) {
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

  public WaterCustomerView adultRate(Integer adultRate) {
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

  public WaterCustomerView childRate(Integer childRate) {
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

  public WaterCustomerView bookingUId(String bookingUId) {
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

  public WaterCustomerView isDone(Boolean isDone) {
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

  public WaterCustomerView isConfirm(String isConfirm) {
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

  public WaterCustomerView confirmDate(OffsetDateTime confirmDate) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaterCustomerView waterCustomerView = (WaterCustomerView) o;
    return Objects.equals(this.visitId, waterCustomerView.visitId) &&
        Objects.equals(this.customerId, waterCustomerView.customerId) &&
        equalsNullable(this.name, waterCustomerView.name) &&
        equalsNullable(this.mobile, waterCustomerView.mobile) &&
        equalsNullable(this.ticketNo, waterCustomerView.ticketNo) &&
        equalsNullable(this.ticketDate, waterCustomerView.ticketDate) &&
        equalsNullable(this.noOfMembers, waterCustomerView.noOfMembers) &&
        Objects.equals(this.totalAmount, waterCustomerView.totalAmount) &&
        equalsNullable(this.service, waterCustomerView.service) &&
        equalsNullable(this.user, waterCustomerView.user) &&
        equalsNullable(this.adults, waterCustomerView.adults) &&
        equalsNullable(this.childrens, waterCustomerView.childrens) &&
        equalsNullable(this.adultRate, waterCustomerView.adultRate) &&
        equalsNullable(this.childRate, waterCustomerView.childRate) &&
        equalsNullable(this.bookingUId, waterCustomerView.bookingUId) &&
        Objects.equals(this.isDone, waterCustomerView.isDone) &&
        equalsNullable(this.isConfirm, waterCustomerView.isConfirm) &&
        equalsNullable(this.confirmDate, waterCustomerView.confirmDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(visitId, customerId, hashCodeNullable(name), hashCodeNullable(mobile), hashCodeNullable(ticketNo), hashCodeNullable(ticketDate), hashCodeNullable(noOfMembers), totalAmount, hashCodeNullable(service), hashCodeNullable(user), hashCodeNullable(adults), hashCodeNullable(childrens), hashCodeNullable(adultRate), hashCodeNullable(childRate), hashCodeNullable(bookingUId), isDone, hashCodeNullable(isConfirm), hashCodeNullable(confirmDate));
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
    sb.append("class WaterCustomerView {\n");
    sb.append("    visitId: ").append(toIndentedString(visitId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    ticketNo: ").append(toIndentedString(ticketNo)).append("\n");
    sb.append("    ticketDate: ").append(toIndentedString(ticketDate)).append("\n");
    sb.append("    noOfMembers: ").append(toIndentedString(noOfMembers)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
    sb.append("    childrens: ").append(toIndentedString(childrens)).append("\n");
    sb.append("    adultRate: ").append(toIndentedString(adultRate)).append("\n");
    sb.append("    childRate: ").append(toIndentedString(childRate)).append("\n");
    sb.append("    bookingUId: ").append(toIndentedString(bookingUId)).append("\n");
    sb.append("    isDone: ").append(toIndentedString(isDone)).append("\n");
    sb.append("    isConfirm: ").append(toIndentedString(isConfirm)).append("\n");
    sb.append("    confirmDate: ").append(toIndentedString(confirmDate)).append("\n");
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

