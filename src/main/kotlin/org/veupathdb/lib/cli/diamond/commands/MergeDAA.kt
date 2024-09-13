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
import io.foxcapades.lib.cli.builder.command.CliCommand
import io.foxcapades.lib.cli.builder.flag.CliFlag
import org.veupathdb.lib.cli.diamond.DiamondCommand
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOutputOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer
import java.nio.file.Path

@CliCommand(Command, SubCommands.MergeDAA)
interface MergeDAA : DiamondCommandConfig, GeneralOptionContainer, GeneralOutputOptionContainer, HiddenOptionContainer {
  @CliFlag("in")
  @get:JsonGetter("inputFiles")
  @set:JsonSetter("inputFiles")
  var inputFiles: List<Path>?

  override val tool: DiamondCommand
    get() = DiamondCommand.MergeDAA
}
