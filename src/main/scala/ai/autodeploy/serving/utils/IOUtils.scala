/*
 * Copyright (c) 2019-2020 AutoDeployAI
 *
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

package ai.autodeploy.serving.utils

import java.nio.file.{Files, Path}

import ai.autodeploy.serving.utils.Utils.using
import com.google.protobuf.ByteString

object IOUtils {

  def write(path: Path, bytes: ByteString): Path = {
    using(Files.newOutputStream(path)) { os =>
      bytes.writeTo(os)
      path
    }
  }

}
