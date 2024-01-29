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
import org.openapitools.model.ExtraWeddingDetail;
import org.openapitools.model.WeddingDetail;
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
 * WeddingMasterView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class WeddingMasterView {

  private Integer lastUpdatedBy;

  private Integer weddingId;

  private Integer customerId;

  private JsonNullable<String> customerName = JsonNullable.<String>undefined();

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

  private JsonNullable<String> message = JsonNullable.<String>undefined();

  private JsonNullable<String> bookingUId = JsonNullable.<String>undefined();

  private Integer userId;

  private Boolean result;

  private JsonNullable<String> isConfermed = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> confirmDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> reason = JsonNullable.<String>undefined();

  private JsonNullable<String> venue = JsonNullable.<String>undefined();

  private JsonNullable<Double> SGST = JsonNullable.<Double>undefined();

  private JsonNullable<Double> CGST = JsonNullable.<Double>undefined();

  private JsonNullable<Double> discount = JsonNullable.<Double>undefined();

  private JsonNullable<Boolean> isAlacarte = JsonNullable.<Boolean>undefined();

  private JsonNullable<Integer> weddingPackageId = JsonNullable.<Integer>undefined();

  @Valid
  private JsonNullable<List<@Valid WeddingDetail>> weddingDetails = JsonNullable.<List<@Valid WeddingDetail>>undefined();

  @Valid
  private JsonNullable<List<@Valid ExtraWeddingDetail>> extraWeddingDetails = JsonNullable.<List<@Valid ExtraWeddingDetail>>undefined();

  public WeddingMasterView lastUpdatedBy(Integer lastUpdatedBy) {
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

  public WeddingMasterView weddingId(Integer weddingId) {
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

  public WeddingMasterView customerId(Integer customerId) {
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

  public WeddingMasterView customerName(String customerName) {
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

  public WeddingMasterView eventDate(OffsetDateTime eventDate) {
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

  public WeddingMasterView arrivalTime(String arrivalTime) {
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

  public WeddingMasterView relieveTime(String relieveTime) {
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

  public WeddingMasterView totalAmount(Double totalAmount) {
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

  public WeddingMasterView advanceAmount(Double advanceAmount) {
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

  public WeddingMasterView details(String details) {
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

  public WeddingMasterView isDeleted(Boolean isDeleted) {
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

  public WeddingMasterView pcontact(String pcontact) {
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

  public WeddingMasterView scontact(String scontact) {
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

  public WeddingMasterView message(String message) {
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

  public WeddingMasterView bookingUId(String bookingUId) {
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

  public WeddingMasterView userId(Integer userId) {
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

  public WeddingMasterView result(Boolean result) {
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

  public WeddingMasterView isConfermed(String isConfermed) {
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

  public WeddingMasterView confirmDate(OffsetDateTime confirmDate) {
    this.confirmDate = JsonNullable.of(confirmDate);
    return this;
  }

  /**
   * Get confirmDate
   * @return confirmDate
  */
  @Valid 
  @Schema(name = "ConfirmDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ConfirmDate")
  public JsonNullable<OffsetDateTime> getConfirmDate() {
    return confirmDate;
  }

  public void setConfirmDate(JsonNullable<OffsetDateTime> confirmDate) {
    this.confirmDate = confirmDate;
  }

  public WeddingMasterView reason(String reason) {
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

  public WeddingMasterView venue(String venue) {
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

  public WeddingMasterView SGST(Double SGST) {
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

  public WeddingMasterView CGST(Double CGST) {
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

  public WeddingMasterView discount(Double discount) {
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

  public WeddingMasterView isAlacarte(Boolean isAlacarte) {
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

  public WeddingMasterView weddingPackageId(Integer weddingPackageId) {
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

  public WeddingMasterView weddingDetails(List<@Valid WeddingDetail> weddingDetails) {
    this.weddingDetails = JsonNullable.of(weddingDetails);
    return this;
  }

  public WeddingMasterView addWeddingDetailsItem(WeddingDetail weddingDetailsItem) {
    if (this.weddingDetails == null || !this.weddingDetails.isPresent()) {
      this.weddingDetails = JsonNullable.of(new ArrayList<>());
    }
    this.weddingDetails.get().add(weddingDetailsItem);
    return this;
  }

  /**
   * Get weddingDetails
   * @return weddingDetails
  */
  @Valid 
  @Schema(name = "WeddingDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WeddingDetails")
  public JsonNullable<List<@Valid WeddingDetail>> getWeddingDetails() {
    return weddingDetails;
  }

  public void setWeddingDetails(JsonNullable<List<@Valid WeddingDetail>> weddingDetails) {
    this.weddingDetails = weddingDetails;
  }

  public WeddingMasterView extraWeddingDetails(List<@Valid ExtraWeddingDetail> extraWeddingDetails) {
    this.extraWeddingDetails = JsonNullable.of(extraWeddingDetails);
    return this;
  }

  public WeddingMasterView addExtraWeddingDetailsItem(ExtraWeddingDetail extraWeddingDetailsItem) {
    if (this.extraWeddingDetails == null || !this.extraWeddingDetails.isPresent()) {
      this.extraWeddingDetails = JsonNullable.of(new ArrayList<>());
    }
    this.extraWeddingDetails.get().add(extraWeddingDetailsItem);
    return this;
  }

  /**
   * Get extraWeddingDetails
   * @return extraWeddingDetails
  */
  @Valid 
  @Schema(name = "ExtraWeddingDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExtraWeddingDetails")
  public JsonNullable<List<@Valid ExtraWeddingDetail>> getExtraWeddingDetails() {
    return extraWeddingDetails;
  }

  public void setExtraWeddingDetails(JsonNullable<List<@Valid ExtraWeddingDetail>> extraWeddingDetails) {
    this.extraWeddingDetails = extraWeddingDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeddingMasterView weddingMasterView = (WeddingMasterView) o;
    return Objects.equals(this.lastUpdatedBy, weddingMasterView.lastUpdatedBy) &&
        Objects.equals(this.weddingId, weddingMasterView.weddingId) &&
        Objects.equals(this.customerId, weddingMasterView.customerId) &&
        equalsNullable(this.customerName, weddingMasterView.customerName) &&
        Objects.equals(this.eventDate, weddingMasterView.eventDate) &&
        equalsNullable(this.arrivalTime, weddingMasterView.arrivalTime) &&
        equalsNullable(this.relieveTime, weddingMasterView.relieveTime) &&
        Objects.equals(this.totalAmount, weddingMasterView.totalAmount) &&
        Objects.equals(this.advanceAmount, weddingMasterView.advanceAmount) &&
        equalsNullable(this.details, weddingMasterView.details) &&
        Objects.equals(this.isDeleted, weddingMasterView.isDeleted) &&
        equalsNullable(this.pcontact, weddingMasterView.pcontact) &&
        equalsNullable(this.scontact, weddingMasterView.scontact) &&
        equalsNullable(this.message, weddingMasterView.message) &&
        equalsNullable(this.bookingUId, weddingMasterView.bookingUId) &&
        Objects.equals(this.userId, weddingMasterView.userId) &&
        Objects.equals(this.result, weddingMasterView.result) &&
        equalsNullable(this.isConfermed, weddingMasterView.isConfermed) &&
        equalsNullable(this.confirmDate, weddingMasterView.confirmDate) &&
        equalsNullable(this.reason, weddingMasterView.reason) &&
        equalsNullable(this.venue, weddingMasterView.venue) &&
        equalsNullable(this.SGST, weddingMasterView.SGST) &&
        equalsNullable(this.CGST, weddingMasterView.CGST) &&
        equalsNullable(this.discount, weddingMasterView.discount) &&
        equalsNullable(this.isAlacarte, weddingMasterView.isAlacarte) &&
        equalsNullable(this.weddingPackageId, weddingMasterView.weddingPackageId) &&
        equalsNullable(this.weddingDetails, weddingMasterView.weddingDetails) &&
        equalsNullable(this.extraWeddingDetails, weddingMasterView.extraWeddingDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdatedBy, weddingId, customerId, hashCodeNullable(customerName), eventDate, hashCodeNullable(arrivalTime), hashCodeNullable(relieveTime), totalAmount, advanceAmount, hashCodeNullable(details), isDeleted, hashCodeNullable(pcontact), hashCodeNullable(scontact), hashCodeNullable(message), hashCodeNullable(bookingUId), userId, result, hashCodeNullable(isConfermed), hashCodeNullable(confirmDate), hashCodeNullable(reason), hashCodeNullable(venue), hashCodeNullable(SGST), hashCodeNullable(CGST), hashCodeNullable(discount), hashCodeNullable(isAlacarte), hashCodeNullable(weddingPackageId), hashCodeNullable(weddingDetails), hashCodeNullable(extraWeddingDetails));
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
    sb.append("class WeddingMasterView {\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    weddingId: ").append(toIndentedString(weddingId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    relieveTime: ").append(toIndentedString(relieveTime)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    advanceAmount: ").append(toIndentedString(advanceAmount)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    pcontact: ").append(toIndentedString(pcontact)).append("\n");
    sb.append("    scontact: ").append(toIndentedString(scontact)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    bookingUId: ").append(toIndentedString(bookingUId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    isConfermed: ").append(toIndentedString(isConfermed)).append("\n");
    sb.append("    confirmDate: ").append(toIndentedString(confirmDate)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
    sb.append("    SGST: ").append(toIndentedString(SGST)).append("\n");
    sb.append("    CGST: ").append(toIndentedString(CGST)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    isAlacarte: ").append(toIndentedString(isAlacarte)).append("\n");
    sb.append("    weddingPackageId: ").append(toIndentedString(weddingPackageId)).append("\n");
    sb.append("    weddingDetails: ").append(toIndentedString(weddingDetails)).append("\n");
    sb.append("    extraWeddingDetails: ").append(toIndentedString(extraWeddingDetails)).append("\n");
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

