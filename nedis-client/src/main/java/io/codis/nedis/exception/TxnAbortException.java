/**
 * Copyright (c) 2015 CodisLabs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.codis.nedis.exception;

import java.io.IOException;

/**
 *
 * @author Apache9
 *
 */
public class TxnAbortException extends IOException {

    private static final long serialVersionUID = -4546827177372832280L;

    public TxnAbortException() {
        super();
    }

    public TxnAbortException(String message, Throwable cause) {
        super(message, cause);
    }

    public TxnAbortException(String message) {
        super(message);
    }

    public TxnAbortException(Throwable cause) {
        super(cause);
    }

}
