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
 * BigEcomProduct
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class BigEcomProduct {

  private Integer productId;

  private String productSku;

  private JsonNullable<String> productName = JsonNullable.<String>undefined();

  private Double productPrice;

  private JsonNullable<String> productShortName = JsonNullable.<String>undefined();

  private JsonNullable<String> productDescription = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  private JsonNullable<String> deliveryTimeSpan = JsonNullable.<String>undefined();

  private Integer categoryId;

  private JsonNullable<String> productImageUrl = JsonNullable.<String>undefined();

  public BigEcomProduct() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BigEcomProduct(String productSku) {
    this.productSku = productSku;
  }

  public BigEcomProduct productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  
  @Schema(name = "ProductId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductId")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public BigEcomProduct productSku(String productSku) {
    this.productSku = productSku;
    return this;
  }

  /**
   * Get productSku
   * @return productSku
  */
  @NotNull 
  @Schema(name = "ProductSku", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ProductSku")
  public String getProductSku() {
    return productSku;
  }

  public void setProductSku(String productSku) {
    this.productSku = productSku;
  }

  public BigEcomProduct productName(String productName) {
    this.productName = JsonNullable.of(productName);
    return this;
  }

  /**
   * Get productName
   * @return productName
  */
  
  @Schema(name = "ProductName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductName")
  public JsonNullable<String> getProductName() {
    return productName;
  }

  public void setProductName(JsonNullable<String> productName) {
    this.productName = productName;
  }

  public BigEcomProduct productPrice(Double productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  /**
   * Get productPrice
   * @return productPrice
  */
  
  @Schema(name = "ProductPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductPrice")
  public Double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(Double productPrice) {
    this.productPrice = productPrice;
  }

  public BigEcomProduct productShortName(String productShortName) {
    this.productShortName = JsonNullable.of(productShortName);
    return this;
  }

  /**
   * Get productShortName
   * @return productShortName
  */
  
  @Schema(name = "ProductShortName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductShortName")
  public JsonNullable<String> getProductShortName() {
    return productShortName;
  }

  public void setProductShortName(JsonNullable<String> productShortName) {
    this.productShortName = productShortName;
  }

  public BigEcomProduct productDescription(String productDescription) {
    this.productDescription = JsonNullable.of(productDescription);
    return this;
  }

  /**
   * Get productDescription
   * @return productDescription
  */
  
  @Schema(name = "ProductDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductDescription")
  public JsonNullable<String> getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(JsonNullable<String> productDescription) {
    this.productDescription = productDescription;
  }

  public BigEcomProduct createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "CreatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public BigEcomProduct deliveryTimeSpan(String deliveryTimeSpan) {
    this.deliveryTimeSpan = JsonNullable.of(deliveryTimeSpan);
    return this;
  }

  /**
   * Get deliveryTimeSpan
   * @return deliveryTimeSpan
  */
  
  @Schema(name = "DeliveryTimeSpan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryTimeSpan")
  public JsonNullable<String> getDeliveryTimeSpan() {
    return deliveryTimeSpan;
  }

  public void setDeliveryTimeSpan(JsonNullable<String> deliveryTimeSpan) {
    this.deliveryTimeSpan = deliveryTimeSpan;
  }

  public BigEcomProduct categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  
  @Schema(name = "CategoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CategoryId")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public BigEcomProduct productImageUrl(String productImageUrl) {
    this.productImageUrl = JsonNullable.of(productImageUrl);
    return this;
  }

  /**
   * Get productImageUrl
   * @return productImageUrl
  */
  
  @Schema(name = "ProductImageUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductImageUrl")
  public JsonNullable<String> getProductImageUrl() {
    return productImageUrl;
  }

  public void setProductImageUrl(JsonNullable<String> productImageUrl) {
    this.productImageUrl = productImageUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BigEcomProduct bigEcomProduct = (BigEcomProduct) o;
    return Objects.equals(this.productId, bigEcomProduct.productId) &&
        Objects.equals(this.productSku, bigEcomProduct.productSku) &&
        equalsNullable(this.productName, bigEcomProduct.productName) &&
        Objects.equals(this.productPrice, bigEcomProduct.productPrice) &&
        equalsNullable(this.productShortName, bigEcomProduct.productShortName) &&
        equalsNullable(this.productDescription, bigEcomProduct.productDescription) &&
        Objects.equals(this.createdDate, bigEcomProduct.createdDate) &&
        equalsNullable(this.deliveryTimeSpan, bigEcomProduct.deliveryTimeSpan) &&
        Objects.equals(this.categoryId, bigEcomProduct.categoryId) &&
        equalsNullable(this.productImageUrl, bigEcomProduct.productImageUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productSku, hashCodeNullable(productName), productPrice, hashCodeNullable(productShortName), hashCodeNullable(productDescription), createdDate, hashCodeNullable(deliveryTimeSpan), categoryId, hashCodeNullable(productImageUrl));
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
    sb.append("class BigEcomProduct {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productShortName: ").append(toIndentedString(productShortName)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    deliveryTimeSpan: ").append(toIndentedString(deliveryTimeSpan)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    productImageUrl: ").append(toIndentedString(productImageUrl)).append("\n");
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

