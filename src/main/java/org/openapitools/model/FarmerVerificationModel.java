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
 * FarmerVerificationModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class FarmerVerificationModel {

  private Integer farmerId;

  private Integer executiveId;

  public FarmerVerificationModel farmerId(Integer farmerId) {
    this.farmerId = farmerId;
    return this;
  }

  /**
   * Get farmerId
   * @return farmerId
  */
  
  @Schema(name = "farmerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("farmerId")
  public Integer getFarmerId() {
    return farmerId;
  }

  public void setFarmerId(Integer farmerId) {
    this.farmerId = farmerId;
  }

  public FarmerVerificationModel executiveId(Integer executiveId) {
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
    FarmerVerificationModel farmerVerificationModel = (FarmerVerificationModel) o;
    return Objects.equals(this.farmerId, farmerVerificationModel.farmerId) &&
        Objects.equals(this.executiveId, farmerVerificationModel.executiveId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(farmerId, executiveId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FarmerVerificationModel {\n");
    sb.append("    farmerId: ").append(toIndentedString(farmerId)).append("\n");
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

