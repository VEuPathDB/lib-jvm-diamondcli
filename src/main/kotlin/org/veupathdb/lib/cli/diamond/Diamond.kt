/*
 * Copyright 2024 VEuPathDB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.veupathdb.lib.cli.diamond

import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.commands.BlastN
import org.veupathdb.lib.cli.diamond.commands.BlastP
import org.veupathdb.lib.cli.diamond.commands.BlastX
import org.veupathdb.lib.cli.diamond.commands.impl.BlastNImpl
import org.veupathdb.lib.cli.diamond.commands.impl.BlastPImpl
import org.veupathdb.lib.cli.diamond.commands.impl.BlastXImpl
import org.veupathdb.lib.jackson.Json
import java.io.InputStream

object Diamond {
  @DiamondExtras
  fun blastN(): BlastN = BlastNImpl()

  @DiamondExtras
  fun blastN(json: JsonNode): BlastN = Json.parse<BlastNImpl>(json)

  @DiamondExtras
  fun blastN(json: String): BlastN = Json.parse<BlastNImpl>(json)

  @DiamondExtras
  fun blastN(json: InputStream): BlastN = Json.parse<BlastNImpl>(json)

  fun blastP(): BlastP = BlastPImpl()

  fun blastP(json: JsonNode): BlastP = Json.parse<BlastPImpl>(json)

  fun blastP(json: String): BlastP = Json.parse<BlastPImpl>(json)

  fun blastP(json: InputStream): BlastP = Json.parse<BlastPImpl>(json)

  fun blastX(): BlastX = BlastXImpl()

  fun blastX(json: JsonNode): BlastX = Json.parse<BlastXImpl>(json)

  fun blastX(json: String): BlastX = Json.parse<BlastXImpl>(json)

  fun blastX(json: InputStream): BlastX = Json.parse<BlastXImpl>(json)
}

