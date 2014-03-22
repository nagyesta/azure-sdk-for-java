/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.websites.models;

import java.util.ArrayList;
import java.util.Iterator;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* The List Server Farm operation response.
*/
public class ServerFarmListResponse extends OperationResponse implements Iterable<ServerFarmListResponse.ServerFarm> {
    private ArrayList<ServerFarmListResponse.ServerFarm> serverFarms;
    
    /**
    * Optional. The server farms associated with the specified subscription.
    * @return The ServerFarms value.
    */
    public ArrayList<ServerFarmListResponse.ServerFarm> getServerFarms() {
        return this.serverFarms;
    }
    
    /**
    * Optional. The server farms associated with the specified subscription.
    * @param serverFarmsValue The ServerFarms value.
    */
    public void setServerFarms(final ArrayList<ServerFarmListResponse.ServerFarm> serverFarmsValue) {
        this.serverFarms = serverFarmsValue;
    }
    
    /**
    * Initializes a new instance of the ServerFarmListResponse class.
    *
    */
    public ServerFarmListResponse() {
        super();
        this.serverFarms = new ArrayList<ServerFarmListResponse.ServerFarm>();
    }
    
    /**
    * Gets the sequence of ServerFarms.
    *
    */
    public Iterator<ServerFarmListResponse.ServerFarm> iterator() {
        return this.getServerFarms().iterator();
    }
    
    /**
    * A server farm associated with the specified subscription.
    */
    public static class ServerFarm {
        private int currentNumberOfWorkers;
        
        /**
        * Optional. The current number of Virtual Machines (VMs) in the server
        * farm.
        * @return The CurrentNumberOfWorkers value.
        */
        public int getCurrentNumberOfWorkers() {
            return this.currentNumberOfWorkers;
        }
        
        /**
        * Optional. The current number of Virtual Machines (VMs) in the server
        * farm.
        * @param currentNumberOfWorkersValue The CurrentNumberOfWorkers value.
        */
        public void setCurrentNumberOfWorkers(final int currentNumberOfWorkersValue) {
            this.currentNumberOfWorkers = currentNumberOfWorkersValue;
        }
        
        private ServerFarmWorkerSize currentWorkerSize;
        
        /**
        * Optional. The current worker size Possible values are Small, Medium,
        * or Large.
        * @return The CurrentWorkerSize value.
        */
        public ServerFarmWorkerSize getCurrentWorkerSize() {
            return this.currentWorkerSize;
        }
        
        /**
        * Optional. The current worker size Possible values are Small, Medium,
        * or Large.
        * @param currentWorkerSizeValue The CurrentWorkerSize value.
        */
        public void setCurrentWorkerSize(final ServerFarmWorkerSize currentWorkerSizeValue) {
            this.currentWorkerSize = currentWorkerSizeValue;
        }
        
        private String name;
        
        /**
        * Optional. The name of the server farm.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The name of the server farm.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private int numberOfWorkers;
        
        /**
        * Optional. The instance count, which is the number of virtual machines
        * dedicated to the farm. Supported values are 1-10.
        * @return The NumberOfWorkers value.
        */
        public int getNumberOfWorkers() {
            return this.numberOfWorkers;
        }
        
        /**
        * Optional. The instance count, which is the number of virtual machines
        * dedicated to the farm. Supported values are 1-10.
        * @param numberOfWorkersValue The NumberOfWorkers value.
        */
        public void setNumberOfWorkers(final int numberOfWorkersValue) {
            this.numberOfWorkers = numberOfWorkersValue;
        }
        
        private ServerFarmStatus status;
        
        /**
        * Optional. Server farm status. Possible values are Ready or Pending.
        * @return The Status value.
        */
        public ServerFarmStatus getStatus() {
            return this.status;
        }
        
        /**
        * Optional. Server farm status. Possible values are Ready or Pending.
        * @param statusValue The Status value.
        */
        public void setStatus(final ServerFarmStatus statusValue) {
            this.status = statusValue;
        }
        
        private ServerFarmWorkerSize workerSize;
        
        /**
        * Optional. The instance size. Possible values are Small, Medium, or
        * Large.
        * @return The WorkerSize value.
        */
        public ServerFarmWorkerSize getWorkerSize() {
            return this.workerSize;
        }
        
        /**
        * Optional. The instance size. Possible values are Small, Medium, or
        * Large.
        * @param workerSizeValue The WorkerSize value.
        */
        public void setWorkerSize(final ServerFarmWorkerSize workerSizeValue) {
            this.workerSize = workerSizeValue;
        }
    }
}
