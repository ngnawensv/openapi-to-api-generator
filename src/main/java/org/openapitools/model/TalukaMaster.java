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
 * TalukaMaster
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class TalukaMaster {

  private Integer talukaId;

  private JsonNullable<String> talukaName = JsonNullable.<String>undefined();

  private Integer cityId;

  public TalukaMaster talukaId(Integer talukaId) {
    this.talukaId = talukaId;
    return this;
  }

  /**
   * Get talukaId
   * @return talukaId
  */
  
  @Schema(name = "talukaId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("talukaId")
  public Integer getTalukaId() {
    return talukaId;
  }

  public void setTalukaId(Integer talukaId) {
    this.talukaId = talukaId;
  }

  public TalukaMaster talukaName(String talukaName) {
    this.talukaName = JsonNullable.of(talukaName);
    return this;
  }

  /**
   * Get talukaName
   * @return talukaName
  */
  
  @Schema(name = "talukaName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("talukaName")
  public JsonNullable<String> getTalukaName() {
    return talukaName;
  }

  public void setTalukaName(JsonNullable<String> talukaName) {
    this.talukaName = talukaName;
  }

  public TalukaMaster cityId(Integer cityId) {
    this.cityId = cityId;
    return this;
  }

  /**
   * Get cityId
   * @return cityId
  */
  
  @Schema(name = "cityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cityId")
  public Integer getCityId() {
    return cityId;
  }

  public void setCityId(Integer cityId) {
    this.cityId = cityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TalukaMaster talukaMaster = (TalukaMaster) o;
    return Objects.equals(this.talukaId, talukaMaster.talukaId) &&
        equalsNullable(this.talukaName, talukaMaster.talukaName) &&
        Objects.equals(this.cityId, talukaMaster.cityId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(talukaId, hashCodeNullable(talukaName), cityId);
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
    sb.append("class TalukaMaster {\n");
    sb.append("    talukaId: ").append(toIndentedString(talukaId)).append("\n");
    sb.append("    talukaName: ").append(toIndentedString(talukaName)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
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

