package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VendorVerificationModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class VendorVerificationModel {

  private Integer vendorId;

  private Integer executiveId;

  public VendorVerificationModel vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

  /**
   * Get vendorId
   * @return vendorId
  */
  
  @Schema(name = "vendorId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendorId")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  public VendorVerificationModel executiveId(Integer executiveId) {
    this.executiveId = executiveId;
    return this;
  }

  /**
   * Get executiveId
   * @return executiveId
  */
  
  @Schema(name = "executiveId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executiveId")
  public Integer getExecutiveId() {
    return executiveId;
  }

  public void setExecutiveId(Integer executiveId) {
    this.executiveId = executiveId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorVerificationModel vendorVerificationModel = (VendorVerificationModel) o;
    return Objects.equals(this.vendorId, vendorVerificationModel.vendorId) &&
        Objects.equals(this.executiveId, vendorVerificationModel.executiveId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, executiveId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorVerificationModel {\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    executiveId: ").append(toIndentedString(executiveId)).append("\n");
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

