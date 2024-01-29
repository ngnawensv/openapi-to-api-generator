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
 * BigEcomSale
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class BigEcomSale {

  private Integer saleId;

  private Integer custId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime saleDate;

  private Double totalInvoiceAmount;

  private Double discount;

  private JsonNullable<String> paymentNaration = JsonNullable.<String>undefined();

  private JsonNullable<String> deliveryAddress1 = JsonNullable.<String>undefined();

  private JsonNullable<String> deliveryAddress2 = JsonNullable.<String>undefined();

  private JsonNullable<String> deliveryCity = JsonNullable.<String>undefined();

  private JsonNullable<String> deliveryPinCode = JsonNullable.<String>undefined();

  private JsonNullable<String> deliveryLandMark = JsonNullable.<String>undefined();

  public BigEcomSale() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BigEcomSale(Integer custId) {
    this.custId = custId;
  }

  public BigEcomSale saleId(Integer saleId) {
    this.saleId = saleId;
    return this;
  }

  /**
   * Get saleId
   * @return saleId
  */
  
  @Schema(name = "SaleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SaleId")
  public Integer getSaleId() {
    return saleId;
  }

  public void setSaleId(Integer saleId) {
    this.saleId = saleId;
  }

  public BigEcomSale custId(Integer custId) {
    this.custId = custId;
    return this;
  }

  /**
   * Get custId
   * @return custId
  */
  @NotNull 
  @Schema(name = "CustId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CustId")
  public Integer getCustId() {
    return custId;
  }

  public void setCustId(Integer custId) {
    this.custId = custId;
  }

  public BigEcomSale saleDate(OffsetDateTime saleDate) {
    this.saleDate = saleDate;
    return this;
  }

  /**
   * Get saleDate
   * @return saleDate
  */
  @Valid 
  @Schema(name = "SaleDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SaleDate")
  public OffsetDateTime getSaleDate() {
    return saleDate;
  }

  public void setSaleDate(OffsetDateTime saleDate) {
    this.saleDate = saleDate;
  }

  public BigEcomSale totalInvoiceAmount(Double totalInvoiceAmount) {
    this.totalInvoiceAmount = totalInvoiceAmount;
    return this;
  }

  /**
   * Get totalInvoiceAmount
   * @return totalInvoiceAmount
  */
  
  @Schema(name = "TotalInvoiceAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalInvoiceAmount")
  public Double getTotalInvoiceAmount() {
    return totalInvoiceAmount;
  }

  public void setTotalInvoiceAmount(Double totalInvoiceAmount) {
    this.totalInvoiceAmount = totalInvoiceAmount;
  }

  public BigEcomSale discount(Double discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Get discount
   * @return discount
  */
  
  @Schema(name = "Discount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Discount")
  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public BigEcomSale paymentNaration(String paymentNaration) {
    this.paymentNaration = JsonNullable.of(paymentNaration);
    return this;
  }

  /**
   * Get paymentNaration
   * @return paymentNaration
  */
  
  @Schema(name = "PaymentNaration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentNaration")
  public JsonNullable<String> getPaymentNaration() {
    return paymentNaration;
  }

  public void setPaymentNaration(JsonNullable<String> paymentNaration) {
    this.paymentNaration = paymentNaration;
  }

  public BigEcomSale deliveryAddress1(String deliveryAddress1) {
    this.deliveryAddress1 = JsonNullable.of(deliveryAddress1);
    return this;
  }

  /**
   * Get deliveryAddress1
   * @return deliveryAddress1
  */
  
  @Schema(name = "DeliveryAddress1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryAddress1")
  public JsonNullable<String> getDeliveryAddress1() {
    return deliveryAddress1;
  }

  public void setDeliveryAddress1(JsonNullable<String> deliveryAddress1) {
    this.deliveryAddress1 = deliveryAddress1;
  }

  public BigEcomSale deliveryAddress2(String deliveryAddress2) {
    this.deliveryAddress2 = JsonNullable.of(deliveryAddress2);
    return this;
  }

  /**
   * Get deliveryAddress2
   * @return deliveryAddress2
  */
  
  @Schema(name = "DeliveryAddress2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryAddress2")
  public JsonNullable<String> getDeliveryAddress2() {
    return deliveryAddress2;
  }

  public void setDeliveryAddress2(JsonNullable<String> deliveryAddress2) {
    this.deliveryAddress2 = deliveryAddress2;
  }

  public BigEcomSale deliveryCity(String deliveryCity) {
    this.deliveryCity = JsonNullable.of(deliveryCity);
    return this;
  }

  /**
   * Get deliveryCity
   * @return deliveryCity
  */
  
  @Schema(name = "DeliveryCity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryCity")
  public JsonNullable<String> getDeliveryCity() {
    return deliveryCity;
  }

  public void setDeliveryCity(JsonNullable<String> deliveryCity) {
    this.deliveryCity = deliveryCity;
  }

  public BigEcomSale deliveryPinCode(String deliveryPinCode) {
    this.deliveryPinCode = JsonNullable.of(deliveryPinCode);
    return this;
  }

  /**
   * Get deliveryPinCode
   * @return deliveryPinCode
  */
  
  @Schema(name = "DeliveryPinCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryPinCode")
  public JsonNullable<String> getDeliveryPinCode() {
    return deliveryPinCode;
  }

  public void setDeliveryPinCode(JsonNullable<String> deliveryPinCode) {
    this.deliveryPinCode = deliveryPinCode;
  }

  public BigEcomSale deliveryLandMark(String deliveryLandMark) {
    this.deliveryLandMark = JsonNullable.of(deliveryLandMark);
    return this;
  }

  /**
   * Get deliveryLandMark
   * @return deliveryLandMark
  */
  
  @Schema(name = "DeliveryLandMark", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryLandMark")
  public JsonNullable<String> getDeliveryLandMark() {
    return deliveryLandMark;
  }

  public void setDeliveryLandMark(JsonNullable<String> deliveryLandMark) {
    this.deliveryLandMark = deliveryLandMark;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BigEcomSale bigEcomSale = (BigEcomSale) o;
    return Objects.equals(this.saleId, bigEcomSale.saleId) &&
        Objects.equals(this.custId, bigEcomSale.custId) &&
        Objects.equals(this.saleDate, bigEcomSale.saleDate) &&
        Objects.equals(this.totalInvoiceAmount, bigEcomSale.totalInvoiceAmount) &&
        Objects.equals(this.discount, bigEcomSale.discount) &&
        equalsNullable(this.paymentNaration, bigEcomSale.paymentNaration) &&
        equalsNullable(this.deliveryAddress1, bigEcomSale.deliveryAddress1) &&
        equalsNullable(this.deliveryAddress2, bigEcomSale.deliveryAddress2) &&
        equalsNullable(this.deliveryCity, bigEcomSale.deliveryCity) &&
        equalsNullable(this.deliveryPinCode, bigEcomSale.deliveryPinCode) &&
        equalsNullable(this.deliveryLandMark, bigEcomSale.deliveryLandMark);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(saleId, custId, saleDate, totalInvoiceAmount, discount, hashCodeNullable(paymentNaration), hashCodeNullable(deliveryAddress1), hashCodeNullable(deliveryAddress2), hashCodeNullable(deliveryCity), hashCodeNullable(deliveryPinCode), hashCodeNullable(deliveryLandMark));
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
    sb.append("class BigEcomSale {\n");
    sb.append("    saleId: ").append(toIndentedString(saleId)).append("\n");
    sb.append("    custId: ").append(toIndentedString(custId)).append("\n");
    sb.append("    saleDate: ").append(toIndentedString(saleDate)).append("\n");
    sb.append("    totalInvoiceAmount: ").append(toIndentedString(totalInvoiceAmount)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    paymentNaration: ").append(toIndentedString(paymentNaration)).append("\n");
    sb.append("    deliveryAddress1: ").append(toIndentedString(deliveryAddress1)).append("\n");
    sb.append("    deliveryAddress2: ").append(toIndentedString(deliveryAddress2)).append("\n");
    sb.append("    deliveryCity: ").append(toIndentedString(deliveryCity)).append("\n");
    sb.append("    deliveryPinCode: ").append(toIndentedString(deliveryPinCode)).append("\n");
    sb.append("    deliveryLandMark: ").append(toIndentedString(deliveryLandMark)).append("\n");
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

