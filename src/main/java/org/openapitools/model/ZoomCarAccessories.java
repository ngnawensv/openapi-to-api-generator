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
 * ZoomCarAccessories
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ZoomCarAccessories {

  private Integer accessoriesId;

  private String accessoriesTitle;

  private Boolean showOnWebsite;

  private Integer carId;

  public ZoomCarAccessories() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ZoomCarAccessories(String accessoriesTitle, Integer carId) {
    this.accessoriesTitle = accessoriesTitle;
    this.carId = carId;
  }

  public ZoomCarAccessories accessoriesId(Integer accessoriesId) {
    this.accessoriesId = accessoriesId;
    return this;
  }

  /**
   * Get accessoriesId
   * @return accessoriesId
  */
  
  @Schema(name = "accessoriesId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accessoriesId")
  public Integer getAccessoriesId() {
    return accessoriesId;
  }

  public void setAccessoriesId(Integer accessoriesId) {
    this.accessoriesId = accessoriesId;
  }

  public ZoomCarAccessories accessoriesTitle(String accessoriesTitle) {
    this.accessoriesTitle = accessoriesTitle;
    return this;
  }

  /**
   * Get accessoriesTitle
   * @return accessoriesTitle
  */
  @NotNull 
  @Schema(name = "accessoriesTitle", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accessoriesTitle")
  public String getAccessoriesTitle() {
    return accessoriesTitle;
  }

  public void setAccessoriesTitle(String accessoriesTitle) {
    this.accessoriesTitle = accessoriesTitle;
  }

  public ZoomCarAccessories showOnWebsite(Boolean showOnWebsite) {
    this.showOnWebsite = showOnWebsite;
    return this;
  }

  /**
   * Get showOnWebsite
   * @return showOnWebsite
  */
  
  @Schema(name = "showOnWebsite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showOnWebsite")
  public Boolean getShowOnWebsite() {
    return showOnWebsite;
  }

  public void setShowOnWebsite(Boolean showOnWebsite) {
    this.showOnWebsite = showOnWebsite;
  }

  public ZoomCarAccessories carId(Integer carId) {
    this.carId = carId;
    return this;
  }

  /**
   * Get carId
   * @return carId
  */
  @NotNull 
  @Schema(name = "carId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("carId")
  public Integer getCarId() {
    return carId;
  }

  public void setCarId(Integer carId) {
    this.carId = carId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoomCarAccessories zoomCarAccessories = (ZoomCarAccessories) o;
    return Objects.equals(this.accessoriesId, zoomCarAccessories.accessoriesId) &&
        Objects.equals(this.accessoriesTitle, zoomCarAccessories.accessoriesTitle) &&
        Objects.equals(this.showOnWebsite, zoomCarAccessories.showOnWebsite) &&
        Objects.equals(this.carId, zoomCarAccessories.carId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessoriesId, accessoriesTitle, showOnWebsite, carId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoomCarAccessories {\n");
    sb.append("    accessoriesId: ").append(toIndentedString(accessoriesId)).append("\n");
    sb.append("    accessoriesTitle: ").append(toIndentedString(accessoriesTitle)).append("\n");
    sb.append("    showOnWebsite: ").append(toIndentedString(showOnWebsite)).append("\n");
    sb.append("    carId: ").append(toIndentedString(carId)).append("\n");
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

