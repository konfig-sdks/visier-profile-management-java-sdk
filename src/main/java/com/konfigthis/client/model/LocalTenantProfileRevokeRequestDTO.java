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
 * LocalTenantProfileRevokeRequestDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LocalTenantProfileRevokeRequestDTO {
  public static final String SERIALIZED_NAME_TARGET_USER_IDS = "targetUserIds";
  @SerializedName(SERIALIZED_NAME_TARGET_USER_IDS)
  private List<String> targetUserIds = null;

  public LocalTenantProfileRevokeRequestDTO() {
  }

  public LocalTenantProfileRevokeRequestDTO targetUserIds(List<String> targetUserIds) {
    
    
    
    
    this.targetUserIds = targetUserIds;
    return this;
  }

  public LocalTenantProfileRevokeRequestDTO addTargetUserIdsItem(String targetUserIdsItem) {
    if (this.targetUserIds == null) {
      this.targetUserIds = new ArrayList<>();
    }
    this.targetUserIds.add(targetUserIdsItem);
    return this;
  }

   /**
   * A list of users to remove this profile from.
   * @return targetUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of users to remove this profile from.")

  public List<String> getTargetUserIds() {
    return targetUserIds;
  }


  public void setTargetUserIds(List<String> targetUserIds) {
    
    
    
    this.targetUserIds = targetUserIds;
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
   * @return the LocalTenantProfileRevokeRequestDTO instance itself
   */
  public LocalTenantProfileRevokeRequestDTO putAdditionalProperty(String key, Object value) {
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
    LocalTenantProfileRevokeRequestDTO localTenantProfileRevokeRequestDTO = (LocalTenantProfileRevokeRequestDTO) o;
    return Objects.equals(this.targetUserIds, localTenantProfileRevokeRequestDTO.targetUserIds)&&
        Objects.equals(this.additionalProperties, localTenantProfileRevokeRequestDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetUserIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalTenantProfileRevokeRequestDTO {\n");
    sb.append("    targetUserIds: ").append(toIndentedString(targetUserIds)).append("\n");
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
    openapiFields.add("targetUserIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocalTenantProfileRevokeRequestDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LocalTenantProfileRevokeRequestDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocalTenantProfileRevokeRequestDTO is not found in the empty JSON string", LocalTenantProfileRevokeRequestDTO.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("targetUserIds") != null && !jsonObj.get("targetUserIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetUserIds` to be an array in the JSON string but got `%s`", jsonObj.get("targetUserIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalTenantProfileRevokeRequestDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalTenantProfileRevokeRequestDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalTenantProfileRevokeRequestDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalTenantProfileRevokeRequestDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalTenantProfileRevokeRequestDTO>() {
           @Override
           public void write(JsonWriter out, LocalTenantProfileRevokeRequestDTO value) throws IOException {
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
           public LocalTenantProfileRevokeRequestDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LocalTenantProfileRevokeRequestDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LocalTenantProfileRevokeRequestDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalTenantProfileRevokeRequestDTO
  * @throws IOException if the JSON string is invalid with respect to LocalTenantProfileRevokeRequestDTO
  */
  public static LocalTenantProfileRevokeRequestDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalTenantProfileRevokeRequestDTO.class);
  }

 /**
  * Convert an instance of LocalTenantProfileRevokeRequestDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

