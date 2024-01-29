package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ZomatoRestaurant
 */

@JsonTypeName("zomatoRestaurant")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ZomatoRestaurant {

  private Integer restaurantID;

  private String name;

  private JsonNullable<String> cuisineType = JsonNullable.<String>undefined();

  private JsonNullable<String> address = JsonNullable.<String>undefined();

  private String contactNo;

  private String openingHours;

  public ZomatoRestaurant() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ZomatoRestaurant(String name, String contactNo, String openingHours) {
    this.name = name;
    this.contactNo = contactNo;
    this.openingHours = openingHours;
  }

  public ZomatoRestaurant restaurantID(Integer restaurantID) {
    this.restaurantID = restaurantID;
    return this;
  }

  /**
   * Get restaurantID
   * @return restaurantID
  */
  
  @Schema(name = "restaurantID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("restaurantID")
  public Integer getRestaurantID() {
    return restaurantID;
  }

  public void setRestaurantID(Integer restaurantID) {
    this.restaurantID = restaurantID;
  }

  public ZomatoRestaurant name(String name) {
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

  public ZomatoRestaurant cuisineType(String cuisineType) {
    this.cuisineType = JsonNullable.of(cuisineType);
    return this;
  }

  /**
   * Get cuisineType
   * @return cuisineType
  */
  
  @Schema(name = "cuisineType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cuisineType")
  public JsonNullable<String> getCuisineType() {
    return cuisineType;
  }

  public void setCuisineType(JsonNullable<String> cuisineType) {
    this.cuisineType = cuisineType;
  }

  public ZomatoRestaurant address(String address) {
    this.address = JsonNullable.of(address);
    return this;
  }

  /**
   * Get address
   * @return address
  */
  
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public JsonNullable<String> getAddress() {
    return address;
  }

  public void setAddress(JsonNullable<String> address) {
    this.address = address;
  }

  public ZomatoRestaurant contactNo(String contactNo) {
    this.contactNo = contactNo;
    return this;
  }

  /**
   * Get contactNo
   * @return contactNo
  */
  @NotNull 
  @Schema(name = "contactNo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contactNo")
  public String getContactNo() {
    return contactNo;
  }

  public void setContactNo(String contactNo) {
    this.contactNo = contactNo;
  }

  public ZomatoRestaurant openingHours(String openingHours) {
    this.openingHours = openingHours;
    return this;
  }

  /**
   * Get openingHours
   * @return openingHours
  */
  @NotNull 
  @Schema(name = "openingHours", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("openingHours")
  public String getOpeningHours() {
    return openingHours;
  }

  public void setOpeningHours(String openingHours) {
    this.openingHours = openingHours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZomatoRestaurant zomatoRestaurant = (ZomatoRestaurant) o;
    return Objects.equals(this.restaurantID, zomatoRestaurant.restaurantID) &&
        Objects.equals(this.name, zomatoRestaurant.name) &&
        equalsNullable(this.cuisineType, zomatoRestaurant.cuisineType) &&
        equalsNullable(this.address, zomatoRestaurant.address) &&
        Objects.equals(this.contactNo, zomatoRestaurant.contactNo) &&
        Objects.equals(this.openingHours, zomatoRestaurant.openingHours);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(restaurantID, name, hashCodeNullable(cuisineType), hashCodeNullable(address), contactNo, openingHours);
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
    sb.append("class ZomatoRestaurant {\n");
    sb.append("    restaurantID: ").append(toIndentedString(restaurantID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cuisineType: ").append(toIndentedString(cuisineType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    openingHours: ").append(toIndentedString(openingHours)).append("\n");
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

