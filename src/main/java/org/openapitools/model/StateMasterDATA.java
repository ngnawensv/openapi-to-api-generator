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
 * StateMasterDATA
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class StateMasterDATA {

  private Integer stateId;

  private String stateName;

  private Integer countryId;

  public StateMasterDATA() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StateMasterDATA(String stateName) {
    this.stateName = stateName;
  }

  public StateMasterDATA stateId(Integer stateId) {
    this.stateId = stateId;
    return this;
  }

  /**
   * Get stateId
   * @return stateId
  */
  
  @Schema(name = "stateId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateId")
  public Integer getStateId() {
    return stateId;
  }

  public void setStateId(Integer stateId) {
    this.stateId = stateId;
  }

  public StateMasterDATA stateName(String stateName) {
    this.stateName = stateName;
    return this;
  }

  /**
   * Get stateName
   * @return stateName
  */
  @NotNull 
  @Schema(name = "stateName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stateName")
  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public StateMasterDATA countryId(Integer countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * Get countryId
   * @return countryId
  */
  
  @Schema(name = "countryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryId")
  public Integer getCountryId() {
    return countryId;
  }

  public void setCountryId(Integer countryId) {
    this.countryId = countryId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateMasterDATA stateMasterDATA = (StateMasterDATA) o;
    return Objects.equals(this.stateId, stateMasterDATA.stateId) &&
        Objects.equals(this.stateName, stateMasterDATA.stateName) &&
        Objects.equals(this.countryId, stateMasterDATA.countryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateId, stateName, countryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateMasterDATA {\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
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

