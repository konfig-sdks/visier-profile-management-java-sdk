package com.konfigthis.client;

import com.konfigthis.client.api.ProfileManagementApi;

public class VisierProfileManagement {
    private ApiClient apiClient;
    public final ProfileManagementApi profileManagement;

    public VisierProfileManagement() {
        this(null);
    }

    public VisierProfileManagement(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.profileManagement = new ProfileManagementApi(this.apiClient);
    }

}
