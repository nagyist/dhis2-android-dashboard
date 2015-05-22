/*
 * Copyright (c) 2015, University of Oslo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * Neither the name of the HISP project nor the names of its contributors may
 * be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.dhis2.android.dashboard.api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Access {
    @JsonProperty("delete") private boolean delete;
    @JsonProperty("externalize") private boolean externalize;
    @JsonProperty("manage") private boolean manage;
    @JsonProperty("read") private boolean read;
    @JsonProperty("update") private boolean update;
    @JsonProperty("write") private boolean write;

    @JsonIgnore public boolean isDelete() {
        return delete;
    }

    @JsonIgnore public void setDelete(boolean delete) {
        this.delete = delete;
    }

    @JsonIgnore public boolean isExternalize() {
        return externalize;
    }

    @JsonIgnore public void setExternalize(boolean externalize) {
        this.externalize = externalize;
    }

    @JsonIgnore public boolean isManage() {
        return manage;
    }

    @JsonIgnore public void setManage(boolean manage) {
        this.manage = manage;
    }

    @JsonIgnore public boolean isRead() {
        return read;
    }

    @JsonIgnore public void setRead(boolean read) {
        this.read = read;
    }

    @JsonIgnore public boolean isUpdate() {
        return update;
    }

    @JsonIgnore public void setUpdate(boolean update) {
        this.update = update;
    }

    @JsonIgnore public boolean isWrite() {
        return write;
    }

    @JsonIgnore public void setWrite(boolean write) {
        this.write = write;
    }

    @JsonIgnore @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" delete: ");
        builder.append(delete);

        builder.append(" externalize: ");
        builder.append(externalize);

        builder.append(" manage: ");
        builder.append(manage);

        builder.append(" read: ");
        builder.append(read);

        builder.append(" update: ");
        builder.append(update);

        builder.append(" write: ");
        builder.append(write);

        return builder.toString();
    }
}