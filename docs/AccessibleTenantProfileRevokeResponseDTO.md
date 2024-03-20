

# AccessibleTenantProfileRevokeResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**badTenantCodes** | [**List&lt;ReducedTenantCodeErrorDTO&gt;**](ReducedTenantCodeErrorDTO.md) | A list of objects representing any tenants that returned errors. |  [optional] |
|**badUserIds** | [**List&lt;ReducedUserIdErrorDTO&gt;**](ReducedUserIdErrorDTO.md) | A list of objects representing the user IDs that may not be valid. |  [optional] |
|**unaffectedUsers** | [**List&lt;SuccessfulLocalTenantProfileAssignmentDTO&gt;**](SuccessfulLocalTenantProfileAssignmentDTO.md) | A list of objects representing the valid user IDs that were not affected. |  [optional] |
|**succeeded** | [**List&lt;SuccessfulLocalTenantProfileAssignmentDTO&gt;**](SuccessfulLocalTenantProfileAssignmentDTO.md) | A list of objects representing the valid user IDs that succeeded. |  [optional] |



