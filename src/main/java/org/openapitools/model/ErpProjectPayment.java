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
 * ErpProjectPayment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ErpProjectPayment {

  private Integer projectPaymentId;

  private Integer projectId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime paymentDate;

  private JsonNullable<String> paymentMode = JsonNullable.<String>undefined();

  private Double amount;

  private JsonNullable<String> naration = JsonNullable.<String>undefined();

  public ErpProjectPayment projectPaymentId(Integer projectPaymentId) {
    this.projectPaymentId = projectPaymentId;
    return this;
  }

  /**
   * Get projectPaymentId
   * @return projectPaymentId
  */
  
  @Schema(name = "projectPaymentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectPaymentId")
  public Integer getProjectPaymentId() {
    return projectPaymentId;
  }

  public void setProjectPaymentId(Integer projectPaymentId) {
    this.projectPaymentId = projectPaymentId;
  }

  public ErpProjectPayment projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  */
  
  @Schema(name = "projectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public ErpProjectPayment paymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Get paymentDate
   * @return paymentDate
  */
  @Valid 
  @Schema(name = "paymentDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentDate")
  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }

  public ErpProjectPayment paymentMode(String paymentMode) {
    this.paymentMode = JsonNullable.of(paymentMode);
    return this;
  }

  /**
   * Get paymentMode
   * @return paymentMode
  */
  
  @Schema(name = "paymentMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMode")
  public JsonNullable<String> getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(JsonNullable<String> paymentMode) {
    this.paymentMode = paymentMode;
  }

  public ErpProjectPayment amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public ErpProjectPayment naration(String naration) {
    this.naration = JsonNullable.of(naration);
    return this;
  }

  /**
   * Get naration
   * @return naration
  */
  
  @Schema(name = "naration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("naration")
  public JsonNullable<String> getNaration() {
    return naration;
  }

  public void setNaration(JsonNullable<String> naration) {
    this.naration = naration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErpProjectPayment erpProjectPayment = (ErpProjectPayment) o;
    return Objects.equals(this.projectPaymentId, erpProjectPayment.projectPaymentId) &&
        Objects.equals(this.projectId, erpProjectPayment.projectId) &&
        Objects.equals(this.paymentDate, erpProjectPayment.paymentDate) &&
        equalsNullable(this.paymentMode, erpProjectPayment.paymentMode) &&
        Objects.equals(this.amount, erpProjectPayment.amount) &&
        equalsNullable(this.naration, erpProjectPayment.naration);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectPaymentId, projectId, paymentDate, hashCodeNullable(paymentMode), amount, hashCodeNullable(naration));
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
    sb.append("class ErpProjectPayment {\n");
    sb.append("    projectPaymentId: ").append(toIndentedString(projectPaymentId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    naration: ").append(toIndentedString(naration)).append("\n");
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

