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
 * ZomatoMenuItem
 */

@JsonTypeName("zomatoMenuItem")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ZomatoMenuItem {

  private Integer itemID;

  private Integer restaurantID;

  private Integer categoryId;

  private String name;

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private Double price;

  private JsonNullable<String> photoUrl = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> availability = JsonNullable.<Boolean>undefined();

  public ZomatoMenuItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ZomatoMenuItem(Integer restaurantID, String name, Double price) {
    this.restaurantID = restaurantID;
    this.name = name;
    this.price = price;
  }

  public ZomatoMenuItem itemID(Integer itemID) {
    this.itemID = itemID;
    return this;
  }

  /**
   * Get itemID
   * @return itemID
  */
  
  @Schema(name = "itemID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemID")
  public Integer getItemID() {
    return itemID;
  }

  public void setItemID(Integer itemID) {
    this.itemID = itemID;
  }

  public ZomatoMenuItem restaurantID(Integer restaurantID) {
    this.restaurantID = restaurantID;
    return this;
  }

  /**
   * Get restaurantID
   * @return restaurantID
  */
  @NotNull 
  @Schema(name = "restaurantID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("restaurantID")
  public Integer getRestaurantID() {
    return restaurantID;
  }

  public void setRestaurantID(Integer restaurantID) {
    this.restaurantID = restaurantID;
  }

  public ZomatoMenuItem categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  
  @Schema(name = "categoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryId")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public ZomatoMenuItem name(String name) {
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

  public ZomatoMenuItem description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public ZomatoMenuItem price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @NotNull 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ZomatoMenuItem photoUrl(String photoUrl) {
    this.photoUrl = JsonNullable.of(photoUrl);
    return this;
  }

  /**
   * Get photoUrl
   * @return photoUrl
  */
  
  @Schema(name = "photoUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photoUrl")
  public JsonNullable<String> getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(JsonNullable<String> photoUrl) {
    this.photoUrl = photoUrl;
  }

  public ZomatoMenuItem availability(Boolean availability) {
    this.availability = JsonNullable.of(availability);
    return this;
  }

  /**
   * Get availability
   * @return availability
  */
  
  @Schema(name = "availability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availability")
  public JsonNullable<Boolean> getAvailability() {
    return availability;
  }

  public void setAvailability(JsonNullable<Boolean> availability) {
    this.availability = availability;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZomatoMenuItem zomatoMenuItem = (ZomatoMenuItem) o;
    return Objects.equals(this.itemID, zomatoMenuItem.itemID) &&
        Objects.equals(this.restaurantID, zomatoMenuItem.restaurantID) &&
        Objects.equals(this.categoryId, zomatoMenuItem.categoryId) &&
        Objects.equals(this.name, zomatoMenuItem.name) &&
        equalsNullable(this.description, zomatoMenuItem.description) &&
        Objects.equals(this.price, zomatoMenuItem.price) &&
        equalsNullable(this.photoUrl, zomatoMenuItem.photoUrl) &&
        equalsNullable(this.availability, zomatoMenuItem.availability);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemID, restaurantID, categoryId, name, hashCodeNullable(description), price, hashCodeNullable(photoUrl), hashCodeNullable(availability));
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
    sb.append("class ZomatoMenuItem {\n");
    sb.append("    itemID: ").append(toIndentedString(itemID)).append("\n");
    sb.append("    restaurantID: ").append(toIndentedString(restaurantID)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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

