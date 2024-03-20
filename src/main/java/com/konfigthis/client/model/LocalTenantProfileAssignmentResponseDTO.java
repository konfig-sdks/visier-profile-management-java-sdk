/*
 * Visier Profile Management APIs
 * Visier APIs for managing the profiles assigned to users
 *
 * The version of the OpenAPI document: 22222222.99201.1200
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.FailedLocalTenantProfileAssignmentDTO;
import com.konfigthis.client.model.SuccessfulLocalTenantProfileAssignmentDTO;
import com.konfigthis.client.model.UserIdErrorDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * LocalTenantProfileAssignmentResponseDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LocalTenantProfileAssignmentResponseDTO {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Boolean errors;

  public static final String SERIALIZED_NAME_BAD_USER_IDS = "badUserIds";
  @SerializedName(SERIALIZED_NAME_BAD_USER_IDS)
  private List<UserIdErrorDTO> badUserIds = null;

  public static final String SERIALIZED_NAME_FAILED_ASSIGNMENTS = "failedAssignments";
  @SerializedName(SERIALIZED_NAME_FAILED_ASSIGNMENTS)
  private List<FailedLocalTenantProfileAssignmentDTO> failedAssignments = null;

  public static final String SERIALIZED_NAME_SUCCESSFUL_ASSIGNMENTS = "successfulAssignments";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL_ASSIGNMENTS)
  private List<SuccessfulLocalTenantProfileAssignmentDTO> successfulAssignments = null;

  public LocalTenantProfileAssignmentResponseDTO() {
  }

  public LocalTenantProfileAssignmentResponseDTO errors(Boolean errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

   /**
   * If true, an error was generated by the request.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, an error was generated by the request.")

  public Boolean getErrors() {
    return errors;
  }


  public void setErrors(Boolean errors) {
    
    
    
    this.errors = errors;
  }


  public LocalTenantProfileAssignmentResponseDTO badUserIds(List<UserIdErrorDTO> badUserIds) {
    
    
    
    
    this.badUserIds = badUserIds;
    return this;
  }

  public LocalTenantProfileAssignmentResponseDTO addBadUserIdsItem(UserIdErrorDTO badUserIdsItem) {
    if (this.badUserIds == null) {
      this.badUserIds = new ArrayList<>();
    }
    this.badUserIds.add(badUserIdsItem);
    return this;
  }

   /**
   * A list of objects representing the user IDs that may not be valid.
   * @return badUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of objects representing the user IDs that may not be valid.")

  public List<UserIdErrorDTO> getBadUserIds() {
    return badUserIds;
  }


  public void setBadUserIds(List<UserIdErrorDTO> badUserIds) {
    
    
    
    this.badUserIds = badUserIds;
  }


  public LocalTenantProfileAssignmentResponseDTO failedAssignments(List<FailedLocalTenantProfileAssignmentDTO> failedAssignments) {
    
    
    
    
    this.failedAssignments = failedAssignments;
    return this;
  }

  public LocalTenantProfileAssignmentResponseDTO addFailedAssignmentsItem(FailedLocalTenantProfileAssignmentDTO failedAssignmentsItem) {
    if (this.failedAssignments == null) {
      this.failedAssignments = new ArrayList<>();
    }
    this.failedAssignments.add(failedAssignmentsItem);
    return this;
  }

   /**
   * A list of objects representing any errors that occurred during the assignment operation.
   * @return failedAssignments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of objects representing any errors that occurred during the assignment operation.")

  public List<FailedLocalTenantProfileAssignmentDTO> getFailedAssignments() {
    return failedAssignments;
  }


  public void setFailedAssignments(List<FailedLocalTenantProfileAssignmentDTO> failedAssignments) {
    
    
    
    this.failedAssignments = failedAssignments;
  }


  public LocalTenantProfileAssignmentResponseDTO successfulAssignments(List<SuccessfulLocalTenantProfileAssignmentDTO> successfulAssignments) {
    
    
    
    
    this.successfulAssignments = successfulAssignments;
    return this;
  }

  public LocalTenantProfileAssignmentResponseDTO addSuccessfulAssignmentsItem(SuccessfulLocalTenantProfileAssignmentDTO successfulAssignmentsItem) {
    if (this.successfulAssignments == null) {
      this.successfulAssignments = new ArrayList<>();
    }
    this.successfulAssignments.add(successfulAssignmentsItem);
    return this;
  }

   /**
   * A list of the user IDs that were successfully assigned the profile.
   * @return successfulAssignments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the user IDs that were successfully assigned the profile.")

  public List<SuccessfulLocalTenantProfileAssignmentDTO> getSuccessfulAssignments() {
    return successfulAssignments;
  }


  public void setSuccessfulAssignments(List<SuccessfulLocalTenantProfileAssignmentDTO> successfulAssignments) {
    
    
    
    this.successfulAssignments = successfulAssignments;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the LocalTenantProfileAssignmentResponseDTO instance itself
   */
  public LocalTenantProfileAssignmentResponseDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalTenantProfileAssignmentResponseDTO localTenantProfileAssignmentResponseDTO = (LocalTenantProfileAssignmentResponseDTO) o;
    return Objects.equals(this.errors, localTenantProfileAssignmentResponseDTO.errors) &&
        Objects.equals(this.badUserIds, localTenantProfileAssignmentResponseDTO.badUserIds) &&
        Objects.equals(this.failedAssignments, localTenantProfileAssignmentResponseDTO.failedAssignments) &&
        Objects.equals(this.successfulAssignments, localTenantProfileAssignmentResponseDTO.successfulAssignments)&&
        Objects.equals(this.additionalProperties, localTenantProfileAssignmentResponseDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, badUserIds, failedAssignments, successfulAssignments, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalTenantProfileAssignmentResponseDTO {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    badUserIds: ").append(toIndentedString(badUserIds)).append("\n");
    sb.append("    failedAssignments: ").append(toIndentedString(failedAssignments)).append("\n");
    sb.append("    successfulAssignments: ").append(toIndentedString(successfulAssignments)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("errors");
    openapiFields.add("badUserIds");
    openapiFields.add("failedAssignments");
    openapiFields.add("successfulAssignments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocalTenantProfileAssignmentResponseDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LocalTenantProfileAssignmentResponseDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocalTenantProfileAssignmentResponseDTO is not found in the empty JSON string", LocalTenantProfileAssignmentResponseDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("badUserIds") != null && !jsonObj.get("badUserIds").isJsonNull()) {
        JsonArray jsonArraybadUserIds = jsonObj.getAsJsonArray("badUserIds");
        if (jsonArraybadUserIds != null) {
          // ensure the json data is an array
          if (!jsonObj.get("badUserIds").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `badUserIds` to be an array in the JSON string but got `%s`", jsonObj.get("badUserIds").toString()));
          }

          // validate the optional field `badUserIds` (array)
          for (int i = 0; i < jsonArraybadUserIds.size(); i++) {
            UserIdErrorDTO.validateJsonObject(jsonArraybadUserIds.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("failedAssignments") != null && !jsonObj.get("failedAssignments").isJsonNull()) {
        JsonArray jsonArrayfailedAssignments = jsonObj.getAsJsonArray("failedAssignments");
        if (jsonArrayfailedAssignments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("failedAssignments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `failedAssignments` to be an array in the JSON string but got `%s`", jsonObj.get("failedAssignments").toString()));
          }

          // validate the optional field `failedAssignments` (array)
          for (int i = 0; i < jsonArrayfailedAssignments.size(); i++) {
            FailedLocalTenantProfileAssignmentDTO.validateJsonObject(jsonArrayfailedAssignments.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("successfulAssignments") != null && !jsonObj.get("successfulAssignments").isJsonNull()) {
        JsonArray jsonArraysuccessfulAssignments = jsonObj.getAsJsonArray("successfulAssignments");
        if (jsonArraysuccessfulAssignments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("successfulAssignments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `successfulAssignments` to be an array in the JSON string but got `%s`", jsonObj.get("successfulAssignments").toString()));
          }

          // validate the optional field `successfulAssignments` (array)
          for (int i = 0; i < jsonArraysuccessfulAssignments.size(); i++) {
            SuccessfulLocalTenantProfileAssignmentDTO.validateJsonObject(jsonArraysuccessfulAssignments.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalTenantProfileAssignmentResponseDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalTenantProfileAssignmentResponseDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalTenantProfileAssignmentResponseDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalTenantProfileAssignmentResponseDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalTenantProfileAssignmentResponseDTO>() {
           @Override
           public void write(JsonWriter out, LocalTenantProfileAssignmentResponseDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalTenantProfileAssignmentResponseDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LocalTenantProfileAssignmentResponseDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalTenantProfileAssignmentResponseDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalTenantProfileAssignmentResponseDTO
  * @throws IOException if the JSON string is invalid with respect to LocalTenantProfileAssignmentResponseDTO
  */
  public static LocalTenantProfileAssignmentResponseDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalTenantProfileAssignmentResponseDTO.class);
  }

 /**
  * Convert an instance of LocalTenantProfileAssignmentResponseDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
