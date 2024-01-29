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
 * TrainAppStation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class TrainAppStation {

  private Integer stationID;

  private JsonNullable<String> stationName = JsonNullable.<String>undefined();

  private JsonNullable<String> stationCode = JsonNullable.<String>undefined();

  public TrainAppStation stationID(Integer stationID) {
    this.stationID = stationID;
    return this;
  }

  /**
   * Get stationID
   * @return stationID
  */
  
  @Schema(name = "stationID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stationID")
  public Integer getStationID() {
    return stationID;
  }

  public void setStationID(Integer stationID) {
    this.stationID = stationID;
  }

  public TrainAppStation stationName(String stationName) {
    this.stationName = JsonNullable.of(stationName);
    return this;
  }

  /**
   * Get stationName
   * @return stationName
  */
  
  @Schema(name = "stationName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stationName")
  public JsonNullable<String> getStationName() {
    return stationName;
  }

  public void setStationName(JsonNullable<String> stationName) {
    this.stationName = stationName;
  }

  public TrainAppStation stationCode(String stationCode) {
    this.stationCode = JsonNullable.of(stationCode);
    return this;
  }

  /**
   * Get stationCode
   * @return stationCode
  */
  
  @Schema(name = "stationCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stationCode")
  public JsonNullable<String> getStationCode() {
    return stationCode;
  }

  public void setStationCode(JsonNullable<String> stationCode) {
    this.stationCode = stationCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainAppStation trainAppStation = (TrainAppStation) o;
    return Objects.equals(this.stationID, trainAppStation.stationID) &&
        equalsNullable(this.stationName, trainAppStation.stationName) &&
        equalsNullable(this.stationCode, trainAppStation.stationCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(stationID, hashCodeNullable(stationName), hashCodeNullable(stationCode));
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
    sb.append("class TrainAppStation {\n");
    sb.append("    stationID: ").append(toIndentedString(stationID)).append("\n");
    sb.append("    stationName: ").append(toIndentedString(stationName)).append("\n");
    sb.append("    stationCode: ").append(toIndentedString(stationCode)).append("\n");
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

