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
 * EnquirySearch
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class EnquirySearch {

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<Integer> userId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> contactNo = JsonNullable.<String>undefined();

  private JsonNullable<Integer> statusId = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> masterId = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> referenceId = JsonNullable.<Integer>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> frDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> toDate = JsonNullable.<OffsetDateTime>undefined();

  private Integer pageNumber;

  private Integer pageSize;

  public EnquirySearch name(String name) {
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

  public EnquirySearch userId(Integer userId) {
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

  public EnquirySearch contactNo(String contactNo) {
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

  public EnquirySearch statusId(Integer statusId) {
    this.statusId = JsonNullable.of(statusId);
    return this;
  }

  /**
   * Get statusId
   * @return statusId
  */
  
  @Schema(name = "StatusId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatusId")
  public JsonNullable<Integer> getStatusId() {
    return statusId;
  }

  public void setStatusId(JsonNullable<Integer> statusId) {
    this.statusId = statusId;
  }

  public EnquirySearch masterId(Integer masterId) {
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

  public EnquirySearch referenceId(Integer referenceId) {
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

  public EnquirySearch frDate(OffsetDateTime frDate) {
    this.frDate = JsonNullable.of(frDate);
    return this;
  }

  /**
   * Get frDate
   * @return frDate
  */
  @Valid 
  @Schema(name = "FrDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FrDate")
  public JsonNullable<OffsetDateTime> getFrDate() {
    return frDate;
  }

  public void setFrDate(JsonNullable<OffsetDateTime> frDate) {
    this.frDate = frDate;
  }

  public EnquirySearch toDate(OffsetDateTime toDate) {
    this.toDate = JsonNullable.of(toDate);
    return this;
  }

  /**
   * Get toDate
   * @return toDate
  */
  @Valid 
  @Schema(name = "ToDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ToDate")
  public JsonNullable<OffsetDateTime> getToDate() {
    return toDate;
  }

  public void setToDate(JsonNullable<OffsetDateTime> toDate) {
    this.toDate = toDate;
  }

  public EnquirySearch pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
  */
  
  @Schema(name = "PageNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public EnquirySearch pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  */
  
  @Schema(name = "PageSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnquirySearch enquirySearch = (EnquirySearch) o;
    return equalsNullable(this.name, enquirySearch.name) &&
        equalsNullable(this.userId, enquirySearch.userId) &&
        equalsNullable(this.contactNo, enquirySearch.contactNo) &&
        equalsNullable(this.statusId, enquirySearch.statusId) &&
        equalsNullable(this.masterId, enquirySearch.masterId) &&
        equalsNullable(this.referenceId, enquirySearch.referenceId) &&
        equalsNullable(this.frDate, enquirySearch.frDate) &&
        equalsNullable(this.toDate, enquirySearch.toDate) &&
        Objects.equals(this.pageNumber, enquirySearch.pageNumber) &&
        Objects.equals(this.pageSize, enquirySearch.pageSize);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(userId), hashCodeNullable(contactNo), hashCodeNullable(statusId), hashCodeNullable(masterId), hashCodeNullable(referenceId), hashCodeNullable(frDate), hashCodeNullable(toDate), pageNumber, pageSize);
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
    sb.append("class EnquirySearch {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    masterId: ").append(toIndentedString(masterId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    frDate: ").append(toIndentedString(frDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

