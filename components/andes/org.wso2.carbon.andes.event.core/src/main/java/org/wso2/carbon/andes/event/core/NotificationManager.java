/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.andes.event.core;

import org.wso2.carbon.andes.event.core.exception.EventBrokerException;
import org.wso2.carbon.andes.event.core.subscription.Subscription;

/**
 * Implementation of this interface used to send notification to any delivery manager
 */
public interface NotificationManager {

    /**
     * Notification message send to given subscription
     *
     * @param message message
     * @param subscription subscription
     * @throws EventBrokerException
     */
    public void sendNotification(Message message, Subscription subscription) throws EventBrokerException;
}
