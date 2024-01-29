package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ErmClient
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ErmClient {

  private Integer clientId;

  private JsonNullable<String> contactPersonName = JsonNullable.<String>undefined();

  private JsonNullable<String> companyName = JsonNullable.<String>undefined();

  private JsonNullable<String> address = JsonNullable.<String>undefined();

  private JsonNullable<String> city = JsonNullable.<String>undefined();

  private JsonNullable<String> pincode = JsonNullable.<String>undefined();

  private JsonNullable<String> state = JsonNullable.<String>undefined();

  private Integer employeeStrength;

  private JsonNullable<String> gstNo = JsonNullable.<String>undefined();

  private JsonNullable<String> contactNo = JsonNullable.<String>undefined();

  private JsonNullable<String> regNo = JsonNullable.<String>undefined();

  public ErmClient clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
  */
  
  @Schema(name = "clientId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientId")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public ErmClient contactPersonName(String contactPersonName) {
    this.contactPersonName = JsonNullable.of(contactPersonName);
    return this;
  }

  /**
   * Get contactPersonName
   * @return contactPersonName
  */
  
  @Schema(name = "contactPersonName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPersonName")
  public JsonNullable<String> getContactPersonName() {
    return contactPersonName;
  }

  public void setContactPersonName(JsonNullable<String> contactPersonName) {
    this.contactPersonName = contactPersonName;
  }

  public ErmClient companyName(String companyName) {
    this.companyName = JsonNullable.of(companyName);
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  
  @Schema(name = "companyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companyName")
  public JsonNullable<String> getCompanyName() {
    return companyName;
  }

  public void setCompanyName(JsonNullable<String> companyName) {
    this.companyName = companyName;
  }

  public ErmClient address(String address) {
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

  public ErmClient city(String city) {
    this.city = JsonNullable.of(city);
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public JsonNullable<String> getCity() {
    return city;
  }

  public void setCity(JsonNullable<String> city) {
    this.city = city;
  }

  public ErmClient pincode(String pincode) {
    this.pincode = JsonNullable.of(pincode);
    return this;
  }

  /**
   * Get pincode
   * @return pincode
  */
  
  @Schema(name = "pincode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pincode")
  public JsonNullable<String> getPincode() {
    return pincode;
  }

  public void setPincode(JsonNullable<String> pincode) {
    this.pincode = pincode;
  }

  public ErmClient state(String state) {
    this.state = JsonNullable.of(state);
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public JsonNullable<String> getState() {
    return state;
  }

  public void setState(JsonNullable<String> state) {
    this.state = state;
  }

  public ErmClient employeeStrength(Integer employeeStrength) {
    this.employeeStrength = employeeStrength;
    return this;
  }

  /**
   * Get employeeStrength
   * @return employeeStrength
  */
  
  @Schema(name = "EmployeeStrength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EmployeeStrength")
  public Integer getEmployeeStrength() {
    return employeeStrength;
  }

  public void setEmployeeStrength(Integer employeeStrength) {
    this.employeeStrength = employeeStrength;
  }

  public ErmClient gstNo(String gstNo) {
    this.gstNo = JsonNullable.of(gstNo);
    return this;
  }

  /**
   * Get gstNo
   * @return gstNo
  */
  
  @Schema(name = "gstNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gstNo")
  public JsonNullable<String> getGstNo() {
    return gstNo;
  }

  public void setGstNo(JsonNullable<String> gstNo) {
    this.gstNo = gstNo;
  }

  public ErmClient contactNo(String contactNo) {
    this.contactNo = JsonNullable.of(contactNo);
    return this;
  }

  /**
   * Get contactNo
   * @return contactNo
  */
  
  @Schema(name = "contactNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactNo")
  public JsonNullable<String> getContactNo() {
    return contactNo;
  }

  public void setContactNo(JsonNullable<String> contactNo) {
    this.contactNo = contactNo;
  }

  public ErmClient regNo(String regNo) {
    this.regNo = JsonNullable.of(regNo);
    return this;
  }

  /**
   * Get regNo
   * @return regNo
  */
  
  @Schema(name = "regNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regNo")
  public JsonNullable<String> getRegNo() {
    return regNo;
  }

  public void setRegNo(JsonNullable<String> regNo) {
    this.regNo = regNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErmClient ermClient = (ErmClient) o;
    return Objects.equals(this.clientId, ermClient.clientId) &&
        equalsNullable(this.contactPersonName, ermClient.contactPersonName) &&
        equalsNullable(this.companyName, ermClient.companyName) &&
        equalsNullable(this.address, ermClient.address) &&
        equalsNullable(this.city, ermClient.city) &&
        equalsNullable(this.pincode, ermClient.pincode) &&
        equalsNullable(this.state, ermClient.state) &&
        Objects.equals(this.employeeStrength, ermClient.employeeStrength) &&
        equalsNullable(this.gstNo, ermClient.gstNo) &&
        equalsNullable(this.contactNo, ermClient.contactNo) &&
        equalsNullable(this.regNo, ermClient.regNo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, hashCodeNullable(contactPersonName), hashCodeNullable(companyName), hashCodeNullable(address), hashCodeNullable(city), hashCodeNullable(pincode), hashCodeNullable(state), employeeStrength, hashCodeNullable(gstNo), hashCodeNullable(contactNo), hashCodeNullable(regNo));
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
    sb.append("class ErmClient {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    contactPersonName: ").append(toIndentedString(contactPersonName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    employeeStrength: ").append(toIndentedString(employeeStrength)).append("\n");
    sb.append("    gstNo: ").append(toIndentedString(gstNo)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    regNo: ").append(toIndentedString(regNo)).append("\n");
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

