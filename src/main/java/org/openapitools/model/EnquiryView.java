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
 * EnquiryView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class EnquiryView {

  private Integer enquiryId;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> subject = JsonNullable.<String>undefined();

  private JsonNullable<String> details = JsonNullable.<String>undefined();

  private JsonNullable<String> enquiryStatus = JsonNullable.<String>undefined();

  private JsonNullable<String> contactNo = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> enquiryDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Integer> referenceId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> message = JsonNullable.<String>undefined();

  private JsonNullable<String> reference = JsonNullable.<String>undefined();

  private Integer statusId;

  private Boolean result;

  private JsonNullable<String> emailId = JsonNullable.<String>undefined();

  private JsonNullable<String> feedBack = JsonNullable.<String>undefined();

  private JsonNullable<String> altContactNo = JsonNullable.<String>undefined();

  private Integer userId;

  private JsonNullable<String> userName = JsonNullable.<String>undefined();

  private JsonNullable<Integer> customerId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> otherRef = JsonNullable.<String>undefined();

  private JsonNullable<Integer> masterId = JsonNullable.<Integer>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> followUpDate = JsonNullable.<OffsetDateTime>undefined();

  public EnquiryView enquiryId(Integer enquiryId) {
    this.enquiryId = enquiryId;
    return this;
  }

  /**
   * Get enquiryId
   * @return enquiryId
  */
  
  @Schema(name = "EnquiryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnquiryId")
  public Integer getEnquiryId() {
    return enquiryId;
  }

  public void setEnquiryId(Integer enquiryId) {
    this.enquiryId = enquiryId;
  }

  public EnquiryView name(String name) {
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

  public EnquiryView subject(String subject) {
    this.subject = JsonNullable.of(subject);
    return this;
  }

  /**
   * Get subject
   * @return subject
  */
  
  @Schema(name = "Subject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Subject")
  public JsonNullable<String> getSubject() {
    return subject;
  }

  public void setSubject(JsonNullable<String> subject) {
    this.subject = subject;
  }

  public EnquiryView details(String details) {
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

  public EnquiryView enquiryStatus(String enquiryStatus) {
    this.enquiryStatus = JsonNullable.of(enquiryStatus);
    return this;
  }

  /**
   * Get enquiryStatus
   * @return enquiryStatus
  */
  
  @Schema(name = "EnquiryStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnquiryStatus")
  public JsonNullable<String> getEnquiryStatus() {
    return enquiryStatus;
  }

  public void setEnquiryStatus(JsonNullable<String> enquiryStatus) {
    this.enquiryStatus = enquiryStatus;
  }

  public EnquiryView contactNo(String contactNo) {
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

  public EnquiryView enquiryDate(OffsetDateTime enquiryDate) {
    this.enquiryDate = JsonNullable.of(enquiryDate);
    return this;
  }

  /**
   * Get enquiryDate
   * @return enquiryDate
  */
  @Valid 
  @Schema(name = "EnquiryDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnquiryDate")
  public JsonNullable<OffsetDateTime> getEnquiryDate() {
    return enquiryDate;
  }

  public void setEnquiryDate(JsonNullable<OffsetDateTime> enquiryDate) {
    this.enquiryDate = enquiryDate;
  }

  public EnquiryView referenceId(Integer referenceId) {
    this.referenceId = JsonNullable.of(referenceId);
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
  */
  
  @Schema(name = "ReferenceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReferenceId")
  public JsonNullable<Integer> getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(JsonNullable<Integer> referenceId) {
    this.referenceId = referenceId;
  }

  public EnquiryView message(String message) {
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

  public EnquiryView reference(String reference) {
    this.reference = JsonNullable.of(reference);
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  
  @Schema(name = "Reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reference")
  public JsonNullable<String> getReference() {
    return reference;
  }

  public void setReference(JsonNullable<String> reference) {
    this.reference = reference;
  }

  public EnquiryView statusId(Integer statusId) {
    this.statusId = statusId;
    return this;
  }

  /**
   * Get statusId
   * @return statusId
  */
  
  @Schema(name = "StatusId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatusId")
  public Integer getStatusId() {
    return statusId;
  }

  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
  }

  public EnquiryView result(Boolean result) {
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

  public EnquiryView emailId(String emailId) {
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

  public EnquiryView feedBack(String feedBack) {
    this.feedBack = JsonNullable.of(feedBack);
    return this;
  }

  /**
   * Get feedBack
   * @return feedBack
  */
  
  @Schema(name = "FeedBack", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeedBack")
  public JsonNullable<String> getFeedBack() {
    return feedBack;
  }

  public void setFeedBack(JsonNullable<String> feedBack) {
    this.feedBack = feedBack;
  }

  public EnquiryView altContactNo(String altContactNo) {
    this.altContactNo = JsonNullable.of(altContactNo);
    return this;
  }

  /**
   * Get altContactNo
   * @return altContactNo
  */
  
  @Schema(name = "AltContactNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AltContactNo")
  public JsonNullable<String> getAltContactNo() {
    return altContactNo;
  }

  public void setAltContactNo(JsonNullable<String> altContactNo) {
    this.altContactNo = altContactNo;
  }

  public EnquiryView userId(Integer userId) {
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

  public EnquiryView userName(String userName) {
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

  public EnquiryView customerId(Integer customerId) {
    this.customerId = JsonNullable.of(customerId);
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  
  @Schema(name = "CustomerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CustomerId")
  public JsonNullable<Integer> getCustomerId() {
    return customerId;
  }

  public void setCustomerId(JsonNullable<Integer> customerId) {
    this.customerId = customerId;
  }

  public EnquiryView otherRef(String otherRef) {
    this.otherRef = JsonNullable.of(otherRef);
    return this;
  }

  /**
   * Get otherRef
   * @return otherRef
  */
  
  @Schema(name = "OtherRef", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherRef")
  public JsonNullable<String> getOtherRef() {
    return otherRef;
  }

  public void setOtherRef(JsonNullable<String> otherRef) {
    this.otherRef = otherRef;
  }

  public EnquiryView masterId(Integer masterId) {
    this.masterId = JsonNullable.of(masterId);
    return this;
  }

  /**
   * Get masterId
   * @return masterId
  */
  
  @Schema(name = "MasterId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MasterId")
  public JsonNullable<Integer> getMasterId() {
    return masterId;
  }

  public void setMasterId(JsonNullable<Integer> masterId) {
    this.masterId = masterId;
  }

  public EnquiryView followUpDate(OffsetDateTime followUpDate) {
    this.followUpDate = JsonNullable.of(followUpDate);
    return this;
  }

  /**
   * Get followUpDate
   * @return followUpDate
  */
  @Valid 
  @Schema(name = "FollowUpDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FollowUpDate")
  public JsonNullable<OffsetDateTime> getFollowUpDate() {
    return followUpDate;
  }

  public void setFollowUpDate(JsonNullable<OffsetDateTime> followUpDate) {
    this.followUpDate = followUpDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnquiryView enquiryView = (EnquiryView) o;
    return Objects.equals(this.enquiryId, enquiryView.enquiryId) &&
        equalsNullable(this.name, enquiryView.name) &&
        equalsNullable(this.subject, enquiryView.subject) &&
        equalsNullable(this.details, enquiryView.details) &&
        equalsNullable(this.enquiryStatus, enquiryView.enquiryStatus) &&
        equalsNullable(this.contactNo, enquiryView.contactNo) &&
        equalsNullable(this.enquiryDate, enquiryView.enquiryDate) &&
        equalsNullable(this.referenceId, enquiryView.referenceId) &&
        equalsNullable(this.message, enquiryView.message) &&
        equalsNullable(this.reference, enquiryView.reference) &&
        Objects.equals(this.statusId, enquiryView.statusId) &&
        Objects.equals(this.result, enquiryView.result) &&
        equalsNullable(this.emailId, enquiryView.emailId) &&
        equalsNullable(this.feedBack, enquiryView.feedBack) &&
        equalsNullable(this.altContactNo, enquiryView.altContactNo) &&
        Objects.equals(this.userId, enquiryView.userId) &&
        equalsNullable(this.userName, enquiryView.userName) &&
        equalsNullable(this.customerId, enquiryView.customerId) &&
        equalsNullable(this.otherRef, enquiryView.otherRef) &&
        equalsNullable(this.masterId, enquiryView.masterId) &&
        equalsNullable(this.followUpDate, enquiryView.followUpDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(enquiryId, hashCodeNullable(name), hashCodeNullable(subject), hashCodeNullable(details), hashCodeNullable(enquiryStatus), hashCodeNullable(contactNo), hashCodeNullable(enquiryDate), hashCodeNullable(referenceId), hashCodeNullable(message), hashCodeNullable(reference), statusId, result, hashCodeNullable(emailId), hashCodeNullable(feedBack), hashCodeNullable(altContactNo), userId, hashCodeNullable(userName), hashCodeNullable(customerId), hashCodeNullable(otherRef), hashCodeNullable(masterId), hashCodeNullable(followUpDate));
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
    sb.append("class EnquiryView {\n");
    sb.append("    enquiryId: ").append(toIndentedString(enquiryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    enquiryStatus: ").append(toIndentedString(enquiryStatus)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    enquiryDate: ").append(toIndentedString(enquiryDate)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    feedBack: ").append(toIndentedString(feedBack)).append("\n");
    sb.append("    altContactNo: ").append(toIndentedString(altContactNo)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    otherRef: ").append(toIndentedString(otherRef)).append("\n");
    sb.append("    masterId: ").append(toIndentedString(masterId)).append("\n");
    sb.append("    followUpDate: ").append(toIndentedString(followUpDate)).append("\n");
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

