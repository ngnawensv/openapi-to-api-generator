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
 * StatusMasterView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class StatusMasterView {

  private Integer statusId;

  private String statusFor;

  private String status;

  private JsonNullable<String> message = JsonNullable.<String>undefined();

  private Boolean result;

  public StatusMasterView() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StatusMasterView(String statusFor, String status) {
    this.statusFor = statusFor;
    this.status = status;
  }

  public StatusMasterView statusId(Integer statusId) {
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

  public StatusMasterView statusFor(String statusFor) {
    this.statusFor = statusFor;
    return this;
  }

  /**
   * Get statusFor
   * @return statusFor
  */
  @NotNull 
  @Schema(name = "StatusFor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("StatusFor")
  public String getStatusFor() {
    return statusFor;
  }

  public void setStatusFor(String statusFor) {
    this.statusFor = statusFor;
  }

  public StatusMasterView status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull 
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public StatusMasterView message(String message) {
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

  public StatusMasterView result(Boolean result) {
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
    StatusMasterView statusMasterView = (StatusMasterView) o;
    return Objects.equals(this.statusId, statusMasterView.statusId) &&
        Objects.equals(this.statusFor, statusMasterView.statusFor) &&
        Objects.equals(this.status, statusMasterView.status) &&
        equalsNullable(this.message, statusMasterView.message) &&
        Objects.equals(this.result, statusMasterView.result);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusId, statusFor, status, hashCodeNullable(message), result);
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
    sb.append("class StatusMasterView {\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    statusFor: ").append(toIndentedString(statusFor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

