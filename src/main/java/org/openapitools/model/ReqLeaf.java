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
 * ReqLeaf
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ReqLeaf {

  private Integer leaveId;

  private Integer employeeId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime fromDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime toDate;

  private Integer noOfDays;

  private String leaveType;

  private JsonNullable<String> details = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> isApproved = JsonNullable.<Boolean>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> approvedDate = JsonNullable.<OffsetDateTime>undefined();

  public ReqLeaf() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReqLeaf(Integer employeeId, OffsetDateTime fromDate, OffsetDateTime toDate, Integer noOfDays, String leaveType) {
    this.employeeId = employeeId;
    this.fromDate = fromDate;
    this.toDate = toDate;
    this.noOfDays = noOfDays;
    this.leaveType = leaveType;
  }

  public ReqLeaf leaveId(Integer leaveId) {
    this.leaveId = leaveId;
    return this;
  }

  /**
   * Get leaveId
   * @return leaveId
  */
  
  @Schema(name = "leaveId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leaveId")
  public Integer getLeaveId() {
    return leaveId;
  }

  public void setLeaveId(Integer leaveId) {
    this.leaveId = leaveId;
  }

  public ReqLeaf employeeId(Integer employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * Get employeeId
   * @return employeeId
  */
  @NotNull 
  @Schema(name = "employeeId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employeeId")
  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  public ReqLeaf fromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  /**
   * Get fromDate
   * @return fromDate
  */
  @NotNull @Valid 
  @Schema(name = "fromDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fromDate")
  public OffsetDateTime getFromDate() {
    return fromDate;
  }

  public void setFromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
  }

  public ReqLeaf toDate(OffsetDateTime toDate) {
    this.toDate = toDate;
    return this;
  }

  /**
   * Get toDate
   * @return toDate
  */
  @NotNull @Valid 
  @Schema(name = "toDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("toDate")
  public OffsetDateTime getToDate() {
    return toDate;
  }

  public void setToDate(OffsetDateTime toDate) {
    this.toDate = toDate;
  }

  public ReqLeaf noOfDays(Integer noOfDays) {
    this.noOfDays = noOfDays;
    return this;
  }

  /**
   * Get noOfDays
   * @return noOfDays
  */
  @NotNull 
  @Schema(name = "noOfDays", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("noOfDays")
  public Integer getNoOfDays() {
    return noOfDays;
  }

  public void setNoOfDays(Integer noOfDays) {
    this.noOfDays = noOfDays;
  }

  public ReqLeaf leaveType(String leaveType) {
    this.leaveType = leaveType;
    return this;
  }

  /**
   * Get leaveType
   * @return leaveType
  */
  @NotNull 
  @Schema(name = "leaveType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("leaveType")
  public String getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(String leaveType) {
    this.leaveType = leaveType;
  }

  public ReqLeaf details(String details) {
    this.details = JsonNullable.of(details);
    return this;
  }

  /**
   * Get details
   * @return details
  */
  
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public JsonNullable<String> getDetails() {
    return details;
  }

  public void setDetails(JsonNullable<String> details) {
    this.details = details;
  }

  public ReqLeaf isApproved(Boolean isApproved) {
    this.isApproved = JsonNullable.of(isApproved);
    return this;
  }

  /**
   * Get isApproved
   * @return isApproved
  */
  
  @Schema(name = "isApproved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isApproved")
  public JsonNullable<Boolean> getIsApproved() {
    return isApproved;
  }

  public void setIsApproved(JsonNullable<Boolean> isApproved) {
    this.isApproved = isApproved;
  }

  public ReqLeaf approvedDate(OffsetDateTime approvedDate) {
    this.approvedDate = JsonNullable.of(approvedDate);
    return this;
  }

  /**
   * Get approvedDate
   * @return approvedDate
  */
  @Valid 
  @Schema(name = "approvedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvedDate")
  public JsonNullable<OffsetDateTime> getApprovedDate() {
    return approvedDate;
  }

  public void setApprovedDate(JsonNullable<OffsetDateTime> approvedDate) {
    this.approvedDate = approvedDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReqLeaf reqLeaf = (ReqLeaf) o;
    return Objects.equals(this.leaveId, reqLeaf.leaveId) &&
        Objects.equals(this.employeeId, reqLeaf.employeeId) &&
        Objects.equals(this.fromDate, reqLeaf.fromDate) &&
        Objects.equals(this.toDate, reqLeaf.toDate) &&
        Objects.equals(this.noOfDays, reqLeaf.noOfDays) &&
        Objects.equals(this.leaveType, reqLeaf.leaveType) &&
        equalsNullable(this.details, reqLeaf.details) &&
        equalsNullable(this.isApproved, reqLeaf.isApproved) &&
        equalsNullable(this.approvedDate, reqLeaf.approvedDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveId, employeeId, fromDate, toDate, noOfDays, leaveType, hashCodeNullable(details), hashCodeNullable(isApproved), hashCodeNullable(approvedDate));
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
    sb.append("class ReqLeaf {\n");
    sb.append("    leaveId: ").append(toIndentedString(leaveId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    noOfDays: ").append(toIndentedString(noOfDays)).append("\n");
    sb.append("    leaveType: ").append(toIndentedString(leaveType)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    isApproved: ").append(toIndentedString(isApproved)).append("\n");
    sb.append("    approvedDate: ").append(toIndentedString(approvedDate)).append("\n");
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

