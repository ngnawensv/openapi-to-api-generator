package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ZoomCarAccessories;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ZoomCarView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ZoomCarView {

  private Integer carId;

  private String brand;

  private String name;

  private String pricingDescription;

  private Double pricing;

  private Integer locationId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime registeredOn;

  private String imageUrl;

  private String vehicleNo;

  private Integer ownerUserId;

  @Valid
  private JsonNullable<List<@Valid ZoomCarAccessories>> zoomCarAccessoriess = JsonNullable.<List<@Valid ZoomCarAccessories>>undefined();

  public ZoomCarView() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ZoomCarView(String brand, String name, String pricingDescription, Double pricing, Integer locationId, String imageUrl, String vehicleNo, Integer ownerUserId) {
    this.brand = brand;
    this.name = name;
    this.pricingDescription = pricingDescription;
    this.pricing = pricing;
    this.locationId = locationId;
    this.imageUrl = imageUrl;
    this.vehicleNo = vehicleNo;
    this.ownerUserId = ownerUserId;
  }

  public ZoomCarView carId(Integer carId) {
    this.carId = carId;
    return this;
  }

  /**
   * Get carId
   * @return carId
  */
  
  @Schema(name = "carId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carId")
  public Integer getCarId() {
    return carId;
  }

  public void setCarId(Integer carId) {
    this.carId = carId;
  }

  public ZoomCarView brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  */
  @NotNull 
  @Schema(name = "brand", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public ZoomCarView name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ZoomCarView pricingDescription(String pricingDescription) {
    this.pricingDescription = pricingDescription;
    return this;
  }

  /**
   * Get pricingDescription
   * @return pricingDescription
  */
  @NotNull 
  @Schema(name = "pricingDescription", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pricingDescription")
  public String getPricingDescription() {
    return pricingDescription;
  }

  public void setPricingDescription(String pricingDescription) {
    this.pricingDescription = pricingDescription;
  }

  public ZoomCarView pricing(Double pricing) {
    this.pricing = pricing;
    return this;
  }

  /**
   * Get pricing
   * @return pricing
  */
  @NotNull 
  @Schema(name = "pricing", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pricing")
  public Double getPricing() {
    return pricing;
  }

  public void setPricing(Double pricing) {
    this.pricing = pricing;
  }

  public ZoomCarView locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  */
  @NotNull 
  @Schema(name = "locationId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("locationId")
  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public ZoomCarView registeredOn(OffsetDateTime registeredOn) {
    this.registeredOn = registeredOn;
    return this;
  }

  /**
   * Get registeredOn
   * @return registeredOn
  */
  @Valid 
  @Schema(name = "registeredOn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registeredOn")
  public OffsetDateTime getRegisteredOn() {
    return registeredOn;
  }

  public void setRegisteredOn(OffsetDateTime registeredOn) {
    this.registeredOn = registeredOn;
  }

  public ZoomCarView imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  @NotNull 
  @Schema(name = "imageUrl", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public ZoomCarView vehicleNo(String vehicleNo) {
    this.vehicleNo = vehicleNo;
    return this;
  }

  /**
   * Get vehicleNo
   * @return vehicleNo
  */
  @NotNull 
  @Schema(name = "vehicleNo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleNo")
  public String getVehicleNo() {
    return vehicleNo;
  }

  public void setVehicleNo(String vehicleNo) {
    this.vehicleNo = vehicleNo;
  }

  public ZoomCarView ownerUserId(Integer ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

  /**
   * Get ownerUserId
   * @return ownerUserId
  */
  @NotNull 
  @Schema(name = "ownerUserId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ownerUserId")
  public Integer getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(Integer ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public ZoomCarView zoomCarAccessoriess(List<@Valid ZoomCarAccessories> zoomCarAccessoriess) {
    this.zoomCarAccessoriess = JsonNullable.of(zoomCarAccessoriess);
    return this;
  }

  public ZoomCarView addZoomCarAccessoriessItem(ZoomCarAccessories zoomCarAccessoriessItem) {
    if (this.zoomCarAccessoriess == null || !this.zoomCarAccessoriess.isPresent()) {
      this.zoomCarAccessoriess = JsonNullable.of(new ArrayList<>());
    }
    this.zoomCarAccessoriess.get().add(zoomCarAccessoriessItem);
    return this;
  }

  /**
   * Get zoomCarAccessoriess
   * @return zoomCarAccessoriess
  */
  @Valid 
  @Schema(name = "ZoomCarAccessoriess", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ZoomCarAccessoriess")
  public JsonNullable<List<@Valid ZoomCarAccessories>> getZoomCarAccessoriess() {
    return zoomCarAccessoriess;
  }

  public void setZoomCarAccessoriess(JsonNullable<List<@Valid ZoomCarAccessories>> zoomCarAccessoriess) {
    this.zoomCarAccessoriess = zoomCarAccessoriess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoomCarView zoomCarView = (ZoomCarView) o;
    return Objects.equals(this.carId, zoomCarView.carId) &&
        Objects.equals(this.brand, zoomCarView.brand) &&
        Objects.equals(this.name, zoomCarView.name) &&
        Objects.equals(this.pricingDescription, zoomCarView.pricingDescription) &&
        Objects.equals(this.pricing, zoomCarView.pricing) &&
        Objects.equals(this.locationId, zoomCarView.locationId) &&
        Objects.equals(this.registeredOn, zoomCarView.registeredOn) &&
        Objects.equals(this.imageUrl, zoomCarView.imageUrl) &&
        Objects.equals(this.vehicleNo, zoomCarView.vehicleNo) &&
        Objects.equals(this.ownerUserId, zoomCarView.ownerUserId) &&
        equalsNullable(this.zoomCarAccessoriess, zoomCarView.zoomCarAccessoriess);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(carId, brand, name, pricingDescription, pricing, locationId, registeredOn, imageUrl, vehicleNo, ownerUserId, hashCodeNullable(zoomCarAccessoriess));
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
    sb.append("class ZoomCarView {\n");
    sb.append("    carId: ").append(toIndentedString(carId)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pricingDescription: ").append(toIndentedString(pricingDescription)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    registeredOn: ").append(toIndentedString(registeredOn)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    vehicleNo: ").append(toIndentedString(vehicleNo)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    zoomCarAccessoriess: ").append(toIndentedString(zoomCarAccessoriess)).append("\n");
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

