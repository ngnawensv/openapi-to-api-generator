package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BigEcomCart
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class BigEcomCart {

  private Integer cartId;

  private Integer custId;

  private Integer productId;

  private Integer quantity;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime addedDate;

  public BigEcomCart() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BigEcomCart(Integer custId) {
    this.custId = custId;
  }

  public BigEcomCart cartId(Integer cartId) {
    this.cartId = cartId;
    return this;
  }

  /**
   * Get cartId
   * @return cartId
  */
  
  @Schema(name = "CartId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CartId")
  public Integer getCartId() {
    return cartId;
  }

  public void setCartId(Integer cartId) {
    this.cartId = cartId;
  }

  public BigEcomCart custId(Integer custId) {
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

  public BigEcomCart productId(Integer productId) {
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

  public BigEcomCart quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  
  @Schema(name = "Quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public BigEcomCart addedDate(OffsetDateTime addedDate) {
    this.addedDate = addedDate;
    return this;
  }

  /**
   * Get addedDate
   * @return addedDate
  */
  @Valid 
  @Schema(name = "AddedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AddedDate")
  public OffsetDateTime getAddedDate() {
    return addedDate;
  }

  public void setAddedDate(OffsetDateTime addedDate) {
    this.addedDate = addedDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BigEcomCart bigEcomCart = (BigEcomCart) o;
    return Objects.equals(this.cartId, bigEcomCart.cartId) &&
        Objects.equals(this.custId, bigEcomCart.custId) &&
        Objects.equals(this.productId, bigEcomCart.productId) &&
        Objects.equals(this.quantity, bigEcomCart.quantity) &&
        Objects.equals(this.addedDate, bigEcomCart.addedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartId, custId, productId, quantity, addedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BigEcomCart {\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    custId: ").append(toIndentedString(custId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    addedDate: ").append(toIndentedString(addedDate)).append("\n");
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

