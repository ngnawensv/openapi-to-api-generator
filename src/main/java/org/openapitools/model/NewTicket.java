package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NewTicket
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class NewTicket {

  private Integer employeeId;

  private JsonNullable<String> severity = JsonNullable.<String>undefined();

  private Integer deptId;

  private JsonNullable<String> state = JsonNullable.<String>undefined();

  private JsonNullable<String> requestDetails = JsonNullable.<String>undefined();

  public NewTicket() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NewTicket(Integer employeeId, Integer deptId) {
    this.employeeId = employeeId;
    this.deptId = deptId;
  }

  public NewTicket employeeId(Integer employeeId) {
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

  public NewTicket severity(String severity) {
    this.severity = JsonNullable.of(severity);
    return this;
  }

  /**
   * Get severity
   * @return severity
  */
  
  @Schema(name = "severity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("severity")
  public JsonNullable<String> getSeverity() {
    return severity;
  }

  public void setSeverity(JsonNullable<String> severity) {
    this.severity = severity;
  }

  public NewTicket deptId(Integer deptId) {
    this.deptId = deptId;
    return this;
  }

  /**
   * Get deptId
   * @return deptId
  */
  @NotNull 
  @Schema(name = "deptId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deptId")
  public Integer getDeptId() {
    return deptId;
  }

  public void setDeptId(Integer deptId) {
    this.deptId = deptId;
  }

  public NewTicket state(String state) {
    this.state = JsonNullable.of(state);
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public JsonNullable<String> getState() {
    return state;
  }

  public void setState(JsonNullable<String> state) {
    this.state = state;
  }

  public NewTicket requestDetails(String requestDetails) {
    this.requestDetails = JsonNullable.of(requestDetails);
    return this;
  }

  /**
   * Get requestDetails
   * @return requestDetails
  */
  
  @Schema(name = "requestDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestDetails")
  public JsonNullable<String> getRequestDetails() {
    return requestDetails;
  }

  public void setRequestDetails(JsonNullable<String> requestDetails) {
    this.requestDetails = requestDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewTicket newTicket = (NewTicket) o;
    return Objects.equals(this.employeeId, newTicket.employeeId) &&
        equalsNullable(this.severity, newTicket.severity) &&
        Objects.equals(this.deptId, newTicket.deptId) &&
        equalsNullable(this.state, newTicket.state) &&
        equalsNullable(this.requestDetails, newTicket.requestDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, hashCodeNullable(severity), deptId, hashCodeNullable(state), hashCodeNullable(requestDetails));
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
    sb.append("class NewTicket {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    deptId: ").append(toIndentedString(deptId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    requestDetails: ").append(toIndentedString(requestDetails)).append("\n");
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

