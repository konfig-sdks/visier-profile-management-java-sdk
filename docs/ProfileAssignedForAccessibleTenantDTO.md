

# ProfileAssignedForAccessibleTenantDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**profileId** | **String** | The unique identifier associated with the profile. |  [optional] |
|**displayName** | **String** | An identifiable profile name to display in Visier such as \&quot;Partner Service Manager\&quot;. |  [optional] |
|**tenantCode** | **String** | The tenant code of the analytic tenant on which this profile is assigned. |  [optional] |
|**forAllChildren** | **Boolean** | If true, the profile is assigned for all the analytic tenants of the administrating tenant. |  [optional] |
|**validityStartTime** | **String** | An inclusive date-time when this profile is active.   Note: Long.Min_Value means that startTime is undefined. |  [optional] |
|**validityEndTime** | **String** | An exclusive date-time when this profile is no longer active.   Note: Long.Max_Value means that endTime is undefined and is equivalent to permanent access. |  [optional] |



