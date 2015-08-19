/*
 * Copyright 2005-2011 WSO2, Inc. (http://wso2.com)
 *
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *      you may not use this file except in compliance with the License.
 *      You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 */

package org.wso2.carbon.appfactory.ext.internal;

import org.wso2.carbon.appfactory.common.AppFactoryConfiguration;
import org.wso2.carbon.registry.core.service.RegistryService;
import org.wso2.carbon.user.core.service.RealmService;
import org.wso2.carbon.utils.ConfigurationContextService;


public class ServiceHolder {
    private static AppFactoryConfiguration appFactoryConfiguration;
    private static RealmService realmService;
    private ConfigurationContextService configContextService;
    private static final ServiceHolder instance = new ServiceHolder();
	private static RegistryService registryService;

    private ServiceHolder() {
    }

    public static ServiceHolder getInstance() {
        return instance;
    }

    public RealmService getRealmService() {
        return realmService;
    }

    public void setRealmService(RealmService realmService) {
        ServiceHolder.realmService = realmService;
    }

    public ConfigurationContextService getConfigContextService() {
        return configContextService;
    }

    public void setConfigContextService(ConfigurationContextService configContextService) {
        this.configContextService = configContextService;
    }

    public AppFactoryConfiguration getAppFactoryConfiguration() {
        return appFactoryConfiguration;
    }

    public void setAppFactoryConfiguration(AppFactoryConfiguration appFactoryConfiguration) {
        ServiceHolder.appFactoryConfiguration = appFactoryConfiguration;
    }

	public RegistryService getRegistryService() {
		return registryService;
	}

	public void setRegistryService(RegistryService registryService) {
		ServiceHolder.registryService = registryService;
	}
}
