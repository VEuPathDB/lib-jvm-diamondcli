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

package org.veupathdb.lib.cli.diamond.commands

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.foxcapades.lib.cli.builder.command.CliCommand
import io.foxcapades.lib.cli.builder.flag.CliFlag
import org.veupathdb.lib.cli.diamond.DiamondCommand
import org.veupathdb.lib.cli.diamond.commands.impl.ViewImpl
import org.veupathdb.lib.cli.diamond.opts.*
import java.nio.file.Path

@CliCommand(Command, SubCommands.View)
@JsonDeserialize(`as` = ViewImpl::class)
interface View
  : DiamondCommandConfig
  , GeneralOptionContainer
  , GeneralDBOptionContainer
  , GeneralOutputHeaderOptionContainer
  , GeneralOutputOptionContainer
  , AlignerViewOptionContainer
  , OutputFormatOptionContainer
  , ViewAlignOptionContainer
  , HiddenOptionContainer
{
  @CliFlag("in")
  @get:JsonGetter("inputFile")
  @set:JsonSetter("inputFile")
  var inputFile: Path?

  /**
   * Only show alignments of forward strand.
   *
   * Flag: `--forwardonly`
   */
  @CliFlag("forwardonly")
  @get:JsonGetter("forwardOnly")
  @set:JsonSetter("forwardOnly")
  var forwardOnly: Boolean?

  override val tool: DiamondCommand
    get() = DiamondCommand.View
}
