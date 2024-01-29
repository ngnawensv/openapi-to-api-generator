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
 * DistrictMasterData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class DistrictMasterData {

  private Integer districtId;

  private String districtName;

  private Integer stateId;

  public DistrictMasterData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DistrictMasterData(String districtName, Integer stateId) {
    this.districtName = districtName;
    this.stateId = stateId;
  }

  public DistrictMasterData districtId(Integer districtId) {
    this.districtId = districtId;
    return this;
  }

  /**
   * Get districtId
   * @return districtId
  */
  
  @Schema(name = "districtId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("districtId")
  public Integer getDistrictId() {
    return districtId;
  }

  public void setDistrictId(Integer districtId) {
    this.districtId = districtId;
  }

  public DistrictMasterData districtName(String districtName) {
    this.districtName = districtName;
    return this;
  }

  /**
   * Get districtName
   * @return districtName
  */
  @NotNull 
  @Schema(name = "districtName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("districtName")
  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public DistrictMasterData stateId(Integer stateId) {
    this.stateId = stateId;
    return this;
  }

  /**
   * Get stateId
   * @return stateId
  */
  @NotNull 
  @Schema(name = "stateId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stateId")
  public Integer getStateId() {
    return stateId;
  }

  public void setStateId(Integer stateId) {
    this.stateId = stateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistrictMasterData districtMasterData = (DistrictMasterData) o;
    return Objects.equals(this.districtId, districtMasterData.districtId) &&
        Objects.equals(this.districtName, districtMasterData.districtName) &&
        Objects.equals(this.stateId, districtMasterData.stateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(districtId, districtName, stateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistrictMasterData {\n");
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
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

