package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * StockProduct
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class StockProduct {

  private Integer productId;

  private JsonNullable<String> productName = JsonNullable.<String>undefined();

  private JsonNullable<String> categoryName = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  private Double price;

  private JsonNullable<String> productDetails = JsonNullable.<String>undefined();

  public StockProduct productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  
  @Schema(name = "productId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productId")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public StockProduct productName(String productName) {
    this.productName = JsonNullable.of(productName);
    return this;
  }

  /**
   * Get productName
   * @return productName
  */
  
  @Schema(name = "productName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productName")
  public JsonNullable<String> getProductName() {
    return productName;
  }

  public void setProductName(JsonNullable<String> productName) {
    this.productName = productName;
  }

  public StockProduct categoryName(String categoryName) {
    this.categoryName = JsonNullable.of(categoryName);
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
  */
  
  @Schema(name = "categoryName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryName")
  public JsonNullable<String> getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(JsonNullable<String> categoryName) {
    this.categoryName = categoryName;
  }

  public StockProduct createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public StockProduct price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public StockProduct productDetails(String productDetails) {
    this.productDetails = JsonNullable.of(productDetails);
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  */
  
  @Schema(name = "productDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productDetails")
  public JsonNullable<String> getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(JsonNullable<String> productDetails) {
    this.productDetails = productDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockProduct stockProduct = (StockProduct) o;
    return Objects.equals(this.productId, stockProduct.productId) &&
        equalsNullable(this.productName, stockProduct.productName) &&
        equalsNullable(this.categoryName, stockProduct.categoryName) &&
        Objects.equals(this.createdDate, stockProduct.createdDate) &&
        Objects.equals(this.price, stockProduct.price) &&
        equalsNullable(this.productDetails, stockProduct.productDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, hashCodeNullable(productName), hashCodeNullable(categoryName), createdDate, price, hashCodeNullable(productDetails));
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
    sb.append("class StockProduct {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
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

