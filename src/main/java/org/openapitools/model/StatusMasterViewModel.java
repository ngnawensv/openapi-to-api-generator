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
 * StatusMasterViewModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class StatusMasterViewModel {

  private Integer statusId;

  private JsonNullable<String> status = JsonNullable.<String>undefined();

  private JsonNullable<String> statusFor = JsonNullable.<String>undefined();

  public StatusMasterViewModel statusId(Integer statusId) {
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

  public StatusMasterViewModel status(String status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public JsonNullable<String> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<String> status) {
    this.status = status;
  }

  public StatusMasterViewModel statusFor(String statusFor) {
    this.statusFor = JsonNullable.of(statusFor);
    return this;
  }

  /**
   * Get statusFor
   * @return statusFor
  */
  
  @Schema(name = "StatusFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatusFor")
  public JsonNullable<String> getStatusFor() {
    return statusFor;
  }

  public void setStatusFor(JsonNullable<String> statusFor) {
    this.statusFor = statusFor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusMasterViewModel statusMasterViewModel = (StatusMasterViewModel) o;
    return Objects.equals(this.statusId, statusMasterViewModel.statusId) &&
        equalsNullable(this.status, statusMasterViewModel.status) &&
        equalsNullable(this.statusFor, statusMasterViewModel.statusFor);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusId, hashCodeNullable(status), hashCodeNullable(statusFor));
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
    sb.append("class StatusMasterViewModel {\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusFor: ").append(toIndentedString(statusFor)).append("\n");
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

