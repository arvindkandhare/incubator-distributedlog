/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.distributedlog.exceptions;

import org.apache.distributedlog.thrift.service.StatusCode;

/**
 * Thrown when the transaction Id specified in the API is in the range that has already been truncated.
 */
public class AlreadyTruncatedTransactionException extends DLException {

    private static final long serialVersionUID = 4287238797065959977L;

    public AlreadyTruncatedTransactionException(String message) {
        super(StatusCode.TRUNCATED_TRANSACTION, message);
    }
}