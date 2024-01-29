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
 * StockSale
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class StockSale {

  private Integer saleId;

  private JsonNullable<String> invoiceNo = JsonNullable.<String>undefined();

  private JsonNullable<String> customerName = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime saleDate;

  private Integer productId;

  private Integer quantity;

  private Double totalAmount;

  public StockSale saleId(Integer saleId) {
    this.saleId = saleId;
    return this;
  }

  /**
   * Get saleId
   * @return saleId
  */
  
  @Schema(name = "saleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("saleId")
  public Integer getSaleId() {
    return saleId;
  }

  public void setSaleId(Integer saleId) {
    this.saleId = saleId;
  }

  public StockSale invoiceNo(String invoiceNo) {
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

  public StockSale customerName(String customerName) {
    this.customerName = JsonNullable.of(customerName);
    return this;
  }

  /**
   * Get customerName
   * @return customerName
  */
  
  @Schema(name = "customerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerName")
  public JsonNullable<String> getCustomerName() {
    return customerName;
  }

  public void setCustomerName(JsonNullable<String> customerName) {
    this.customerName = customerName;
  }

  public StockSale mobileNo(String mobileNo) {
    this.mobileNo = JsonNullable.of(mobileNo);
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  */
  
  @Schema(name = "mobileNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileNo")
  public JsonNullable<String> getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(JsonNullable<String> mobileNo) {
    this.mobileNo = mobileNo;
  }

  public StockSale saleDate(OffsetDateTime saleDate) {
    this.saleDate = saleDate;
    return this;
  }

  /**
   * Get saleDate
   * @return saleDate
  */
  @Valid 
  @Schema(name = "saleDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("saleDate")
  public OffsetDateTime getSaleDate() {
    return saleDate;
  }

  public void setSaleDate(OffsetDateTime saleDate) {
    this.saleDate = saleDate;
  }

  public StockSale productId(Integer productId) {
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

  public StockSale quantity(Integer quantity) {
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

  public StockSale totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  */
  
  @Schema(name = "totalAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalAmount")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockSale stockSale = (StockSale) o;
    return Objects.equals(this.saleId, stockSale.saleId) &&
        equalsNullable(this.invoiceNo, stockSale.invoiceNo) &&
        equalsNullable(this.customerName, stockSale.customerName) &&
        equalsNullable(this.mobileNo, stockSale.mobileNo) &&
        Objects.equals(this.saleDate, stockSale.saleDate) &&
        Objects.equals(this.productId, stockSale.productId) &&
        Objects.equals(this.quantity, stockSale.quantity) &&
        Objects.equals(this.totalAmount, stockSale.totalAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(saleId, hashCodeNullable(invoiceNo), hashCodeNullable(customerName), hashCodeNullable(mobileNo), saleDate, productId, quantity, totalAmount);
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
    sb.append("class StockSale {\n");
    sb.append("    saleId: ").append(toIndentedString(saleId)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    saleDate: ").append(toIndentedString(saleDate)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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

