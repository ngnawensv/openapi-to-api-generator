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
 * DistrictMaster
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class DistrictMaster {

  private Integer districtId;

  private JsonNullable<String> districtName = JsonNullable.<String>undefined();

  private JsonNullable<Integer> stateId = JsonNullable.<Integer>undefined();

  public DistrictMaster districtId(Integer districtId) {
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

  public DistrictMaster districtName(String districtName) {
    this.districtName = JsonNullable.of(districtName);
    return this;
  }

  /**
   * Get districtName
   * @return districtName
  */
  
  @Schema(name = "districtName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("districtName")
  public JsonNullable<String> getDistrictName() {
    return districtName;
  }

  public void setDistrictName(JsonNullable<String> districtName) {
    this.districtName = districtName;
  }

  public DistrictMaster stateId(Integer stateId) {
    this.stateId = JsonNullable.of(stateId);
    return this;
  }

  /**
   * Get stateId
   * @return stateId
  */
  
  @Schema(name = "stateId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateId")
  public JsonNullable<Integer> getStateId() {
    return stateId;
  }

  public void setStateId(JsonNullable<Integer> stateId) {
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
    DistrictMaster districtMaster = (DistrictMaster) o;
    return Objects.equals(this.districtId, districtMaster.districtId) &&
        equalsNullable(this.districtName, districtMaster.districtName) &&
        equalsNullable(this.stateId, districtMaster.stateId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(districtId, hashCodeNullable(districtName), hashCodeNullable(stateId));
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
    sb.append("class DistrictMaster {\n");
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

