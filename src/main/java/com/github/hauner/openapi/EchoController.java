/*
 * Copyright 2019 the original authors
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

package com.github.hauner.openapi;

import com.github.hauner.openapi.api.EchoApi;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

/**
 * Implementation of the echo api defined in src/api/openapi.yaml.
 *
 * @author Martin Hauner
 */
@Controller
public class EchoController implements EchoApi {

    @Override
    public ResponseEntity<String> getEcho (String source) {
        return ResponseEntity.ok (source);
    }

}