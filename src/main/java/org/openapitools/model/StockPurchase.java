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
 * StockPurchase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class StockPurchase {

  private Integer purchaseId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime purchaseDate;

  private Integer productId;

  private Integer quantity;

  private JsonNullable<String> supplierName = JsonNullable.<String>undefined();

  private Double invoiceAmount;

  private JsonNullable<String> invoiceNo = JsonNullable.<String>undefined();

  public StockPurchase purchaseId(Integer purchaseId) {
    this.purchaseId = purchaseId;
    return this;
  }

  /**
   * Get purchaseId
   * @return purchaseId
  */
  
  @Schema(name = "purchaseId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseId")
  public Integer getPurchaseId() {
    return purchaseId;
  }

  public void setPurchaseId(Integer purchaseId) {
    this.purchaseId = purchaseId;
  }

  public StockPurchase purchaseDate(OffsetDateTime purchaseDate) {
    this.purchaseDate = purchaseDate;
    return this;
  }

  /**
   * Get purchaseDate
   * @return purchaseDate
  */
  @Valid 
  @Schema(name = "purchaseDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseDate")
  public OffsetDateTime getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(OffsetDateTime purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public StockPurchase productId(Integer productId) {
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

  public StockPurchase quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public StockPurchase supplierName(String supplierName) {
    this.supplierName = JsonNullable.of(supplierName);
    return this;
  }

  /**
   * Get supplierName
   * @return supplierName
  */
  
  @Schema(name = "supplierName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supplierName")
  public JsonNullable<String> getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(JsonNullable<String> supplierName) {
    this.supplierName = supplierName;
  }

  public StockPurchase invoiceAmount(Double invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
    return this;
  }

  /**
   * Get invoiceAmount
   * @return invoiceAmount
  */
  
  @Schema(name = "invoiceAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceAmount")
  public Double getInvoiceAmount() {
    return invoiceAmount;
  }

  public void setInvoiceAmount(Double invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }

  public StockPurchase invoiceNo(String invoiceNo) {
    this.invoiceNo = JsonNullable.of(invoiceNo);
    return this;
  }

  /**
   * Get invoiceNo
   * @return invoiceNo
  */
  
  @Schema(name = "invoiceNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceNo")
  public JsonNullable<String> getInvoiceNo() {
    return invoiceNo;
  }

  public void setInvoiceNo(JsonNullable<String> invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockPurchase stockPurchase = (StockPurchase) o;
    return Objects.equals(this.purchaseId, stockPurchase.purchaseId) &&
        Objects.equals(this.purchaseDate, stockPurchase.purchaseDate) &&
        Objects.equals(this.productId, stockPurchase.productId) &&
        Objects.equals(this.quantity, stockPurchase.quantity) &&
        equalsNullable(this.supplierName, stockPurchase.supplierName) &&
        Objects.equals(this.invoiceAmount, stockPurchase.invoiceAmount) &&
        equalsNullable(this.invoiceNo, stockPurchase.invoiceNo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseId, purchaseDate, productId, quantity, hashCodeNullable(supplierName), invoiceAmount, hashCodeNullable(invoiceNo));
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
    sb.append("class StockPurchase {\n");
    sb.append("    purchaseId: ").append(toIndentedString(purchaseId)).append("\n");
    sb.append("    purchaseDate: ").append(toIndentedString(purchaseDate)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    supplierName: ").append(toIndentedString(supplierName)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
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

