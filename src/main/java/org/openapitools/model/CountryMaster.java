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
 * CountryMaster
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class CountryMaster {

  private Integer countryId;

  private String countryName;

  public CountryMaster() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CountryMaster(String countryName) {
    this.countryName = countryName;
  }

  public CountryMaster countryId(Integer countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * Get countryId
   * @return countryId
  */
  
  @Schema(name = "CountryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CountryId")
  public Integer getCountryId() {
    return countryId;
  }

  public void setCountryId(Integer countryId) {
    this.countryId = countryId;
  }

  public CountryMaster countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  /**
   * Get countryName
   * @return countryName
  */
  @NotNull 
  @Schema(name = "CountryName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CountryName")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryMaster countryMaster = (CountryMaster) o;
    return Objects.equals(this.countryId, countryMaster.countryId) &&
        Objects.equals(this.countryName, countryMaster.countryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryId, countryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryMaster {\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
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

