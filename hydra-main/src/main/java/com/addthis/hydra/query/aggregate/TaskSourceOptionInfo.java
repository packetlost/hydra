/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.addthis.hydra.query.aggregate;

import com.addthis.codec.codables.Codable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskSourceOptionInfo implements Codable {

    @JsonProperty public final String hostUuid;
    @JsonProperty public final boolean active;
    @JsonProperty public final boolean selected;
    @JsonProperty public final String path;

    public TaskSourceOptionInfo(QueryTaskSourceOption option, boolean selected) {
        this.hostUuid = option.queryReference.getHostUUID();
        this.active   = option.isActive();
        this.selected = selected;
        this.path     = option.queryReference.name;
    }
}
