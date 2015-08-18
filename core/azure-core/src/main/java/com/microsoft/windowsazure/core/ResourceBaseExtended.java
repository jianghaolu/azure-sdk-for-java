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

package com.microsoft.windowsazure.core;

/**
* Resource information with extended details.
*/
public class ResourceBaseExtended extends ResourceBase {
    private String id;
    
    /**
    * Optional. Gets or sets the ID of the resource.
    * @return The Id value.
    */
    public String getId() {
        return this.id;
    }
    
    /**
    * Optional. Gets or sets the ID of the resource.
    * @param idValue The Id value.
    */
    public void setId(final String idValue) {
        this.id = idValue;
    }
    
    private String name;
    
    /**
    * Optional. Gets or sets the name of the resource.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Gets or sets the name of the resource.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String type;
    
    /**
    * Optional. Gets or sets the type of the resource.
    * @return The Type value.
    */
    public String getType() {
        return this.type;
    }
    
    /**
    * Optional. Gets or sets the type of the resource.
    * @param typeValue The Type value.
    */
    public void setType(final String typeValue) {
        this.type = typeValue;
    }
    
    /**
    * Initializes a new instance of the ResourceBaseExtended class.
    *
    */
    public ResourceBaseExtended() {
        super();
    }
    
    /**
    * Initializes a new instance of the ResourceBaseExtended class with
    * required arguments.
    *
    * @param location Gets or sets the location of the resource.
    */
    public ResourceBaseExtended(String location) {
        this();
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setLocation(location);
    }
}
