package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * HospitalAppointmentView
 */

@JsonTypeName("hospitalAppointmentView")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class HospitalAppointmentView {

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  private JsonNullable<String> city = JsonNullable.<String>undefined();

  private Integer age;

  private JsonNullable<String> gender = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime appointmentDate;

  private JsonNullable<String> appointmentTime = JsonNullable.<String>undefined();

  private Boolean isFirstVisit;

  private JsonNullable<String> naration = JsonNullable.<String>undefined();

  public HospitalAppointmentView name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public HospitalAppointmentView mobileNo(String mobileNo) {
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

  public HospitalAppointmentView city(String city) {
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

  public HospitalAppointmentView age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  
  @Schema(name = "age", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public HospitalAppointmentView gender(String gender) {
    this.gender = JsonNullable.of(gender);
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public JsonNullable<String> getGender() {
    return gender;
  }

  public void setGender(JsonNullable<String> gender) {
    this.gender = gender;
  }

  public HospitalAppointmentView appointmentDate(OffsetDateTime appointmentDate) {
    this.appointmentDate = appointmentDate;
    return this;
  }

  /**
   * Get appointmentDate
   * @return appointmentDate
  */
  @Valid 
  @Schema(name = "appointmentDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appointmentDate")
  public OffsetDateTime getAppointmentDate() {
    return appointmentDate;
  }

  public void setAppointmentDate(OffsetDateTime appointmentDate) {
    this.appointmentDate = appointmentDate;
  }

  public HospitalAppointmentView appointmentTime(String appointmentTime) {
    this.appointmentTime = JsonNullable.of(appointmentTime);
    return this;
  }

  /**
   * Get appointmentTime
   * @return appointmentTime
  */
  
  @Schema(name = "appointmentTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appointmentTime")
  public JsonNullable<String> getAppointmentTime() {
    return appointmentTime;
  }

  public void setAppointmentTime(JsonNullable<String> appointmentTime) {
    this.appointmentTime = appointmentTime;
  }

  public HospitalAppointmentView isFirstVisit(Boolean isFirstVisit) {
    this.isFirstVisit = isFirstVisit;
    return this;
  }

  /**
   * Get isFirstVisit
   * @return isFirstVisit
  */
  
  @Schema(name = "isFirstVisit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isFirstVisit")
  public Boolean getIsFirstVisit() {
    return isFirstVisit;
  }

  public void setIsFirstVisit(Boolean isFirstVisit) {
    this.isFirstVisit = isFirstVisit;
  }

  public HospitalAppointmentView naration(String naration) {
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
    HospitalAppointmentView hospitalAppointmentView = (HospitalAppointmentView) o;
    return equalsNullable(this.name, hospitalAppointmentView.name) &&
        equalsNullable(this.mobileNo, hospitalAppointmentView.mobileNo) &&
        equalsNullable(this.city, hospitalAppointmentView.city) &&
        Objects.equals(this.age, hospitalAppointmentView.age) &&
        equalsNullable(this.gender, hospitalAppointmentView.gender) &&
        Objects.equals(this.appointmentDate, hospitalAppointmentView.appointmentDate) &&
        equalsNullable(this.appointmentTime, hospitalAppointmentView.appointmentTime) &&
        Objects.equals(this.isFirstVisit, hospitalAppointmentView.isFirstVisit) &&
        equalsNullable(this.naration, hospitalAppointmentView.naration);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(mobileNo), hashCodeNullable(city), age, hashCodeNullable(gender), appointmentDate, hashCodeNullable(appointmentTime), isFirstVisit, hashCodeNullable(naration));
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
    sb.append("class HospitalAppointmentView {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    appointmentDate: ").append(toIndentedString(appointmentDate)).append("\n");
    sb.append("    appointmentTime: ").append(toIndentedString(appointmentTime)).append("\n");
    sb.append("    isFirstVisit: ").append(toIndentedString(isFirstVisit)).append("\n");
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

